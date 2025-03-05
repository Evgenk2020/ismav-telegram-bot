package com.ismavbot;

import java.util.ArrayList;
import java.util.List;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

public class bot_keyboard {
    public InlineKeyboardButton create_button(String text, String callback_data) {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(text);
        button.setCallbackData(callback_data);

        return button;
    }

    public SendMessage button_column_message(Long chat_id, String text, List<InlineKeyboardButton> buttons) {
        SendMessage message = new SendMessage();
        message.setChatId(chat_id.toString());
        message.setText(text);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows_n_columns = new ArrayList<>();

        for (var b : buttons) {
            rows_n_columns.add(List.of(b));
        }

        markup.setKeyboard(rows_n_columns);
        message.setReplyMarkup(markup);

        return message;
    }

    public SendMessage button_row_message(Long chat_id, String text, List<InlineKeyboardButton> buttons) {
        SendMessage message = new SendMessage();
        message.setChatId(chat_id.toString());
        message.setText(text);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows_n_columns = new ArrayList<>();

        rows_n_columns.add(buttons);
        markup.setKeyboard(rows_n_columns);
        message.setReplyMarkup(markup);

        return message;
    }
}

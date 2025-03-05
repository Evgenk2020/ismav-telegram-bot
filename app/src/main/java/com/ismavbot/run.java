package com.ismavbot;

import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.methods.send.SendContact;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class run {
    private static is_bot inner_bot = new is_bot(new data().get_bot_token());
    private String exept;

    private void error_set() {
        exept = "no error";
    }

    public void begin(SendMessage temp_message) {
        error_set();

        try {
            inner_bot.execute(temp_message);
        } catch (TelegramApiException e) {
            exept = "Помилка відправлення повідомлення...";
            e.printStackTrace();
        }
    }

    public void begin(SendPhoto temp_message) {
        error_set();

        try {
            inner_bot.execute(temp_message);
        } catch (TelegramApiException e) {
            exept = "Помилка відправки зображення...";
        }
    }

    public void begin(SendContact temp_message) {
        error_set();

        try {
            inner_bot.execute(temp_message);
        } catch (TelegramApiException e) {
            exept = "Перевищено ліміт запитів... Спробуйте пізніше";
        }
    }

    public void begin(SetMyCommands temp_message) {
        error_set();

        try {
            inner_bot.execute(temp_message);
        } catch (TelegramApiException e) {
            exept = "Помилка завантаження...";
        }
    }

    public String exept() {
        return exept;
    }
}

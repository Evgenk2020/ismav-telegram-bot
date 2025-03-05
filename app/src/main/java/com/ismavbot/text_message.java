package com.ismavbot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class text_message {
    public SendMessage send_text_message(Long chat_id, String text) {
        SendMessage text_message = new SendMessage();
        text_message.setChatId(chat_id);
        text_message.setText(text);

        return text_message;
    }
}

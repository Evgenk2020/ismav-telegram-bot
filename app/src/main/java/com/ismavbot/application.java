package com.ismavbot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class application extends is_bot {
    public application(String token) {
        super(token);
    }

    public static void main(String[] args) {
        try {
            TelegramBotsApi bot = new TelegramBotsApi(DefaultBotSession.class);
            bot.registerBot(new is_bot(new data().get_bot_token()));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
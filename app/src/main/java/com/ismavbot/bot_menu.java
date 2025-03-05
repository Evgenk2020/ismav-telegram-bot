package com.ismavbot;

import java.util.ArrayList;

import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;
import org.telegram.telegrambots.meta.api.objects.commands.scope.BotCommandScopeChat;

public class bot_menu {
    private ArrayList<BotCommand> list_of_commands = new ArrayList<>();
    private SetMyCommands set_menu_commands = new SetMyCommands();

    bot_menu() {
        list_of_commands.add(new BotCommand("/start", "Початок роботи"));
        list_of_commands.add(new BotCommand("/products", "Продукція"));
        list_of_commands.add(new BotCommand("/contact", "Додати до списку контактів"));
        list_of_commands.add(new BotCommand("/net", "Перейти на сайт"));
        list_of_commands.add(new BotCommand("/facebook", "Ми у Facebook"));
    }

    public SetMyCommands menu_commands(Long chat_id) {
        set_menu_commands.setCommands(list_of_commands);
        set_menu_commands.setScope(BotCommandScopeChat.builder().chatId(chat_id).build());

        return set_menu_commands;
    }
}

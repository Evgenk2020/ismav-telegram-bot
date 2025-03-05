package com.ismavbot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import com.ismavbot.assorti.prep;
import com.ismavbot.assorti.units_factory;

public class is_bot extends TelegramLongPollingBot {
    public is_bot(String token) {
        super(token);
    }

    private Update _event = new Update();
    private send_files send_files = new send_files();
    private text_message text_message = new text_message();
    private run run = new run();

    private String button_click;
    boolean show_short;

    @Override
    public String getBotUsername() {
        return new data().get_bot_user_name();
    }

    @Override
    public final void onUpdateReceived(Update event) {
        _event = event;
        bot_session();
    }

    // -------------------------------------------------------------------------------------
    // general carrying on
    private void bot_session() {
        if (_event.hasCallbackQuery()) {
            if (!get_button_callback_data().contains("/")) {
                button_click = get_button_callback_data();
                show_short = true;
            }

            button_action();
            return;
        }

        if (get_text_message().equals("/start")) {
            reset();
            start();
            return;
        }

        if (get_text_message().equals("/products")) {
            reset();
            preparation_list();
            return;
        }

        if (get_text_message().equals("/contact")) {
            run.begin(new contact_card().send_contacts(get_chat_id()));

            if (!run.exept().equals("no error")) {
                SendMessage mes = text_message.send_text_message(get_chat_id(), run.exept());
                run.begin(mes);
            }

            return;
        }

        if (get_text_message().equals("/net")) {
            SendMessage mes = text_message.send_text_message(get_chat_id(), "[ІСМАВ НААН](https://ismav.com.ua/)");
            mes.setParseMode("MarkdownV2");
            run.begin(mes);
        }

        if (get_text_message().equals("/facebook")) {
            SendMessage mes = text_message.send_text_message(get_chat_id(), "[ІСМАВ НААН Facebook](https://www.facebook.com/ismav.com.ua/)");
            mes.setParseMode("MarkdownV2");
            run.begin(mes);
        }
    }

    // -------------------------------------------------------------------------------------
    // additional private methods
    private void button_action() {
        if (get_button_callback_data().equals("/products")) {
            preparation_list();
            return;
        }

        if (get_button_callback_data().equals("/info")) {
            total();
            return;
        }

        assort_enum assol = assort_enum.valueOf(button_click);
        units_factory units = new units_factory();
        prep _prep = units._prep(assol);

        {
            if (button_click != null && show_short == true) {
                run.begin(send_files.send_photo_file(get_chat_id(), _prep.get().image_ile, _prep.get().name));
                SendMessage short_file = text_message.send_text_message(get_chat_id(),
                        send_files.send_text_file(get_chat_id(), _prep.get().short_info_file));
                short_file.enableHtml(true);
                run.begin(short_file);

                SendMessage selection = new bot_keyboard().button_row_message(get_chat_id(), "Оберіть потрібне",
                        new bot_carrying().describe_price_buttons());
                run.begin(selection);
                show_short = false;
                return;
            }

            if (button_click != null && get_button_callback_data().equals("/describe")) {
                SendMessage instruction = text_message.send_text_message(get_chat_id(), send_files.send_text_file(get_chat_id(), _prep.get().info_file));
                instruction.enableHtml(true);
                run.begin(instruction);
                return;
            }

            if (button_click != null && get_button_callback_data().equals("/price")) {
                SendMessage pricing = text_message.send_text_message(get_chat_id(), send_files.send_text_file(get_chat_id(), _prep.get().price));
                pricing.enableHtml(true);
                run.begin(pricing);
                return;
            }
        }
    }

    private void start() {
        run.begin(new bot_menu().menu_commands(get_chat_id()));

        SendMessage hello = text_message.send_text_message(get_chat_id(),
                send_files.send_text_file(get_chat_id(), "general/start.html"));
        hello.enableHtml(true);
        run.begin(hello);

        SendMessage start_button = new bot_keyboard().button_column_message(get_chat_id(), "Оберіть потрібне",
                new bot_carrying().start_buttons());
        run.begin(start_button);
    }

    private void preparation_list() {
        SendMessage assortiment = new bot_keyboard().button_column_message(get_chat_id(), "Асортимент препаратів",
                new bot_carrying().assorti_buttons());
        run.begin(assortiment);
    }

    private void total() {
        SendMessage inf = text_message.send_text_message(get_chat_id(),
                send_files.send_text_file(get_chat_id(), "general/total.html"));
        inf.enableHtml(true);
        run.begin(inf);
    }

    private void reset() {
        button_click = null;
        show_short = false;
    }

    // -------------------------------------------------------------------------------------
    // bot service methods
    private String get_text_message() {
        return (_event.hasMessage() ? _event.getMessage().getText() : null);
    }

    private String get_button_callback_data() {
        return (_event.hasCallbackQuery() ? _event.getCallbackQuery().getData() : null);
    }

    private Long get_chat_id() {
        if (_event.hasMessage()) {
            return _event.getMessage().getChatId();
        }

        if (_event.hasCallbackQuery()) {
            return _event.getCallbackQuery().getMessage().getChatId();
        }

        return null;
    }
}

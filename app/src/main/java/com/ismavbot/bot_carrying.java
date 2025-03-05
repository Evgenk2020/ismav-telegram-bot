package com.ismavbot;

import java.util.ArrayList;
import java.util.List;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

public class bot_carrying {
    public List<InlineKeyboardButton> start_buttons() {
        List<InlineKeyboardButton> starting = new ArrayList<>();
        starting.add(new bot_keyboard().create_button("Інформація", "/info"));
        starting.add(new bot_keyboard().create_button("Продукція", "/products"));

        return starting;
    }

    public List<InlineKeyboardButton> describe_price_buttons() {
        List<InlineKeyboardButton> describbing = new ArrayList<>();
        describbing.add(new bot_keyboard().create_button("Інструкція", "/describe"));
        describbing.add(new bot_keyboard().create_button("Ціна", "/price"));

        return describbing;
    }
   
    public List<InlineKeyboardButton> assorti_buttons() {
        List<InlineKeyboardButton> describbing = new ArrayList<>();
        describbing.add(new bot_keyboard().create_button("Ризогумін", assort_enum.rhizogumin.toString()));
        describbing.add(new bot_keyboard().create_button("Ризогумін рідкий", assort_enum.rhizoliquid.toString()));
        describbing.add(new bot_keyboard().create_button("Діазобактерин", assort_enum.diazobacterin.toString()));
        describbing.add(new bot_keyboard().create_button("Поліміксобактерин", assort_enum.polimixobacterin.toString()));
        describbing.add(new bot_keyboard().create_button("Альбобактерин", assort_enum.albobacterin.toString()));
        describbing.add(new bot_keyboard().create_button("Біогран", assort_enum.biogran.toString()));
        describbing.add(new bot_keyboard().create_button("Мікрогумін", assort_enum.microgumin.toString()));
        describbing.add(new bot_keyboard().create_button("Хетомік", assort_enum.hetomik.toString()));
        describbing.add(new bot_keyboard().create_button("Ризобофіт", assort_enum.rhizobofit.toString()));
        describbing.add(new bot_keyboard().create_button("Антимишин", assort_enum.antimishin.toString()));
        describbing.add(new bot_keyboard().create_button("Консервант для сінажу", assort_enum.sinazh.toString()));
        describbing.add(new bot_keyboard().create_button("Закваска силосна", assort_enum.zakvaska.toString()));
        describbing.add(new bot_keyboard().create_button("Субтікон", assort_enum.subtikon.toString()));

        return describbing;
    }


}

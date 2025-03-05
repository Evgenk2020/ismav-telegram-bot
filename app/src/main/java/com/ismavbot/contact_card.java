package com.ismavbot;

import org.telegram.telegrambots.meta.api.methods.send.SendContact;

public class contact_card {
    private String v_card = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:ІСМАВ Продажі\n" +
            "ORG:ІСМАВ НААН\n" +
            "TEL:+380965382575\n" +
            "TEL:+380996480328\n" +
            "EMAIL:ins.ekonomika2017@gmail.com\n" +
            "ADR:;;вулиця Шевченка, 97, Чернігів, Чернігівська область, 14000\n" +
            "URL:https://ismav.com.ua/\n" +
            "END:VCARD";

    private String first_name = "ІСАМВ продаж препаратів";
    private String phone_number = "+380965382575";

    public SendContact send_contacts(Long chat_id) {
        SendContact cont = new SendContact();
        cont.setChatId(chat_id);
        cont.setFirstName(first_name);
        cont.setPhoneNumber(phone_number);
        cont.setVCard(v_card);

        return cont;
    }
}

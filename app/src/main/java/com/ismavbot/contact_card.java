package com.ismavbot;

import org.telegram.telegrambots.meta.api.methods.send.SendContact;

public class contact_card {
    private String v_card = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:ІСМАВ Продажі\n" +
            "ORG:ІСМАВ НААН\n" +
            "TEL:+38096#######\n" +
            "TEL:+38099#######\n" +
            "EMAIL:ins.ekonomika2017@gmail.com\n" +
            "ADR:;;вулиця ###, ##, ###, ####, ######\n" +
            "URL:https://ismav.com.ua/\n" +
            "END:VCARD";

    private String first_name = "ІСАМВ продаж препаратів";
    private String phone_number = "+38096#######";

    public SendContact send_contacts(Long chat_id) {
        SendContact cont = new SendContact();
        cont.setChatId(chat_id);
        cont.setFirstName(first_name);
        cont.setPhoneNumber(phone_number);
        cont.setVCard(v_card);

        return cont;
    }
}

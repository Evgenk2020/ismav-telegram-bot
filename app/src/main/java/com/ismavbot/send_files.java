package com.ismavbot;

import java.io.IOException;
import java.io.InputStream;

import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;

public class send_files {
    public SendPhoto send_photo_file(Long chat_id, String resorce_file_name, String img_caption) {
        InputStream input_stream = ClassLoader.getSystemResourceAsStream(resorce_file_name);
        InputFile input_file = new InputFile();
        input_file.setMedia(input_stream, resorce_file_name);
        SendPhoto send_photo = new SendPhoto(chat_id.toString(), input_file);
        send_photo.setCaption(img_caption);

        return send_photo;
    }

    public String send_text_file(Long chat_id, String resorce_file_name) {
        InputStream input_stream = ClassLoader.getSystemResourceAsStream(resorce_file_name);

        try {
            return new String(input_stream.readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

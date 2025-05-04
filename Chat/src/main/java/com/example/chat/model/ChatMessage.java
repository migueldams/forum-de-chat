package com.example.chat.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChatMessage {


    String content;

    String sender;

    MessageType type;

    String time;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE,


    }


}
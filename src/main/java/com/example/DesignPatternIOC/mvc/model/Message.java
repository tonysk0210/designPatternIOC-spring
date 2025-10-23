package com.example.DesignPatternIOC.mvc.model;

import lombok.Data;

@Data
public class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }
}

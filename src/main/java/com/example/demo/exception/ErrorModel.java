package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorModel {
    private   String type;
    private String  message;

    @Override
    public String toString() {
        return "ErrorModel{" +
                "type='" + type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

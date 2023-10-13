package com.example.demo.Enumeration;

import lombok.Getter;
import lombok.Setter;


public enum Status {

    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String status;

    Status(String status){
        this.status=status;
    }

    public String getStatus() {
        return this.status;
    }
}

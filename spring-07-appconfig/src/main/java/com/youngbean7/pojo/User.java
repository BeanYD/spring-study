package com.youngbean7.pojo;

import org.springframework.beans.factory.annotation.Value;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    @Value("youngbean7")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

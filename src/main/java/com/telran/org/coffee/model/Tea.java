package com.telran.org.coffee.model;

import java.util.UUID;

public class Tea {
    private String id;
    private String name;

    public Tea() {
        this.id = UUID.randomUUID().toString();
    }

    public Tea(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

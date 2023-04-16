package com.driver;

public class RWOnly {
    private String name;

    public String getName() {
        System.out.println(this.name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

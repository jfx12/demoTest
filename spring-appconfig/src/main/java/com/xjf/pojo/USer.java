package com.xjf.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class USer {
    private String name;

    public String getName() {
        return name;
    }
    @Value("dsfs")
    public void setName(String name) {
        this.name = name;
    }
}

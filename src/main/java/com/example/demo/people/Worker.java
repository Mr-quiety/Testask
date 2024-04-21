package com.example.demo.people;

import lombok.*;

@Data
@Builder
public class Worker {
    private String name;
    private String role;
    private int id;

    public Worker(String name, String role, int id) {
        this.name = name;
        this.role = role;
        this.id = id;
    }
}

package com.example.demo.people;

import lombok.*;

@Data
@Builder
public class Worker {
    private String firstName;
    private String role;
    private int id;
}

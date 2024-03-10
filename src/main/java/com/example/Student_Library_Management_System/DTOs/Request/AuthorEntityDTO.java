package com.example.Student_Library_Management_System.DTOs.Request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorEntityDTO {

    private String name;
    private int age;
    private String country;
    private double rating;
}

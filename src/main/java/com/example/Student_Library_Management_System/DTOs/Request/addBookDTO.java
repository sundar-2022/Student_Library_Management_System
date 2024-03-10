package com.example.Student_Library_Management_System.DTOs.Request;

import com.example.Student_Library_Management_System.Enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class addBookDTO {

    private String name;
    private int page;
    private Genre genre;


}

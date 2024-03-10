package com.example.Student_Library_Management_System.DTOs.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class StudentUpdateMobNoDTO {

    private String email;
    private String MobNo;
}

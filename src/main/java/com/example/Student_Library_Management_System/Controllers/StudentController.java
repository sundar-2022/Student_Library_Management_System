package com.example.Student_Library_Management_System.Controllers;


import com.example.Student_Library_Management_System.DTOs.Request.StudentUpdateMobNoDTO;
import com.example.Student_Library_Management_System.Models.Student;
import com.example.Student_Library_Management_System.Services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("student")
public class StudentController {

    private final StudentService studentService;



    @PostMapping("/add")
    public String createStudent(@RequestBody Student student){

        return studentService.createStudent(student);
    }

    @PostMapping("/updateMobNo")
    public ResponseEntity<String> updateMobNo(@RequestBody StudentUpdateMobNoDTO studentUpdateMobNoDTO){
        try {
            studentService.updateMobNo(studentUpdateMobNoDTO);
            return ResponseEntity.status(HttpStatus.OK).body("Mobile number updated successfully");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
    @GetMapping("/get_user")
    public ResponseEntity<String> getNameByEmail(@RequestParam("email") String email){
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getNameByEmail(email));
    }

}

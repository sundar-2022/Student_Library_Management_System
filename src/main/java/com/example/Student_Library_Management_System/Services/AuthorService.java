package com.example.Student_Library_Management_System.Services;

import com.example.Student_Library_Management_System.DTOs.Request.AuthorEntityDTO;
import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.Repositories.AuthorRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRespository authorRespository;
    public String addAuthor(AuthorEntityDTO authorEntityDTO){
        Author author = new Author();
        author.setName(authorEntityDTO.getName());
        author.setAge(authorEntityDTO.getAge());
        author.setCountry(authorEntityDTO.getCountry());
        author.setRating(authorEntityDTO.getRating());
        authorRespository.save(author);
        return "Author Created Successfully";
    }
}

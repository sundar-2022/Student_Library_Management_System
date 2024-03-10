package com.example.Student_Library_Management_System.Services;

import com.example.Student_Library_Management_System.DTOs.Request.addBookDTO;
import com.example.Student_Library_Management_System.Models.Book;
import com.example.Student_Library_Management_System.Repositories.BookRespository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRespository bookRespository;

    public BookService(BookRespository bookRespository) {
        this.bookRespository = bookRespository;
    }

    public String addBook(addBookDTO addBookDTO){
        Book book = new Book();
        book.setName(addBookDTO.getName());
        book.setPages(addBookDTO.getPage());
        book.setGenre(addBookDTO.getGenre());
        bookRespository.save(book);
        return "Book added successfully";
    }
}

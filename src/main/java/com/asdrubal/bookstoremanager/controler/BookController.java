package com.asdrubal.bookstoremanager.controler;

import com.asdrubal.bookstoremanager.dto.MessageResponseDTO;
import com.asdrubal.bookstoremanager.entity.Book;
import com.asdrubal.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private BookRepository bookRepository;
    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
        Book savedBook =  bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book criado com id"+savedBook.getId())
                .build();
    }
}

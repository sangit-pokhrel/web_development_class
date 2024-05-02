package com.example.demo.service.impl;

import com.example.demo.entity.Book;
import com.example.demo.entity.Ground;
import com.example.demo.entity.User;
import com.example.demo.pojo.BookPojo;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.GroundRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookSerivceImpl implements BookService {
    private final BookRepository bookRepository;
    private final GroundRepository groundRepository;
    private final UserRepository userRepository;

    @Override
    public void addBookinfo(BookPojo bookPojo){
        Book book=new Book();
        book.setId(bookPojo.getId());
        book.setTime(bookPojo.getBook_time());
        book.setBook_date(bookPojo.getBook_date());
        book.setBook_status(bookPojo.getBook_status());
        Ground ground = groundRepository.findById(bookPojo.getGround_id()).orElse(null);

        // Retrieve User entity from the database using userId
        User user = userRepository.findById(bookPojo.getUser_id()).orElse(null);

        book.setGround(ground);
        book.setUser(user);



        bookRepository.save(book);
    }

}

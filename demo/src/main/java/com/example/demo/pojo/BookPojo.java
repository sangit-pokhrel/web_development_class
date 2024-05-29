package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class BookPojo {
    private Integer id;
    private Integer book_time;
    private Integer book_date;
    private String book_status;
    private Integer ground_id;
    private Integer User_id;


}

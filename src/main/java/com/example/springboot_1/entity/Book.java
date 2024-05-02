package com.example.springboot_1.entity;

import jakarta.persistence.*;

@Entity
@Table(name="book_info")

public class Book {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parameter_setup_seq_gen")
    @SequenceGenerator(name = "parameter_setup_seq_gen", sequenceName = "parameters_setup_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name="book_time")
    private Integer time;


    @Column(name="book_date")
    private Integer book_date;

    @Column(name="book_status")
    private String book_status;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ground_id",referencedColumnName = "id",foreignKey = @ForeignKey(name="fk_book_user_id"))
    private Ground ground;


}
package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="book_info")
@Setter
@Getter

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
    @JoinColumn(name="ground_id",referencedColumnName = "id",foreignKey = @ForeignKey(name="fk_book_groundid"))
    private Ground ground;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="User_id",referencedColumnName = "id",foreignKey = @ForeignKey(name="fk_book_userid"))
    private User user;



}

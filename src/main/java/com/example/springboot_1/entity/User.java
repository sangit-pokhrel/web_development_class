package com.example.springboot_1.entity;

import jakarta.persistence.*;
@Entity
@Table(name="User_info")

public class User {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parameter_setup_seq_gen")
    @SequenceGenerator(name = "parameter_setup_seq_gen", sequenceName = "parameters_setup_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private String age;


    @Column(name="email")
    private String email;
}
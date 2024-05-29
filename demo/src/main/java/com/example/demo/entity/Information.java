package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="informations")
public class Information {
    @Id
    private Integer id;


    @Column(name="information_title")
    private String title;
}

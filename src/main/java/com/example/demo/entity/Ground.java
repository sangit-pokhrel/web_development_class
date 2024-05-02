package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="ground_info")
@Setter
@Getter
public class Ground {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parameter_setup_seq_gen")

    @SequenceGenerator(name = "parameter_setup_seq_gen", sequenceName = "parameters_setup_seq", allocationSize = 1)
     @Id
    private Integer id;

     @Column(name="name")
     private String name;

     @Column(name="image")
      private String image;


     @OneToMany(mappedBy = "ground",cascade = CascadeType.ALL)
     private List<Book> books;



}

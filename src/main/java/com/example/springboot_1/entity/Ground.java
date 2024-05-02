package com.example.springboot_1.entity;

import jakarta.persistence.*;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="ground_info")

public class Ground {
    @Setter
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parameter_setup_seq_gen")
    @SequenceGenerator(name = "parameter_setup_seq_gen", sequenceName = "parameters_setup_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Setter
    @Column(name="name")
    private String name;

    @Column(name="image")
    private String image;

    @OneToMany(mappedBy = "ground",fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;

}

package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.List;

@Entity
@Table(name="User_info")
@Setter
@Getter

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


//     @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
//    private List<User> users;

}

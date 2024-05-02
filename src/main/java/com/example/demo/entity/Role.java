package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="role_table")
public class Role {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parameter_setup_seq_gen")
    @SequenceGenerator(name = "parameter_setup_seq_gen", sequenceName = "parameters_setup_seq", allocationSize = 1)
    @Id
    private Integer id;


    @Column(name="name")
    private String name;



    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="users_roles",foreignKey = @ForeignKey(name="fk_users_roles_role_id"),
            joinColumns = @JoinColumn(name="role_id",referencedColumnName = "id"),
            inverseForeignKey = @ForeignKey(name="FK_users_roles_user_id"),
            inverseJoinColumns = @JoinColumn(name="user_id",referencedColumnName = "id"))

   private List<User> users;
}

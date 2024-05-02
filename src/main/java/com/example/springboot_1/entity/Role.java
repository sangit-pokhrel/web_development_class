package com.example.springboot_1.entity;


import jakarta.persistence.*;
import org.hibernate.mapping.List;

@Entity
@Table(name="Role_info")

public class Role {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parameter_setup_seq_gen")
    @SequenceGenerator(name = "parameter_setup_seq_gen", sequenceName = "parameters_setup_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name="role")
    private String role;

//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "users_roles",
//    foreignKey = @ForeignKey(name = "fk_user_id"),
//            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
//            inverseForeignKey = @ForeignKey(name = "fk_role_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
//    )
//    private List<Role> roles;


}

package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users_table")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name" , nullable = false)
    private String ownerName;
    @Column(name = "email")
    private String ownerEmail;
    private String phone;
    private String password;


}

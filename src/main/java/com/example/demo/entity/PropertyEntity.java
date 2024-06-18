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
@Table(name = "property_table")
public class PropertyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    @Column(name = "name" , nullable = false)
    private String ownerName;
    @Column(name = "email")
    private String ownerEmail;
    private double price;
    private String address;


}

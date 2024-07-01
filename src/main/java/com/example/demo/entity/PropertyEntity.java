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

    private double price;
    private String address;

    @ManyToOne(fetch = FetchType.LAZY) //it will not fetch the user data while fetching the properties
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserEntity userEntity;
}

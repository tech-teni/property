package com.example.demo.controller;


import com.example.demo.dto.PropertyDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")


public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public ResponseEntity<UserDTO> saveProperty(@RequestBody UserDTO userDTO) {
        UserDTO dto= userService.register(userDTO);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);


    }
}

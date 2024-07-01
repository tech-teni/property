package com.example.demo.service;

import com.example.demo.dto.UserDTO;

public interface UserService {
    public  UserDTO register(UserDTO userDTO);
    public  UserDTO login(String email, String password);

}

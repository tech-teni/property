package com.example.demo.converter;

import com.example.demo.dto.PropertyDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.PropertyEntity;
import com.example.demo.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserEntity convertDTOtoEntity(UserDTO userDTO)  {
        UserEntity userEntity =new UserEntity();
        userEntity.setOwnerEmail(userDTO.getOwnerEmail());
        userEntity.setPhone(userDTO.getPhone());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setOwnerName(userDTO.getOwnerName());



        return userEntity;
    }

    public UserDTO convertEntityToDTO(UserEntity userEntity)  {
        UserDTO userDTO =new UserDTO();
        userDTO.setOwnerEmail(userEntity.getOwnerEmail());
        userDTO.setPhone(userEntity.getPhone());
//        userDTO.setPassword(userEntity.getPassword());
        userDTO.setOwnerName(userEntity.getOwnerName());
        userDTO.setId(userEntity.getId());



        return userDTO;
    }
}

package com.example.demo.service.impl;

import com.example.demo.converter.UserConverter;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.UserEntity;
import com.example.demo.exception.BusinessException;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.exception.ErrorModel;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;


@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private UserConverter userConverter;


    @Override
    public UserDTO register(UserDTO userDTO) {


        Optional<UserEntity> optUs = userRepository.findByEmail(userDTO.getOwnerEmail());

        if(optUs.isPresent()){
            List<ErrorModel> errorModelList = new ArrayList<>();
            ErrorModel errorModel = new ErrorModel();
            errorModel.setMessage("Email already exist");
            errorModel.setType("Email exist");
            errorModelList.add(errorModel);
            throw  new BusinessException(errorModelList);

        }else{
            UserEntity userEntity = userConverter.convertDTOtoEntity(userDTO);


            userEntity =userRepository.save(userEntity);

            return userConverter.convertEntityToDTO(userEntity);
        }

    }

    @Override
    public UserDTO login(String email, String password) {

        Optional<UserEntity>  optUser=  userRepository.findByEmailAndPassword(email,password);
        if(optUser.isPresent()){
            return userConverter.convertEntityToDTO(optUser.get());
        }else{
            List<ErrorModel> errorModelList = new ArrayList<>();
            ErrorModel errorModel = new ErrorModel();
            errorModel.setMessage("incorrect email or password");
            errorModel.setType("Invalid login");

            errorModelList.add(errorModel);
            throw  new BusinessException(errorModelList);
        }
    }
}

package com.example.demo.service;

import com.example.demo.dto.PropertyDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PropertyService {

    PropertyDTO saveProperty(PropertyDTO propertyDTO);


    List<PropertyDTO> getAllProperties();

    PropertyDTO updateProperty(PropertyDTO propertyDTO, Long id);

//    patchProperty
PropertyDTO patchProperty(PropertyDTO propertyDTO, Long id);


    void  deleteProperty ( Long id);

}

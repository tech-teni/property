package com.example.demo.service;

import com.example.demo.dto.PropertyDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PropertyService {

    public PropertyDTO saveProperty (PropertyDTO propertyDTO);


    public List<PropertyDTO> getAllProperties();

    public PropertyDTO updateProperty (PropertyDTO propertyDTO, Long id);

//    patchProperty
public PropertyDTO patchProperty (PropertyDTO propertyDTO, Long id);


    void  deleteProperty ( Long id);

}

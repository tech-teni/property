package com.example.demo.converter;


import com.example.demo.dto.PropertyDTO;
import com.example.demo.entity.PropertyEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {


    public PropertyEntity convertDTOtoEntity(PropertyDTO propertyDTO)  {
        PropertyEntity propertyEntity = new PropertyEntity();
        propertyEntity.setTitle(propertyDTO.getTitle());
        propertyEntity.setAddress(propertyDTO.getAddress());
        propertyEntity.setOwnerName(propertyDTO.getOwnerName());
        propertyEntity.setOwnerEmail(propertyDTO.getOwnerEmail());
        propertyEntity.setDescription(propertyDTO.getDescription());
        propertyEntity.setPrice(propertyDTO.getPrice());


        return propertyEntity;
    }



    public PropertyDTO convertEntityToDTO(PropertyEntity propertyEntity)  {
        PropertyDTO propertyDTO = new PropertyDTO();
        propertyDTO.setTitle(propertyEntity.getTitle());
        propertyDTO.setAddress(propertyEntity.getAddress());
        propertyDTO.setOwnerName(propertyEntity.getOwnerName());
        propertyDTO.setOwnerEmail(propertyEntity.getOwnerEmail());
        propertyDTO.setDescription(propertyEntity.getDescription());
        propertyDTO.setPrice(propertyEntity.getPrice());
        propertyDTO.setId(propertyEntity.getId());


        return propertyDTO;
    }
}

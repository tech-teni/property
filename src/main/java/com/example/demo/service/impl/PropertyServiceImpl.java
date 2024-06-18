package com.example.demo.service.impl;

import com.example.demo.converter.PropertyConverter;
import com.example.demo.dto.PropertyDTO;
import com.example.demo.entity.PropertyEntity;
import com.example.demo.repository.PropertyRepository;
import com.example.demo.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class PropertyServiceImpl  implements PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    private PropertyConverter propertyConverter;

    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
    PropertyEntity pe= propertyConverter.convertDTOtoEntity(propertyDTO);
        propertyRepository.save(pe);
        return propertyConverter.convertEntityToDTO(pe);
    }

    @Override
    public List<PropertyDTO> getAllProperties() {

        List<PropertyEntity>  listP = (List<PropertyEntity>) propertyRepository.findAll();

        List<PropertyDTO> li =  new ArrayList<>();
        for(PropertyEntity pe : listP){
            PropertyDTO dto = propertyConverter.convertEntityToDTO(pe);
            li.add(dto);
        }
        return  li ;
    }



    @Override
    public PropertyDTO updateProperty(PropertyDTO propertyDTO, Long id) {

        Optional<PropertyEntity> opt=  propertyRepository.findById(id);


        if(opt.isPresent()){
            PropertyEntity pe = opt.get();
            pe.setTitle(propertyDTO.getTitle());
            pe.setAddress(propertyDTO.getAddress());
            pe.setOwnerName(propertyDTO.getOwnerName());
            pe.setOwnerEmail(propertyDTO.getOwnerEmail());
            pe.setDescription(propertyDTO.getDescription());
            pe.setPrice(propertyDTO.getPrice());



            PropertyEntity ans =propertyRepository.save(pe);
            return propertyConverter.convertEntityToDTO(ans);
        }else{
            return null;
        }

    }

    @Override
    public PropertyDTO patchProperty(PropertyDTO propertyDTO, Long id) {
        Optional<PropertyEntity> opt=  propertyRepository.findById(id);


        if(opt.isPresent()){
            PropertyEntity pe = opt.get();
            pe.setPrice(propertyDTO.getPrice());



            PropertyEntity ans =propertyRepository.save(pe);
            return propertyConverter.convertEntityToDTO(ans);
        }else{
            return null;
        }
    }

    @Override
    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }


}

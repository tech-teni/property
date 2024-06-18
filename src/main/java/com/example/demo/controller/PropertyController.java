package com.example.demo.controller;

import com.example.demo.dto.PropertyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.impl.PropertyServiceImpl;

import java.util.List;


@RestController
@RequestMapping("/api/v1/properties")



public class PropertyController {

    @Autowired
private PropertyServiceImpl propertyService;

@GetMapping("")
    public ResponseEntity< List<PropertyDTO>> getAllProperty(){

    List<PropertyDTO>  propertyList=  propertyService.getAllProperties();


    return new ResponseEntity<>(propertyList, HttpStatus.FOUND);

}


    @PostMapping("/save")
    public ResponseEntity<PropertyDTO> saveProperty(@RequestBody PropertyDTO propertyDTO) {
        propertyDTO= propertyService.saveProperty(propertyDTO);
        System.out.println(propertyDTO);


        return new ResponseEntity<>(propertyDTO, HttpStatus.CREATED);


    }


    @PutMapping("/{propertyID}")
            public ResponseEntity<PropertyDTO>  updateProperty( @RequestBody PropertyDTO dto, @PathVariable("propertyID") Long id){

              PropertyDTO  pd = propertyService.updateProperty(dto, id);


              ResponseEntity<PropertyDTO> ans = new ResponseEntity<>(pd,HttpStatus.OK);
              return ans;

}


@PatchMapping("/{id}")
public  ResponseEntity<PropertyDTO>  patchProperty(@RequestBody PropertyDTO dto, @PathVariable("id") Long id){

    PropertyDTO  pd = propertyService.patchProperty(dto, id);


    return new ResponseEntity<>(pd,HttpStatus.OK);

}


@DeleteMapping("/{id}")
public ResponseEntity<String> deleteProperty (@PathVariable("id") Long  id){
    propertyService.deleteProperty(id);


    return new  ResponseEntity<>("Deleted successfully", HttpStatus.OK);
}

}

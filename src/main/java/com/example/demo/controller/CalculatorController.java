package com.example.demo.controller;

import com.example.demo.dto.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {


    @GetMapping("add/{num3}")
    public Double add(@RequestParam("num1") double num1,  @RequestParam("num2") double num2, @PathVariable("num3") double num3){

        return num1 + num2 + num3;
    }

    @GetMapping("sub/{num1}/{num2}")
    public Double sub (@PathVariable("num1") double num1, @PathVariable("num2") double num2){

                if(num1 > num2 ){

                     return   num1 -num2;
                }  else if (num2 > num1 ){
                   return num2-num1;
                }else{
                    return -1.0;
}


    }



    @PostMapping("/mul")
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDTO calculatorDTO){
        double result = 0;
        result= calculatorDTO.getNum1() * calculatorDTO.getNum2() * calculatorDTO.getNum3() * calculatorDTO.getNum4();
        ResponseEntity<Double> responseEntity= new ResponseEntity<>(result, HttpStatus.CREATED);
        return responseEntity;
    }
}

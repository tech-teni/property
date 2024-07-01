package com.example.demo.exception;


import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import  java.util.List;
import java.util.logging.Logger;

@ControllerAdvice
public class customExceptionHandler {
//private final Logger logger= (Logger) LoggerFactory.getLogger(this.getClass());
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public  ResponseEntity<List<ErrorModel>> handleFieldException(MethodArgumentNotValidException mex){
        System.out.println("MethodArgumentNotValidException exception is thrown");

        List<ErrorModel> errorModelList =new ArrayList<>();
        ErrorModel errorModel= new ErrorModel();
        List<FieldError> fieldErrorList=mex.getBindingResult().getFieldErrors();

                for(FieldError fe: fieldErrorList){
//                    logger.info("MY first log out message");
                    errorModel.setType(fe.getField());
                    errorModel.setMessage(fe.getDefaultMessage());
                    errorModelList.add(errorModel);
                }
        return  new ResponseEntity<List<ErrorModel>>(errorModelList, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(BusinessException.class)
    public  ResponseEntity<List<ErrorModel>> handleBusinessException(BusinessException bex){
        System.out.println("Business exception is thrown");
        return  new ResponseEntity<List<ErrorModel>>(bex.getErrors(), HttpStatus.BAD_REQUEST);
    }
}

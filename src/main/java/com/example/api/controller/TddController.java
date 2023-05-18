package com.example.api.controller;

import com.example.api.service.TddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TddController {

    @Autowired private TddService tddService;
    @GetMapping("/hello")
    public ResponseEntity<String> getName(){
        try {
            return ResponseEntity.ok(tddService.getFinalName("Akshit", "kumar"));
        }catch (Exception e){
            return (ResponseEntity<String>) ResponseEntity.internalServerError();
        }
    }

}

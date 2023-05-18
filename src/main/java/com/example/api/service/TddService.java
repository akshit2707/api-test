package com.example.api.service;

import org.springframework.stereotype.Service;

@Service
public class TddService {

    public String getFinalName(String firstName, String lastName){
        if(firstName.isBlank() && lastName.isBlank())
            return null;
        return firstName+" "+lastName;
    }
}

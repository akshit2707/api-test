package com.example.api.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class TddServiceTest {

    @InjectMocks
    private TddService tddService;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testApiToFectchFirstNameAndLastName(){
        String firstName  = "Akshit";
        String lastName = "Kumar";
        String finalAns = tddService.getFinalName(firstName,lastName);
        Assertions.assertEquals("Akshit Kumar",finalAns);
    }

    @Test
    void testApiToFectchFirstNameAndLastNameWithNoNameAnd(){
        String firstName  = "";
        String lastName = "";
        String finalAns = tddService.getFinalName(firstName,lastName);
        Assertions.assertNull(finalAns);
    }
}

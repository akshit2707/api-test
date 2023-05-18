package com.example.api.controller;

import com.example.api.service.TddService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class TddControllerTest {

    @InjectMocks private TddController tddController;
    @Mock private TddService tddService;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void testTddController(){
        Mockito.when(tddService.getFinalName(Mockito.anyString(),Mockito.anyString())).thenReturn("Akshit Kumar");
        ResponseEntity<String> entity = tddController.getName();
        Assertions.assertEquals(HttpStatus.OK,entity.getStatusCode());
        System.out.println(entity);
        Assertions.assertEquals("Akshit Kumar", entity.getBody());

    }
    @Test
    void testTddController123(){
        Mockito.when(tddService.getFinalName(Mockito.anyString(),Mockito.anyString())).thenThrow(new RuntimeException());
        ResponseEntity<String> entity = tddController.getName();
        Assertions.assertEquals(HttpStatus.BAD_REQUEST,entity.getStatusCode());

    }
}

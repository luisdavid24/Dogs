package com.dogsBack.dogsSpringBack.controller;

import com.dogsBack.dogsSpringBack.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class DogController {

    @Autowired
    private DogRepository dogsRepository;
}

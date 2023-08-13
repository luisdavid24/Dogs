package com.dogsBack.dogsSpringBack.controller;

import com.dogsBack.dogsSpringBack.model.Dog;
import com.dogsBack.dogsSpringBack.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class DogController {

    @Autowired
    private DogRepository dogsRepository;

    @PostMapping("/dog")
    Dog newUser(@RequestBody Dog newDog){
        return dogsRepository.save(newDog);
    }
    @GetMapping("/dogs")
    List<Dog> getAllUsers(){
        return dogsRepository.findAll();
    }

}

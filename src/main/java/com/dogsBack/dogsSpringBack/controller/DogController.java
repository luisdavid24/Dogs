package com.dogsBack.dogsSpringBack.controller;

import com.dogsBack.dogsSpringBack.model.Dog;
import com.dogsBack.dogsSpringBack.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//se usa para marcar la clase como un controlador para las solicitudes HTTP y devolver un JSON o XML.
@CrossOrigin("http://localhost:3000")//Se utiliza para la configuracion de politicas de intercambio de recursos entre dominios en servicios web
public class DogController {

    @Autowired//es para poder hacer la inyeccion de dependecias.
    private DogRepository dogsRepository;

    @PostMapping("/dog")//sirve para manejar las solicitudes HTTP POST
    Dog newUser(@RequestBody Dog newDog){
        return dogsRepository.save(newDog);
    }
    @GetMapping("/dogs")//sirve para manejar las solicitudes HTTP GET
    List<Dog> getAllUsers(){
        return dogsRepository.findAll();
    }

}

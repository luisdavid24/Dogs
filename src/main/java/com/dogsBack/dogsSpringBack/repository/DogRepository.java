package com.dogsBack.dogsSpringBack.repository;

import com.dogsBack.dogsSpringBack.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository  extends JpaRepository<Dog,Long> {

}

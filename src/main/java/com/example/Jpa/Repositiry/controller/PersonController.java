package com.example.Jpa.Repositiry.controller;

import com.example.Jpa.Repositiry.entyti.Person;
import com.example.Jpa.Repositiry.model.PersonResponce;
import com.example.Jpa.Repositiry.service.impl.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService ;
    @GetMapping("{id}")
    public PersonResponce getPerson (@PathVariable Integer id){
         return personService.getperson(id);


    }
}

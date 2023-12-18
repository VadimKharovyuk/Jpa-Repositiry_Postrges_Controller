package com.example.Jpa.Repositiry.service.impl;

import com.example.Jpa.Repositiry.entyti.Person;
import com.example.Jpa.Repositiry.maper.PersonMapper;
import com.example.Jpa.Repositiry.model.PersonResponce;
import com.example.Jpa.Repositiry.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class PersonServisImpl implements PersonService {

    private  final PersonRepository personRepository ;
    private final PersonMapper personMapper ;
    @Override
    public PersonResponce getperson(Integer id) {
       Person person =personRepository.findById(id).orElseThrow(RuntimeException::new);
       return  personMapper.personResponce(person);



    }
}

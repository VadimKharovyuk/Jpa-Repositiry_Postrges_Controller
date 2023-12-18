package com.example.Jpa.Repositiry.maper;

import com.example.Jpa.Repositiry.entyti.Person;
import com.example.Jpa.Repositiry.model.PersonResponce;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    public PersonResponce personResponce (Person person) {
        return new PersonResponce()
                .setName(person.getName())
                .setAge(person.getAge());

    }


}

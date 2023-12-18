package com.example.Jpa.Repositiry.repository;

import com.example.Jpa.Repositiry.entyti.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository  extends CrudRepository<Person,Integer> {
}

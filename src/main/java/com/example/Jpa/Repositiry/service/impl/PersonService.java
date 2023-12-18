package com.example.Jpa.Repositiry.service.impl;

import com.example.Jpa.Repositiry.model.PersonResponce;
import org.springframework.stereotype.Service;


public interface  PersonService  {
    PersonResponce getperson (Integer id);

}

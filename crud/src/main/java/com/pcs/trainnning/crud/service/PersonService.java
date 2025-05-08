package com.pcs.trainnning.crud.service;

import com.pcs.trainnning.crud.entity.Person;
import com.pcs.trainnning.crud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    public void save(Person person){
        personRepository.save(person);
    }
}

package com.pcs.trainnning.crud.controller;

import com.pcs.trainnning.crud.entity.Person;
import com.pcs.trainnning.crud.exception.EntityNotFoundException;
import com.pcs.trainnning.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
C - Creating an entry in DB - POST 	- /person {body -> name:"Virat", age:36}

R - Reading from DB	    - GET   	- /person -> All persons
					- /person/{id}  -> /person/1 -> get single person by id
					- /person/name/{name} - person with name
					- /person/age/{age} - person with age

U - Update		    - PUT	- /person {body -> id:1, name:"Virat", age:38}

D - Delete		    - DELETE	- /person/{id}  -> /person/1 -> delete person by id
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping
    public List<Person> getAllPersons(){
        //get all person from table
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") Long id){
        //get this id from table
        return personService.getPersonById(id).orElseThrow(EntityNotFoundException::new);
    }

    @PostMapping
    public void savePerson(@RequestBody Person person){
        personService.save(person);
    }

    @PutMapping
    public void updatePerson(@RequestBody Person person){
        personService.save(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable("id") Long id){
        personService.deleteById(id);
    }
}

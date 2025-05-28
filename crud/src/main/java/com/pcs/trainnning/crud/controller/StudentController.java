package com.pcs.trainnning.crud.controller;

/*
http://localhost:8080
GET   - /student - Get all students
GET   - /student/{id} - get one specific student data with id
POST  - /student - pass student information in body
PUT   - /student - pass student information in body
DELETE - /student/{id} - delete one specific student data with id
 */

import com.pcs.trainnning.crud.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    //GET   - /student - Get all students
    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return new ArrayList<>();
    }

    //GET   - /student/{id} - get one specific student data with this id
    @GetMapping("/student/{id}")
    public Student getStudentWithId(@PathVariable("id") String id) {
        System.out.println("Get data request received for id " + id);
        return new Student("Virat", "Delhi", "10", 18);
    }

    //POST  - /student - pass student information in body
    @PostMapping("/student")
    public void saveStudent(@RequestBody Student student) {
        //write code to save student
        System.out.println("Received student save request " + student);
    }

    //PUT   - /student - pass student information in body
    @PutMapping("/student")
    public void updateStudent(@RequestBody Student student) {
        //write code to update student
        System.out.println("Received student update request " + student);
    }

    //DELETE - /student/{id} - delete one specific student data with id
    @DeleteMapping("/student/{id}")
    public void deleteDeleteStudent(@PathVariable("id") String id) {
        //write code to delete the student
        System.out.println("received delete request for id " + id);
    }


}

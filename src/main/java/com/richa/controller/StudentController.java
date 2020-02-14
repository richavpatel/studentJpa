package com.richa.controller;

import com.richa.model.Student;
import com.richa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value ="/students")
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    RestTemplate restTemplate;
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping(value ="/emp") // This for testing RestTemplate GetFOr OBJECT
    public List<Object> getAll(){
        String url = "http://localhost:8080/employees";
        Object[] objects = restTemplate.getForObject(url,Object[].class);
        return Arrays.asList(objects);
    }

    @GetMapping(value = "/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getOneStudent(id);
    }
    @PutMapping(value = "/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student){
        return studentService.updateStudent(id,student);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }




}

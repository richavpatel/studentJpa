package com.richa.student.first.controller;

import com.richa.student.first.model.Student;
import com.richa.student.first.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public  Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
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

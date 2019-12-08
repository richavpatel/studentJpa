package com.richa.student.first.service;
import com.richa.student.first.model.Student;
import com.richa.student.first.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
    public List<Student> getAllStudent() {
        return studentRepository.findAll();

    }
    public Student getOneStudent(int id) {
        return studentRepository.findById(id).get();
    }

    public Student updateStudent(int id, Student student) {

        return studentRepository.save(student);

    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}

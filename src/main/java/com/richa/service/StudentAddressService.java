package com.richa.service;
import com.richa.model.Student;
import com.richa.model.StudentAddress;
import com.richa.repository.AddressRepository;
import com.richa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentAddressService {

    @Autowired
    AddressRepository addressRepository;
    @Autowired
    StudentRepository studentRepository;

    public StudentAddress addAddress(StudentAddress address, int studentId) {
        Student s1 = studentRepository.getOne(studentId);
        address.setStudent(s1);
        return addressRepository.save(address);
    }
//    public List<Address> getAllAddress() {
//        return addressRepository.findAll();
//
//    }
    public List<StudentAddress> getAllAddress(int studentId) {
        return addressRepository.findByStudentId(studentId);
    }

    public StudentAddress updateAddress(int id, StudentAddress address) {
       address.setId(id);
        return addressRepository.save(address);

    }

    public void deleteAddress(int id) {
        addressRepository.deleteById(id);
    }
}

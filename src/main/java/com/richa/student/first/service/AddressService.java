package com.richa.student.first.service;
import com.richa.student.first.model.Address;
import com.richa.student.first.model.Student;
import com.richa.student.first.repository.AddressRepository;
import com.richa.student.first.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;
    @Autowired
    StudentRepository studentRepository;

    public Address addAddress(Address address, int studentId) {
        Student s1 = studentRepository.getOne(studentId);
        address.setStudent(s1);
        return addressRepository.save(address);
    }
//    public List<Address> getAllAddress() {
//        return addressRepository.findAll();
//
//    }
    public List<Address> getAllAddress(int studentId) {
        return addressRepository.findByStudentId(studentId);
    }

    public Address updateAddress(int id, Address address) {
       address.setId(id);
        return addressRepository.save(address);

    }

    public void deleteAddress(int id) {
        addressRepository.deleteById(id);
    }
}

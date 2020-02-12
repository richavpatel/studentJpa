package com.richa.controller;
import com.richa.model.StudentAddress;
import com.richa.service.StudentAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/address")
public class StudentAddressController {

    @Autowired
    StudentAddressService addressService;

    @PostMapping(value = "/{student_id}")
    public StudentAddress addAddress(@RequestBody StudentAddress address, @PathVariable int student_id){
        return addressService.addAddress(address, student_id);
    }
    //we do not need this because in student method we are already watching by student/1
    @GetMapping(value = "/{student_id}")
    public List<StudentAddress> getAllAddress(@PathVariable int student_id){
        return addressService.getAllAddress(student_id);
    }
    @PutMapping(value = "/{id}")
    public StudentAddress updateAddress(@PathVariable int id, @RequestBody StudentAddress address){
        return addressService.updateAddress(id,address);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteAddress(@PathVariable int id){
        addressService.deleteAddress(id);
    }




}

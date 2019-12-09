package com.richa.student.first.controller;


import com.richa.student.first.model.Address;
import com.richa.student.first.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping(value = "/{student_id}")
    public  Address addAddress(@RequestBody Address address, @PathVariable int student_id){
        return addressService.addAddress(address, student_id);
    }
    //we do not need this because in student method we are already watching by student/1
    @GetMapping(value = "/{student_id}")
    public List<Address> getAllAddress(@PathVariable int student_id){
        return addressService.getAllAddress(student_id);
    }
    @PutMapping(value = "/{id}")
    public Address updateAddress(@PathVariable int id, @RequestBody Address address){
        return addressService.updateAddress(id,address);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteAddress(@PathVariable int id){
        addressService.deleteAddress(id);
    }




}

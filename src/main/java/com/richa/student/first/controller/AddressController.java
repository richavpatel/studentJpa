package com.richa.student.first.controller;


import com.richa.student.first.model.Address;
import com.richa.student.first.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(value ="/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping(value = "/students/{student_id}/address")
    public  Address addAddress(@RequestBody Address address, @PathVariable int student_id){
        return addressService.addAddress(address, student_id);
    }
    @GetMapping(value = "/students/{student_id}/address")
    public List<Address> getAllAddress(@PathVariable int student_id){
        return addressService.getAllAddress(student_id);
    }
    @PutMapping(value = "/students/{student_id}/address")
    public Address updateAddress(@PathVariable int id, @RequestBody Address address, @PathVariable String student_id){
        return addressService.updateAddress(id,address);
    }
    @DeleteMapping(value = "/students/{student_id}/address")
    public void deleteAddress(@PathVariable int id, @PathVariable String student_id){
        addressService.deleteAddress(id);
    }




}

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

    @PostMapping
    public  Address addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    @GetMapping
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    @GetMapping(value = "/{id}")
    public Address getAddress(@PathVariable int id){
        return addressService.getOneAddress(id);
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

package com.richa.student.first.service;
import com.richa.student.first.model.Address;
import com.richa.student.first.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }
    public List<Address> getAllAddress() {
        return addressRepository.findAll();

    }
    public Address getOneAddress(int id) {
        return addressRepository.findById(id).get();
    }

    public Address updateAddress(int id, Address address) {
       // address.setId(id);
        return addressRepository.save(address);

    }

    public void deleteAddress(int id) {
        addressRepository.deleteById(id);
    }
}

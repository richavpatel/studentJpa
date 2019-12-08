package com.richa.student.first.repository;

import com.richa.student.first.model.Address;
import com.richa.student.first.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
}

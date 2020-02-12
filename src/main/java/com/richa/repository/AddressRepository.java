package com.richa.repository;

import com.richa.model.StudentAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<StudentAddress,Integer> {
    List<StudentAddress> findByStudentId(int studentId );
}

package com.richa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmplyoeeController {

    @Autowired
    RestTemplate restTemplate;

/*
  @GetMapping
    public List<Employee> gellEmp(){
        String Url ="http://localhost:8080/employees";
        Object[] employeeResponseEntity = restTemplate.getForObject(Url,Employee[].class);
      return Arrays.asList(employeeResponseEntity);
    }
*/

    @GetMapping
    public ResponseEntity<String> gellResEmp(){
        String Url ="http://localhost:8080/employees";
        ResponseEntity<String> employeeResponseEntity = restTemplate.getForEntity(Url,String.class);
        System.out.println(employeeResponseEntity);
        return employeeResponseEntity;

    }

   /* @GetMapping(value ="/emp") // This for testing RestTemplate GetFOr OBJECT
    public List<Object> getAll(){
        String url = "http://localhost:8080/employees";
        Object[] objects = restTemplate.getForObject(url,Object[].class);
        return Arrays.asList(objects);
    }*/

}

package com.richa.service;

import com.richa.model.User;
import com.richa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Iterable<User>  listAll(){
        return userRepository.findAll();
    }

      //one use save
    public User save(User user) {
        return userRepository.save(user);
    }
      // save all list users
    public Iterable<User> save(List<User> users) {
        return userRepository.saveAll(users);
    }

   
}

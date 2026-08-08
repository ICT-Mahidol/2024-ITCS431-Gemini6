package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);

}

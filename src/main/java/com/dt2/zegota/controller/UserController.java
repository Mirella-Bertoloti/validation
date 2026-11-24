package com.dt2.zegota.controller;

import com.dt2.zegota.entities.User;
import com.dt2.zegota.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/zegota")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public String criar(@RequestBody User u){
        return "User calvo!" + repository.save(u);
    }

    @GetMapping
    public List<User> buscar(){
        return repository.findAll();
    }


}

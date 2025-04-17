package com.wijith.controller;

import com.wijith.model.User;
import com.wijith.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/api/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody @Valid User user) {
        return userService.createUser(user);
    }

    @GetMapping("/api/users")
    @ResponseStatus(HttpStatus.OK)
    public List <User> getUser(){
       return userService.getAllUsers();
    }
    @GetMapping("/api/users/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public User getUserByID(@PathVariable("userId") Long id) throws Exception {
            return userService.getUserById(id);
    }
    @PutMapping("/api/users/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public User updateUser (@RequestBody User user, @PathVariable Long id) throws Exception {
        return userService.updateUser(id,user);
    }
    @DeleteMapping("/api/users/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteUserById(@PathVariable Long id ) throws Exception{
        userService.deleteUser(id);
        return "User deleted";
    }
}

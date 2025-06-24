package com.example.store.Controllers;

import com.example.store.dtos.UserDto;
import com.example.store.entities.User;
import com.example.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping
    public User putUser(@RequestBody User user){
        return userService.putUser(user);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteUser(@PathVariable Long id){
        userService.deleteById(id);
    }
}

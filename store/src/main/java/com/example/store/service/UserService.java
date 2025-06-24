package com.example.store.service;

import com.example.store.dtos.UserDto;
import com.example.store.entities.User;
import com.example.store.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public List<UserDto> getAllUsers(){
        return userRepository.findAll()
                .stream()
                .map(user ->  new UserDto(
                        user.getId(),
                        user.getName()
                )).collect(Collectors.toList());
    }

    public User putUser(User user){
        return userRepository.save(user);
    }

    public void deleteById(Long id){
         userRepository.deleteById(id);
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }
}

package com.example.deleteuserservice.service;

import com.example.deleteuserservice.model.User;
import com.example.deleteuserservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findById(Long id) { // ✅ Agrega este método
        return userRepository.findById(id);
    }

    public void deleteById(Long id) { // ✅ Agrega este método
        userRepository.deleteById(id);
    }
}

package com.example.deleteuserservice.service;

import com.example.deleteuserservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            // Aquí puedes enviar la notificación a SNS
        } else {
            throw new IllegalArgumentException("User not found with id: " + id);
        }
    }
}

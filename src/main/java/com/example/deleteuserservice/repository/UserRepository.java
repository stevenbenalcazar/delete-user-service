package com.example.deleteuserservice.repository;

import com.example.deleteuserservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.example.k_progect.repositories;

import com.example.k_progect.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
}

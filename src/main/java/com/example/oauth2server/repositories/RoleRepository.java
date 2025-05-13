package com.example.oauth2server.repositories;

import com.example.oauth2server.entity.UserEntity;
import com.example.oauth2server.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<UserRole, Integer> {
//        Optional<UserEntity> findByUsername(String username);

}

package com.example.oauth2server.repositories;

import com.example.oauth2server.entity.Privilege;
import com.example.oauth2server.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {
//        Optional<UserEntity> findByUsername(String username);

}

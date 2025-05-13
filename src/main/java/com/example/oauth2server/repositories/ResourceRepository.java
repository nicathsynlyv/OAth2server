package com.example.oauth2server.repositories;

import com.example.oauth2server.resources.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
    // Additional query methods if needed

}

package com.example.oauth2server.repositories;

import com.example.oauth2server.entity.OAuthClientDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OAuthClientDetailsRepository  extends JpaRepository<OAuthClientDetails, Long> {
    // Additional query methods if needed

}


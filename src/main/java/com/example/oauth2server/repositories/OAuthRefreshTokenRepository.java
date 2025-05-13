package com.example.oauth2server.repositories;

import com.example.oauth2server.entity.OAuthRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OAuthRefreshTokenRepository extends JpaRepository<OAuthRefreshToken, String> {
    // Define custom queries if needed

}

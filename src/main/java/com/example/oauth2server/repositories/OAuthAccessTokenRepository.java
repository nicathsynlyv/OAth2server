package com.example.oauth2server.repositories;

import com.example.oauth2server.entity.OAuthAccessToken;
import org.springframework.data.jpa.repository.JpaRepository;

interface OAuthAccessTokenRepository extends JpaRepository<OAuthAccessToken, String> {
    // Define custom queries if needed

}

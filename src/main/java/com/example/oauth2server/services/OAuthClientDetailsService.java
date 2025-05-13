package com.example.oauth2server.services;

import com.example.oauth2server.dtos.OAuthClientDetailDto;
import com.example.oauth2server.entity.OAuthClientDetails;
import com.example.oauth2server.repositories.OAuthClientDetailsRepository;
import com.example.oauth2server.resources.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class OAuthClientDetailsService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    OAuthClientDetailsRepository clientDetailsRepository;

    public OAuthClientDetailDto create(OAuthClientDetailDto dto){
        OAuthClientDetails ent = OAuthClientDetails.builder()
                .clientId(dto.getClientId())
                .clientSecret(passwordEncoder.encode(dto.getClientSecret()))
                .scope("read")
                .authorizedGrantTypes("password,refresh_token")
                .webServerRedirectUri(null)
                .accessTokenValidity(900)
                .refreshTokenValidity(1800)
                .resource(Resource.builder().id(dto.getResourceId()).build())
                .build();
        clientDetailsRepository.save(ent);
        return dto;
    }
}


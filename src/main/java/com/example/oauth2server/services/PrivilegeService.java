package com.example.oauth2server.services;

import com.example.oauth2server.dtos.PrivilegeDto;
import com.example.oauth2server.entity.Privilege;
import com.example.oauth2server.repositories.PrivilegeRepository;
import org.springframework.stereotype.Service;

@Service
public class PrivilegeService {
    private final PrivilegeRepository repository;

    public PrivilegeService(PrivilegeRepository repository) {
        this.repository = repository;
    }

    public PrivilegeDto createPrivilege(PrivilegeDto dto){
        Privilege privilege = Privilege.builder()
                .name(dto.getName())
                .build();
        repository.save(privilege);
        return  dto;
    }
}

package com.example.oauth2server.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data

public class UserRolesDto {
    private Integer userId;
    private List<Integer> roleIds;
}

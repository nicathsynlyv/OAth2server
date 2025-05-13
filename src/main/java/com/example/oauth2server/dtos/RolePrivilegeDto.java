package com.example.oauth2server.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data

public class RolePrivilegeDto {
    private Integer roleId;
    private List<Integer> privilegeId;
}

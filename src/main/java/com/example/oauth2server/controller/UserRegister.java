package com.example.oauth2server.controller;

import com.example.oauth2server.dtos.UserDto;
import com.example.oauth2server.dtos.UserRolesDto;
import com.example.oauth2server.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserRegister {
    private final UserService userService;

    public UserRegister(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users/register")
    public ResponseEntity<?> createUser(@RequestBody UserDto dto){
        return ResponseEntity.ok(userService.createUser(dto));
    }


    @GetMapping("/users")
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.ok(userService.getAll());
    }

    @PostMapping("/user-roles")
    public ResponseEntity<?> createUserRoles(@RequestBody UserRolesDto dto){
        return ResponseEntity.ok(userService.createUserRoles(dto));
    }
}

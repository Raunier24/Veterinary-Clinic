package com.veterinaryProyect.Veterinary_Clinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaryProyect.Veterinary_Clinic.dto.AuthRequestDTO;
import com.veterinaryProyect.Veterinary_Clinic.services.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody AuthRequestDTO authRequest) {
        return authService.authenticate(authRequest.getUsername(), authRequest.getPassword());
    }
}

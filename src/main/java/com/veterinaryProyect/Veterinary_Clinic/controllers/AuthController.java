package com.veterinaryProyect.Veterinary_Clinic.controllers;


import com.veterinaryProyect.Veterinary_Clinic.dto.AuthRequestDTO;
import com.veterinaryProyect.Veterinary_Clinic.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
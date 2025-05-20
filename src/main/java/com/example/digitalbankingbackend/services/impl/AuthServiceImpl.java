package com.example.digitalbankingbackend.services.impl;

import com.example.digitalbankingbackend.dtos.RegisterRequest;
import com.example.digitalbankingbackend.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public Object register(RegisterRequest request) {
        // TODO: Implement user registration logic (save user to DB, hash password, etc.)
        return "User registered successfully: " + request.getUsername();
    }
} 
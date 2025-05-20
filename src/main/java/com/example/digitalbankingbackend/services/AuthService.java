package com.example.digitalbankingbackend.services;

import com.example.digitalbankingbackend.dtos.RegisterRequest;

public interface AuthService {
    Object register(RegisterRequest request);
} 
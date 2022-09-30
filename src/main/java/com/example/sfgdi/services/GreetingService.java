package com.example.sfgdi.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public interface GreetingService {
    String sayGreeting();
}

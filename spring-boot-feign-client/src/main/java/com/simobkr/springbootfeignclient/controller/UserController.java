package com.simobkr.springbootfeignclient.controller;

import com.simobkr.springbootfeignclient.client.UserClient;
import com.simobkr.springbootfeignclient.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
@RequiredArgsConstructor
public class UserController {

    private final UserClient client;

    @GetMapping
    List<UserResponse> getAllUsers() {
        return client.getAllUsers();
    }
}

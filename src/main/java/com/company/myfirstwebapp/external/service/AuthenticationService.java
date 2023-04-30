package com.company.myfirstwebapp.external.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean isAuthenticated(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("Vahe");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");

        return isValidUsername && isValidPassword;
    }
}

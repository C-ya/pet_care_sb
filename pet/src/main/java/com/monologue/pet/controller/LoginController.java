package com.monologue.pet.controller;

import com.monologue.pet.model.User;
import com.monologue.pet.model.Login;
import com.monologue.pet.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    String loginPet(@RequestBody Login login) {
       // Login login = null;
        return loginService.loginPet(login);
    }

}


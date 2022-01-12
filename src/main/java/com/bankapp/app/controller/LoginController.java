package com.bankapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.app.domain.Account;
import com.bankapp.app.domain.LoginData;
import com.bankapp.app.service.LoginService;

@RestController
public class LoginController {

	@Autowired
    private LoginService loginService;
	
	@PostMapping("/login")
    public Account checkLogin(@RequestBody LoginData loginData) {
		//return name;
        return loginService.validateLogin(loginData);
        }
}

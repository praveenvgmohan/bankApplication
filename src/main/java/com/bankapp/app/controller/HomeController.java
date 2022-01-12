package com.bankapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.app.domain.Account;
import com.bankapp.app.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	private HomeService homeService;
	private Account account;
	@GetMapping("/home")
	public Account MyHome(@RequestParam String accountNumber) {
		account=homeService.getMyAccount(accountNumber);
		return account;
	}
	public String getAccountno() {
		return account.getAccountnumber();
	}
}
//http://localhost:8080/accountBalance?toAccountNumber=123456781&amount=12345
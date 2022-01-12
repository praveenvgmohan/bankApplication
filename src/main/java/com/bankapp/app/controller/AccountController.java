package com.bankapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.app.service.HomeService;
import com.bankapp.app.service.TransferService;

@RestController
public class AccountController {

	@Autowired
    private TransferService accountService;
    @Autowired
    private HomeService home;
    @RequestMapping("/accountDetails")
    public String fetchAccountDetails(@RequestParam String accountNumber) {
        return accountService.getAccount(accountNumber);
    }

    @RequestMapping("/accountBalance")
    public String getBalance(@RequestParam String toAccountNumber, @RequestParam int amount) {
    	String fromAccountNumber= home.getAccountno();
    	return accountService.Transfer(fromAccountNumber, toAccountNumber, amount);
    }
}

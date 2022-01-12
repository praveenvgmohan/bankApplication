package com.bankapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.app.service.ProfileService;

@RestController
public class ProfileController {
	@Autowired
	private ProfileService profileService;
	
	
	@RequestMapping("/getUser")
    public String getUser(@RequestParam String accountNumber) {
        return profileService.getUser(accountNumber);
    }
   
    @RequestMapping("/updatePassword")
    public String updatePassword(@RequestParam String accountNumber,@RequestParam String currentPassWord,@RequestParam String newPassWord) {
        return profileService.updatePassword(accountNumber,currentPassWord,newPassWord);
    }
}

package com.bankapp.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.app.domain.Account;
import com.bankapp.app.domain.LoginData;
import com.bankapp.app.domain.User;
import com.bankapp.app.repository.AccountRepository;
import com.bankapp.app.repository.UserRepository;

@Service
public class LoginService {
	
	@Autowired
    private UserRepository userRepository;
	@Autowired
	private AccountRepository accountRepository;
	private String accountNumber;
	private Account accountInfo;
    public LoginService(UserRepository userRepository,AccountRepository accountRepository) {
        this.userRepository=userRepository;
        this.accountRepository=accountRepository;
    }
	
	
    public Account validateLogin(LoginData loginData) {
        if(userRepository.existsByUsername(loginData.getUserName())) {
            
            Iterable<User> userData = userRepository.findAll();
            
            for(User user : userData) {
                if(user.getUsername().equals(loginData.getUserName())) {
                    
                    if(user.getPassword().equals(loginData.getPassword())) {
                    	accountNumber=user.getAccountnumber();
                    	accountInfo=accountRepository.findByAccountnumber(accountNumber);
                        return accountInfo;
                    }
                    else {
                        return null;
                    }
                }  
            }
                return null;
        }
        else {
            return null;
        }
    }
	
	
	
}

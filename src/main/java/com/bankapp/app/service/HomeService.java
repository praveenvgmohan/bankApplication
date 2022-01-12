package com.bankapp.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.app.domain.Account;
import com.bankapp.app.repository.AccountRepository;

@Service
public class HomeService {

	@Autowired
    private AccountRepository accountRepository;
	private Account account;
    public void homeService(AccountRepository accountRepository) {
        this.accountRepository =accountRepository;
    }
    
    
    public String getAccountno() {
		return account.getAccountnumber();
	}
    
    public Account getMyAccount(String accountNumber){
    	 Account account=accountRepository.findByAccountnumber(accountNumber);
    	 return account;
//         return "Account Details \n"+"Account Number: \t"+acc.getAccountnumber()+"\n"
//                 +"Account IFSC: \t"+acc.getIfsccode()+"\n"
//                 +"Account Branch: \t"+acc.getAddress()+"\n"
//                 +"Balance: \t"+acc.getBalance();
    }
}

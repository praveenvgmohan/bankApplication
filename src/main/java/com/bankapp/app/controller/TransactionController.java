package com.bankapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.app.domain.Transactions;
import com.bankapp.app.service.TransactionsService;


@RestController
public class TransactionController {

	@Autowired
    private TransactionsService transactionService;
   
    //Transaction Handlers
    @PostMapping(value="addAmount")
    public String addAmount(@RequestParam int amount,@RequestParam String reciverAccountnumber, @RequestParam String senderAccountnumber)
    {
        Transactions receiverTransaction=new Transactions(amount,"Credit",reciverAccountnumber);
        transactionService.saveTransactions(receiverTransaction);
        Transactions senderTransaction=new Transactions(amount,"Debit",senderAccountnumber);
        transactionService.saveTransactions(senderTransaction);
        return "Transaction Successful";
    }
    
   
    @GetMapping(value="getAllTransactions")
    public List<Transactions> showAllTransactions(@RequestParam String accountNumber){
        return transactionService.findAllTransactions(accountNumber);
    }    
}

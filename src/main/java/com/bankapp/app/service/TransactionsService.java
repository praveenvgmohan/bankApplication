package com.bankapp.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.app.domain.Transactions;
import com.bankapp.app.repository.TransactionRepository;

@Service
public class TransactionsService {
	@Autowired
    private TransactionRepository transactionRepository;

 

    public Transactions saveTransactions(Transactions transaction) {
        return transactionRepository.save(transaction);
    }

 

    public List<Transactions> findAllTransactions(String account) {
        return transactionRepository.findByName(account);
    }
}

package com.bankapp.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bankapp.app.domain.Transactions;

public interface TransactionRepository extends CrudRepository<Transactions, Integer>{

	@Query (value= "select * from Transactions where acc_no= ?1", nativeQuery =true)
	List<Transactions> findByName(String account);

}

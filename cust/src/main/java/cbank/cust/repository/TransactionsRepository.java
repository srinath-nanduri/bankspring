package cbank.cust.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cbank.cust.entity.Transactions;


public interface TransactionsRepository extends JpaRepository<Transactions, Integer>{
	
	List<Transactions> findAllTransactionsByCid(int id);

}


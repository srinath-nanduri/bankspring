package cbank.cust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cbank.cust.entity.Transactions;
import cbank.cust.repository.TransactionsRepository;




@Service
public class TransactionsService {
	
	@Autowired
	private TransactionsRepository repo;
	
    public Transactions saveTransactions(Transactions u) {
    	return  repo.save(u);
    }

    public List<Transactions> getTransactionsById(int id) {
        return repo.findAllTransactionsByCid(id);
    }



}


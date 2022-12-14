package admin.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.crud.entity.Transactions;
import admin.crud.repository.TransactionsRepository;


@Service
public class TransactionsService {
	
	@Autowired
	private TransactionsRepository repo;
	
    public Transactions saveTransactions(Transactions u) {
    	return  repo.save(u);
    }

    public List<Transactions> saveTransactionss(List<Transactions> Transactionss) {
        return repo.saveAll(Transactionss);
    }

    public List<Transactions> getTransactionss() {
        return repo.findAll();
    }

    public Transactions getTransactionsById(int id) {
        return repo.findById(id).orElse(null);
    }



}

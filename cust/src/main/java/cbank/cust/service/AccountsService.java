package cbank.cust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cbank.cust.entity.Account;
import cbank.cust.repository.AccountsRepository;

@Service
public class AccountsService {

	@Autowired
	private AccountsRepository repo;
	

    public List<Account> getAccounts() {
        return repo.findAll();
    }
    
    public Account saveAccount(Account a) {
    	return  repo.save(a);
    }

    public Account getAccountById(int id) {
        return repo.findAccountByCid(id);
    }
    
    public Account getAccountByAno(String ano) {
        return repo.findAccountByAno(ano);
    }
    
	
}

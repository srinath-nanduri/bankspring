package cbank.cust.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cbank.cust.entity.Account;

public interface AccountsRepository extends JpaRepository<Account, Integer>{

	Account findAccountByCid(int id);
	
	Account findAccountByAno(String ano);
	
}

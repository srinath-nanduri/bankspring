package admin.crud.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import admin.crud.entity.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer>{
	

}

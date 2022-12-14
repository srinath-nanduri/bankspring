package cbank.cust.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cbank.cust.entity.Loan;

public interface LoanRepository  extends JpaRepository<Loan, Integer>{

}

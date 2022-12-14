package cbank.cust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cbank.cust.entity.Loan;
import cbank.cust.repository.LoanRepository;

@Service
public class LoanService {
	
	@Autowired
    private LoanRepository repo;

    public Loan saveLoan(Loan loan) {
        return  repo.save(loan);
    }

}

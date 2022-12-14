package cbank.cust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cbank.cust.entity.Issues;
import cbank.cust.repository.IssuesRepository;

@Service
public class IssuesService {

	@Autowired
	private IssuesRepository repo;
	
    public Issues saveIssue(Issues i) {
    	return  repo.save(i);
    }
	
}

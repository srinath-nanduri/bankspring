package admin.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.crud.entity.Issues;
import admin.crud.repository.IssuesRepository;



@Service
public class IssuesService {

	@Autowired
	private IssuesRepository repo;
	
    public List<Issues> getIssues() {
    	return  repo.findAll();
    }
	
}
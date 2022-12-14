package cbank.cust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cbank.cust.entity.Feedback;
import cbank.cust.repository.FeedbackRepository;


@Service
public class FeedbackService {

	  @Autowired
	    private FeedbackRepository repo;

	    public Feedback saveFeedback(Feedback f) {
	        return repo.save(f);
	    }
	    

	 

	    public List<Feedback> getFeedbacks() {
	        // TODO Auto-generated method stub
	        return repo.findAll();
	    }

	 
	
}

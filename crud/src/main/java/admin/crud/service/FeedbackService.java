package admin.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.crud.entity.Feedback;
import admin.crud.repository.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackRepository repo;
	
    public List<Feedback> getFeedback() {
    	return  repo.findAll();
    }
	
}

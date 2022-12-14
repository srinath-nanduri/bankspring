package admin.crud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import admin.crud.entity.Feedback;
import admin.crud.entity.Issues;
import admin.crud.entity.Transactions;
import admin.crud.service.FeedbackService;
import admin.crud.service.IssuesService;
import admin.crud.service.TransactionsService;


@RestController
@CrossOrigin(origins = "http://localhost:4201")
public class TransactionsController {

	@Autowired
    private TransactionsService service;
	
	@Autowired
    private IssuesService iservice;
	
	@Autowired
    private FeedbackService fservice;

    @PostMapping("/addTransaction")
    public Transactions addTransactions(@RequestBody Transactions Transactions) {
        return service.saveTransactions(Transactions);
    }

    @PostMapping("/addTransactions")
    public List<Transactions> addTransactionss(@RequestBody List<Transactions> Transactionss) {
        return service.saveTransactionss(Transactionss);
    }

    @GetMapping("/Transactions")
    public List<Transactions> findAllTransactionss() {
        return service.getTransactionss();
    }

    @GetMapping("/TransactionsById/{didi}")
    public Transactions findTransactionsById(@PathVariable int didi) {
        return service.getTransactionsById(didi);
    }
    
    @GetMapping("/Issues")
    public List<Issues> findAllIssues() {
        return iservice.getIssues();
    }
    
    @GetMapping("/Feedback")
    public List<Feedback> findAllFeedback() {
        return fservice.getFeedback();
    }

   

	
}


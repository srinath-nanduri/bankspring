package cbank.cust.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;

import java.util.Arrays;
//import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.bind.annotation.*;

import cbank.cust.entity.Feedback;
import cbank.cust.entity.Aadhar;
import cbank.cust.entity.Account;
import cbank.cust.entity.Customer;
import cbank.cust.entity.Issues;
import cbank.cust.entity.Loan;
import cbank.cust.entity.Payment;
import cbank.cust.entity.Transactions;
import cbank.cust.service.AadharService;
import cbank.cust.service.AccountsService;
import cbank.cust.service.CustomerService;
import cbank.cust.service.FeedbackService;
import cbank.cust.service.IssuesService;
import cbank.cust.service.LoanService;
import cbank.cust.service.TransactionsService;
import jakarta.mail.MessagingException;
import cbank.cust.service.EmailSenderService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

	@Autowired
    private CustomerService service;
	
	@Autowired
    private AccountsService aservice;
	
	@Autowired
    private TransactionsService tservice;
	
	@Autowired
    private IssuesService iservice;
	
	@Autowired
    private FeedbackService fservice;
	
	@Autowired
    private LoanService lservice;
	
	@Autowired
	private AadharService aadharservice;
	
	@Autowired
	private EmailSenderService eservice;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer Customer) {
        return service.saveCustomer(Customer);
    }

    @PostMapping("/addCustomers")
    public List<Customer> addCustomers(@RequestBody List<Customer> Customers) {
        return service.saveCustomers(Customers);
    }

    @GetMapping("/Customers")
    public List<Customer> findAllCustomers() {
        return service.getCustomers();
    }

    @GetMapping("/CustomerById/{didi}")
    public Customer findCustomerById(@PathVariable int didi) {
        return service.getCustomerById(didi);
    }
    
    @GetMapping("/val/{email}/{pass}")
    public List<String> valCustomer(@PathVariable String email, @PathVariable String pass){
    	
    	Customer temp = service.validCustomer(email, pass);
    	
    	if (temp==null) {
    		List<String> val = Arrays.asList("null", "null","false");
    		return val;
        	
    	}
    	else {
    		List<String> val = Arrays.asList(temp.getCfname(), Integer.toString(temp.getCid()), "true");
    		return val;
    	}
    	
    }
    
    @GetMapping("/Account/{didi}")
    public Account getAccountById(@PathVariable int didi) {
        return aservice.getAccountById(didi);
    }
    
    @GetMapping("/Transaction/{didi}")
    public List<Transactions> getTransactionById(@PathVariable int didi) {
        return tservice.getTransactionsById(didi);
    }
    
    
    @PostMapping("/addIssue")
    public Issues addIssues(@RequestBody Issues issue) {
        return iservice.saveIssue(issue);
    }
    
    @PostMapping("/addFeedback")
    public Feedback addFeedback(@RequestBody Feedback f) {
        return fservice.saveFeedback(f);
    }
    
    @PostMapping("/addLoan")
    public Loan addLoan(@RequestBody Loan l) {
    	return lservice.saveLoan(l);
    }
    
    @GetMapping("/valAcc/{id}")
    public String validateAccount(@PathVariable int id) {
        Customer cust =  service.getCustomerById(id);
        	return cust.getCinit();        
    }
    
    @PostMapping("/addAcc")
    public Account addAcc(@RequestBody Account a) {
    	
    	int c = a.getCid();

    	Customer cust = service.getCustomerById(c);
    	
    	cust.setCinit("true");
    	
    	service.saveCustomer(cust);
    	
    	
    	return aservice.saveAccount(a);
    	
    	
    	
    	
    }
    
    
    @GetMapping("/value/{id}/{pass}/{npass}")
    public Customer valPass(@PathVariable int id , @PathVariable String pass, @PathVariable String npass) {
//        return service.passChange(id, pass);
        
        Customer cust = service.passVal(id, pass);
        
        cust.setCpass(npass);
        return service.passChange(cust);       

    }
    
    @GetMapping("/emailval/{id}/{email}/{newemail}")
    public Customer valEmail(@PathVariable int id, @PathVariable String email,@PathVariable String newemail) {
        Customer cust = service.passEmailVal(id, email);
        cust.setCemail(newemail);
        return service.emailChange(cust);
    }
    
    @GetMapping("/mobileval/{id}/{mobile}/{newmobile}")
    public Customer valMobile(@PathVariable int id,@PathVariable String mobile, @PathVariable String newmobile ) {
        Customer cust = service.passMobileVal(id, mobile);
        cust.setCmobile(newmobile);
        return service.mobileChange(cust);
        
    }
    
    
    
    
//    Aadhar Rest API Endpoints.
    
    @GetMapping("/Aadhar")
    public List<Aadhar> findAllAadhar() {
        return aadharservice.getAllAadhar();
    }
 
 @PostMapping("/addAadhar")
    public Aadhar addAadhar(@RequestBody Aadhar Aadhar) {
        return aadharservice.saveAadhar(Aadhar);
    }
    
 
 
 	@PostMapping("/makePayment")
 	public String makePayment(@RequestBody Payment p) {
 		Account sacc = aservice.getAccountById(p.getId());
 		Account racc = aservice.getAccountByAno(p.getRaccno());
 		
 		if(sacc.getApin().equals(p.getPin())) {
 			if(sacc.getAbal() > p.getAmt()) {
 				double sbal = sacc.getAbal();
 				double rbal = racc.getAbal();
 				double amt = p.getAmt();
 				
 				sacc.setAbal(sbal-amt);
 				racc.setAbal(rbal+amt);

 				aservice.saveAccount(sacc);
 				aservice.saveAccount(racc);
 				
 				
 				
 				
 				Transactions st = new Transactions();
 				Transactions rt = new Transactions();
 				
 				st.setCid(sacc.getCid());
 				rt.setCid(racc.getCid());
 				
 				java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
 				
 				st.setTdate(sqlDate);
 				rt.setTdate(sqlDate);
 				
 				java.sql.Time sqlTime = new java.sql.Time(System.currentTimeMillis());
 		 		
 				st.setTtime(sqlTime);
 				rt.setTtime(sqlTime);
 				
 				st.setTwithdraw(amt);
 				rt.setTdeposit(amt);
 				
 				st.setTdeposit(0.0);
 				rt.setTwithdraw(0.0);
 				
 				st.setTbalance(sacc.getAbal());
 				rt.setTbalance(racc.getAbal());
 				
 				tservice.saveTransactions(st);
 				tservice.saveTransactions(rt);
 				
 				
 				return "Money Sent";
 				
 				
 			}
 		}
 		
 		else {
 			return "Wrong pin";
 		}
		return "Thank you";
 		
 		
 		

 		
 	}
 	
 	
 	@GetMapping("/sendEmail")
 	public void triggerMail(){
 		
 		
//			final ByteArrayResource inputStream = new ByteArrayResource(Files.readAllBytes(Paths.get(
//			        "C:/Users/Srinath.Nanduri/OneDrive - Brillio/Desktop/me_pic.jpg")));
			eservice.sendSimpleEmail("srinathnasa123@gmail.com", "Hi guys!", "Test");
	
		


	}
    

   

	
}

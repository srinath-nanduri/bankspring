package cbank.cust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cbank.cust.entity.Customer;
import cbank.cust.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;
	
    public Customer saveCustomer(Customer u) {
    	return  repo.save(u);
    }

    public List<Customer> saveCustomers(List<Customer> Customers) {
        return repo.saveAll(Customers);
    }

    public List<Customer> getCustomers() {
        return repo.findAll();
    }

    public Customer getCustomerById(int id) {
        return repo.findById(id).orElse(null);
    }
    
    public Customer validCustomer(String email, String pass) {
    	return repo.findCustomerByCemailAndCpass(email, pass);
    }
    
    public Customer passVal(int id,String pass) {
        return repo.findCustomerByCidAndCpass(id, pass);
    }
    
    public Customer passChange(Customer c) {
        return repo.save(c);
    }
    
    public Customer passEmailVal(int id,String email) {
        return repo.findCustomerByCidAndCemail(id, email);
    }
    
    public Customer emailChange(Customer c) {
        return repo.save(c);
    }
    
    public Customer passMobileVal(int id,String mobile) {
        return repo.findCustomerByCidAndCmobile(id, mobile);
    }
    
    public Customer mobileChange(Customer c) {
        return repo.save(c);
    }




}

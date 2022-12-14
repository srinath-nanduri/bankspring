package cbank.cust.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cbank.cust.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Customer findCustomerByCemailAndCpass(String cemail, String cpass);		
	
    Customer findCustomerByCidAndCpass(int cid, String cpass);
    
    Customer findCustomerByCidAndCemail(int cid, String cemail);
    
    Customer findCustomerByCidAndCmobile(int cid, String cmobile);
	
}

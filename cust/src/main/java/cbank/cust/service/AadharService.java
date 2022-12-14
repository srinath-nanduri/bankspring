package cbank.cust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cbank.cust.entity.Aadhar;
import cbank.cust.repository.AadharRepository;

@Service
public class AadharService {
    @Autowired
    private AadharRepository repo;
    
     public List<Aadhar> getAllAadhar() {
            return repo.findAll();
        }
     public Aadhar saveAadhar(Aadhar newUser) {
            return  repo.save(newUser);
        }
}
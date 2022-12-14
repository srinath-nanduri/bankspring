package cbank.cust.entity;

import jakarta.persistence.*;

@Entity
@Table(name="aadhar")
public class Aadhar {
    
    @Id
    @Column(name="mobile")
    private String mobile;
    
    @Column(name="aadhar")
    private String aadhar;
    
    @Column(name="email")
    private String email;
    
    @Column(name="pan")
    private String pan;
    
    
        
    public String getEmail() {
        return email;
    }



   public void setEmail(String email) {
        this.email = email;
    }



   public String getPan() {
        return pan;
    }



   public void setPan(String pan) {
        this.pan = pan;
    }



   public String getMobile() {
        return mobile;
    }



   public void setMobile(String mobile) {
        this.mobile = mobile;
    }



   public String getAadhar() {
        return aadhar;
    }



   public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }
    
    



}
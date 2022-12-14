package cbank.cust.entity;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name="loan")
public class Loan {
    @Id
    @GeneratedValue
    @Column(name="lid")
    private int lid;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="email")
    private String email;

    @Column(name="phoneno")
    private String phoneno;

    @Column(name="address")
    private String address;

    @Column(name="dob")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @Temporal(TemporalType.DATE)
    private Date dob;

    @Column(name="currentocc")
    private String currentocc;

    @Column(name="comname")
    private String comname;

    @Column(name="yoe")
    private String yoe;

    @Column(name="ltype")
    private String ltype;

    @Column(name="lamt")
    private String lamt;

    @Column(name="lperiod")
    private String lperiod;

    @Column(name="roi")
    private String roi;


    public int getLid() {
        return lid;
    }

 

    public void setLid(int lid) {
        this.lid = lid;
    }

 

    public String getFirstname() {
        return firstname;
    }

 

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

 

    public String getLastname() {
        return lastname;
    }

 

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

 

    public String getEmail() {
        return email;
    }

 

    public void setEmail(String email) {
        this.email = email;
    }

 

    public String getPhoneno() {
        return phoneno;
    }

 

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

 

    public String getAddress() {
        return address;
    }

 

    public void setAddress(String address) {
        this.address = address;
    }

 

    public Date getDob() {
        return dob;
    }

 

    public void setDob(Date dob) {
        this.dob = dob;
    }

 

    public String getCurrentocc() {
        return currentocc;
    }

 

    public void setCurrentocc(String currentocc) {
        this.currentocc = currentocc;
    }

 

    public String getComname() {
        return comname;
    }

 

    public void setComname(String comname) {
        this.comname = comname;
    }

 

    public String getYoe() {
        return yoe;
    }

 

    public void setYoe(String yoe) {
        this.yoe = yoe;
    }

 

    public String getLtype() {
        return ltype;
    }

 

    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

 

    public String getLamt() {
        return lamt;
    }

 

    public void setLamt(String lamt) {
        this.lamt = lamt;
    }

 

    public String getLperiod() {
        return lperiod;
    }

 

    public void setLperiod(String lperiod) {
        this.lperiod = lperiod;
    }

 

    public String getRoi() {
        return roi;
    }

 

    public void setRoi(String roi) {
        this.roi = roi;
    }

 


    




 


}

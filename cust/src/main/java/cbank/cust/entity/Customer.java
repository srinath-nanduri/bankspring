package cbank.cust.entity;

import java.sql.Date;

import org.springframework.format.annotation.*;

import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name="cid")
	private int cid;
	
	@Column(name="crn")
	private String crn;
	
	@Column(name="cfname")
	private String cfname;
	
	@Column(name="clname")
	private String clname;
	
	@Column(name="cmobile")
	private String cmobile;
	
	@Column(name="cemail")
	private String cemail;
	
	@Column(name="cdob")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	@Temporal(TemporalType.DATE)
	private Date cdob;
	
	@Column(name="cgender")
	private String cgender;
	
	@Column(name="cpass")
	private String cpass;
	
	@Column(name="caadhar")
	private String caadhar;
	
	@Column(name="cpan")
	private String cpan;

	@Column(name="c_occupation")
	private String coccupation;

	@Column(name="c_soi")
	private String csoi;
	
	@Column(name="c_gross_income")
	private String cgrossincome;
	
	@Column(name="c_place_of_work")
	private String cplaceofwork;
	
	@Column(name="cinit")
	private String cinit;

	public String getCinit() {
		return cinit;
	}

	public void setCinit(String cinit) {
		this.cinit = cinit;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}

	public String getCfname() {
		return cfname;
	}

	public void setCfname(String cfname) {
		this.cfname = cfname;
	}

	public String getClname() {
		return clname;
	}

	public void setClname(String clname) {
		this.clname = clname;
	}

	public String getCmobile() {
		return cmobile;
	}

	public void setCmobile(String cmobile) {
		this.cmobile = cmobile;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public Date getCdob() {
		return cdob;
	}

	public void setCdob(Date cdob) {
		this.cdob = cdob;
	}

	public String getCgender() {
		return cgender;
	}

	public void setCgender(String cgender) {
		this.cgender = cgender;
	}

	public String getCpass() {
		return cpass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	public String getCaadhar() {
		return caadhar;
	}

	public void setCaadhar(String caadhar) {
		this.caadhar = caadhar;
	}

	public String getCpan() {
		return cpan;
	}

	public void setCpan(String cpan) {
		this.cpan = cpan;
	}

	public String getCoccupation() {
		return coccupation;
	}

	public void setCoccupation(String coccupation) {
		this.coccupation = coccupation;
	}

	public String getCsoi() {
		return csoi;
	}

	public void setCsoi(String csoi) {
		this.csoi = csoi;
	}

	public String getCgrossincome() {
		return cgrossincome;
	}

	public void setCgrossincome(String cgrossincome) {
		this.cgrossincome = cgrossincome;
	}

	public String getCplaceofwork() {
		return cplaceofwork;
	}

	public void setCplaceofwork(String cplaceofwork) {
		this.cplaceofwork = cplaceofwork;
	}

	
	
	
	
	
	
}

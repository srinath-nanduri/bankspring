package cbank.cust.entity;

import jakarta.persistence.*;

@Entity
@Table(name="accounts")
public class Account {
	
	@Id
	@GeneratedValue
	@Column(name="aid")
	private int id;
	
	@Column(name="ano")
	private String ano;
	
	@Column(name="cid")
	private int cid;
	
	@Column(name="abal")
	private double abal;
	
	@Column(name="apin")
	private String apin;
	
	@Column(name="aclimit")
	private int aclimit;
	
	@Column(name="status")
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public double getAbal() {
		return abal;
	}

	public void setAbal(double abal) {
		this.abal = abal;
	}

	public String getApin() {
		return apin;
	}

	public void setApin(String apin) {
		this.apin = apin;
	}

	public int getAclimit() {
		return aclimit;
	}

	public void setAclimit(int aclimit) {
		this.aclimit = aclimit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
}

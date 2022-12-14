package cbank.cust.entity;

import java.sql.Date;
import java.sql.Time;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name="transactions")
public class Transactions {
	
	@Id
	@GeneratedValue
	@Column(name="tid")
	private int id;
	
	@Column(name="cid")
	private int cid;
	
	@Column(name="tdate")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	@Temporal(TemporalType.DATE)
	private Date tdate;


	@Column(name="ttime")
	@Temporal(TemporalType.TIME)
	private Time ttime;
	
	@Column(name="twithdraw")
	private double twithdraw;
	
	
	@Column(name="tdeposit")
	private double tdeposit;
	
	
	@Column(name="tbalance")
	private double tbalance;
	
	
	
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public Date getTdate() {
		return tdate;
	}

	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}

	public Time getTtime() {
		return ttime;
	}

	public void setTtime(Time ttime) {
		this.ttime = ttime;
	}

	public double getTwithdraw() {
		return twithdraw;
	}

	public void setTwithdraw(double twithdraw) {
		this.twithdraw = twithdraw;
	}

	public double getTdeposit() {
		return tdeposit;
	}

	public void setTdeposit(double tdeposit) {
		this.tdeposit = tdeposit;
	}

	public double getTbalance() {
		return tbalance;
	}

	public void setTbalance(double tbalance) {
		this.tbalance = tbalance;
	}
	
	
	
	

}

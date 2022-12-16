package cbank.cust.entity;

public class Payment {
	
	
	private int id;

	private String raccno;
	
	private double amt;
	
	private String pin;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	public String getRaccno() {
		return raccno;
	}

	public void setRaccno(String raccno) {
		this.raccno = raccno;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", amt=" + amt + ", raccno=" + raccno + ", pin=" + pin + "]";
	}

	
	
	

}

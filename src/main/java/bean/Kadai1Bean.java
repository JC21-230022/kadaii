package bean;

import java.io.Serializable;

public class Kadai1Bean implements Serializable{
	private int money;
	private double rate;
	private int tax;
	private int withTax;
	
	public Kadai1Bean() {
		
		this.money=0;
		this.rate=0;
		this.tax=0;
		this.withTax=0;
	}
	
	public void setMoney(int money) {
		this.money=money;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void setRate(double rate) {
		this.rate=rate;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public void setTax(int tax) {
		this.tax=tax;
	}
	
	public int getTax() {
		return this.tax;
	}
	
	public void setWithTax(int withTax) {
		this.withTax=withTax;
	}
	
	public int getWithTax() {
		return this.withTax;
	}
}
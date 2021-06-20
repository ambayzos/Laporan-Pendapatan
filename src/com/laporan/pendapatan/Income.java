package com.laporan.pendapatan;

public class Income  {
	
	private String incomeTypeName;
	private double amount;
	private double tax;
	private double totalTax;
	
	
	public Income(String incomeTypeName, double amount, double tax, double totalTax) {
		super();
		this.incomeTypeName = incomeTypeName;
		this.amount = amount;
		this.tax = tax;
		this.totalTax = totalTax;
	}
	
	
	public Income() {
		// TODO Auto-generated constructor stub
	}


	public String getIncomeTypeName() {
		return incomeTypeName;
	}
	public void setIncomeTypeName(String incomeTypeName) {
		this.incomeTypeName = incomeTypeName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getTotalTax() {
		return (this.tax/100)*this.amount;
	}
	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}
	@Override
	public String toString() {
		return "Income [incomeTypeName=" + incomeTypeName + ", amount=" + amount + ", tax=" + tax + ", totalTax="
				+ getTotalTax() + "]";
	}
	
	
	
	
	
	
}

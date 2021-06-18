package com.laporan.pendapatan;

public class Income  {
	
	String incomeType;
	double amount;
	double tax;
	double totalTax;
	
	public Income(String incomeType, double amount, double tax, double totalTax) {
		// TODO Auto-generated constructor stub
		this.incomeType = incomeType;
		this.amount = amount;
		this.tax = tax;
		this.totalTax = totalTax;
		
	}

	public Income() {
		super();
	}
	
	

	public String getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
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
		return totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}
	
	
	
}

package com.laporan.pendapatan;


public class Staff {
	private String id;
	private String name;
	private Income income;
	
	public Staff(String id, String name, Income income) {
		super();
		this.id = id;
		this.name = name;
		this.income = income;
	}

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", income=" + income + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getIncome()=" + getIncome() + ", canculate()=" + canculate() + "]";
	}

	public Income getIncome() {
		return income;
	}

	public void setIncome(Income income) {
		this.income = income;
	}
	
	public double canculate() {
		return this.income.getAmount() - this.income.getTotalTax();
	}
	
	
	
	

	
	
	
	
	
	
}

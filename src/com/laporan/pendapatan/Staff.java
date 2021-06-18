package com.laporan.pendapatan;

import java.util.Scanner;

public class Staff {
	private String id;
	private String name;
	

	public Staff(String id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public Staff() {
		super();
	}
	
	
//	 double calculateNetIncome() {
//	//Staff staff = new Staff();
//	Income income = new Income();
//	double totalTax = income.getTax() / 100 * income.getAmount();
//	double totalNetIncome = income.getAmount() - income.totalTax;
//	//return totalNetIncome;
//	return totalNetIncome;
//	}
	
	void displayStaffInfo() {
//		Staff staff = new Staff();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Masukkan Nama :");
//		String name = sc.next();
//		staff.setName(name);
//		System.out.println("Nama :"+staff.getName());

	}
	
	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}
	

	public void setId(String id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}








	void displayIncomeInfo() {
//		Income income = new Income(String); 
//		System.out.println("Type Income :"+Income.this.getIncomeType());
	}
	
	
	
	
	
}

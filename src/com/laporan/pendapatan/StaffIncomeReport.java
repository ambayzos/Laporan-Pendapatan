package com.laporan.pendapatan;

import java.util.Scanner;

public class StaffIncomeReport {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan Nama :");
		String name = sc.next();
		Staff staff = new Staff();
		staff.setName(name);
		
		
		System.out.println("Masukkan Income Type :");
		Income income = new Income();
		String incomeType = sc.next();
		income.setIncomeType(incomeType);
		
		System.out.println("Masukkan Jumlah : ");
		double amount = sc.nextDouble();
		income.setAmount(amount);
		income.setTax(0.5);
		
		System.out.println("Nama :"+staff.getName());
		System.out.println("Income Type :"+income.getIncomeType());
		System.out.println("Jumlah :"+income.getAmount());
		System.out.println("Pajak :"+income.getTax());
		System.out.println("=====================");
		double totalTax = income.getTax() / 100 * income.getAmount();
		double totalNetIncome = income.getAmount() - totalTax;
		System.out.println("Total Tax :"+totalTax);
		System.out.println("Total Net Income :"+totalNetIncome);
	
	
		
		
		
		

	}


}

package com.laporan.pendapatan;

import java.util.Scanner;

public class StaffIncomeReport {

	public static void main(String[] args) {
		
//		Income income = new Income("Pendapatan Gaji", 10000, 12, 12);
//		System.out.println(income.toString());
//		Staff staff = new Staff("A1", "Ahmad", income);
//		System.out.println(staff.toString());
		
		Income income = new Income();
		Staff staff = new Staff();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================");
		System.out.println("Masukkan ID :");
		String id = sc.next();
		staff.setId(id);
		System.out.println("Masukkan Nama :");
		String name = sc.next();
		staff.setName(name);
		System.out.println("Masukkan Type Income :");
		String incomeTypeName = sc.next();
		income.setIncomeTypeName(incomeTypeName);
		System.out.println("Masukkan Jumlah Pendapatan :");
		double amount = sc.nextDouble();
		income.setAmount(amount);
		System.out.println("Masukkan Jumlah Tax :");
		double tax = sc.nextDouble();
		income.setTax(tax);
		System.out.println("=======================");
		
		System.out.println("ID :"+staff.getId());
		System.out.println("Nama :"+staff.getName());
		System.out.println("Type Income :"+income.getIncomeTypeName());
		System.out.println("Jumlah Pendapatan :"+income.getAmount());
		System.out.println("Jumlah Pajak :"+income.getTax());
		System.out.println("Total Pajak :"+income.getTotalTax());
		Staff calculate = new Staff(id,name,income);
		System.out.println("Pendapatan Bersih:"+calculate.canculate());
		
		
		
	
	
		
		
		
		

	}


}

package com.miniProject;

public class HomeLoan extends Loan{

	public static void main(String[] args) {
		
		HomeLoan hl = new HomeLoan();
		int age = hl.getAgeInfo();
		double salary = hl.getSalaryInfo();
		int cibil = hl.getCibilInfo();
		boolean IsValidCustomer = hl.getAadhar_Phone_Pan_Verification();
		
		if(salary >= 30000 && age >= 30 && cibil >= 700 && IsValidCustomer) {
			
			System.out.println("Congratulations ! Your Personal Loan got approved.");
			System.out.println("Rate of Interest is : " + hl.getRateOfInterest());
			
		}
		else {
			System.out.println("Sorry ! Your Loan is rejected.");
		}

	}

}

package com.miniProject;

public class PersonalLoan extends Loan{

	public static void main(String[] args) {
		
		PersonalLoan pl = new PersonalLoan();
		
		int age = pl.getAgeInfo();
		double salary = pl.getSalaryInfo();
		int cibil = pl.getCibilInfo();
		boolean IsValidCustomer = pl.getAadhar_Phone_Pan_Verification();
		
		if(salary >= 30000 && age >= 25 && cibil >= 750 && IsValidCustomer) {
			
			System.out.println("Congratulations ! Your Personal got approved.");
			System.out.println("Rate of Interest is : " + pl.getRateOfInterest());
			
		}
		else {
			System.out.println("Sorry ! Your Loan is rejected.");
		}

	}

}

package com.miniProject;

public class CarLoan extends Loan{

	public static void main(String[] args) {
		
		CarLoan cl = new CarLoan();
		
		int cibil = cl.getCibilInfo();
		int age = cl.getAgeInfo();
		double salary = cl.getSalaryInfo();
		boolean valid = cl.getAadhar_Phone_Pan_Verification();
		
		if(cibil >= 700 && age >= 25 && salary >= 40000.00 && valid) {
			System.out.println("Congratulations ! Your Car Loan got approved.");
			System.out.println("Rate of Interest is : " + cl.getRateOfInterest());	
		}
		else {
			System.out.println("Sorry !! Your are not eligible for Loan.");
		}

	}

}

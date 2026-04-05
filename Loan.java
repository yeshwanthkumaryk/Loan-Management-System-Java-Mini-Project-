package com.miniProject;

import java.util.Scanner;

public class Loan {
	
	Scanner sc = new Scanner(System.in); 
	
	double getRateOfInterest() {
		return 8;
	}
	
	double getSalaryInfo() {
		System.out.println("Enter your salary : ");
		double salary  =sc.nextDouble();
		return salary;
	}
	
	int getCibilInfo() {
		System.out.println("Enter your Cibil score : ");
		int cibil = sc.nextInt();
		return cibil;
	}
	
	int getAgeInfo() {
		System.out.println("Enter your Age : ");
		int age = sc.nextInt();
		return age;
	}
	
	double RateOfInterest() {
		return 9.5;
	}
	
	boolean getAadhar_Phone_Pan_Verification() {
		
		System.out.println("Enter your Aadhar Number : ");
		String aadhar = sc.next();
		
		System.out.println("Enter your Phone Number : ");
		String phone = sc.next();
		
		System.out.println("Enter your PAN Number : ");
		String pan = sc.next();
		
		String aadharRegex = "^[0-9]{12}$";
		String phoneRegex = "^[0-9]{10}$";
		String panRegex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";
		
		boolean IsAadharValid = aadhar != null && aadhar.matches(aadharRegex);
		boolean IsPhoneValid = phone != null && phone.matches(phoneRegex);
		boolean IsPanValid = pan != null && pan.matches(panRegex);
		
		return IsAadharValid && IsPhoneValid && IsPanValid;
	}

}

package com.xyz.application;
import com.xyz.calculator.SalaryCalculator;
public class SalaryRunner {
	
	static SalaryCalculator salCalc = new SalaryCalculator();
	
	public static void main(String[] args) {
		
		int newSalaryEmployee = salCalc.salaryCalc(10000, 10);
		int newSalaryManager = salCalc.salaryCalc(30000, 15, 5000);
		
		System.out.println("Old Salary of Employee: 10000 || New Salary: "+newSalaryEmployee);
		System.out.println("Old Salary of Manager: 30000 || New Salary: "+newSalaryManager);
	}
	
}

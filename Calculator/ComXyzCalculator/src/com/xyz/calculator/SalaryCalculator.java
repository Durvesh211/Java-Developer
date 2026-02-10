package com.xyz.calculator;

import com.xyz.helper.CalculatorHelper;

public class SalaryCalculator {

	   static CalculatorHelper calcHelp = new CalculatorHelper();
		
		public int salaryCalc(int sal, int hike) {
			return calcHelp.calcHelper(sal, hike);
		}
		
		public int salaryCalc(int sal, int hike, int bonus) {
			sal = sal + bonus;
			return calcHelp.calcHelper(sal, hike);
		}

}

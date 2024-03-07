package com.example;

import java.util.Scanner;

public class EmployeeSalaryCalculator 
{
	//Variable Declaration
	final static int standardWorkingHours = 40;
	static String employeeID;
	static String employeeName;
	static int hoursWorked;
	static int  hourlyRate;
	static int basicPay;
	static int overTime;
	static int overTimeRate;
	static int overTimePay;
	static int grossSalary;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter an Employee ID: ");
		employeeID = sc.nextLine();
		
		System.out.println("Enter an Employee Name: ");
		employeeName = sc.nextLine();
		
		System.out.println("Enter the no. of Hours Worked: ");
		hoursWorked = sc.nextInt();
		
		System.out.println("Enter the Hourly Rate: ");
		hourlyRate = sc.nextInt();
		
		salaryCalculator(hoursWorked,hourlyRate);
		displayPaySlip();
	}

	static int salaryCalculator(int HW,int HR)
	{
		hourlyRate = HR;
		hoursWorked = HW;





				if(HW <= standardWorkingHours)
				{
					//Manually set overtime & overtime pay assuming 0
					overTime=0;
					overTimePay=0;

					//Set gross salary according to hours worked
					grossSalary=hourlyRate*HW;

				}
				else
				{
					//Set overtime & overtime pay according to time over standardWorkingHours
					overTime=HW-standardWorkingHours;
					overTimePay=overTime*overTimeRate;

					//Set gross salary according to total hours at standard rate
					grossSalary=standardWorkingHours*hourlyRate;
				}
				//Increase gross salary by overtime
				grossSalary+=overTimePay;
				return grossSalary;
	}
	
	static void displayPaySlip()
	{
		
		System.out.println("===========================================");
		System.out.println("                                     ");
		System.out.println("================PAYSLIP==============");
		System.out.println("                                     ");

		System.out.println("Employee ID    :       " + employeeID);
		System.out.println("Employee Name  :       " + employeeName);
		System.out.println("Hours Worked   :       " + hoursWorked);
		System.out.println("Hourly Rate    :       " + hourlyRate);
		System.out.println("Overtime       :       " + overTime);
		System.out.println("Overtime Rate  :       " + overTimeRate);
		System.out.println("Overtime Pay   :       " + overTimePay);
		System.out.println("Basic Pay      :       " + basicPay);
		System.out.println("                                     ");
		System.out.println("Gross Salary   :       " + grossSalary);
		
	}
}

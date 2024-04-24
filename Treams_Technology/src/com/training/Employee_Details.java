package com.training;

public class Employee_Details extends Employee{
public static void main(String[] args) {
	Employee aa=new Employee();
	aa.identity("Esk", 123);
	System.out.println("Enployee Name:"+aa.details1());
	System.out.println("Enployee Id:"+aa.details2());
	//aa.details2();
	
}
}

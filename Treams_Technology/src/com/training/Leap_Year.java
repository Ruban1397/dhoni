package com.training;

import java.util.Scanner;

public class Leap_Year {
public static void main(String[] args) {
	System.out.println("Enter the Year:");
	Scanner sc =new Scanner(System.in);
	int year = sc.nextInt();
	if(((year %4 ==0)&&(year %100 !=0))|| (year%400==0)) {
		System.out.println("The entered year is leap year");
	}
	
	else {
		System.out.println("This is not a leap year");
	}
}
}

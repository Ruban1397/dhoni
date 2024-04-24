package com.concepts;

public class Array {
 public static void main(String[] args) {
	int[] arr=new int[10];
	int min,max;
	int arr1[]= {20,12,3,45,11,24,18,1,25,35};
	min=arr1[0];
	max=arr1[0];
	for(int i=0;i<10;i++)
	{
		if(min>arr1[i])
		{
			min=arr1[i];
		}
	}
	for(int i=0;i<10;i++)
	{
		if(max<arr1[i])
		{
			max=arr1[i];
		}
	}
	System.out.println("Minimum"+min);
	System.out.println("Maximum"+max);
}
}

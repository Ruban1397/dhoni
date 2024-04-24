package com.training;

public class ReturnType {

	public int sum()
	{
	int a=20,b=30,c;
	c=a+b;
	return c;
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ReturnType r1=new ReturnType();
    System.out.println(r1.sum());
    System.out.println(r1.sub(25,35));
    
	}

}

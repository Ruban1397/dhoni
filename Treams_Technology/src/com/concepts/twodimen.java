package com.concepts;

public class twodimen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][] a=new int[2][2];
     int[][] b=new int[2][2];
     a[0][0]=1;
     a[0][1]=2;
     a[1][0]=3;
     a[1][1]=4;
     b[0][0]=1;
     b[0][1]=2;
     b[1][0]=3;
     b[1][1]=4;
     for(int i=0;i<2;i++)
     {
    	 for(int j=0;j<2;j++)
    	 {
    		 System.out.print(a[i][j]+b[i][j]);
    	 }
    	 System.out.println("\n");
     }
     }

}

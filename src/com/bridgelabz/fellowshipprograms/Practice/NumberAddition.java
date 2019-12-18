package com.bridgelabz.fellowshipprograms.Practice;

public class NumberAddition {
	
	
	public static int akshada(int i) {
		int a[]= new int [10];
		int x=1;
		int sum=0;
		while(i!=0) {
			a[x]= i%10;
			x++;
			//System.out.println(a);
			i=i/10;
		}
		for(int r:a) {
			sum=sum+r;
		}
		//System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		int i=123456789;
		int sum= akshada(i);
		int sum2= akshada(sum);
		System.out.println(sum2);
		
		

	}

}

package com.bridgelabz.fellowshipprograms.Practice;

import java.util.ArrayList;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class PrimeNo2DArray {

	public static void main(String[] args)
	{
		int aaa[]=new int [100];
		ArrayList<Integer> al= new ArrayList<Integer>();
		int n=1000;
		al=Utility.primeNoRange(n);
		int length=al.size();
		int arr[][]= new int[10][50];
		//System.out.println(al);
		int z=0,cnt=0,ij=100;
		while(z<168)
		{	
			if(al.get(z)>ij)
			{
				ij=ij+100;
				cnt=0;
			}
		arr[(al.get(z)/100)][cnt]=al.get(z);
			
				z++;
				cnt++;
		}
		
		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 30; k++) {
				
		if (arr[i][k]>0) {
			System.out.print(arr[i][k]+ "_|_");
			}
			}
			System.out.println();
		}
		
		aaa=Utility.primeAnagram(al);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < aaa.length; j++) {
				System.out.print(aaa[j]+" ");
			}
			
		}
		//System.out.println(aaa[0]);
		
	}
}

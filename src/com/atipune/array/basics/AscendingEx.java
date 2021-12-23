package com.atipune.array.basics;

public class AscendingEx {

	
	
	public static void main(String[] args) {
	int[] a=new int[] {5,2,8,7,1};
	int temp=0;
	System.out.println("elements of original array");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+ " ");
	}
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) 
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;	
				}
		}
	}
	
	System.out.println("elements of array in ascending order");
	for(int i=0;i<a.length;i++)
	

	{
		System.out.println(a[i]+ " ");
	}
	
	
	}

}

package com.atipune.array.basics;

public class AscendingDescending {

	public static void main(String[] args) {
		int[] a= {12,34,665,78,129,49};
		int temp=0;
		System.out.println("ascending order");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			System.out.println(+a[i]);
		}
		System.out.println("descending order");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			System.out.println(+a[i]);
		}

	}

}

package com.atipune.array.basics;

public class ArrayMaxMinElement {

	public static void main(String[] args) {
		int[] values = {120,-1230,-120,123,456,789,-1234};
		int max=0, min = 0;
		for(int i=0;i<values.length;i++) {
			if(values[i]>max) {
				max=values[i];
	

}
}
		System.out.println("max values are="+max);
		
		for(int i=0;i<values.length;i++) {
			if(values[i]<min) {
				min=values[i];
			}
		}
		System.out.println("min values ="+min);
	
	}
}
package com.bridgelabz.DemoLogics;

public class Calculation {
	public static long findMaxNumber(int[] arr) {
		// TODO Auto-generated method stub
		int max=arr[0];
		for(int i=1;i<arr.length; i++) {
			if(max<arr[i])
				max=arr[i];
		}
	
		return max;
	}
}

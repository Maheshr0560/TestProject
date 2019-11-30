package com.app;

import java.util.Arrays;

public class PractFour {

	public static void main(String[] args) {
	
		String a= "Mahesh Reddy";
		String e = "Babu";
		String rev= "";
		String reve="";
		for(int i=a.length()-1;i>=0;i--) {
			rev= rev+a.charAt(i);
		}
		System.out.println(rev);
		String[] b = a.split(" ");
		System.out.println(Arrays.toString(b));
		for(String s:b) {
			System.out.println(s);
		}			
		String c = a.substring(0,6);
		String d= a.substring(7,12);
		System.out.println(c);
		for(int j=c.length()-1;j>=0;j--) {
			reve= reve+c.charAt(j);
		}
		System.out.println(reve +" "+d);
		a= a+e;
		e= a.substring(0,a.length()-e.length());
		a= a.substring(e.length());
		System.out.println(a +"  "+ e);
		System.out.println(e);
		System.out.println(e.charAt(4));
		System.out.println(e.indexOf("s"));
		
		int[] arr= {22,33,11,3,7,9,5,1,55,44,99,66,88,8};
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		for(int f=0;f<arr.length;f++) {
			for(int g=f+1;g<arr.length;g++) {
				if(arr[f]>arr[g]) {
					int temp=arr[f];
					arr[f]=arr[g];
					arr[g]=temp;
				}//3521125000204
			}
			}
				System.out.println(Arrays.toString(arr));
		
		
		//LTI Capgemini 
		

	}

}

package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.google.common.base.MoreObjects.ToStringHelper;

public class PractOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= "Mahesh";
		String b= "Reddy";
		
		a= a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a +"======"+b);
		
		
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev= rev+a.charAt(i);
		}
		System.out.println(rev);
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Ram");arr.add("Babu");
		arr.add("Reddy");arr.add("Naidu");
		arr.add("Papa");arr.add("Girl");
		arr.add("Come");arr.add("Bye");
		System.out.println(arr);
		System.out.println(arr.indexOf("Babu"));
		//System.out.println(((CharSequence) arr).charAt(1));
		
		String d= "Uma Maheswar";
		String reve="";
		System.out.println(d.indexOf("s"));
		System.out.println(d.charAt(2));
		System.out.println(d.substring(0));
		System.out.println(d.substring(0,3));
		String e= d.substring(0,3);
		String f= d.substring(3,12);
		for(int j= e.length()-1;j>=0;j--) {
			reve= reve+e.charAt(j);
		}
		System.out.println(reve+f);
		
		System.out.println(arr.size());
		for(String arrayFoeLoop :arr) {
			System.out.println(arrayFoeLoop);
		}
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr);
		
		String s="Mahesh Reddy";
		String[] ss = s.split(" ");
		System.out.println(Arrays.toString(ss));
		
		
		

	}

}

package com.app;

import java.util.Arrays;
import java.util.HashSet;

public class PractThree {

	public static void main(String[] args) {
		
		int[] s= {2,23,42,61,5,33,55,6,8,39,7,55,3,54,99};
		/*Arrays.sort(s);
		System.out.println(Arrays.toString(s));*/
		
		for(int i=0; i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]>s[j]) {
					int temp = s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(s));
		
		String a= "Mahesh Babu";
		String b= "Reddy garu";
		a= a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+"  after swip  "+b);
		//====
		String rev="";
		for(int k=a.length()-1;k>=0 ; k--) {
			rev=rev+a.charAt(k);
		}
		System.out.println(rev);
		String c =a.substring(0,5);
		String d= a.substring(6,10);
		System.out.println(c);
		System.out.println(d);
		String reve= "";
		for(int l=c.length()-1;l>=0;l--) {
			reve= reve+c.charAt(l);
		}
		System.out.println(reve+ " "+d);
		System.out.println(c.indexOf("y"));
		System.out.println(c.charAt(4));
		
		String f= "Mahesh Reddy Garu";
		String[] g= f.split(" ");
		System.out.println(Arrays.toString(g));
		for(String ss:g) {
			System.out.println(ss);
		}
		
		/*
		int in=0;
		int num=0;
		String count="";
		for(in=0;in<=100;in++) {
			int cou=0;
			for(num=in;num>=1;num--) {
				if(in%num==0) {
					cou=cou+1;
				}
			}
			if(cou==2) {
				count=count+in+" ";
			}
		}
		System.out.println(count);
		int[] aa= {12,22,3,63,2,34,5,6,17,6,5,94,7,65};
		for(int i=0;i<aa.length;i++) {
			for(int j=i+1;j<aa.length;j++) {
				if(aa[i]>aa[j]) {
					int temp=aa[i];
					aa[i]=aa[j];
					aa[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(aa));
		 HashSet<Integer> arr= new HashSet<>(Arrays.asList(12,3,4,66,22,12,4,23,98,2,3));
		System.out.println(arr);
		
		HashSet<String> sss= new HashSet<>(Arrays.asList("Ma","Ra","Ma","Ra"));
		System.out.println(sss);
*/
				
	}

}

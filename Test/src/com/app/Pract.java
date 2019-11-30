package com.app;

public class Pract {

	public static void main (String... arg) {
		
		String a= "Mahesh";
		String b="Reddy";
		
		System.out.println(a +" Before method "+ b);
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a +" After  "+b);
		
		//=============================
		
		String c="MAheshReddy";
		String rev=""; 
		
		for(int i=c.length()-1;i>=0;i--) {
			rev=rev+c.charAt(i);
		}
		System.out.println(rev);
		
		//================
		
		
		String dd="Mahesh $Babu Reddy";
		System.out.println(dd.charAt(7));
		System.out.println(dd.indexOf("$"));
		System.out.println(dd.substring(7));
		System.out.println(dd.substring(7, 12));
		
		String cc="";
		for (int i = dd.length()-1;i>=0;i--) {
			cc=cc+dd.charAt(i);
		}
		System.out.println(cc);
		if(dd==cc) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("not a polindrom");
		}
		//==============================
		String d="Maheswar";
		String e="Reddy";
		System.out.println(d + "+"+  e);
		d=d+e;
		e=d.substring(0,d.length()-e.length());
		d=d.substring(e.length());
		System.out.println(d +"+" + e);
		//=======================
		int aa[] = {2,3,9,82,4,2,5,8,6,4,12};
		int count=0; int j;		
		for (j=0 ;j<=aa.length;j++ ) {
			System.out.println(aa[j]);
			if(aa[j]==4) {
				//System.out.println(j);
				break;
			}
			//count= count+aa[j];
		}
		//System.out.println(count);
		
	}
	
}

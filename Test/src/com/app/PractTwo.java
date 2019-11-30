package com.app;

 class One{
	
	 public void m1() {
		 System.out.println("m1 methd and Parent class method");
	 }
}

public class PractTwo extends One {
	
	
	public void m1() {
		System.out.println("Child class m2 method");
	}
	
	public static void main (String... ar) {
		
		//PractTwo two= new PractTwo();
		One one = new PractTwo();
		one .m1();
		one.m1();
		System.out.println("Uma Maheswar");
	}

}

package com.app;

public class TestLogin {
	
	
	public final int m1() {
		System.out.println("final m1 method");
		return m1();
	}
	
	public int m1(int a) {
		System.out.println("normal m1 method ");
		return m1();
	}
	public static void main(String... s) {
	
		
TestLogin test= new TestLogin();
	test.m1();
	
	}
}

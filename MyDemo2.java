package com.demo;

public class MyDemo2 {

	public static void main(String[] args) {
		
		MyDemo1 m1 = new MyDemo1();
		
		int res= m1.add(22,11);
		System.out.println("Result of addition  :"+res);
		int res1= m1.sub(100,50);
		System.out.println("Result of substraction  :"+res1);
		int res2= m1.mul(100,50);
		System.out.println("Result of multiplication  :"+res2);
		int res3= m1.div(100,50);
		System.out.println("Result of division  :"+res3);
		
	}

}


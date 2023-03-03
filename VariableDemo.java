package com.demo;

public class VariableDemo {
	
	
	double division(double a, double b)
	{
		double d1= (a/b);
		return d1;
	}

	public static void main(String[] args)
	{
		VariableDemo object1 = new VariableDemo();//object creation
		double result = object1.division(22.22, 11.11);   //method call
		System.out.println("Division  : "+result);
	}

}

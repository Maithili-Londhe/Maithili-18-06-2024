package com.javaThreads;

public class TestThreadClass 
{

	public static void main(String[] args) 
	{
		
		Example1 example1 = new Example1();		
		Example1 example2 = new Example1();
		Example1 example3 = new Example1();
		
		example1.start();		
		example2.start();
		example3.start();
		
		
	}
	
}

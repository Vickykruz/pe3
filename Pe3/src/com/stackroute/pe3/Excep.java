package com.stackroute.pe3;

public class Excep {
public  static void  main(String args[]) {
	try {
		throw new Exception("Hi...");
	}
	catch(Exception e)
	{
		e.getMessage();
	}
	finally
	{
		System.out.println("Bye.!!");
	}
}
}
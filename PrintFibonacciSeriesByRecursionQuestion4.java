package com.ds.app;

public class PrintFibonacciSeriesByRecursionQuestion4 
{
	private int fib(int num)
	{
		if(num==1)
		{
			return 0;
		}
		else if(num==2||num==3)
		{
			return 1;
		}
		else
		{
			return fib(num-1)+fib(num-2);
		}
		
	}
	public void printFibSeries(int num)
	{
		for(int i=1;i<=num;i++)
		{
			System.out.println(fib(i));
		}
	}
	
	
}

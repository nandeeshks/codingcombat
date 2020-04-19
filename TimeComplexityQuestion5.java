package com.ds.app;

public class TimeComplexityQuestion5
{
	public void add(int num1,int num2)
	{
		//constant time complexity
		int num3 = num1+num2;
		System.out.println("sum="+num3);
	}
	
	public void PrintNumbers(int num)
	{
		//linear time complexity
		for(int i=1;i<=num;i++)
		{
			System.out.println("i value="+i);
		}
	}
	
	public void searchElementInMatrix(int[][] arr,int num)
	{
		//Qudratic time complexity
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				if(arr[i][i] == num)
				{
					System.out.println("Element found....");
					return;
				}
			}
			
			System.out.println("Element not present.....");
		}
	}

}

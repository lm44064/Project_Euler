package com.euler.fibonacci;

public class Fibonacci 

{
	long first;
	long second;
	long evenSum;

	public Fibonacci()
	{
		first = 1;
		second = 1;
	}

	public void calculateEvenSum()
	{
		System.out.println("Starting calculation.");

		long nextTerm = 0;

		while (nextTerm <= 4000000)
		{
			nextTerm = first + second;
			if(nextTerm % 2 == 0) evenSum += nextTerm;
			first = second;
			second = nextTerm;
		}
		System.out.println("The sum of even valued terms under 4 million in a Fibonacci queue is " + evenSum);
	}

}
package com.euler.primesummarizer;

import com.euler.utils.Utils;

public class PrimeSummarizer 
{
	long sum;
	int limit;
	
	public PrimeSummarizer (int limit)
	{
		this.limit = limit;
		System.out.println("Summarize all prime numbers under the value of " + this.limit);
	}
	
	public void Summarize ()
	{
		for (int i = 2; i <= limit; i++)
		{
			if (Utils.checkIsPrime(i))
				sum += i;
		}
		
		System.out.println("The sum of all prime numbers under " + limit + " is " + sum);
	}
}

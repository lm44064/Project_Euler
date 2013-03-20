package com.euler.primefinder;

import com.euler.utils.Utils;

public class PrimeFinder 
{
	int primeNumber;
	
	public PrimeFinder(int primeNumber)
	{
		this.primeNumber = primeNumber;
		System.out.println("Created prime number finder. Find the " + this.primeNumber + ". prime number.");
	}
	
	public void findPrimeNumber()
	{
		int location = 0;
		int primeCandidate = 1;
		while (location != primeNumber)
		{
			primeCandidate++;
			if (Utils.checkIsPrime(primeCandidate))
			{
				location++;
			}
		}
		
		System.out.println("Prime number " + primeCandidate + " is the " + this.primeNumber + ". prime number.");
	}
}

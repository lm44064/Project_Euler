package com.euler.primefinder;

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
			if (checkIsPrime(primeCandidate))
			{
				location++;
			}
		}
		
		System.out.println("Prime number " + primeCandidate + " is the " + this.primeNumber + ". prime number.");
	}
	
	private boolean checkIsPrime(int number) {
		for (int i = 2; i <= number/2; ++i)
		{
			if (number % i == 0) return false;
		}
		return true;
	}

}

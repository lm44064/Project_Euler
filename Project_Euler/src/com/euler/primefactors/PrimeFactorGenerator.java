package com.euler.primefactors;

import java.util.LinkedList;

public class PrimeFactorGenerator 
{	
	long number;
	int smallestPrime;
	LinkedList<Integer> primeFactors;

	public PrimeFactorGenerator(long number)
	{
		System.out.println("Created Prime Factor Generator for number " + number);
		this.number = number;
		smallestPrime = 2;
		primeFactors = new LinkedList<Integer>();
	}

	public void generatePrimeFactors()
	{
		System.out.println("Generating prime factors.");

		if (checkIsPrime(number))
		{
			System.out.println("Inital number is prime!");
		}

		else
		{
			while(!checkIsPrime(number))
			{
				if (number % smallestPrime == 0)
				{
					primeFactors.add(smallestPrime);
					number /= smallestPrime;
					smallestPrime = 2;
				}
				else 
				{
					do
					{
						smallestPrime++;
					}
					while(!checkIsPrime(smallestPrime));
				}				
			}
			primeFactors.add((int) number);
		}

		System.out.println("Prime factors are " + primeFactors.toString());
	}

	private boolean checkIsPrime(long number) {
		for (int i = 2; i <= number/2; ++i)
		{
			if (number % i == 0) return false;
		}
		return true;
	}
}
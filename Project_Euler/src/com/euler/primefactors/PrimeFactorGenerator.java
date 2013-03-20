package com.euler.primefactors;

import java.util.LinkedList;

import com.euler.utils.Utils;

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

		if (Utils.checkIsPrime(number))
		{
			System.out.println("Inital number is prime!");
		}

		else
		{
			while(!Utils.checkIsPrime(number))
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
					while(!Utils.checkIsPrime(smallestPrime));
				}				
			}
			primeFactors.add((int) number);
		}

		System.out.println("Prime factors are " + primeFactors.toString());
	}
}
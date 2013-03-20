package com.euler.sumsquaredifference;

public class SumSquareDifferenceFinder 
{
	int rangeMin;
	int rangeMax;
	long sumOfSquares;
	long squareOfSum;
	long difference;
	
	public SumSquareDifferenceFinder (int rangeMin, int rangeMax)
	{
		this.rangeMax = rangeMax;
		this.rangeMin = rangeMin;
		sumOfSquares = 0;
		squareOfSum = 0;
		difference = 0;
		System.out.println("Created sum square difference finder for a range of " + this.rangeMin + " - " + this.rangeMax);
	}
	
	public void findSumSquareDifference()
	{
		for (int i = rangeMin; i <= rangeMax; ++i)
		{
			sumOfSquares += (i*i);
		}
		
		System.out.println("Sum of squares = " + sumOfSquares);
		
		if (rangeMax % 2 == 0)
		{
			squareOfSum = (rangeMax + rangeMin) * (rangeMax / 2);
			squareOfSum = squareOfSum * squareOfSum;
		}
		else 
		{
			squareOfSum = ((rangeMax + rangeMin) * ((rangeMax - 1) / 2)) + ((rangeMax + 1) / 2);
			squareOfSum = squareOfSum * squareOfSum;
		}
		
		System.out.println("Square of sum = " + squareOfSum);
		
		difference = squareOfSum - sumOfSquares;
		
		System.out.println("Sum square difference for given range is " + difference);
	}
}

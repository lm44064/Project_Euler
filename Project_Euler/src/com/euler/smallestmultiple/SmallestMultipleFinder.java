package com.euler.smallestmultiple;

public class SmallestMultipleFinder 
{
	boolean isMultiple;
	int number;
	int rangeMin;
	int rangeMax;
	
	public SmallestMultipleFinder (int rangeMin, int rangeMax)
	{
		this.rangeMax = rangeMax;
		this.rangeMin = rangeMin;
		isMultiple = false;
		number = rangeMax * 2;
		System.out.println("Created smallest multiple finder for a range of " + this.rangeMin + " - " + this.rangeMax);
	}
	
	public void findSmallestMultiple() 
	{
			while(!isMultiple)
			{
				isMultiple = true;
				for (int i = rangeMin; i <= rangeMax; ++i)
				{
					if (number % i != 0) isMultiple = false;
				}
				if(!isMultiple) number++;
			}
			
			System.out.println("The smallest multiple for given range is " + this.number);
	}
}

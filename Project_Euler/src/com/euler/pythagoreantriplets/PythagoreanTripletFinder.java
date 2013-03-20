package com.euler.pythagoreantriplets;

public class PythagoreanTripletFinder 
{
	int a;
	int b;
	int c;
	int target;
	
	public PythagoreanTripletFinder (int target)
	{
		this.target = target;
		System.out.println("Find pythagorean triplets that are a < b < c and a + b + c = " + target);
	}
	
	public void findTriplets()
	{
		int numOfTriplets = 0;
		for (a = 1; a <= target - 2; a++)
			for (b = a + 1; b <= target - 1; b++)
				for (c = b + 1; c <= target; c++)
				{
					if (isPythagoreanTriplet(a, b, c) && (a + b + c == target))
					{
						numOfTriplets++;
						System.out.println("The triplet " + a + ", " + b + ", " + c + " is the " + numOfTriplets + ". special Pythagorean triplet for the sum " + target);
						System.out.println("Their product is " + a * b * c);
					}
						
				}
		
		if (numOfTriplets == 0)
			System.out.println("No special Pythagorean triplets for given target.");
	}

	private boolean isPythagoreanTriplet(int a, int b, int c) 
	{
		if ((a * a) + (b * b) == (c * c)) return true;
		else
			return false;
	}
	
}

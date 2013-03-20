package com.euler.largestproductinseries;

public class LargestProductInSeries 
{
	String series;
	String productSeries;
	int length;
	int largestProduct;
	
	public LargestProductInSeries(String series, int length)
	{
		this.length = length;
		this.series = series;
		largestProduct = 0;
		System.out.println("Find the product of " + length + " consecutive digits in:\n" + series);
	}
	
	public void findProduct()
	{
		for (int i = 0; i <= series.length() - length; i++)
		{
			int productCandidate = 0;
			for (int j = i; j < i + length; j++)
			{
				if (productCandidate == 0)
					productCandidate += ((int) series.charAt(j) - 48);
				else
					productCandidate *= ((int) series.charAt(j) - 48);
			}
			
			if (largestProduct == 0 || productCandidate > largestProduct)
			{
				largestProduct = productCandidate;
				productSeries = series.substring(i, i + length);
			}
		}
		
		System.out.println("Largest product in series is " + largestProduct + ". It is the product of the following subseries: " + productSeries);
	}
}

package com.euler.largestproductingrid;

public class LargestProductInGrid 
{
	int [][] grid;
	
	public LargestProductInGrid(String grid)
	{
		System.out.println("Success");
		//grid = new int [x][y];
		for(int i = 0; i < grid.length(); i++)
			System.out.println("Position - " + i + "; Character - " + grid.charAt(i));
	}
}

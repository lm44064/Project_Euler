package com.euler.largestproductingrid;

import java.util.StringTokenizer;

public class LargestProductInGrid 
{
	int [][] grid;
	
	public LargestProductInGrid(String grid)
	{
		//grid = new int [x][y];
		StringTokenizer rowTokenizer;
		
		for(int i = 0; i < grid.length(); i++)
			System.out.println("Position - " + i + "; Character - " + grid.charAt(i));
	}
}

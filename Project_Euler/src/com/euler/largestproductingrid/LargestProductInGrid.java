package com.euler.largestproductingrid;

public class LargestProductInGrid 
{
	int [][] grid;
	private int x;
	private int y;
	
	public LargestProductInGrid(String grid) throws Exception
	{
		String [] rows = grid.split("\n");
		if(!rowsAllSameLength(rows))
		{
			System.out.println("Error! Grid not rectangular.");
			throw new Exception();
		}
		this.grid = new int [this.x = rows.length][this.y = rows[0].split("\\s+").length];
		for(int i = 0; i < rows.length; i++)
			
		{
			String [] row = rows[i].split("\\s+");
			for (int j = 0; j < row.length; j++)
				this.grid[i][j] = Integer.parseInt(row[j]);
		}
		
		System.out.println("Grid input successful.");
		
		// Grid printout
		/*for (int i = 0; i < this.x; i++)
		{
			for (int j = 0; j < this.y; j++)
				if(this.grid[i][j] < 10)
					System.out.print("0" + this.grid[i][j] + " ");
				else
					System.out.print(this.grid[i][j] + " ");
			System.out.println();
		}*/			
	}

	private boolean rowsAllSameLength(String[] rows) 
	{
		for (int i = 0; i < rows.length; i++)
			if (rows[0].length() != rows[i].length())
				return false;
		return true;
	}
}

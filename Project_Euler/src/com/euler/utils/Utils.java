package com.euler.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils 
{	
	public static boolean checkIsPrime(Object number) 
	{
		long mNumber;
		if(number instanceof Long)
			mNumber = (long) number;	
		else
			mNumber = (int) number;
		
		if (mNumber == 1) return false;
		
		for (int i = 2; i <= mNumber / 2; ++i)
		{
			if (mNumber % i == 0) return false;
		}
		System.out.println(mNumber);
		return true;
	}
	
	public static String readInput(String inputText) throws IOException
	{
		String input = null;
		System.out.println(inputText);
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		input = bReader.readLine();
		return input;	
	}

}

package com.euler.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Utils {
	
	static PrintStream original = System.out;
    static PrintStream suppress = new PrintStream(new OutputStream() 
    {
		@Override
		public void write(int arg0) throws IOException {
			// Do nothing. Suppress syso calls.
		}
    });
	
	public static boolean checkIsPrime(Object number) 
	{
		long mNumber;
		if (number instanceof Long)
			mNumber = (long) number;
		else
			mNumber = (int) number;

		if (mNumber == 1)
			return false;

		if (mNumber < 100) 
		{
			for (int i = 2; i <= mNumber / 2; ++i) {
				if (mNumber % i == 0)
					return false;
			}
			System.out.println(mNumber);
			return true;
		}
		else
		{
			for (int i = 2; i <= (int) Math.ceil(Math.sqrt(mNumber)); ++i) {
				if (mNumber % i == 0)
					return false;
			}
			return true;
		}
	}

	public static String readInput(String inputText) throws IOException 
	{
		String input = "";
		System.out.println(inputText);
		Scanner consoleScanner = new Scanner(System.in);
		while (consoleScanner.hasNextLine())
		{
			Scanner sScanner = new Scanner(consoleScanner.nextLine());
			if(!sScanner.hasNext()) 
				break;
			while(sScanner.hasNext())
			{
				if(input.isEmpty())
					input = sScanner.nextLine() + "\n";
				else
					input = input + sScanner.nextLine() + "\n";
				
			}
		}
		return input;
	}
	
	public static void SuppressSyso()
	{
		System.setOut(suppress);
	}
	
	public static void UnsuppressSyso()
	{
		System.setOut(original);
	}
}

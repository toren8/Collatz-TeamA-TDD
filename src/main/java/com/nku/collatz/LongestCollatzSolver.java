package com.nku.collatz;

import java.util.Stack;

public class LongestCollatzSolver
{	
	private final int threshold;
	
	public LongestCollatzSolver(int threshold)
	{
		this.threshold = threshold;
	}
	
	public int getLongestChain()
	{
		int longestLength = 1;
		long startValue = 1;
		
		Stack<Long> inline = new Stack<Long>();
		int[] solvedNumbers = new int[threshold + 1];
		solvedNumbers[1] = 1;
		
		
		CollatzNumberGenerator generator = new CollatzNumberGenerator(2);
		for (long i = 2; i <= threshold; i++)
		{
			inline.clear();
			generator.setSeed(i);
			inline.add(i);
			long out = i;
			
			//while(generator.hasNext())
			while(generator.hasNext() && (out >= threshold || solvedNumbers[(int)out] == 0))
			{
				out = generator.next();
				inline.add(out);
			}
			
			//System.out.println("Length solved [" + solvedNumbers.length + "] index [" + out + "]");
			int firstFoundLength = solvedNumbers[(int)out];
			long current = inline.pop();
			while(inline.size() > 0)
			{
				current = inline.pop();
				firstFoundLength++;
				if (current <= threshold)
				{
					solvedNumbers[(int)current] = firstFoundLength;
				}
			}
			
			//Set to current index if it is the longest
			if (longestLength < solvedNumbers[(int)i])
			{
				startValue = i;
				longestLength = solvedNumbers[(int)i];
			}
			
		}
		
		
		
		return (int)startValue;
		
	}
}


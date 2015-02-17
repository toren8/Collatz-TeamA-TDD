package com.nku.collatz;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;


public class LongestCollatzSolverTest
{	
	@Test
	public void testThresholdOne()
	{
		//1
		LongestCollatzSolver solver = new LongestCollatzSolver(1);
		Assert.assertThat(1, Is.is(solver.getLongestChain()));
	}
	
	@Test
	public void testThresholdTwo()
	{
		//2->1
		LongestCollatzSolver solver = new LongestCollatzSolver(2);
		Assert.assertThat(2, Is.is(solver.getLongestChain()));
	}
	
	@Test
	public void testThresholdThree()
	{
		//3->10->5->16->8->4->2->1
		LongestCollatzSolver solver = new LongestCollatzSolver(3);
		Assert.assertThat(3, Is.is(solver.getLongestChain()));
	}
	
	@Test
	public void testThresholdFour()
	{
		//4->2->1
		LongestCollatzSolver solver = new LongestCollatzSolver(4);
		Assert.assertThat(3, Is.is(solver.getLongestChain()));
	}
	
	@Test
	public void testThresholdFive()
	{
		//5->16->8->4->2->1
		LongestCollatzSolver solver = new LongestCollatzSolver(5);
		Assert.assertThat(3, Is.is(solver.getLongestChain()));
	}
	
	@Test
	public void testThresholdSix()
	{
		//6->3->10->5->16->8->4->2->1
		LongestCollatzSolver solver = new LongestCollatzSolver(6);
		Assert.assertThat(6, Is.is(solver.getLongestChain()));
	}
	
	@Test
	public void testThresholdBig()
	{
		int threshold = 1000000;
		LongestCollatzSolver solver = new LongestCollatzSolver(threshold);
		Assert.assertThat(837799, Is.is(solver.getLongestChain()));
	}
	
	
	
	@Test
	public void testThresFiveMillion()
	{
		int threshold = 5000000;
		long startTime = System.currentTimeMillis();
		LongestCollatzSolver solver = new LongestCollatzSolver(threshold);
		Assert.assertThat(3732423, Is.is(solver.getLongestChain()));
		long endTime = System.currentTimeMillis();
		double totalTime = (endTime - startTime) / 1000.0;
		Assert.assertTrue("Run Time less than 5 seconds actual [" + totalTime + "]", totalTime < 5d);
		
	}
}

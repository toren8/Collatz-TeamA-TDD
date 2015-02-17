package com.nku.collatz;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CollatzNumberGeneratorTest
{

	@Test
	public void testGetSeed()
	{
		long seed = 4;
		CollatzNumberGenerator	generator = new CollatzNumberGenerator(0);
		generator.setSeed(seed);
		Assert.assertThat(seed, Is.is(generator.getSeed()));
	}
	
	@Test
	public void testBaseCase()
	{
		CollatzNumberGenerator	generator = new CollatzNumberGenerator(0);
		generator.setSeed(1);
		Assert.assertThat(generator.hasNext(), Is.is(IsEqual.equalTo(false)));
	}
	
	@Test
	public void testSeedSix()
	{
		CollatzNumberGenerator	generator = new CollatzNumberGenerator(0);
		generator.setSeed(6);
		
		List<Long> generatedList = new ArrayList<Long>();
		
		while (generator.hasNext())
		{
			generatedList.add(generator.next());
		}
		
		Assert.assertThat(3L, Is.is(generatedList.get(0)));
		Assert.assertThat(10L, Is.is(generatedList.get(1)));
		Assert.assertThat(5L, Is.is(generatedList.get(2)));
		Assert.assertThat(16L, Is.is(generatedList.get(3)));
		Assert.assertThat(8L, Is.is(generatedList.get(4)));
		Assert.assertThat(4L, Is.is(generatedList.get(5)));
		Assert.assertThat(2L, Is.is(generatedList.get(6)));
		Assert.assertThat(1L, Is.is(generatedList.get(7)));
	}
	
	@Test
	public void testSeedThriteen()
	{
		CollatzNumberGenerator	generator = new CollatzNumberGenerator(0);
		generator.setSeed(13);
		
		List<Long> generatedList = new ArrayList<Long>();
		
		while (generator.hasNext())
		{
			generatedList.add(generator.next());
		}
		
		Assert.assertThat(40L, Is.is(generatedList.get(0)));
		Assert.assertThat(20L, Is.is(generatedList.get(1)));
		Assert.assertThat(10L, Is.is(generatedList.get(2)));
		Assert.assertThat(5L, Is.is(generatedList.get(3)));
		Assert.assertThat(16L, Is.is(generatedList.get(4)));
		Assert.assertThat(8L, Is.is(generatedList.get(5)));
		Assert.assertThat(4L, Is.is(generatedList.get(6)));
		Assert.assertThat(2L, Is.is(generatedList.get(7)));
		Assert.assertThat(1L, Is.is(generatedList.get(8)));
	}
	
	@Test
	public void testSeedThree()
	{
		CollatzNumberGenerator	generator = new CollatzNumberGenerator(0);
		generator.setSeed(3);
		
		List<Long> generatedList = new ArrayList<Long>();
		
		while (generator.hasNext())
		{
			generatedList.add(generator.next());
		}
		
		Assert.assertThat(10L, Is.is(generatedList.get(0)));
		Assert.assertThat(5L, Is.is(generatedList.get(1)));
		Assert.assertThat(16L, Is.is(generatedList.get(2)));
		Assert.assertThat(8L, Is.is(generatedList.get(3)));
		Assert.assertThat(4L, Is.is(generatedList.get(4)));
		Assert.assertThat(2L, Is.is(generatedList.get(5)));
		Assert.assertThat(1L, Is.is(generatedList.get(6)));
	}
}

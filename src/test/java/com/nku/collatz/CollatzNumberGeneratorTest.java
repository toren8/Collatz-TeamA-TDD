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
	
	private CollatzNumberGenerator	generator;
	
	@Before
	public void createGenerator()
	{
		generator = new CollatzNumberGenerator(0);
	}
	
	@Test
	public void testBaseCase()
	{
		generator.setSeed(1);
		Assert.assertThat(generator.hasNext(), Is.is(IsEqual.equalTo(false)));
	}
	
	@Test
	public void testSeedSix()
	{
		generator.setSeed(6);
		
		List<Long> generatedList = new ArrayList<Long>();
		
		while (generator.hasNext())
		{
			generatedList.add(generator.next());
		}
		
		Assert.assertThat(3, Is.is(generatedList.get(0)));
		Assert.assertThat(10, Is.is(generatedList.get(1)));
		Assert.assertThat(5, Is.is(generatedList.get(2)));
		Assert.assertThat(16, Is.is(generatedList.get(3)));
		Assert.assertThat(8, Is.is(generatedList.get(4)));
		Assert.assertThat(4, Is.is(generatedList.get(5)));
		Assert.assertThat(2, Is.is(generatedList.get(6)));
		Assert.assertThat(1, Is.is(generatedList.get(7)));
	}
	
	@Test
	public void testSeedThriteen()
	{
		generator.setSeed(13);
		
		List<Long> generatedList = new ArrayList<Long>();
		
		while (generator.hasNext())
		{
			generatedList.add(generator.next());
		}
		
		Assert.assertThat(40, Is.is(generatedList.get(0)));
		Assert.assertThat(20, Is.is(generatedList.get(1)));
		Assert.assertThat(10, Is.is(generatedList.get(2)));
		Assert.assertThat(5, Is.is(generatedList.get(3)));
		Assert.assertThat(16, Is.is(generatedList.get(4)));
		Assert.assertThat(8, Is.is(generatedList.get(5)));
		Assert.assertThat(4, Is.is(generatedList.get(6)));
		Assert.assertThat(2, Is.is(generatedList.get(7)));
		Assert.assertThat(1, Is.is(generatedList.get(8)));
	}
	
	@Test
	public void testSeedThree()
	{
		generator.setSeed(3);
		
		List<Long> generatedList = new ArrayList<Long>();
		
		while (generator.hasNext())
		{
			generatedList.add(generator.next());
		}
		
		Assert.assertThat(10, Is.is(generatedList.get(0)));
		Assert.assertThat(5, Is.is(generatedList.get(1)));
		Assert.assertThat(16, Is.is(generatedList.get(2)));
		Assert.assertThat(8, Is.is(generatedList.get(3)));
		Assert.assertThat(4, Is.is(generatedList.get(4)));
		Assert.assertThat(2, Is.is(generatedList.get(5)));
		Assert.assertThat(1, Is.is(generatedList.get(6)));
	}
}

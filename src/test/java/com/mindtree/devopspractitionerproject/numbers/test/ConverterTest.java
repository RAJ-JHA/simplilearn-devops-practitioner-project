package com.mindtree.devopspractitionerproject.numbers.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mindtree.devopspractitionerproject.numbers.Converter;

public class ConverterTest {

	public Converter converter;

	@Before
	public void setup() {
		converter = new Converter();
	}

	@Test
	public void number1Test() {
		Assert.assertEquals("one", converter.convertToWords(1).trim());
	}

	@Test
	public void number0001Test() {
		Assert.assertEquals("one", converter.convertToWords(0001).trim());
	}

	@Test
	public void number9Test() {
		Assert.assertEquals("nine", converter.convertToWords(9).trim());
	}

	@Test
	public void number10Test() {
		Assert.assertEquals("ten", converter.convertToWords(10).trim());
	}

	@Test
	public void number11Test() {
		Assert.assertEquals("eleven", converter.convertToWords(11).trim());
	}

	@Test
	public void number29Test() {
		Assert.assertEquals("twenty nine", converter.convertToWords(29).trim());
	}

	@Test
	public void number90Test() {
		Assert.assertEquals("ninty", converter.convertToWords(90).trim());
	}

	@Test
	public void number100Test() {
		Assert.assertEquals("one hundred", converter.convertToWords(100).trim());
	}

	@Test
	public void number202Test() {
		Assert.assertEquals("two hundred two", converter.convertToWords(202).trim());
	}

	@Test
	public void number888Test() {
		Assert.assertEquals("eight hundred eighty eight", converter.convertToWords(888).trim());
	}

	@Test
	public void number900Test() {
		Assert.assertEquals("nine hundred", converter.convertToWords(900).trim());
	}

	@Test
	public void lessThan0Test() {
		Assert.assertEquals("Invalid Number", converter.convertToWords(-19));
	}

	@Test
	public void greaterThan999Test() {
		Assert.assertEquals("Invalid Number", converter.convertToWords(78701));
	}

}

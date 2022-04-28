package com.lti.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.lti.Calculator;

class TestBeforeAfter {
	
	int sum;
	
	@BeforeAll
	public static void testConnection1()
	{
		System.out.println("DB is connected");
	}
	
	@AfterAll
	public static void testConnection2()
	{
		System.out.println("DB is closed");
	}
	
	@BeforeEach
	public void testStartUp1()
	{
		sum=0;
		System.out.println("Sum initialized to zero");
	}
	
	@AfterEach
	public void testStartUp2()
	{
		sum=8;
		System.out.println("Sum initialised to eight");
	}
	
	@Test
	public void testAddition()
	{
		System.out.println("Test Addition Method");
		Calculator c = new Calculator();
		int result=c.addNos(01, 20);
		Assertions.assertEquals(21, result);
	}

	@Test
	public void testSubtraction()
	{
		System.out.println("Test Subtraction Method");
		Calculator c = new Calculator();
		int res=c.subNos(20, 01);
		Assertions.assertEquals(19, res);
	}

}

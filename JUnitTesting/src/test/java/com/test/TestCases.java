package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junit.Area;


public class TestCases {


	
	@BeforeClass
	public static void beforeClass() {
	System.out.println("before class only ones");
	}



	@Before
	public void before() {
	System.out.println("before every test case");
	}


	@Test
	public void testsq() {
	System.out.println("testcase for square");
	Area t = new Area();
	int output = t.square(8);
	assertEquals(64, output);
	}
	
	
	@Test
	public void CheckEven() {
		System.out.println("test case for even check");
		Area t = new Area();
		
		assertEquals(2,t.evenNumber(2) );
	}
	
	
	 @After  
	    public void tearDown() throws Exception {  
	        System.out.println("after");  
	    }  
	  
	    @AfterClass  
	    public static void tearDownAfterClass() throws Exception {  
	        System.out.println("after class only once");  
	    }

	
	
}

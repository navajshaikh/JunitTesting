package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junit.Calculator;

public class TestCalculator {
	
	Calculator c=new Calculator();
	
//	@Test
//	public void addtest() {
//		assertEquals(7, c.add(3, 4));
//	}
//
//	
//	@Test
//	public void subtest() {
//		assertEquals(7, c.sub(10, 3));
//	}
	
	//////////////////////////////////////////////
	
	 @BeforeClass  
	    public static void setUpBeforeClass() throws Exception {  
	        System.out.println("before class");  
	    }  
	    @Before  
	    public void setUp() throws Exception {  
	        System.out.println("before");  
	    }  
	  
	    @Test  
	    public void testFindMax(){  
	        System.out.println("test case find max");  
	        assertEquals(4,c.findMax(new int[]{1,3,4,2}));  
	        
	    }  
	    @Test  
	    public void testCube(){  
	        System.out.println("test case cube");  
	        assertEquals(27,c.cube(3));  
	    }  
	    @Test  
	    public void testReverseWord(){  
	        System.out.println("test case reverse word");  
	   //     assertEquals("ym eman si nahk",c.reverseWord("my name is khan"));  
	    }  
	    @After  
	    public void tearDown() throws Exception {  
	        System.out.println("after");  
	    }  
	  
	    @AfterClass  
	    public static void tearDownAfterClass() throws Exception {  
	        System.out.println("after class");  
	    }  
	
	
	
}

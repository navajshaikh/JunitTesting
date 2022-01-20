package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junit.Login;

public class TestLogin {
	
	Login obj=new Login();
	
	@BeforeClass
	 public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }
	
	   @Before  
	    public void setUp() throws Exception {  
	        System.out.println("before");  
	    }
	
	@Test
	public void testlogin() {
		assertEquals("You are sucessfully loged in.", obj.login());
	}
	
	

	
	@Test
	public void testUploadPost() {
		assertEquals(1, obj.uploadPost(1));
	}
	

	
	@Test
	public void testlogout() {
		assertEquals("You logged out !!!", obj.logout());
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

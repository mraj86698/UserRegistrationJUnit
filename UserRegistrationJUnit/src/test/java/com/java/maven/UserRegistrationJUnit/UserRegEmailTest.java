package com.java.maven.UserRegistrationJUnit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



	@RunWith(Parameterized.class)
	public class UserRegEmailTest {

		private String email_test;					//global variables
		private boolean exp_val;
		private UserRegValidate checker;

		/**
		 * Create a constructor that stores the test data. It stores 2 variable
		 * @param email_test
		 * @param exp_val
		 */

		public UserRegEmailTest(String email_test, boolean exp_val) {
			this.email_test = email_test;
			this.exp_val = exp_val;
		}
		/**
		 *  Using @Parameters annotation to create a set of input data to run our test.
		 *  Create a static method that generates and returns test data
		 *  @return
		 */

		@Parameterized.Parameters
		public static Collection TestCases() {
			return Arrays.asList(new Object[][] {
			{"abc@yahoo.com",true},
			{"abc-100@yahoo.com",true},
			{"abc.100@yahoo.com",true},
			{"abc111@abc.com",true},
			{"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true},
			{"abc@1.com",true},
			{"abc@gmail.com.com",true},
			{"abc+100@gmail.com",true},

			{"abc",false},
	    	{"abc@.com.my",false},
			{"abc123@gmail.a",false},
			{"abc123@.com",false},
			{"abc123@.com.com",false},
			{".abc@abc.com",false},
			{"abc()*@gmail.com",false},
			{"abc@%*.com",false},
			{"abc..2002@gmail.com",false},
	    	{"abc.@gmail.com",false},
	    	{"abc@abc@gmail.com",false},
	    	{"abc@gmail.com.1a",false},
	    	{"abc@gmail.com.aa.au",false},
			});
		}

		@Test
		public void EmailTest() {					//initializing test
			checker=new UserRegValidate();
			boolean result=checker.validateEmail(email_test);
			Assert.assertEquals(exp_val, result);
		}
}

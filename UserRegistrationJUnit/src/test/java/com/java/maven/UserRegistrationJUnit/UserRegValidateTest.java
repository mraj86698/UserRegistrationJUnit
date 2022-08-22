package com.java.maven.UserRegistrationJUnit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class UserRegValidateTest
{
	/**
	 * To Validate for  First name
	 * Happy Test Case validates the Entry Successfully
	 * Sad Test Cases fails the Entry
	 */
	@Test
	public void FirstNameCorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validateFName("Mohan");
		Assert.assertTrue(result);
	}

	@Test
	public void FirstNameIncorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validateFName("Mn");
		Assert.assertFalse(result);
	}

	/**
	 * To Validate for  LastName
	 * Happy Test Case validates the Entry Successfully
	 * Sad Test Cases fails the Entry
	 */


	@Test
	public void LastNameCorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validateLName("Raj");
		Assert.assertTrue(result);
	}

	@Test
	public void LastNameIncorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validateLName("Rj");
		Assert.assertFalse(result);
	}

	/**
	 * To Validate for Email
	 * Happy Test Case validates the Entry Successfully
	 * Sad Test Cases fails the Entry
	 */
	@Test
	public void EmailCorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validateEmail("mraj86698@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void EmailIncorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validateEmail("mail@.com");
		Assert.assertFalse(result);
	}

	/**
	 * To Validate for  PhoneNumber
	 * Happy Test Case validates the Entry Successfully
	 * Sad Test Cases fails the Entry
	 */
	@Test
	public void PhoneCorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validatePhone("91 6374930453");
		Assert.assertTrue(result);
	}

	@Test
	public void PhoneIncorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validatePhone("54681");
		Assert.assertFalse(result);
	}

	/**
	 * To Validate for Password
	 * Happy Test Case validates the Entry Successfully
	 * Sad Test Cases fails the Entry
	 */
	@Test
	public void PasswordCorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validatePassword("Mohan$8634");
		Assert.assertTrue(result);
	}

	@Test
	public void PasswordIncorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validatePassword("mraj");
		Assert.assertFalse(result);
	}
}

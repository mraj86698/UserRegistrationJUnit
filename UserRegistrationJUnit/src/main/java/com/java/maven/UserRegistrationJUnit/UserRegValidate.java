package com.java.maven.UserRegistrationJUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegValidate
{
	private static final String fname_match = "[A-Z]{1}[a-zA-Z]{2,}";
	private static final String lname_match = fname_match;
	private static final String email_match = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	private static final String phone_match = "[0-9]{1,}\\s[1-9]{1}[0-9]{9}";
	private static final String pass_match = "((?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])).{8,}";
	/**
	 * Validate the First Name
	 * First name starts with Cap and has minimum 3 characters
	 * @param fname
	 * @return
	 */
	public boolean validateFName(String fname) {
		Pattern pattern=Pattern.compile(fname_match);
		Matcher matcher=pattern.matcher(fname);
		boolean check=pattern.matcher(fname).matches();
		return check;
	}
	/**
	 * Validate the Last Name
	 * Last name starts with Cap and has minimum 3 characters
	 * @param lname
	 * @return
	 */

	public boolean validateLName(String lname) {
		Pattern pattern=Pattern.compile(lname_match);
		Matcher matcher=pattern.matcher(lname);
		boolean check=pattern.matcher(lname).matches();
		return check;
	}
	/**
	 * Validation of Email Id
	 * A-Z characters allowed
	 * a-z characters allowed
	 * 0-9 numbers allowed
	 * Additionally email may contain only dot(.), dash(-) and underscore(_)
	 */

	public boolean validateEmail(String email) {
		Pattern pattern=Pattern.compile(email_match);
		Matcher matcher=pattern.matcher(email);
		boolean check=pattern.matcher(email).matches();
		return check;
	}
	/**
	 * Validation for Mobile Number E.g. 91 9374930253
	 * Country code Follow by space and 10 digit number.
	 */


	public boolean validatePhone(String phone) {
		Pattern pattern=Pattern.compile(phone_match);
		Matcher matcher=pattern.matcher(phone);
		boolean check=pattern.matcher(phone).matches();
		return check;
	}
	/**
	 * Validate the Password
	 * Minimum 8 Character
	 * AtLeast 1 UpperCase
	 * AtLeast 1 Numeric Number
	 * Atleast 1 Special Character
	 */

	public boolean validatePassword(String password) {
		Pattern pattern=Pattern.compile(pass_match);
		Matcher matcher=pattern.matcher(password);
		boolean check=pattern.matcher(password).matches();
		return check;
	}
}

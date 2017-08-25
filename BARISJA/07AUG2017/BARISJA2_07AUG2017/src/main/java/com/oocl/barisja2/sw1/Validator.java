package com.oocl.barisja2.sw1;

import java.util.regex.Pattern;

public class Validator {

	String password, confPassword;
	int errornum;

	public int getErrornum() {
		return errornum;
	}

	public Validator(String password, String confPassword) {
		this.password = password;
		this.confPassword = confPassword;
		errornum = validate();
	}

	public int validate() {

		if (password.equals("") || confPassword.equals("")) {
			return 1;
		} else if (!password.equals(confPassword)) {
			return 2;
		} else if (!password.matches(".*\\d+.*")) {
			return 3;
		} else if (!password.matches(".*[A-Z]+.*")) {
			return 4;
		} else if ((password.length() < 8)) {
			return 5;
		}

		return 0;

	}

}

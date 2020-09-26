package com.projectb.recruitment.exception;

public class UserRegisteredException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7196458172266470890L;

	public UserRegisteredException() {
	}

	public UserRegisteredException(String message) {
		super(message);
	}

	public UserRegisteredException(Throwable cause) {
		super(cause);
	}

	public UserRegisteredException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserRegisteredException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

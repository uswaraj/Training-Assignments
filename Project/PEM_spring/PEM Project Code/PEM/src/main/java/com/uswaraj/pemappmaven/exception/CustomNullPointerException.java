/**
 * 
 */
package com.uswaraj.pemappmaven.exception;

/**
 * @author a
 *
 */
public class CustomNullPointerException extends Exception {

	/**
	 * this is parameterized constructor accept String as parameter.
	 * also call parameterized constructor of Exception super class.
	 * @param message
	 */
	public CustomNullPointerException(String message) {
		super(message);
	}
}

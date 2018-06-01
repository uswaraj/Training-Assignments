/**
 * 
 */
package com.uswarajsoft;

/**
 * This class is an entry point of execution for PersonaExpenseManager
 * Application (PEMApp).
 * 
 * @author udakhe.swaraj
 *
 */
public class StartApp {
	/**
	 * This method is creating <code>PEMService</code> Object and show app menu
	 * by calling showMenu() method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		PEMService service = new PEMService();
		service.showMenu();
	}

}

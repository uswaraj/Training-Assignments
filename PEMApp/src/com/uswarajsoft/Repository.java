/**
 * 
 */
package com.uswarajsoft;

import java.util.ArrayList;
import java.util.List;

/**
 * The class is used as Database/Repository and its a singleton.
 * @author udakhe.swaraj
 *
 */
public class Repository {

	public List<Expense> expList = new ArrayList<>();
	public List<Category> catList = new ArrayList<>();
	private static Repository repository;
	private Repository() {
		
	}
	
	public static Repository getRepository() {
		if (repository == null) {
			repository = new Repository();
		}
		return repository;
	}
}

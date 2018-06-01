/**
 * 
 */
package com.uswarajsoft;

/**
 * This is a domain class represented a category.
 * @author udakhe.swaraj
 *
 */
public class Category {

	/**
	 * It refers to a unique category Id. 
	 * Here it is simply equal to generated using current time, but in real time application it should be generated using some profession strategy or algo.
	 */
	private Long categoryId = System.currentTimeMillis();
	
	/**
	 * Name of Category.
	 */
	private String name;
	
	public Category() {
	
	}

	/**
	 * @param name
	 */
	public Category(String name) {
		this.name = name;
	}



	/**
	 * @param categoryId
	 * @param name
	 */
	public Category(Long categoryId, String name) {
		this.categoryId = categoryId;
		this.name = name;
	}



	/**
	 * @return the categoryId
	 */
	public Long getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}

/**
 * 
 */
package com.uswaraj.pemappmaven.domain;

/**
 * @author udakhe.swaraj
 *
 */
public class Category {

	private Integer catId;
	private Integer userId; // FK
	private String catName;
	
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Category() {

	}

	/**
	 * @param catName
	 */
	public Category(String catName) {
		super();
		this.catName = catName;
	}

	/**
	 * @param userId
	 * @param catName
	 */
	public Category(Integer userId, String catName) {
		super();
		this.userId = userId;
		this.catName = catName;
	}

	/**
	 * @param catId
	 * @param userId
	 * @param catName
	 */
	public Category(Integer catId, Integer userId, String catName) {
		super();
		this.catId = catId;
		this.userId = userId;
		this.catName = catName;
	}

	/**
	 * @return the catId
	 */
	public Integer getCatId() {
		return catId;
	}

	/**
	 * @param catId
	 *            the catId to set
	 */
	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	/**
	 * @return the catName
	 */
	public String getCatName() {
		return catName;
	}

	/**
	 * @param catName
	 *            the catName to set
	 */
	public void setCatName(String catName) {
		this.catName = catName;
	}

}

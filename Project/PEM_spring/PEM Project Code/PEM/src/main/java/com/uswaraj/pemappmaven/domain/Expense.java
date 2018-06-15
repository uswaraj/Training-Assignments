/**
 * 
 */
package com.uswaraj.pemappmaven.domain;

import java.util.Date;

/**
 * @author udakhe.swaraj
 *
 */
public class Expense {

	private Integer expId;
	private Integer catId; // FK
	private Integer userId;
	private Float amount;
	private String date;
	private String remark;
	private String catName;
	private String total;
	private String month;
	private String year;


	public Expense() {

	}

	/**
	 * @param catId
	 * @param amount
	 * @param date
	 * @param remark
	 */
	public Expense(Integer catId, Float amount, String date, String remark) {
		super();
		this.catId = catId;
		this.amount = amount;
		this.date = date;
		this.remark = remark;
	}

	/**
	 * @return the catName
	 */
	public String getCatName() {
		return catName;
	}

	/**
	 * @param catName the catName to set
	 */
	public void setCatName(String catName) {
		this.catName = catName;
	}

	/**
	 * @return the payDateAndTime
	 */
	

	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(String total) {
		this.total = total;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @param catId
	 * @param userId
	 * @param amount
	 * @param date
	 * @param remark
	 */
	public Expense(Integer catId, Integer userId, Float amount, String date, String remark) {
		super();
		this.catId = catId;
		this.userId = userId;
		this.amount = amount;
		this.date = date;
		this.remark = remark;
	}

	/**
	 * @return the expId
	 */
	public Integer getExpId() {
		return expId;
	}

	/**
	 * @param expId
	 *            the expId to set
	 */
	public void setExpId(Integer expId) {
		this.expId = expId;
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
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the amount
	 */
	public Float getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(Float amount) {
		this.amount = amount;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}

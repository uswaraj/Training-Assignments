/**
 * 
 */
package com.uswarajsoft;

import java.util.Date;

/**
 * This is a domain class represents Expense.
 * @author udakhe.swaraj
 *
 */
public class Expense {

	/**
	 * A unique expense id, here its auto-generated as current milliseconds, but should use time standards algo for primary key generation.
	 */
	private Long expenseId = System.currentTimeMillis();
	
	/**
	 * Represents a category of this expense.
	 */
	private Long categoryId; // FK
	private Float amount;
	private Date date;
	private String remark;
	
	public Expense() {
	
	}

	/**
	 * @param categoryId
	 * @param amount
	 * @param date
	 * @param remark
	 */
	public Expense(Long categoryId, Float amount, Date date, String remark) {
		super();
		this.categoryId = categoryId;
		this.amount = amount;
		this.date = date;
		this.remark = remark;
	}

	/**
	 * @return the expenseId
	 */
	public Long getExpenseId() {
		return expenseId;
	}

	/**
	 * @param expenseId the expenseId to set
	 */
	public void setExpenseId(Long expenseId) {
		this.expenseId = expenseId;
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
	 * @return the amount
	 */
	public Float getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Float amount) {
		this.amount = amount;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}

/**
 * 
 */
package com.uswaraj.pemappmaven.dao;

import java.util.List;

import com.uswaraj.pemappmaven.domain.Expense;

/**
 * @author udakhe.swaraj
 *
 */
public interface ExpenseDAO {

	public int insertExpense(Expense expense);
	
	public int deleteExpense(Integer expId);
	
	public List<Expense> expLists(String username);
	
	public List<Expense> expMonthlyLists(String username);
	
	public List<Expense> expYearlyLists(String username);
	
	public List<Expense> expCategoryWiseLists(String username);
}

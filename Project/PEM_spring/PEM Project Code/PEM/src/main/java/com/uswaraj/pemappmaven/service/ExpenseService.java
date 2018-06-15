/**
 * 
 */
package com.uswaraj.pemappmaven.service;

import java.util.List;

import com.uswaraj.pemappmaven.domain.Category;
import com.uswaraj.pemappmaven.domain.Expense;

/**
 * @author udakhe.swaraj
 *
 */
public interface ExpenseService {

	public int addExpense(Expense expense);
	
	public int deleteExpense(Integer expId);
	
	public List<Expense> showExpLists(String username);
	
	public List<Expense> showExpMonthlyLists(String username);
	
	public List<Expense> showExpYearlyLists(String username);
	
	public List<Expense> showExpCategoryWiseLists(String username);
	
	
}

/**
 * 
 */
package com.uswaraj.pemappmaven.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uswaraj.pemappmaven.dao.ExpenseDAO;
import com.uswaraj.pemappmaven.domain.Category;
import com.uswaraj.pemappmaven.domain.Expense;
import com.uswaraj.pemappmaven.service.ExpenseService;

/**
 * @author udakhe.swaraj
 *
 */
@Service("expenseService")
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseDAO expenseDAO;
	
	public int addExpense(Expense expense) {

		return expenseDAO.insertExpense(expense);
	}

	public List<Expense> showExpLists(String username) {

		return expenseDAO.expLists(username);
	}

	public List<Expense> showExpMonthlyLists(String username) {

		return expenseDAO.expMonthlyLists(username);
	}

	public List<Expense> showExpYearlyLists(String username) {

		return expenseDAO.expYearlyLists(username);
	}

	public List<Expense> showExpCategoryWiseLists(String username) {

		return expenseDAO.expCategoryWiseLists(username);
	}

	public int deleteExpense(Integer expId) {

		return expenseDAO.deleteExpense(expId);
	}

}

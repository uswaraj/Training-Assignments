/**
 * 
 */
package com.uswaraj.pemappmaven.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uswaraj.pemappmaven.domain.Category;
import com.uswaraj.pemappmaven.domain.Expense;
import com.uswaraj.pemappmaven.service.CategoryService;
import com.uswaraj.pemappmaven.service.ExpenseService;

/**
 * @author udakhe.swaraj
 *
 */
@Controller
@RequestMapping("/user")
public class ExpenseController {

	@Autowired
	ExpenseService expenseService;

	@Autowired
	HttpSession session;

	@Autowired
	CategoryService categoryService;

	@RequestMapping(value = "/addExpense.htm", method = RequestMethod.GET)
	public ModelAndView showAddExpensePage() {

		// session.setAttribute("username", session.getAttribute("username"));
		ModelAndView model = new ModelAndView("addExpense");

		Integer userId = (Integer) session.getAttribute("userId");
		List<Category> catlist = new ArrayList<Category>();

		catlist = categoryService.categoryList(userId);

		model.addObject("catList", catlist);

		return model;

	}

	@RequestMapping(value = "/sendExpense.htm", method = RequestMethod.POST)
	public ModelAndView addExpensePage(@RequestParam("catId") int categoryId, @RequestParam("date") String date,
			@ModelAttribute("exp") Expense expense) {

		Integer userId = (Integer) session.getAttribute("userId");
		expense.setUserId(userId);
		expense.setCatId(categoryId);

		String arr[] = date.split("-");
		String month = null;
		String year = null;
		for (int i = 0; i < arr.length; i++) {

			year = arr[0];
			System.out.println("-----------y" + year);

			month = arr[1];
			System.out.println("------------m" + month);

		}

		expense.setMonth(month);

		expense.setYear(year);

		List<Category> catlist = new ArrayList<Category>();

		catlist = categoryService.getNameById(categoryId);
		String catName = null;

		for (Category category : catlist) {
			catName = category.getCatName();
		}

		expense.setCatName(catName);

		expenseService.addExpense(expense);

		ModelAndView model = new ModelAndView("profile");
		model.addObject("msg", "Expense Added successfully");

		return model;
	}

	@RequestMapping(value = "/listExpenses.htm", method = RequestMethod.GET)
	protected ModelAndView listExpense(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView model = new ModelAndView("listExpense");

		String userId = session.getAttribute("userId").toString();

		List<Expense> explist = new ArrayList<Expense>();
		explist = expenseService.showExpLists(userId);

		model.addObject("explist", explist);
		return model;
	}

	@RequestMapping(value = "/listMonthlyExpense.htm")
	protected ModelAndView listMonthlyExpenses(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView model = new ModelAndView("monthlyReportList");
		
		String userId = session.getAttribute("userId").toString();

		List<Expense> expMonList = new ArrayList<Expense>();

		expMonList = expenseService.showExpMonthlyLists(userId);

		model.addObject("expMonList", expMonList);
		
		return model;
	}
	
	@RequestMapping(value = "/listYearlyExpense.htm")
	protected ModelAndView listYearlyExpenses(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView model = new ModelAndView("yearlyReportList");
		
		String userId = session.getAttribute("userId").toString();

		List<Expense> expYearList = new ArrayList<Expense>();

		expYearList = expenseService.showExpYearlyLists(userId);

		model.addObject("expYearList", expYearList);
		
		return model;
	}
	
	@RequestMapping(value = "/listCategoryWiseExpense.htm")
	protected ModelAndView listCategoryWiseExpenses(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView model = new ModelAndView("categoryWiseReportList");
		
		String userId = session.getAttribute("userId").toString();

		List<Expense> expCategoryWiseList = new ArrayList<Expense>();

		expCategoryWiseList = expenseService.showExpCategoryWiseLists(userId);

		model.addObject("expCategoryWiseList", expCategoryWiseList);
		
		return model;
	}
	
	
}

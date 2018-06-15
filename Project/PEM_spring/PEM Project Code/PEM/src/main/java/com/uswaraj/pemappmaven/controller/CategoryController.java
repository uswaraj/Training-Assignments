/**
 * 
 */
package com.uswaraj.pemappmaven.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uswaraj.pemappmaven.domain.Category;
import com.uswaraj.pemappmaven.service.CategoryService;

/**
 * @author udakhe.swaraj
 *
 */
@Controller
@RequestMapping("/user")
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@Autowired
	HttpSession session;

	@RequestMapping(value = "/profile.htm", method = RequestMethod.GET)
	public ModelAndView showCategoryProfilePage() {
		ModelAndView model = new ModelAndView("profile");
		return model;
	}

	@RequestMapping(value = "/addCategory.htm", method = RequestMethod.GET)
	public ModelAndView showAddCategoryPage(Category category) {

		ModelAndView model = new ModelAndView("addCategory");

		session.setAttribute("catId", category.getCatId());

		return model;
	}

	@RequestMapping(value = "/addCat.htm", method = RequestMethod.POST)
	public ModelAndView addCategoryPage(Category category) {

		Integer userId = (Integer) session.getAttribute("userId");
		category.setUserId(userId);

		categoryService.addCategory(category);

		ModelAndView model = new ModelAndView("profile");

		return model;
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@RequestMapping(value = "/listCategory.htm", method = RequestMethod.GET)
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView model = new ModelAndView("listCategory");
		
		Integer userId = (Integer) session.getAttribute("userId");

		List<Category> categories = new ArrayList<Category>();
		categories = categoryService.categoryList(userId);
		
		System.out.println(categories);
		
		for (Category category : categories) {
			System.out.println(category);
		}
		
		model.addObject("listCategory", categories);
		return model;
	}
}

/**
 * 
 */
package com.uswaraj.pemappmaven.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uswaraj.pemappmaven.dao.CategoryDAO;
import com.uswaraj.pemappmaven.domain.Category;
import com.uswaraj.pemappmaven.service.CategoryService;

/**
 * @author udakhe.swaraj
 *
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDAO categoryDAO;

	public int addCategory(Category category) {

		return categoryDAO.insertCategory(category);
	}

	public List<Category> categoryList(Integer userId) {

		return categoryDAO.catLists(userId);
	}

	public List<Category> getNameById(Integer CatId) {
		return categoryDAO.getNameById(CatId);
	}

}

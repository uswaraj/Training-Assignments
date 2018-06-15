/**
 * 
 */
package com.uswaraj.pemappmaven.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uswaraj.pemappmaven.domain.Category;

/**
 * @author udakhe.swaraj
 *
 */

public interface CategoryService {

	public int addCategory(Category category);
	
	
	public List<Category> categoryList(Integer userId);
	
	public List<Category> getNameById(Integer CatId);
}

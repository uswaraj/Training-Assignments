/**
 * 
 */
package com.uswaraj.pemappmaven.dao;

import java.util.List;

import com.uswaraj.pemappmaven.domain.Category;

/**
 * @author udakhe.swaraj
 *
 */
public interface CategoryDAO {

	public int insertCategory(Category category);
	
	public List<Category> catLists(Integer userId);

	public List<Category> getNameById(Integer catId);
}

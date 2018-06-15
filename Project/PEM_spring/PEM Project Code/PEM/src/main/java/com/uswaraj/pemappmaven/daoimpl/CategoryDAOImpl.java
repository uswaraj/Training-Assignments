/**
 * 
 */
package com.uswaraj.pemappmaven.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uswaraj.pemappmaven.dao.CategoryDAO;
import com.uswaraj.pemappmaven.domain.Category;
import com.uswaraj.pemappmaven.rowmapper.CustomeCategoryRowMapper;

/**
 * @author udakhe.swaraj
 *
 */
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public int insertCategory(Category category) {

		String sql = "INSERT INTO category (cat_name,user_id) values(?,?)";

		int i = jdbcTemplate.update(sql, new Object[] { category.getCatName(),category.getUserId() });
		System.out.println(category.getCatName());
		if (i > 0) {

			return i;
		}
		
		return 0;
	}

	public List<Category> catLists(Integer userId) {

		System.out.println("category dao impl..........." + userId);
		
		List<Category> categories = new ArrayList<Category>();
		String sql = "select * from category where user_id = ?";
		categories = jdbcTemplate.query(sql, new CustomeCategoryRowMapper(), userId);
		
		System.out.println(categories);
		
		return categories;
		
	}

	public List<Category> getNameById(Integer catId) {
		List<Category> categories = new ArrayList<Category>();
		String sql = "select * from category where cat_id = ?";
		categories = jdbcTemplate.query(sql, new CustomeCategoryRowMapper(), catId);
		
		System.out.println(categories);
		
		return categories;
	}

}

/**
 * 
 */
package com.uswaraj.pemappmaven.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uswaraj.pemappmaven.domain.Category;

/**
 * @author udakhe.swaraj
 *
 */
public class CustomeCategoryRowMapper implements RowMapper<Category> {

	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {

		Category category = new Category();
		
		category.setCatId(rs.getInt(1));
		category.setCatName(rs.getString(2));
		category.setUserId(rs.getInt(3));
		
		return category;
	}

}

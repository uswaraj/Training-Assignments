/**
 * 
 */
package com.uswaraj.pemappmaven.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uswaraj.pemappmaven.domain.Expense;

/**
 * @author udakhe.swaraj
 *
 */
public class listExpenseRowMapper implements RowMapper<Expense> {

	public Expense mapRow(ResultSet rs, int rowNum) throws SQLException {

		Expense expense = new Expense();
		
		expense.setCatName(rs.getString("catName"));
		expense.setMonth(rs.getString("month"));
		expense.setYear(rs.getString("year"));
		expense.setTotal(rs.getString("total"));
		
		return expense;
	}

}

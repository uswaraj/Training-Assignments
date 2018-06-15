/**
 * 
 */
package com.uswaraj.pemappmaven.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.uswaraj.pemappmaven.domain.Category;
import com.uswaraj.pemappmaven.domain.Expense;

/**
 * @author udakhe.swaraj
 *
 */
public class CustomeExpenseRowMapper implements RowMapper<Expense> {

	public Expense mapRow(ResultSet rs, int rowNum) throws SQLException {

		Expense expenses = new Expense();
		
		expenses.setExpId(rs.getInt(1));
		expenses.setAmount(rs.getFloat(2));
		expenses.setDate(rs.getString(3));
		expenses.setRemark(rs.getString(4));
		expenses.setCatName(rs.getString(5));
		expenses.setMonth(rs.getString(6));
		expenses.setYear(rs.getString(7));
		expenses.setUserId(rs.getInt(8));
		expenses.setCatId(rs.getInt(9));
		
		return expenses;
	}

}

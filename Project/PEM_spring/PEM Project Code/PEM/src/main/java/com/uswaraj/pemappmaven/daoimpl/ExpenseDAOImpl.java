/**
 * 
 */
package com.uswaraj.pemappmaven.daoimpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uswaraj.pemappmaven.dao.ExpenseDAO;
import com.uswaraj.pemappmaven.domain.Category;
import com.uswaraj.pemappmaven.domain.Expense;
import com.uswaraj.pemappmaven.rowmapper.CustomeCategoryRowMapper;
import com.uswaraj.pemappmaven.rowmapper.CustomeExpenseRowMapper;
import com.uswaraj.pemappmaven.rowmapper.listExpenseRowMapper;

/**
 * @author udakhe.swaraj
 *
 */
@Repository("expenseDAO")
public class ExpenseDAOImpl implements ExpenseDAO {

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

	public int insertExpense(Expense expense) {

		String sql = "INSERT INTO expenses (exp_amount,exp_date,exp_remark,userId,cat_id,catName,month,year) values(?,?,?,?,?,?,?,?)";

		int i = jdbcTemplate.update(sql, new Object[] { expense.getAmount(), expense.getDate(), expense.getRemark(),
				expense.getUserId(), expense.getCatId(), expense.getCatName(), expense.getMonth(), expense.getYear() });

		if (i > 0) {

			return i;
		}
		return 0;
	}

	public List<Expense> expLists(String username) {

		List<Expense> explist = new ArrayList<Expense>();
		String sql = "select * from expenses where userId = ?";
		explist = jdbcTemplate.query(sql, new CustomeExpenseRowMapper(), username);

		return explist;
	}

	public List<Expense> expMonthlyLists(String username) {

		String sql = "SELECT  month,year,catName,SUM(exp_amount) as 'total' FROM expenses where userId = ? GROUP BY month ASC";

		List<Expense> explist = new ArrayList<Expense>();
		explist = jdbcTemplate.query(sql, new listExpenseRowMapper(), username);

		return explist;
	}

	public List<Expense> expYearlyLists(String username) {

		String sql = "SELECT  month,year,catName,SUM(exp_amount) as 'total' FROM expenses where userId = ? GROUP BY year ASC";

		List<Expense> explist = new ArrayList<Expense>();
		explist = jdbcTemplate.query(sql, new listExpenseRowMapper(), username);

		return explist;
	}

	public List<Expense> expCategoryWiseLists(String username) {

		String sql = "SELECT  month,year,catName,SUM(exp_amount) as 'total' FROM expenses where userId = ? GROUP BY catName ASC";

		List<Expense> explist = new ArrayList<Expense>();
		explist = jdbcTemplate.query(sql, new listExpenseRowMapper(), username);

		return explist;
	}

	public int deleteExpense(Integer expId) {

		String del = " DELETE FROM expenses WHERE exp_id = ?";
		int i = jdbcTemplate.update(del, expId);
		if (i > 0) {
			return i;
		}
		return 0;

	}

}

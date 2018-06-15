/**
 * 
 */
package com.uswaraj.pemappmaven.daoimpl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uswaraj.pemappmaven.dao.UserDAO;
import com.uswaraj.pemappmaven.domain.User;
import com.uswaraj.pemappmaven.exception.CustomNullPointerException;
import com.uswaraj.pemappmaven.rowmapper.CustomUserRowMapper;

/**
 * @author udakhe.swaraj
 *
 */
@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

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

	public int insertUser(User user) {

		if (user == null) {
			try {
				throw new CustomNullPointerException("user having no values");
			} catch (Exception e) {

				e.printStackTrace();
			}
		} else {

			String sql = "INSERT INTO users (name,email,loginname,password) values(?,?,?,?)";

			int i = jdbcTemplate.update(sql, new Object[] { user.getUserName(), user.getEmail(), user.getLoginname(), user.getPassword() });
			
			if (i > 0) {

				return i;
			}

		}
		return 0;
	}

	public User loginUser(String loginname) {

		String sql = null;
		User user = null;

			sql = "select * from users where loginname = ?";
			user = new User();
			user = jdbcTemplate.queryForObject(sql, new CustomUserRowMapper(), loginname);


		return user;
	}

}

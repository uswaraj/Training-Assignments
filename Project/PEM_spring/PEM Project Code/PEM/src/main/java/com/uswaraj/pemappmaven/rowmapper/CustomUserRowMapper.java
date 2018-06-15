/**
 * 
 */
package com.uswaraj.pemappmaven.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uswaraj.pemappmaven.domain.User;

/**
 * @author udakhe.swaraj
 *
 */
public class CustomUserRowMapper implements RowMapper<User> {

	
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {

		User user = new User();

		user.setUserId(rs.getInt(1));
		user.setUserName(rs.getString(2));
		user.setLoginname(rs.getString(3));
		user.setPassword(rs.getString(4));
		
		return user;
	}

}

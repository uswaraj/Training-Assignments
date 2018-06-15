/**
 * 
 */
package com.uswaraj.pemappmaven.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uswaraj.pemappmaven.dao.UserDAO;
import com.uswaraj.pemappmaven.domain.User;
import com.uswaraj.pemappmaven.service.UserService;

/**
 * @author udakhe.swaraj
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	public int registerUser(User user) {

		return userDAO.insertUser(user);
	}

	public User loginUser(String loginname) {

		return userDAO.loginUser(loginname);
	}

}

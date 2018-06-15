/**
 * 
 */
package com.uswaraj.pemappmaven.dao;

import com.uswaraj.pemappmaven.domain.User;

/**
 * @author udakhe.swaraj
 *
 */
public interface UserDAO {

	/**
	 * This method is used for Inserting User in DB.
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	/**
	 * This method is used for logging into an Application.
	 * @param loginname
	 * @return
	 */
	public User loginUser(String loginname);
}

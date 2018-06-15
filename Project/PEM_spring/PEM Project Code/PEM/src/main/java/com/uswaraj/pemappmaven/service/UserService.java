/**
 * 
 */
package com.uswaraj.pemappmaven.service;

import com.uswaraj.pemappmaven.domain.User;

/**
 * @author udakhe.swaraj
 *
 */
public interface UserService {

	/**
	 * 
	 * @param user
	 * @return
	 */
	public int registerUser(User user);	
	
	/**
	 * 
	 * @param loginname
	 * @return
	 */
	public User loginUser(String loginname);
}

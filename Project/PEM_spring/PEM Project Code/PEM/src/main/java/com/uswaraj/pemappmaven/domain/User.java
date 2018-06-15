/**
 * 
 */
package com.uswaraj.pemappmaven.domain;

/**
 * @author udakhe.swaraj
 *
 */
public class User {

	private Integer userId;
	private String userName;
	private String email;
	private String loginname;
	private String password;
	
	public User() {
	
	}

	/**
	 * @param userId
	 * @param userName
	 * @param loginname
	 * @param password
	 */
	public User(Integer userId, String userName, String loginname, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.loginname = loginname;
		this.password = password;
	}
	
	/**
	 * @param userId
	 * @param userName
	 * @param email
	 * @param loginname
	 * @param password
	 */
	public User(Integer userId, String userName, String email, String loginname, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.loginname = loginname;
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the loginname
	 */
	public String getLoginname() {
		return loginname;
	}

	/**
	 * @param loginname the loginname to set
	 */
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

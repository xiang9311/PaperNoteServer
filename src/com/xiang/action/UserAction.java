/**
 * add by xiang 
 * 2015��1��24�� UserAction.java
 */
package com.xiang.action;

import java.util.HashMap;

import com.xiang.base.BaseAction;
import com.xiang.dao.user.PnUser;
import com.xiang.server.UserServer;

/**
 * @author ����
 *
 */
public class UserAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5528119123690441362L;
	/**
	 * ��ȡ������
	 */
	private String username;
	private String password;
	/**
	 * ���ص�����
	 */
	private HashMap<String, Object> dataMap;
	private PnUser user;
	/**
	 * ��������
	 */
	private UserServer userServer;
	
	/**
	 * @return SUCCESS ��ʾ�ɹ�
	 */
	public String addUser(){
		user = new PnUser();
		user.setPassword(password);
		user.setUsername(username);
		userServer.addUser(user);
		
		setStatus(0);
		setDescription("ע��ɹ�");
		
		dataMap = new HashMap<String, Object>();
		dataMap.put("status", getStatus());
		dataMap.put("description", getDescription());
		dataMap.put("user", user);
		
		return SUCCESS;
	}

	/**
	 * @return the userServer
	 */
	public UserServer getUserServer() {
		return userServer;
	}

	/**
	 * @param userServer the userServer to set
	 */
	public void setUserServer(UserServer userServer) {
		this.userServer = userServer;
	}

	/**
	 * @return the user
	 */
	public PnUser getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(PnUser user) {
		this.user = user;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
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

	public HashMap<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(HashMap<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
}

/**
 * add by xiang 
 * 2015Äê1ÔÂ24ÈÕ UserServerImpl.java
 */
package com.xiang.server.impl;

import com.xiang.base.BaseServerImpl;
import com.xiang.dao.user.PnUser;
import com.xiang.dao.user.PnUserDAO;
import com.xiang.server.UserServer;

/**
 * @author ÏéÏé
 *
 */
public class UserServerImpl extends BaseServerImpl implements UserServer {

	private PnUserDAO userDao;
	
	/* (non-Javadoc)
	 * @see com.xiang.server.UserServer#addUser(com.xiang.dao.user.PnUser)
	 */
	@Override
	public void addUser(PnUser user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	/**
	 * @return the userDao
	 */
	public PnUserDAO getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(PnUserDAO userDao) {
		this.userDao = userDao;
	}

}

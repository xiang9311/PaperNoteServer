/**
 * add by xiang 
 * 2015��1��24�� UserServer.java
 */
package com.xiang.server;

import com.xiang.base.BaseServer;
import com.xiang.dao.user.PnUser;

/**
 * @author ����
 *
 */
public interface UserServer extends BaseServer {
	public void addUser(PnUser user);
}

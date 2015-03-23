/**
 * add by xiang 
 * 2015Äê1ÔÂ24ÈÕ UserServer.java
 */
package com.xiang.server;

import com.xiang.base.BaseServer;
import com.xiang.dao.user.PnUser;

/**
 * @author ÏéÏé
 *
 */
public interface UserServer extends BaseServer {
	public void addUser(PnUser user);
}

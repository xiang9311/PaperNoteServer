/**
 * add by xiang 
 * 2015��1��24�� BaseAction.java
 */
package com.xiang.base;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ����
 *
 */
public class BaseAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6202697308304837085L;

	/**
	 * ���ص�����
	 */
	private int status;
	private String description;
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}

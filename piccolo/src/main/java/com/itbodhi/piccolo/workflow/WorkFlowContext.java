package com.itbodhi.piccolo.workflow;

import com.itbodhi.piccolo.ui.bean.UserBean;

public class WorkFlowContext {

	Object ipContxt;
	Object opContxt;
	
	UserBean userBean;
	

	public Object getIpContxt() {
		return ipContxt;
	}

	public void setIpContxt(Object ipContxt) {
		this.ipContxt = ipContxt;
	}

	public Object getOpContxt() {
		return opContxt;
	}

	public void setOpContxt(Object opContxt) {
		this.opContxt = opContxt;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	
	
}

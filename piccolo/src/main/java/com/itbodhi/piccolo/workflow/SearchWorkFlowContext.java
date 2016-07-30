package com.itbodhi.piccolo.workflow;

import com.itbodhi.piccolo.ui.bean.SearchBean;

public class SearchWorkFlowContext {

	Object ipContxt;
	Object opContxt;
	
	SearchBean searchBean;
	

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


	
	public SearchBean getSearchBean() {
		return searchBean;
	}

	public void setSearchBean(SearchBean searchBean) {
		this.searchBean = searchBean;
	}

	
}

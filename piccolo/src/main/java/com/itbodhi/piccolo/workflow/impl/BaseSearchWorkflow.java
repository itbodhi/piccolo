package com.itbodhi.piccolo.workflow.impl;

import com.itbodhi.piccolo.workflow.SearchWorkflowContext;

public abstract class BaseSearchWorkflow {
	SearchWorkflowContext wfCtx;

	public SearchWorkflowContext getWfCtx() {
		return wfCtx;
	}

	public void setWfCtx(SearchWorkflowContext wfCtx) {
		this.wfCtx = wfCtx;
	}
	
	public void resetWorkFlowContext(){
		this.wfCtx = null;
	}
}
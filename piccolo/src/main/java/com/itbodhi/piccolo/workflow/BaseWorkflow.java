package com.itbodhi.piccolo.workflow;

public abstract class BaseWorkflow {

	public WorkFlowContext wfCtx;

	public WorkFlowContext getWfCtx() {
		return wfCtx;
	}

	public void setWfCtx(WorkFlowContext wfCtx) {
		this.wfCtx = wfCtx;
	}
	
	public void resetWorkFlowContext(){
		this.wfCtx = null;
	}
}

package com.itbodhi.piccolo.workflow;

public interface Workflow {

	public void execute() throws Exception;
	public void setContext(Object ctx) ;
	public Object getContext() ;
	
}
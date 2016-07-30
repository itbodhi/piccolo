package com.itbodhi.piccolo.workflow.impl.Search;

import com.itbodhi.piccolo.entity.Search;
import com.itbodhi.piccolo.ui.bean.SearchBean;
import com.itbodhi.piccolo.workflow.BaseWorkflow;
import com.itbodhi.piccolo.workflow.SearchWorkflowContext;
import com.itbodhi.piccolo.workflow.Workflow;
import com.itbodhi.piccolo.workflow.impl.BaseSearchWorkflow;

public class SearchWorkflow extends BaseSearchWorkflow implements Workflow{
SearchWorkflowContext ctf=getWfCtx();
public void execute() throws Exception
{
	this.eventExist(ctf.getSearchBean().getEvent());
	this.locationExist(ctf.getSearchBean().getLocation());
}
public void insert()
{
	SearchBean sb=(SearchBean)ctf.getIpContxt();
	
	
	Search sr=new Search();
	sr.setEvent(sb.getEvent());
	sr.setLocation(sb.getLocation());
}
public void eventExist(String event) throws Exception
{
	SearchDAO sd=new SearchDAO();
Search s=sd.getSearch(event);
if(s==null)
{
	throw new Exception("Event name cant be empty");
}
if(s.getEvent()!=ctf.getSearchBean().getEvent())
{
	throw new Exception("Even doesnot exist");
}
}
public void locationExist(String location) throws Exception
{
	SearchDAO sd=new SearchDAO();
	Search s=sd.getSearch(location);
	if(s.getEvent()!=ctf.getSearchBean().getEvent())
	{
		throw new Exception("Event doesnot exist");
	}
	}
public void setContext(Object ctx) {
	// TODO Auto-generated method stub
	
}
public Object getContext() {
	// TODO Auto-generated method stub
	return null;
}
	
}
	


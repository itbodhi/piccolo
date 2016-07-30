package com.itbodhi.picolo.imp.search;

import com.itbodhi.piccolo.entity.Search;
import com.itbodhi.piccolo.ui.bean.SearchBean;
import com.itbodhi.piccolo.workflow.BaseWorkflow;
import com.itbodhi.piccolo.workflow.SearchWorkFlowContext;
import com.itbodhi.piccolo.workflow.Workflow;

public class SearchWorkflow extends BaseWorkflow implements Workflow{
SearchWorkFlowContext ctx=getWfCtx();
public void execute() throws Exception
{
	this.eventExist(ctx.getSearchBean().getEvent());
	this.locationExist(ctx.getSearchBean().getLocation());
}
public void insert()
{
	SearchBean sb=(SearchBean)ctx.getIpContxt();
	
	
	Search sr=new Search();
	sr.setEvent(sb.getEvent());
	sr.setLocation(sb.getLocation());
}
public void eventExist(String event) throws Exception
{
	SearchDAO sd=new SearchDAO();
    Search s =sd.getSearch(event);
if(s==null)
{
	throw new Exception("Event name cant be empty");
}
if(s.getEvent()!=ctx.getSearchBean().getEvent())
{
	throw new Exception("Even doesnot exist");
}
}
public void locationExist(String location) throws Exception
{
	SearchDAO sd=new SearchDAO();
	Search s=sd.getSearch(location);
	if(s.getEvent()!=ctx.getSearchBean().getEvent())
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
	


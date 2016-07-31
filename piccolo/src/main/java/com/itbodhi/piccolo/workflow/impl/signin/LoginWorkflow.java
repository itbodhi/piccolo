package com.itbodhi.piccolo.workflow.impl.signin;

import com.itbodhi.piccolo.entity.User;
import com.itbodhi.piccolo.workflow.BaseWorkflow;
import com.itbodhi.piccolo.workflow.WorkFlowContext;
import com.itbodhi.piccolo.workflow.Workflow;

public class LoginWorkflow extends BaseWorkflow implements Workflow{

	WorkFlowContext ctx = getWfCtx();
	
	public void execute() throws Exception {
		
		//ctx.setOpContxt(opContxt);
		
		//1. validate if admin exist
		this.adminExist(ctx.getViewBean().getLoginId());
		
		//2. validate if password is correct
		this.passWordValidation(ctx.getViewBean().getLoginId());
	}

	public void AdminExist(String loginId) throws AdminNotExist {
		
		UserDAO ud = new UserDAO();
		
		User usr = ud.getAdmin(loginId);
		
		if ( usr == null )
		{
			throw new AdminNotExist();
		}
	}
	
	public void passWordValidation(String loginId) throws Exception
	{
		// passowrd validation code
		
		ViewDAO ud = new ViewDAO();
		
		View usr = ud.getAdmin(loginId);
		
	    if ( usr.getPassword() != ctx.getViewBean().getPassword() )
		{
			throw new Exception("Password is wrong");
		}
	}

	public void setContext(Object ctx)  {
		// TODO Auto-generated method stub
		this.ctx = (WorkFlowContext) ctx; 
	}

	public Object getContext()  {
		// TODO Auto-generated method stub
		return this.ctx;
	}
	
}

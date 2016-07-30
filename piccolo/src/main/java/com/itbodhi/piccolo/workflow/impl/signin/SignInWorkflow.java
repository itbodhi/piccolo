package com.itbodhi.piccolo.workflow.impl.signin;

import com.itbodhi.piccolo.entity.User;
import com.itbodhi.piccolo.workflow.BaseWorkflow;
import com.itbodhi.piccolo.workflow.WorkFlowContext;
import com.itbodhi.piccolo.workflow.Workflow;

public class SignInWorkflow extends BaseWorkflow implements Workflow{

	WorkFlowContext ctx = getWfCtx();
	
	public void execute() throws Exception {
		
		//1. validate if user exist
		this.userExist(ctx.getUserBean().getLoginId());
		
		//2. validate if password is correct
		this.passWordValidation(ctx.getUserBean().getLoginId());
	}

	public void userExist(String loginId) throws UserNotExist {
		
		UserDAO ud = new UserDAO();
		
		User usr = ud.getUser(loginId);
		
		if ( usr == null )
		{
			throw new UserNotExist();
		}
	}
	
	public void passWordValidation(String loginId) throws Exception
	{
		// password validation code
		
		UserDAO ud = new UserDAO();
		
		User usr = ud.getUser(loginId);
		
		//if ( usr.getPassword() != ctx.getUserBean().getPassword() )
		{
			throw new Exception("Password is wrong");
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

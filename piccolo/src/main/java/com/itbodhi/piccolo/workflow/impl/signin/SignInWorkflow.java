package com.itbodhi.piccolo.workflow.impl.signin;
import com.itbodhi.piccolo.entity.User;
import com.itbodhi.piccolo.ui.bean.UserBean;
import com.itbodhi.piccolo.workflow.BaseWorkflow;
import com.itbodhi.piccolo.workflow.WorkFlowContext;
import com.itbodhi.piccolo.workflow.Workflow;

public class SignInWorkflow extends BaseWorkflow implements Workflow{

	public void setContext(Object ctx)  {
		this.wfCtx = (WorkFlowContext) ctx; 
	}
	
	public Object getContext()  {
		return this.wfCtx;
	}
	public void execute() throws Exception {
		
		//1. validate if user exist
		this.userExist(wfCtx.getUserBean().getLoginId());
		
		//2. validate if password is correct
		this.passWordValidation(wfCtx.getUserBean());
	}

	public void userExist(String loginId) throws UserNotExist {
		
		UserDAO ud = new UserDAO();
		
		User usr = ud.getUser(loginId);
		
		if ( usr == null )
		{
			throw new UserNotExist();
		}
	}
	
	public void passWordValidation(UserBean userBean) throws Exception
	{
		// passowrd validation code
		
		UserDAO ud = new UserDAO();		
		User usr = ud.getUser(userBean.getLoginId());
		
		if ( usr.getPassword() != (userBean.getPassword()))
		{
			throw new Exception("Password is wrong");
		}
	}
	
}

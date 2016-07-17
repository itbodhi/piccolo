package com.itbodhi.piccolo;

import org.hibernate.SessionFactory;

import com.itbodhi.piccolo.db.HibernateUtil;
import com.itbodhi.piccolo.ui.bean.UserBean;
import com.itbodhi.piccolo.ui.bean.UserQueryBean;
import com.itbodhi.piccolo.workflow.WorkFlowContext;
import com.itbodhi.piccolo.workflow.Workflow;
import com.itbodhi.piccolo.workflow.impl.signin.SignInWorkflow;
import com.itbodhi.piccolo.workflow.impl.signin.UserNotExist;

public class SignInController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserBean ub = new UserBean();
		
		Workflow signIn = new SignInWorkflow();
		
		WorkFlowContext ctx = new WorkFlowContext();
		
		ctx.setUserBean(ub);
		
		signIn.setContext(ctx);
		
			try {
				signIn.execute();
			}catch(UserNotExist e){
				// define view to redirect
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		ctx = (WorkFlowContext)signIn.getContext();
	
		//ctx.get
		
		UserQueryBean uqb = new UserQueryBean();
		
		ctx.setIpContxt(uqb);
	}

}

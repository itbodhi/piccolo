package com.itbodhi.piccolo.controller;

import com.itbodhi.piccolo.controller.Response;
import com.itbodhi.piccolo.ui.bean.UserBean;
import com.itbodhi.piccolo.workflow.WorkFlowContext;
import com.itbodhi.piccolo.workflow.Workflow;
import com.itbodhi.piccolo.workflow.impl.signin.SignInWorkflow;
import com.itbodhi.piccolo.workflow.impl.signin.UserNotExist;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class SignInController {
	
	@RequestMapping(value = "/signin" ,method = RequestMethod.POST)
    public Response getLogin(@RequestBody UserBean uq ){
        
		//UserBean ub=
		String message=new String();
		Workflow signIn = new SignInWorkflow();		
		WorkFlowContext ctx = new WorkFlowContext();	
		ctx.setUserBean(uq);
		signIn.setContext(ctx);
		
			try {
				signIn.execute();
				message="You have successfully logged In";
			}catch(UserNotExist e){
				message="User not exists, Please signup";
			} catch (Exception e) {
				e.printStackTrace();
				message="something went wrong";
			}
		   //ctx = (WorkFlowContext)signIn.getContext();	
		return new Response(message);
		
	 }
}

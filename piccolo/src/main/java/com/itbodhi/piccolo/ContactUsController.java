package com.itbodhi.piccolo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itbodhi.piccolo.controller.Response;
import com.itbodhi.piccolo.ui.bean.ContactUsBean;
import com.itbodhi.piccolo.ui.bean.UserBean;
import com.itbodhi.piccolo.ui.bean.UserQueryBean;
import com.itbodhi.piccolo.workflow.WorkFlowContext;
import com.itbodhi.piccolo.workflow.Workflow;
import com.itbodhi.piccolo.workflow.impl.contactus.ContactUsWorkflow;

@RestController(value = "/")

public class ContactUsController {
	 
	@RequestMapping(value = "/contactus" ,method = RequestMethod.POST)
	    
	 public Response getcontactus(@RequestBody ContactUsBean cb){
		
		//UserBean ub = new UserBean();
		 String msg=new String();
		
		Workflow con = new ContactUsWorkflow();
		
		WorkFlowContext ctx = new WorkFlowContext();
		//ctx.setUserBean(ub);
		ctx.setIpContxt(cb);
		con.setContext(ctx);
		
		
			try {
				con.execute();
			} catch (Exception e) {
				msg="something went wrong,please try again later";
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
	   // UserQueryBean uqb = new UserQueryBean();
		
     //	ctx.setIpContxt(uqb);
		
		return new Response(msg);
	}
	
	


}

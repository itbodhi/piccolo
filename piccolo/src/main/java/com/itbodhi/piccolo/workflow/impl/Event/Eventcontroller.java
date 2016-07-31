package com.itbodhi.piccolo.workflow.impl.Event;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itbodhi.piccolo.ui.bean.Eventbean;
import com.itbodhi.piccolo.workflow.impl.EventSubmit.Eventworkflow;
import com.itbodhi.piccolo.workflow.WorkFlowContext;
import com.itbodhi.piccolo.workflow.Workflow;

@Controller
@RestController(value = "/")
public class Eventcontroller {
	
	@RequestMapping(value = "/submitform" ,method = RequestMethod.POST)
    public Response getsubmitform(@RequestBody EventSubmitbean sb){
        
		//UserBean sb=
		String message=new String();
		Workflow submit = new Eventworkflow();		
		WorkFlowContext ctx = new WorkFlowContext();	
		ctx.setIpContxt(sb);
		submit.setContext(ctx);
		
			try {
				submit.execute();
				message="Your form is submitted successfully";
			} catch (Exception e) {
				e.printStackTrace();
				message="something went wrong";
			}
		   //ctx = (Workflowcontext)submit.getContext();	
		return new Response(message);
		
	 }
}

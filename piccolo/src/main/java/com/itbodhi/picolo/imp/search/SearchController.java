package com.itbodhi.picolo.imp.search;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import com.itbodhi.piccolo.controller.Response;
import com.itbodhi.piccolo.ui.bean.SearchBean;
import com.itbodhi.piccolo.workflow.SearchWorkFlowContext;


@RestController(value = "/")
public class SearchController {
	
	@RequestMapping(value = "/search" ,method = RequestMethod.POST)
    public Response getEvent(@RequestBody SearchBean uq ){
        
		String message=new String();
		SearchWorkflow wf = new SearchWorkflow();		
		SearchWorkFlowContext ctx = new SearchWorkFlowContext();	
		ctx.setSearchBean(uq);
		wf.setContext(ctx);
		
			try {
				wf.execute();
				message="Search Results";
			}
			catch (Exception e) {
				e.printStackTrace();
				message="something went wrong";
			}
		   //ctx = (WorkFlowContext)signIn.getContext();	
		return new Response();
		
	 }
}

package com.itbodhi.piccolo.workflow.impl.Search;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import com.itbodhi.piccolo.controller.Response;
import com.itbodhi.piccolo.entity.Search;
import com.itbodhi.piccolo.entity.base.SearchBase;
import com.itbodhi.piccolo.ui.bean.SearchBean;
import com.itbodhi.piccolo.workflow.SearchWorkflowContext;
import com.itbodhi.piccolo.workflow.Workflow;
import com.itbodhi.piccolo.workflow.impl.Search.SearchWorkflow;


@RestController(value = "/")
public class SearchController {
	
	
	@RequestMapping(value = "/dosearch" ,method = RequestMethod.POST)
    public Response getSearch(@RequestBody SearchBean uq ){
        
		String message=new String();
		Workflow wf = new SearchWorkflow();		
		SearchWorkflowContext ctx = new SearchWorkflowContext();	
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
		return new Response(wf);
		
	 }
}

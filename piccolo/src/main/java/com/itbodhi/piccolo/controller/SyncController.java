package com.itbodhi.piccolo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.itbodhi.piccolo.ui.bean.UserQueryBean;

@Controller
public class SyncController {

	   @RequestMapping(value = "/result" ,method = RequestMethod.GET)
	    public ModelAndView getSearchResult(){
	        
	    	//System.out.println(request.evenType);
	        return new ModelAndView("redirect:gui/result.html");
	    }    
	   
	   @RequestMapping(value = "/home" ,method = RequestMethod.GET)
	    public ModelAndView redirect(){
	        
	    //System.out.println(request.evenType);
		   //ModelAndView modelView = new ModelAndView("redirect:gui/index.jsp");
		   ModelAndView modelView = new ModelAndView("index");
		   
		   UserQueryBean uq1 = new UserQueryBean();
		   uq1.setName("name1");uq1.setQuery("query1");
		   UserQueryBean uq2 = new UserQueryBean();
		   uq2.setName("name2");uq2.setQuery("query2");
		   UserQueryBean uq3 = new UserQueryBean();
		   uq3.setName("name3");uq3.setQuery("query3");
		   UserQueryBean uq4 = new UserQueryBean();
		   uq4.setName("name4");uq4.setQuery("query4");
		   
		   List<UserQueryBean> uqueryList = new ArrayList();
		   uqueryList.add(uq1);
		   uqueryList.add(uq2);
		   uqueryList.add(uq3);
		   uqueryList.add(uq4);
		   
		   modelView.addObject("queryList", uqueryList);
		   
		   return modelView;
	        		
	    }    
}

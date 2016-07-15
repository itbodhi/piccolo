package com.itbodhi.piccolo.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itbodhi.piccolo.ui.bean.UserQueryBean;



@RestController(value = "/")
public class GenericController {

    @RequestMapping(value = "/list" ,method = RequestMethod.POST)
    public UserQueryBean getList(){
        //@RequestBody Request request
    	UserQueryBean uq = new UserQueryBean();
    	
    	uq.setQuery("this is my query");
    	
        return  uq;
    }
    
    @RequestMapping(value = "/ulist" ,method = RequestMethod.POST)
    public List<UserQueryBean> getUserList(){
        //@RequestBody Request request
    	UserQueryBean uq1 = new UserQueryBean();
    	UserQueryBean uq2 = new UserQueryBean();
    	
    	uq1.setQuery("this is my query 1");
    	uq2.setQuery("this is my query 2");
    	
    	List<UserQueryBean> userList = new ArrayList();
    	userList.add(uq1);
    	userList.add(uq2);
    	
        return  userList;
    }
    @RequestMapping(value = "/mylist" ,method = RequestMethod.POST)
    public Response getObjectList(){
        //@RequestBody Request request
    	UserQueryBean uq1 = new UserQueryBean();
    	UserQueryBean uq2 = new UserQueryBean();
    	
    	uq1.setQuery("this is my query 1");
    	uq2.setQuery("this is my query 2");
    	
    	List<UserQueryBean> userList = new ArrayList();
    	userList.add(uq1);
    	userList.add(uq2);
    	
    	Response res = new Response(userList); 
        return  res;
    }
    
    @RequestMapping(value = "/search" ,method = RequestMethod.POST)
    public Response getList(@RequestBody Request request){
        
    	
        return new Response("Request has recived :"+request.getEvenType());
    }    
}

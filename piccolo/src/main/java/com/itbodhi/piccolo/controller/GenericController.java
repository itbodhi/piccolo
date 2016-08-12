package com.itbodhi.piccolo.controller;



import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itbodhi.piccolo.ui.bean.UserQueryBean;



@RestController(value = "/gen")
public class GenericController {

    @RequestMapping(value = "/list" ,method = RequestMethod.POST)
    public UserQueryBean getList(){
        //@RequestBody Request request
    	UserQueryBean uq = new UserQueryBean();
    	
    	uq.setQuery("this is my query");
    	
        return  uq;
    }
}

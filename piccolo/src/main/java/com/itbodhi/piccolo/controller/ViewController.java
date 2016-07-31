package com.itbodhi.piccolo.controller;



import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itbodhi.piccolo.ui.bean.UserQueryBean;



@RestController(value = "/")
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String Login()
    {
    	return "login";
    
    }
    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect() {
      
       return "redirect:event";
    }
    
    
    @RequestMapping(value = "/event",method = RequestMethod.GET)
    public String View()
    {
    	return "event";
    
    }
}

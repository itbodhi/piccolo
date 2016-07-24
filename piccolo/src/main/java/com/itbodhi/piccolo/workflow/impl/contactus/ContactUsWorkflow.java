package com.itbodhi.piccolo.workflow.impl.contactus;

import org.springframework.beans.BeanUtils;

import com.itbodhi.piccolo.entity.ContactUs;
import com.itbodhi.piccolo.entity.User;
import com.itbodhi.piccolo.ui.bean.ContactUsBean;
import com.itbodhi.piccolo.workflow.BaseWorkflow;
import com.itbodhi.piccolo.workflow.WorkFlowContext;
import com.itbodhi.piccolo.workflow.Workflow;

public class ContactUsWorkflow extends BaseWorkflow implements Workflow {

	
	
	public void execute() throws Exception {
		
		ContactUsBean cb = (ContactUsBean)this.getWfCtx().getIpContxt();
		
		saveContact(cb);
	}

	public void saveContact(ContactUsBean cb)
	{
		ContactUsDAO cdo = new ContactUsDAO();
		ContactUs cu = new ContactUs();
		
		BeanUtils.copyProperties(cb, cu);
		
		cdo.saveDetails(cu);
	}
	
	public void setContext(Object ctx) {
		// TODO Auto-generated method stub
		this.wfCtx =(WorkFlowContext)ctx;
		
	}

	public Object getContext() {
		// TODO Auto-generated method stub
		return this.wfCtx;
	}

}

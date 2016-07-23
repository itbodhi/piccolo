package com.itbodhi.piccolo.workflow.impl.ratereview;

import com.itbodhi.piccolo.entity.RateReview;
import com.itbodhi.piccolo.ui.bean.RateReviewBean;
import com.itbodhi.piccolo.workflow.BaseWorkflow;
import com.itbodhi.piccolo.workflow.WorkFlowContext;


public class RateReviewWorkflow extends BaseWorkflow{

	WorkFlowContext wfc = getWfCtx();
	
	public boolean insertRateReview()
	{
		RateReviewBean rrBean = (RateReviewBean)wfc.getIpContxt();
		
		RateReviewDAO rrd=new RateReviewDAO();
		
		//set UI bean to entity bean
		RateReview entity = new RateReview();
		
		entity.setUser_id(rrBean.getUser_id());
		entity.setEvent_id(rrBean.getEvent_id());
		entity.setRate(rrBean.getRate());
		entity.setReview(rrBean.getReview());;
		boolean b=rrd.setRateReview(entity);
		return b;
	}
}

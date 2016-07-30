package  com.itbodhi.piccolo.workflow.impl.EventSubmit;

import com.itbodhi.piccolo.entity.Eventsubmit.java;
import com.itbodhi.piccolo.ui.bean.EventSubmitbean;
import com.itbohi.piccolo.workflow.BaseWorkflow;
import com.itbohi.piccolo.workflow.Workflow;
import com.itbohi.piccolo.workflow.WorklowContext;

public class EventSubmitworkflow extends BaseWorkFlow implements Workflow{

public void execute() throws Exception {
	
	EventSubmitbean sb = (EventSubmitbean)this.getWfCtx().getIpContxt();
	sendmail(sb);
	
}

public void sendmail(EventSubmitbean sb)
{
	 
	
	
	saveDetail(sb);
}

public void saveDetail(EventSubmitbean sb){
	
}


public void setContext(Object ctx) {
	// TODO Auto-generated method stub
	this.wfCtx=(WorkFlowContext)ctx;
	
}


public Object getContext() {
	// TODO Auto-generated method stub
	return this.wfCtx;
}

	
}

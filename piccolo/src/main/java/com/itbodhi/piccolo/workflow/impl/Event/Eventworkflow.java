package  com.itbodhi.piccolo.workflow.impl.Event;

import com.itbodhi.piccolo.entity.Eventsubmit;
import com.itbodhi.piccolo.ui.bean.Eventbean;
import com.itbohi.piccolo.workflow.BaseWorkflow;
import com.itbohi.piccolo.workflow.Workflow;
import com.itbohi.piccolo.workflow.WorklowContext;
import org.springframework.beans.BeanUtils;

public class Eventworkflow extends BaseWorkFlow implements Workflow{

public void execute() throws Exception {
	
	Eventbean sb = (Eventbean)this.getWfCtx().getIpContxt();
	saveDetail(sb);
	sendmail(sb);
	
}

public void sendmail(Eventbean sb)
{
	 
	
}

public void saveDetail(Eventbean sb){
	
	EventDAO edo = new EventDAO();
	Event ed = new Event();
	
	BeanUtils.copyProperties(sb,ed);
	
	edo.SubmitDetails(ed);
	
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

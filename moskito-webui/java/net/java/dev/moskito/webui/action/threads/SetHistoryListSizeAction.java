package net.java.dev.moskito.webui.action.threads;

import net.anotheria.maf.action.ActionCommand;
import net.anotheria.maf.action.ActionMapping;
import net.anotheria.maf.bean.FormBean;
import net.java.dev.moskito.core.util.threadhistory.ThreadHistoryUtility;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Sets the size of the history array and therefore history length.
 */
public class SetHistoryListSizeAction extends ThreadsHistoryAction{

	@Override
	public ActionCommand execute(ActionMapping mapping, FormBean formBean,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		ThreadHistoryUtility.INSTANCE.setMaxEventsSize(Integer.parseInt(req.getParameter("pSize")));
		
		return super.execute(mapping, formBean, req, res);
	}
	
}
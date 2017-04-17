package com.rvrjc.portal.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.rvrjc.portal.model.Parent;
import com.rvrjc.portal.service.ParentLocalServiceUtil;

import java.io.IOException;
import java.util.Calendar;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

/**
 * Portlet implementation class ParentManagementPortlet
 */
public class ParentManagementPortlet extends MVCPortlet {
 
	Log _log = LogFactoryUtil.getLog(ParentManagementPortlet.class);
	@ProcessAction(name="addParent")
	public void addParent(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
		
		
		
		 String pfirstName=ParamUtil.getString(actionRequest,"firstName");
	     String pmiddleName=ParamUtil.getString(actionRequest, "middleName");
	     String plastName=ParamUtil.getString(actionRequest, "lastName");
	     String pemail=ParamUtil.getString(actionRequest,"email");
	     long  pphno=ParamUtil.getLong(actionRequest, "phno");
	     String relationship=ParamUtil.getString(actionRequest, "relationship");
	  
	     try {
	     User loggedInUser=PortalUtil.getUser(actionRequest);
	     
	     
	     Parent parent=ParentLocalServiceUtil.createParent(0);
	     
	     parent.setFirstName(pfirstName);
	     parent.setMiddleName(pmiddleName);
	     parent.setLastName(plastName);
	     parent.setEmail(pemail);
	     parent.setPhNo(pphno);
	     parent.setRelationShip(relationship);
	     
	     //Audit fields
	     parent.setCreatedBy(loggedInUser.getFullName());
	     parent.setCreatedOn(Calendar.getInstance().getTime());

	     //parent.setModifiedBy(loggedInUser.getFullName());
	     //parent.setModifiedOn(Calendar.getInstance().getTime());
	     
			parent=ParentLocalServiceUtil.addParent(parent);
		} catch (SystemException | PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  
	     
	}
	@ProcessAction(name="updateParent")
	public void updateParent(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
	
		//Parent Details
		long parentId=ParamUtil.getLong(actionRequest, "parentId");
		String pfirstName=ParamUtil.getString(actionRequest,"firstName");
	     String pmiddleName=ParamUtil.getString(actionRequest, "middleName");
	     String plastName=ParamUtil.getString(actionRequest, "lastName");
	     String pemail=ParamUtil.getString(actionRequest,"email");
	     long  pphno=ParamUtil.getLong(actionRequest, "phno");
	     String relationship=ParamUtil.getString(actionRequest, "relationShip");
	     _log.info("updateParent relationship " + relationship);
	     Parent parent;
		
			try {
				 User loggedInUser=PortalUtil.getUser(actionRequest);

				 parent = ParentLocalServiceUtil.getParent(parentId);
				 
				 parent.setFirstName(pfirstName);
			     parent.setMiddleName(pmiddleName);
			     parent.setLastName(plastName);
			     parent.setEmail(pemail);
			     parent.setPhNo(pphno);
			     parent.setRelationShip(relationship);
			    
			     //Audit fields
			     parent.setModifiedBy(loggedInUser.getFullName());
			     parent.setModifiedOn(Calendar.getInstance().getTime());
			     
			     
			      parent=ParentLocalServiceUtil.updateParent(parent);
			      
			      
			} catch (PortalException | SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
	
	}
	@ProcessAction(name="deleteParent")
	public void deleteParent(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
	 	 long parentId=ParamUtil.getLong(actionRequest, "parentId");
		 try {
			ParentLocalServiceUtil.deleteParent(parentId);
		} catch (PortalException | SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
}
}

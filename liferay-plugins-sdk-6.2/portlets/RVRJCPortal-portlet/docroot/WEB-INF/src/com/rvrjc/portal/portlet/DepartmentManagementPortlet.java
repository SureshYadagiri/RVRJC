package com.rvrjc.portal.portlet;

import java.io.IOException;
import java.util.Calendar;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.rvrjc.portal.model.Department;
import com.rvrjc.portal.service.DepartmentLocalServiceUtil;

/**
 * Portlet implementation class DepartmentManagementPortlet
 */
public class DepartmentManagementPortlet extends MVCPortlet {
 
	@ProcessAction(name="addDepartment")
	public void addDepartment(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
	
		
		
	  String dname = ParamUtil.getString(actionRequest, "dname");
	
	     try {
	    	 User loggedInUser = PortalUtil.getUser(actionRequest);
	 		
	     Department dept=DepartmentLocalServiceUtil.createDepartment(0);
	     
	     dept.setDname(dname);
	     dept.setCreatedBy(loggedInUser.getFullName());
	     dept.setCreatedOn(Calendar.getInstance().getTime());
	    
	     
			dept=DepartmentLocalServiceUtil.addDepartment(dept);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	  
	}
	@ProcessAction(name="updateDepartment")
	public void updateDepartment(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
	
		long dno=ParamUtil.getLong(actionRequest, "dno");
		 String dname = ParamUtil.getString(actionRequest, "dname");
		  
		    
		     Department dept;
			try {
				User loggedInUser = PortalUtil.getUser(actionRequest);
				
				dept = DepartmentLocalServiceUtil.getDepartment(dno);
				dept.setDname(dname);
			 
			     
			     dept.setModifiedBy(loggedInUser.getFullName());
			     dept.setModifiedOn(Calendar.getInstance().getTime());
			     dept=DepartmentLocalServiceUtil.updateDepartment(dept);
			     
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     

	}

	@ProcessAction(name="deleteDepartment")
	public void deleteDepartment(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
	
		 long dno=ParamUtil.getLong(actionRequest, "dno");
		  
		  try {
	
			DepartmentLocalServiceUtil.deleteDepartment(dno);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

package com.rvrjc.portal.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.rvrjc.portal.model.Course;
import com.rvrjc.portal.service.CourseLocalServiceUtil;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;


/**
 * Portlet implementation class CourseManagementPortlet
 */
public class CourseManagementPortlet extends MVCPortlet {
	Log _log = LogFactoryUtil.getLog(CourseManagementPortlet.class);

	@ProcessAction(name="addCourse")
	public void addCourse(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
		 try {
		String cname=ParamUtil.getString(actionRequest, "cname");
		String ccode=ParamUtil.getString(actionRequest, "ccode");
		String cdescription=ParamUtil.getString(actionRequest, "cdescription");
		//_log.info("cdescription " + cdescription);
		int cfee=ParamUtil.getInteger(actionRequest, "cfee");
		
	 	 /*DateFormat cdateFormat = new SimpleDateFormat("MM/dd/yyyy");
	     Date createdOn=ParamUtil.getDate(actionRequest, "createdOn", cdateFormat);
	     String createdBy=ParamUtil.getString(actionRequest, "createdBy");

	     DateFormat mdateFormat = new SimpleDateFormat("MM/dd/yyyy");
	     Date modifiedOn=ParamUtil.getDate(actionRequest, "modifiedOn", mdateFormat);
	     
	     String modifiedBy=ParamUtil.getString(actionRequest, "modifiedBy");
*/		

		 Course course=CourseLocalServiceUtil.createCourse(0);
	     course.setCcode(ccode);
	     course.setCname(cname);
	     course.setCdescription(cdescription);
	     course.setCfee(cfee);
	     
	     
	     //Audit Fields
	     Date now = Calendar.getInstance().getTime();
	     User loggedInLiferayUser =  PortalUtil.getUser(actionRequest);
	     course.setCreatedOn(now);
	     course.setCreatedBy(loggedInLiferayUser.getScreenName());
	     
	     course=CourseLocalServiceUtil.addCourse(course);
	     _log.info("Course created with Number " + course.getCno());
	     
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  
	     
	}
	@ProcessAction(name="updateCourse")
	public void updateCourse(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
		long cno=ParamUtil.getLong(actionRequest, "cno");
		String cname=ParamUtil.getString(actionRequest, "cname");
		String ccode=ParamUtil.getString(actionRequest, "ccode");
		String cdescription=ParamUtil.getString(actionRequest, "cdescription");
		//_log.info("cdescription " + cdescription);
		int cfee=ParamUtil.getInteger(actionRequest, "cfee");
		
		 /*DateFormat cdateFormat = new SimpleDateFormat("MM/dd/yyyy");
	     Date createdOn=ParamUtil.getDate(actionRequest, "createdOn", cdateFormat);
	     String createdBy=ParamUtil.getString(actionRequest, "createdBy");
*/
		
	     Course course;
		try {
			 Date now = Calendar.getInstance().getTime();
		     User loggedInLiferayUser =  PortalUtil.getUser(actionRequest);
		    
			course = CourseLocalServiceUtil.getCourse(cno);
			 course.setCcode(ccode);
			  course.setCname(cname);
			  course.setCdescription(cdescription);
			  course.setCfee(cfee);
			     
			  //Audit Fieds
		     course.setModifiedBy(loggedInLiferayUser.getScreenName());
		     course.setModifiedOn(now);
		    
		    
		    course=CourseLocalServiceUtil.updateCourse(course);
		    
		    _log.info("Couse Updated - " +cno);
		    
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	
	}
	@ProcessAction(name="deleteCourse")
	public void deleteCourse(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
	  long cno=ParamUtil.getLong(actionRequest, "cno");
	  try {
		CourseLocalServiceUtil.deleteCourse(cno);
	} catch (PortalException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SystemException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}

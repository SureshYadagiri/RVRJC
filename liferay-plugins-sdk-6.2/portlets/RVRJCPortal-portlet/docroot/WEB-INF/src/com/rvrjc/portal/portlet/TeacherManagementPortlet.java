package com.rvrjc.portal.portlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PropertiesUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.rvrjc.portal.model.Teacher;
import com.rvrjc.portal.service.TeacherLocalServiceUtil;

/**
 * Portlet implementation class TeacherManagementPortlet
 */
public class TeacherManagementPortlet extends MVCPortlet {
 
	static Log _log=LogFactoryUtil.getLog(TeacherManagementPortlet.class);
	@ProcessAction(name="addTeacher")
	public void addTeacher(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException  {
	
		 String firstName=ParamUtil.getString(actionRequest,"firstName");
	     String middleName=ParamUtil.getString(actionRequest, "middleName");
	     String lastName=ParamUtil.getString(actionRequest, "lastName");
	     String gender = ParamUtil.getString(actionRequest, "gender");
	     String email=ParamUtil.getString(actionRequest,"email");
	     long phno=ParamUtil.getLong(actionRequest, "phno");
	     try { 
	     User loggedInUser = PortalUtil.getUser(actionRequest);
	 	long companyId = CompanyThreadLocal.getCompanyId();
			Role role = RoleLocalServiceUtil.getRole(companyId, "RVRJC_	TEACHER");
			long []roleIds = {role.getRoleId() }; 
			
			ThemeDisplay td = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			Group siteGroup = td.getSiteGroup();
			_log.info("siteGroup Name:" + siteGroup.getName());
			
			//Group group = GroupLocalServiceUtil.getGroup(companyId, "RVRJC");
			long []groupIDS = {siteGroup.getGroupId() }; 
			
			Locale locale = Locale.getDefault();
			
			//(creatorUserId, companyId, autoPassword, password1, password2, autoScreenName, 
			//screenName, emailAddress, facebookId, openId, locale, firstName, middleName, lastName, 
			//prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, 
			//organizationIds, roleIds, userGroupIds, sendEmail, serviceContext)
			User newUser =	UserLocalServiceUtil.addUser(loggedInUser.getUserId(), companyId, false,
					"test", "test", false,firstName+lastName , email, 
					0L, "", locale, firstName, middleName, lastName, 0, 
					0, false, 1, 1, 1980, "Teacher", 
					groupIDS, null, roleIds, null, true, new ServiceContext());
			
	   
	   
	  
	     Teacher teacher=TeacherLocalServiceUtil.createTeacher(0);
	     teacher.setFirstName(firstName);
	     teacher.setMiddleName(middleName);
	     teacher.setLastName(lastName);
	     teacher.setGender(gender);
	     teacher.setEmail(email);
	     teacher.setPhno(phno);
	     teacher.setLiferayUserId(newUser.getUserId());
	     
	    
			teacher=TeacherLocalServiceUtil.addTeacher(teacher);
			
			sendActivationEmail(teacher);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@ProcessAction(name="updateTeacher")
	public void updateTeacher(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
	
		long tid=ParamUtil.getLong(actionRequest, "tid");
		String firstName=ParamUtil.getString(actionRequest,"firstName");
	     String middleName=ParamUtil.getString(actionRequest, "middleName");
	     String lastName=ParamUtil.getString(actionRequest, "lastName");
	     String gender = ParamUtil.getString(actionRequest, "gender");
	     String email=ParamUtil.getString(actionRequest,"email");
	     long phno=ParamUtil.getLong(actionRequest, "phno");
	     
	     
	   
	     Teacher teacher;
		try {
			 
			 User loggedInUser = PortalUtil.getUser(actionRequest);

			teacher = TeacherLocalServiceUtil.getTeacher(tid);
			 teacher.setFirstName(firstName);
		     teacher.setMiddleName(middleName);
		     teacher.setLastName(lastName);
		     teacher.setGender(gender);
		     teacher.setEmail(email);
		     teacher.setPhno(phno);
		     teacher.setLiferayUserId(loggedInUser.getUserId());
		         
				teacher=TeacherLocalServiceUtil.updateTeacher(teacher);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		 catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	@ProcessAction(name="deleteTeacher")
	public void deleteTeacher(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException {
	
		long tid=ParamUtil.getLong(actionRequest, "tid");
		
	   try {
		
		TeacherLocalServiceUtil.deleteTeacher(tid);
	} catch (PortalException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SystemException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	}
	  public static  void sendActivationEmail(Teacher teacher) 
		 {
			 //User user = null;
					 //ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			 try {
				 
				 InternetAddress sendTo = null;
					InternetAddress fromAddr=null;
				 try {
						sendTo=new InternetAddress(teacher.getEmail());
						fromAddr=new InternetAddress("abcschoolmail2u@gmail.com");
					} catch (AddressException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
				 
				 String fname=teacher.getFirstName();
				 String lname=teacher.getLastName();
				 DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
				 
				 String datestring = dateFormat.format(new Date()); 
					
				String	words=fname.substring(0,3)+""+lname.substring(lname.length()-3)+""+datestring.substring(6, 10);
				String password=words.trim();
				MailMessage  msg=new MailMessage();
				msg.setTo(sendTo);
				msg.setFrom(fromAddr);
				msg.setBody("You are added it RVCRJC portal, please try to login with your\n email id :"+teacher.getEmail()+"\n your password :"+password);
				msg.setSubject(" Rvr&JC Portal");
				
				MailServiceUtil.sendEmail(msg);
				 
				 
			 } catch (Exception e) {
				 e.printStackTrace();
				// responseData.put("success", "false");
				 _log.error(e.getMessage());
			 }
			 
			
	}

}

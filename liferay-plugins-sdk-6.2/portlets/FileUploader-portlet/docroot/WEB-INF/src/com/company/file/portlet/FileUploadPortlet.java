package com.company.file.portlet;

import com.company.file.model.Employee;
import com.company.file.service.EmployeeLocalServiceUtil;
import com.csvreader.CsvReader;
import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.ProcessAction;

/**
 * Portlet implementation class FileUploadPortlet
 */
public class FileUploadPortlet extends MVCPortlet {
 
     Log _log=LogFactoryUtil.getLog(FileUploadPortlet.class);
	
     
     @ProcessAction(name="fileUpload")
    public void fileUpload(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
    	// TODO Auto-generated method stub
    
    	 PortletPreferences portletPreferences = actionRequest.getPreferences();
        boolean ignoreNullPhoneNumberRecords=GetterUtil.getBoolean(portletPreferences.getValue("ignoreNullPhoneNumberRecords",StringPool.TRUE));
        _log.info(" ignoreNullPhoneNumberRecords set to " + ignoreNullPhoneNumberRecords);
        List<Employee> failedEmployees = new ArrayList<Employee>();
    	    UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
          
            CsvReader readers=getCSV(uploadPortletRequest);
            Employee emp=EmployeeLocalServiceUtil.createEmployee(0);
       	 
            //firstName,middleName,lastName,dateOfBirth,gender,phno,email
            //suresh,,yadagiri,05-10-1980,M,1231231234,suresh@gmail.com
            
            readers.readHeaders();
            while(readers.readRecord())
            {
            	String fname=readers.get("firstName");
            	String mname=readers.get("middleName");
            	String lname=readers.get("lastName");
            	String dob=readers.get("dateOfBirth");
            	String gender=readers.get("gender");
            	String phno=readers.get("phoneNumber");
            	String email=readers.get("email");
            	
            	 emp.setFirstName(fname);
            	 emp.setMiddleName(mname);
            	 emp.setLastName(lname);
            	 
            	 Date date1;
            		try {
					date1 = new SimpleDateFormat("MM-DD-yyyy").parse(dob);
					 emp.setDateOfBirth(date1);
					 emp.setGender(gender);
					 
					 emp.setEmail(email);
	            	 long phoneNum=Long.parseLong(phno); 
	            	 
	            	 
	            	 if(ignoreNullPhoneNumberRecords){
	            	 
				            	 if(phoneNum != 0 ){
				            		 emp.setPhno(phoneNum);
				            		 
				            		 emp=EmployeeLocalServiceUtil.addEmployee(emp);
				            	 }else{
				            		 failedEmployees.add(emp);
				            	 }
	            	 }else{
	            		 	emp.setPhno(phoneNum);
	            		 	emp=EmployeeLocalServiceUtil.addEmployee(emp);
	            		 
	            	 }
	            	 
	            	
	            	
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
            	
            	
            	
            
            }
            
            sendMail(failedEmployees);
       
          }
     
         
   
	private CsvReader getCSV(UploadPortletRequest uploadPortletRequest) {
		// TODO Auto-generated method stub
		InputStream inputStream = null;
        CsvReader csv=null;
        try {
       	 inputStream = new FileInputStream(uploadPortletRequest.getFile("fileupload"));
            
        } catch (FileNotFoundException e) {
           // TODO Auto-generated catch block
           _log.error("Error on Reading File"+e.getMessage());
      }
        BufferedReader csvFile = new BufferedReader(new InputStreamReader(inputStream));
          csv=new CsvReader(csvFile);
		return csv;
	}
	
	 public static  void sendMail(List<Employee> failedEmployees) 
	 {
		 //User user = null;
				 //ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		 try {
			 
			 InternetAddress sendTo = null;
				InternetAddress fromAddr=null;
			
					sendTo=new InternetAddress("abcschoolmail2u@gmail.com");
					fromAddr=new InternetAddress("abcschoolmail2u@gmail.com");
				
		StringBuilder sb = new StringBuilder();
		for(Employee fe: failedEmployees){
			sb.append(fe.getFirstName() + " " + fe.getLastName() + " " + fe.getEmail());
			sb.append("\n");
		}
		  //String name=emp.getFirstName()+" "+emp.getMiddleName()+" "+emp.getLastName();
			
			MailMessage  msg=new MailMessage();
			msg.setTo(sendTo);
			msg.setFrom(fromAddr);
			//msg.setBody(" This Record Doesn't have Phone Number Once check it \n ID :"+emp.getEmpId()+"\n Name :"+ name +" \n Email id :"+emp.getEmail());
			msg.setSubject(" Mobile Number Missing Records");
			msg.setBody(" These Records Doesn't have Phone Number Once check it \n ID :"+sb.toString());
			
			
			MailServiceUtil.sendEmail(msg);
			 
			 } catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}		}
}

package com.company.file.portlet.configuration;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;

public class ConfigurationActionImpl extends DefaultConfigurationAction {

	Log _log = LogFactoryUtil.getLog(ConfigurationActionImpl.class);
	
    @Override
    public void processAction(
        PortletConfig portletConfig, ActionRequest actionRequest,
        ActionResponse actionResponse) throws Exception {  

    	//this one saves preferences to database - but not working
        super.processAction(portletConfig, actionRequest, actionResponse);
    	
    	  boolean ignoreNullPhoneNumberRecords = ParamUtil.getBoolean(actionRequest, "ignoreNullPhoneNumberRecords");
    	  long deltaSize = ParamUtil.getLong(actionRequest, "deltaSize");
    	  
    	  _log.info("Form Parameters : ignoreNullPhoneNumberRecords=" + ignoreNullPhoneNumberRecords +  " deltaSize:" + deltaSize
          		+     " in ConfigurationActionImpl.processAction().");
    	  
    	  
    	 //Save the preferences 
        PortletPreferences portletPreferences = actionRequest.getPreferences();
        portletPreferences.setValue("ignoreNullPhoneNumberRecords",String.valueOf(ignoreNullPhoneNumberRecords));
        portletPreferences.setValue("deltaSize",String.valueOf(deltaSize));
        portletPreferences.store();
        
        //read it and see if it's really updated
        
         ignoreNullPhoneNumberRecords=GetterUtil.getBoolean(portletPreferences.getValue("ignoreNullPhoneNumberRecords",StringPool.TRUE));
         deltaSize = GetterUtil.getLong(portletPreferences.getValue("deltaSize","10"));

        _log.info("After Save: ignoreNullPhoneNumberRecords=" + ignoreNullPhoneNumberRecords +  " deltaSize:" + deltaSize
        		+     " in ConfigurationActionImpl.processAction().");
    }
}
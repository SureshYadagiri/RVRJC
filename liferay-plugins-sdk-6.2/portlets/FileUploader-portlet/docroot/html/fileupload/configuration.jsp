<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.company.file.service.EmployeeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects />

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<%
 boolean ignoreNullPhoneNumberRecords=GetterUtil.getBoolean(portletPreferences.getValue("ignoreNullPhoneNumberRecords",StringPool.TRUE));
long deltaSize = GetterUtil.getLong(portletPreferences.getValue("deltaSize","10"));
%>



<aui:form action="<%= configurationURL %>" method="post" name="fm">
    
    <aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />

    <!-- Preference control goes here -->
 <aui:input name="ignoreNullPhoneNumberRecords" type="checkbox" value="<%= ignoreNullPhoneNumberRecords %>" label="Allow Phone number Empty" />
 <aui:input name="deltaSize" type="text" value="<%= deltaSize %>" label="Enter Delta Size" />  
   
    <aui:button-row>
        <aui:button type="submit" />
    </aui:button-row>
</aui:form>
<%@page import="com.company.file.service.EmployeeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects />

This is the <b>File Upload</b> portlet in View mode.
<portlet:actionURL name="fileUpload" var="actionURL">

</portlet:actionURL>
<portlet:actionURL var="cancelURL">
 <portlet:param name="mvcPAth" value="/html/fileupload/view.jsp"/>
</portlet:actionURL>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<%
 boolean somePreferenceKey_cfg=GetterUtil.getBoolean(portletPreferences.getValue("preferenceKey",StringPool.TRUE));
%>


<aui:form action="<%= actionURL %>"   enctype="multipart/form-data" method="post" name="form" >
  
  
  <aui:input type="file" name="fileupload" id="fileupload" size="40" label="select-file-to-upload"></aui:input>
               
 
    <aui:button-row>
    <aui:button type="submit" value="Upload" name="upload" />
    <aui:button type="cancel" value="Upload" onClick="<%=cancelURL %>"></aui:button>
    </aui:button-row>
    
</aui:form>


<liferay-ui:search-container>
	<liferay-ui:search-container-results
		results="<%= EmployeeLocalServiceUtil.getEmployees(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= EmployeeLocalServiceUtil.getEmployeesCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.company.file.model.Employee"
		modelVar="employee"
	>
	
		<liferay-ui:search-container-column-text property="empId" />

		<liferay-ui:search-container-column-text value='<%= employee.getFirstName()+""+employee.getMiddleName()+" "+employee.getLastName() %>' name="Name" />


		<liferay-ui:search-container-column-text property="gender" />

		<liferay-ui:search-container-column-text property="phno" />

		<liferay-ui:search-container-column-text property="email" />

		<liferay-ui:search-container-column-text property="dateOfBirth" />

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
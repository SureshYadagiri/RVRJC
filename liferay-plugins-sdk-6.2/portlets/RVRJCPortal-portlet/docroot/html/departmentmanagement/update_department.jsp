<%@include file="/html/init.jsp"%>


<h1>Welcome to Update Department Details</h1>
<a href="<portlet:renderURL />">&laquo;Home</a>
<div class="separator"></div>

<%
long dno = ParamUtil.getLong(request, "dno");

Department department=DepartmentLocalServiceUtil.getDepartment(dno);

%>

<portlet:actionURL name="updateDepartment" var="varUpdateDepartmentURL">
</portlet:actionURL> 

<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/departmentmanagement/view.jsp"/>
</portlet:renderURL>


<aui:form name="form" action="<%= varUpdateDepartmentURL %>" method="post">
<aui:model-context bean="<%= department %>" model="<%= Department.class %>"></aui:model-context>
<aui:fieldset column="true" label="label.deptDetails">
<aui:input name="dno" type="hidden"></aui:input>
<aui:input name="dname" label="label.dname">
<aui:validator name="required"></aui:validator>
</aui:input>
	

</aui:fieldset>


<aui:button-row>
		<aui:button  type="submit" value="save"  />

		<aui:button type="cancel" value="cancel" onClick="<%= cancelURL.toString() %>" />
</aui:button-row>

</aui:form>
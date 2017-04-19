<%@include file="/html/init.jsp"%>

<portlet:defineObjects />

<h1>Welcome To RVR&JC College</h1>

<%
	String currentURL=PortalUtil.getCurrentURL(request);
%>
<br/>
<portlet:renderURL var="addDepartmentVar" >
<portlet:param name="mvcPath" value="/html/departmentmanagement/add_department.jsp"/>
</portlet:renderURL>


<h3><aui:a href="<%= addDepartmentVar %>"> Add Department</aui:a></h3>
<br/>

<liferay-portlet:renderURL varImpl="iteratorURL">
<portlet:param name="mvcPath" value="/html/departmentmanagement/view.jsp"/>

</liferay-portlet:renderURL>
<liferay-ui:search-container delta="5" deltaConfigurable="true" iteratorURL="<%=iteratorURL %>" emptyResultsMessage="msg.info.nodept">

	<liferay-ui:search-container-results
		results="<%= DepartmentLocalServiceUtil.getDepartments(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= DepartmentLocalServiceUtil.getDepartmentsCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.rvrjc.portal.model.Department"
		modelVar="department"
	>
		<liferay-portlet:renderURL varImpl="rowURL">
	<portlet:param name="dno" value="${department.dno}"/>
	<portlet:param name="backURL" value="<%=currentURL %>"/>
	<portlet:param name="mvcPath" value="/html/departmentmanagement/department_details.jsp"/>
	</liferay-portlet:renderURL>
	
		<liferay-ui:search-container-column-text property="dno" />

		<liferay-ui:search-container-column-text property="dname" href="${rowURL }" />

	
		<liferay-ui:search-container-column-jsp name="Actions"   path="/html/departmentmanagement/department_actions.jsp" />  
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>


<%@include file="/html/init.jsp" %>


<%      
 ResultRow row = (ResultRow)
        request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW); 

 Department dept= (Department) row.getObject();
 
%>


<portlet:renderURL var="updateDepartmentURL">
<portlet:param name="dno" value="<%= String.valueOf(dept.getDno()) %>"/>
<portlet:param name="mvcPath" value="/html/departmentmanagement/update_department.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="deleteDepartment" var="deleteDepartmentURL">
<portlet:param name="dno" value="<%= String.valueOf(dept.getDno()) %>"/>
</portlet:actionURL> 



<liferay-ui:icon-menu>
 <liferay-ui:icon image="edit" message="UPDATE Department"   url="<%= updateDepartmentURL.toString() %>" />
  <liferay-ui:icon image="delete" message="DELETE Department"   url="<%= deleteDepartmentURL.toString() %>" />
</liferay-ui:icon-menu>
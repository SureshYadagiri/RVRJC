<%@include file="/html/init.jsp" %>

<%      
 ResultRow row = (ResultRow)
        request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW); 

 Student student= (Student) row.getObject();
 
%>


<portlet:renderURL var="updateStudentURL">
<portlet:param name="sno" value="<%= String.valueOf(student.getSno()) %>"/>
<portlet:param name="mvcPath" value="/html/studentmanagment/update_student.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="deleteStudent" var="deleteStudentURL">
<portlet:param name="sno" value="<%= String.valueOf(student.getSno()) %>"/>
</portlet:actionURL> 

<portlet:renderURL var="invoiceStudentURL">
<portlet:param name="sno" value="<%= String.valueOf(student.getSno()) %>"/>
<portlet:param name="mvcPath" value="/html/studentmanagment/invoice.jsp"/>
</portlet:renderURL>



<liferay-ui:icon-menu>
 <liferay-ui:icon  image="subscribe" message="UPDATE Student"   url="<%= updateStudentURL.toString() %>" />
  <liferay-ui:icon-delete  message="DELETE Student"   url="<%= deleteStudentURL.toString() %>" />
	 <liferay-ui:icon image="subscribe" message="INVOICE Student"   url="<%= invoiceStudentURL.toString() %>" />
	
</liferay-ui:icon-menu>
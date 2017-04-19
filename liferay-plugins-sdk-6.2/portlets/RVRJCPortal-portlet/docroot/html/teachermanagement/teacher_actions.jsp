<%@include file="/html/init.jsp" %>



<%      
 ResultRow row = (ResultRow)
        request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW); 

 Teacher teacher= (Teacher) row.getObject();
 
%>

<portlet:renderURL var="editTeacherURL">
<portlet:param name="tid" value="<%= String.valueOf(teacher.getTid()) %>"/>
<portlet:param name="mvcPath" value="/html/teachermanagement/edit_teacher.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="deleteTeacher" var="deleteTeacherURL">
<portlet:param name="tid" value="<%= String.valueOf(teacher.getTid()) %>"/>
</portlet:actionURL> 



<liferay-ui:icon-menu>
 <liferay-ui:icon image="edit" message="EDIT Teacher"   url="<%= editTeacherURL.toString() %>" />
  <liferay-ui:icon image="delete" message="DELETE Teacher"   url="<%= deleteTeacherURL.toString() %>" />
</liferay-ui:icon-menu>
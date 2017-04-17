<%@page import="com.rvrjc.portal.model.Course"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.mysql.jdbc.ResultSetRow"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<%      
 ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW); 
 Course course= (Course) row.getObject();
%>


<portlet:renderURL var="updateCourseURL">
<portlet:param name="cno" value="<%= String.valueOf(course.getCno()) %>"/>
<portlet:param name="mvcPath" value="/html/coursemanagement/update_course.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="deleteCourse" var="deleteCourseURL">
<portlet:param name="cno" value="<%= String.valueOf(course.getCno()) %>"/>
</portlet:actionURL> 



<liferay-ui:icon-menu>
 	<liferay-ui:icon image="edit" message="action.menu.edit.course"   url="<%= updateCourseURL.toString() %>" />
  <liferay-ui:icon-delete image="delete" message="action.menu.delete.course"   url="<%= deleteCourseURL.toString() %>" />
</liferay-ui:icon-menu>
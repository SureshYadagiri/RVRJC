<%@page import="com.rvrjc.portal.model.Parent"%>
<%@include file="/html/init.jsp" %>



<%      
 ResultRow row = (ResultRow)      request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW); 
 Parent parent= (Parent) row.getObject();
 
%>

<portlet:renderURL var="editParentURL">
<portlet:param name="parentId" value="<%= String.valueOf(parent.getParentId()) %>"/>
<portlet:param name="mvcPath" value="/html/parentmanagement/edit_parent.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="deleteParent" var="deleteParentURL">
<portlet:param name="parentId" value="<%= String.valueOf(parent.getParentId()) %>"/>
</portlet:actionURL> 



<liferay-ui:icon-menu>
 <liferay-ui:icon image="edit" message="edit.parent.action.name"   url="<%= editParentURL.toString() %>" />
  <liferay-ui:icon-delete image="delete" message="delete.parent.action.name"   url="<%= deleteParentURL.toString() %>" />
</liferay-ui:icon-menu>
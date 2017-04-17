<%@page import="com.rvrjc.portal.service.ParentLocalServiceUtil"%>
<%@page import="com.rvrjc.portal.model.Parent"%>
<%@page import="com.rvrjc.portal.service.CourseLocalServiceUtil"%>

<%@page import="com.rvrjc.portal.model.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%
	ResultRow row=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Student student=(Student)row.getObject();
	List<Parent> parents= ParentLocalServiceUtil.getStudentParents(student.getSno());
	for(Parent parent:parents){
%>
<%=  parent.getFirstName()+" "+parent.getMiddleName()+" "+parent.getLastName() %>

<%}
%>
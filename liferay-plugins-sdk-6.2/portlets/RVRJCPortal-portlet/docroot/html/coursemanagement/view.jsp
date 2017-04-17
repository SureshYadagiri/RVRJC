<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>

<%@include file="/html/init.jsp" %>

<portlet:defineObjects />


<h1><liferay-ui:message key="header.course.managment"></liferay-ui:message></h1>


<%
String currentURL =PortalUtil.getCurrentURL(request);
%>

<portlet:renderURL var="addCourseVar" >
<portlet:param name="mvcPath" value="/html/coursemanagement/add_course.jsp"/>
</portlet:renderURL>


<h3><aui:a href="<%= addCourseVar %>"> Add Course</aui:a></h3>
<br/>

<liferay-portlet:renderURL varImpl="iteratorURL">
<portlet:param name="mvcPath" value="/html/course/view.jsp"/>

</liferay-portlet:renderURL>

<liferay-ui:search-container delta="5" deltaConfigurable="true" iteratorURL="${iteratorURL}" emptyResultsMessage="msg.info.nocourses">
	<liferay-ui:search-container-results
		results="<%= CourseLocalServiceUtil.getCourses(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= CourseLocalServiceUtil.getCoursesCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.rvrjc.portal.model.Course"
		modelVar="course"
	>
		
		
		<liferay-portlet:renderURL varImpl="rowURL">
				<portlet:param name="cno" value="${course.cno}"/>
				<portlet:param name="backURL" value="<%=currentURL %>"/>
				<portlet:param name="mvcPath" value="/html/coursemanagement/course_details.jsp"/>
		</liferay-portlet:renderURL>
		<liferay-ui:search-container-row-parameter name="rowURL" value="<%= rowURL.toString() %>"/>
		
		
	
		<liferay-ui:search-container-column-text property="cno" name="header.cno"/>
		<liferay-ui:search-container-column-text property="ccode" name="header.ccode" />
		<liferay-ui:search-container-column-text property="cname" name="header.cname" />
		<liferay-ui:search-container-column-text property="cdescription" name="header.cdescription" />
		<liferay-ui:search-container-column-text property="cfee" name="header.cfee" />

		<%-- <liferay-ui:search-container-column-text name="Details" value="Click here" href="${rowURL }"/> --%>

		<liferay-ui:search-container-column-jsp name="Actions"   path="/html/coursemanagement/course_actions.jsp" />  
		
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
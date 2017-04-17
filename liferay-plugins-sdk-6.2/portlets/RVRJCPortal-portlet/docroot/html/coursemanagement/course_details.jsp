<%@page import="com.rvrjc.portal.service.CourseLocalServiceUtil"%>
<%@page import="com.rvrjc.portal.model.Course"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="javax.portlet.RenderRequest"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%
 long cno=ParamUtil.getLong(request, "cno");
  Course course=CourseLocalServiceUtil.getCourse(cno);
  request.setAttribute("course", course);
  String redirect=ParamUtil.getString(request, "backURL");
 
  %>
  
  <h1>Course Information</h1>
  <br/>
  <h2>course Name :<%=course.getCname()  %></h2>
  <h2>Created On :<%=course.getCreatedOn() %></h2>
    <h2>Created By : <%=course.getCreatedBy() %></h2>
      <h2>Modified On :<%=course.getModifiedOn() %></h2>
      <h2>Modified By :<%=course.getModifiedBy() %></h2>
      
      <br/>
      
      <aui:a href="<%=redirect %>">Back</aui:a>
  
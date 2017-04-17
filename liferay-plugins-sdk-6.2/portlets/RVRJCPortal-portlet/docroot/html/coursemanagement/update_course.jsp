<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@	taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>


<%@page import="com.rvrjc.portal.service.CourseLocalServiceUtil"%>
<%@page import="com.rvrjc.portal.model.Course"%>
<%@page import="com.liferay.portal.kernel.util.ArrayUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.RenderRequest"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>


<h1>Welcome to Edit Course Details</h1>
<a href="<portlet:renderURL />">&laquo;Home</a>
<div class="separator"></div>


<%
long cno = ParamUtil.getLong(request, "cno");
Course course=CourseLocalServiceUtil.getCourse(cno);

%>

<portlet:actionURL name="updateCourse" var="varUpdateCourseURL"></portlet:actionURL> 

<aui:form name="form" action="<%= varUpdateCourseURL %>" method="post">
<aui:model-context bean="<%= course %>" model="<%= Course.class %>"></aui:model-context>
<aui:fieldset column="true" label="Course Details">

<aui:input name="cno" type="hidden"/>

<aui:input name="ccode" label="label.ccode">
<aui:validator name="required"/>
</aui:input>
<aui:input name="cname" label="label.cname">
<aui:validator name="required"/>
</aui:input>
<aui:input name="cfee" label="label.cfee">
<aui:validator name="required"/>
<aui:validator name="number"/>
</aui:input>

<aui:input name="cdescription" type="textarea" label="label.cdescription">
<aui:validator name="required"/>
</aui:input>


</aui:fieldset>

<%-- <aui:fieldset column="true" >
	<aui:input name="createdOn">
		<aui:validator name="date"></aui:validator>
		</aui:input>   
		
		<aui:input name="createdBy">
		<aui:validator name="alpha"></aui:validator>
		</aui:input> 
<aui:input name="modifiedOn">
		<aui:validator name="date"></aui:validator>
		</aui:input> 
		<aui:input name="modifiedBy">
		<aui:validator name="alpha"></aui:validator>
		</aui:input>  

</aui:fieldset> --%>

<aui:button-row>
		<aui:button  type="submit" value="save"  />

		<aui:button type="cancel" value="cancel" />
</aui:button-row>
</aui:form>
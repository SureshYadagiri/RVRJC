<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />

<portlet:actionURL var="addCourseURL" name="addCourse">
</portlet:actionURL>

<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/course/view.jsp"/>
</portlet:renderURL>
<aui:form name="form" action="<%= addCourseURL %>" method="post">

<aui:fieldset column="true" >

<aui:input name="ccode" label="label.ccode">
<aui:validator name="required"></aui:validator>
</aui:input>
<aui:input name="cname" label="label.cname">
<aui:validator name="required"></aui:validator>
</aui:input>
<aui:input name="cfee" label="label.cfee">
<aui:validator name="required"></aui:validator>
<aui:validator name="number"></aui:validator>
</aui:input>

<aui:input name="cdescription" type="textarea" label="label.cdescription"></aui:input>

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


      </aui:fieldset>
 --%>      
        <aui:button-row>
       <aui:button type="submit" name="submit" value="Submit"></aui:button>
       <aui:button type="cancel" name="cancel" value="Cancel" onClick="<%= cancelURL.toString() %>"></aui:button>
       </aui:button-row>

</aui:form>
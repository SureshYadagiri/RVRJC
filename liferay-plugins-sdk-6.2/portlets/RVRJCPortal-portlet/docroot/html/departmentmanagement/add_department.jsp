<%@include file="/html/init.jsp" %>

<portlet:defineObjects />

<portlet:actionURL var="addDepartmentURL" name="addDepartment">
</portlet:actionURL>

<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/departmentmanagement/view.jsp"/>
</portlet:renderURL>
<aui:form name="form" action="<%= addDepartmentURL %>" method="post">

<aui:fieldset  >


<aui:input name="dname"  label="label.dname">
<aui:validator name="required"></aui:validator>
</aui:input>
		 
      </aui:fieldset>
      
        <aui:button-row>
       <aui:button type="submit" name="submit" value="Submit"></aui:button>
       <aui:button type="cancel" name="cancel" value="Cancel" onClick="<%= cancelURL.toString() %>"></aui:button>
       </aui:button-row>

</aui:form>
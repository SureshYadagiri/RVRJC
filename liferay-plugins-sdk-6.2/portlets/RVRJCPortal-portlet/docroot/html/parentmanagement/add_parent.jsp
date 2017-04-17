  <%@ include file="/html/init.jsp" %>
  
  <portlet:actionURL var="addParentURL" name="addParent">
</portlet:actionURL>

<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/parentcurd/view.jsp"/>
</portlet:renderURL>
  
  <aui:form action="<%=addParentURL %>" method="post" name="name">
  <aui:fieldset name="parent" column="true" label="label.parentdetails" >  
       
       <aui:input name="firstName"  >
              <aui:validator name="required" />
              <aui:validator name="alpha" />
       </aui:input>
       
       <aui:input name="middleName" >
       </aui:input>
       
       <aui:input name="lastName" >
        <aui:validator name="required" />
              <aui:validator name="alpha" />
       </aui:input>
       <aui:input name="email"  >
           <aui:validator name="required" />
              <aui:validator name="email" />
       </aui:input>
       
       <aui:input name="phno" label="label.phno">
           <aui:validator name="required" />
              <aui:validator name="digits"></aui:validator>
              <aui:validator name="minLength">10</aui:validator>
              </aui:input>
       <aui:input name="relationship">
       <aui:validator name="required"></aui:validator>
       </aui:input>       
       
       
       </aui:fieldset>
        <aui:button-row>
       <aui:button type="submit" name="submit" value="Submit"></aui:button>
       <aui:button type="cancel" name="cancel" value="Cancel" onClick="<%= cancelURL.toString() %>"></aui:button>
       </aui:button-row>
      </aui:form>
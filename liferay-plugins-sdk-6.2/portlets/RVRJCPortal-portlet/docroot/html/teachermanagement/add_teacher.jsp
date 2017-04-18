<%@include file="/html/init.jsp"%>

<portlet:defineObjects />

<portlet:actionURL var="addTeacherURL" name="addTeacher">
</portlet:actionURL>

<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/teachermanagement/view.jsp"/>
</portlet:renderURL>
<aui:form name="form" action="<%= addTeacherURL %>" method="post">
  
    <aui:fieldset column="true" label="label.header.personalDetails">  
       <aui:input name="firstName"  label="label.firstName" >
              <aui:validator name="required" />
              <aui:validator name="alpha" />
       </aui:input>
       <aui:input name="middleName" label="label.middleName">
             
       </aui:input>
       <aui:input name="lastName"  label="label.lastName">
        <aui:validator name="required" />
              <aui:validator name="alpha" />
       </aui:input>
      
       <aui:field-wrapper name="gender" label="label.gender">
		<aui:input inlineLabel="right" name="gender" type="radio" value="M" label="Male" />
		<aui:input checked="<%= true %>" inlineLabel="right" name="gender" type="radio" value="F" label="Female"  />
	</aui:field-wrapper>

	</aui:fieldset>
	<aui:fieldset column="true" label="label.title.contactDetails">  
       <aui:input name="email" label="label.email" >
           <aui:validator name="required" />
              <aui:validator name="email" />
       </aui:input>
       
       <aui:input name="phno" label="label.phno">
           <aui:validator name="required" />
              <aui:validator name="digits"></aui:validator>
              <aui:validator name="minLength">10</aui:validator>
             
       </aui:input>
      
       </aui:fieldset>
       
        <aui:button-row>
       <aui:button type="submit" name="submit" value="Submit"></aui:button>
       <aui:button type="cancel" name="cancel" value="Cancel" onClick="<%= cancelURL.toString() %>"></aui:button>
       </aui:button-row>
       </aui:form>

<%@include file="/html/init.jsp" %>


<h1>Welcome to Edit Teacher Details</h1>
<a href="<portlet:renderURL />">&laquo;Home</a>
<div class="separator"></div>

<%
long tid = ParamUtil.getLong(request, "tid");
Teacher teacher= TeacherLocalServiceUtil.getTeacher(tid);

%>

<portlet:actionURL name="updateTeacher" var="varEditTeacherURL"></portlet:actionURL> 
<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/teachermanagement/view.jsp"/>
</portlet:renderURL>


<aui:form name="form" action="<%= varEditTeacherURL %>" method="post">
<aui:model-context bean="<%= teacher %>" model="<%= Teacher.class %>"></aui:model-context>

<aui:fieldset column="true" label="label.title.personalDetails">
<aui:input name="tid" type="hidden" ></aui:input>
<aui:input name="firstName" type="text" label="label.firstName"></aui:input>
<aui:input name="middleName" type="text" label="label.middleName"></aui:input>
<aui:input name="lastName" type="text" label="label.lastName"></aui:input>
<aui:field-wrapper name="gender" label="label.gender">
		<aui:input inlineLabel="right" name="gender" type="radio" value="0" label="Male" />
		<aui:input checked="<%= true %>" inlineLabel="right" name="gender" type="radio" value="1" label="Female"  />
</aui:field-wrapper>
</aui:fieldset>
<aui:fieldset column="true" label="label.title.contactDetails">

<aui:input name="phno" type="text" label="label.phno"></aui:input>
<aui:input name="email" type="text" label="label.email"></aui:input>




</aui:fieldset>

<aui:button-row>
		<aui:button  type="submit" value="save"  />

		<aui:button  type="cancel" value="cancel"  onClick="<%=cancelURL.toString() %>"/>
</aui:button-row>

</aui:form>
<%@include file="/html/init.jsp" %>

<portlet:defineObjects />

<h1>Welcome To RVR&JC College</h1>
<br/>



<portlet:renderURL var="addStudentVar">
<portlet:param name="mvcPath" value="/html/studentmanagment/add_student.jsp"/>
</portlet:renderURL>

<!--<portlet:actionURL name="deleteStudent"></portlet:actionURL>-->
<h3><aui:a href="<%= addStudentVar %>">Add Student</aui:a></h3>
<br/>
<liferay-portlet:renderURL varImpl="iteratorURL">
<portlet:param name="mvcPath" value="/html/studentmanagment/view.jsp"/>

</liferay-portlet:renderURL>



<liferay-ui:search-container delta="5" deltaConfigurable="true" iteratorURL="<%=iteratorURL %>" emptyResultsMessage="msg.no.students">

	<liferay-ui:search-container-results
		results="<%= StudentLocalServiceUtil.getStudents(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= StudentLocalServiceUtil.getStudentsCount() %>"
	/>

	<liferay-ui:search-container-row 		className="com.rvrjc.portal.model.Student" 		modelVar="student"
	>
	<liferay-portlet:renderURL varImpl="rowURL">
	<portlet:param name="sno" value="${student.sno}"/>
	<portlet:param name="mvcPath" value="/html/studentmanagment/student_details.jsp"/>
	</liferay-portlet:renderURL>
	
		<liferay-ui:search-container-column-text href="<%=rowURL %>" property="sno" />

		<liferay-ui:search-container-column-text value='<%= student.getFirstName()+" "+student.getMiddleName()+" "+student.getLastName() %>'  name="Name"  />

		<liferay-ui:search-container-column-text name="Gender" value='<%=(student.getGender()==0)?"Male":"Female"%>'	/>
		
		<liferay-ui:search-container-column-jsp name="Address"  path="/html/studentmanagment/student_addr.jsp" />
		
<%-- 		<liferay-ui:search-container-column-text name="Details" value="click here" href="${rowURL}"/> --%>
		
		<liferay-ui:search-container-column-jsp name="Actions"   path="/html/studentmanagment/student_actions.jsp" />  
		

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>




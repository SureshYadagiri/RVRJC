<%@include file="/html/init.jsp" %>
<portlet:defineObjects />

<h1>Welcome To RVR&JC College</h1>

<portlet:renderURL var="addTeacherVar" >
<portlet:param name="mvcPath" value="/html/teachermanagement/add_teacher.jsp"/>
</portlet:renderURL>


<h3><aui:a href="<%= addTeacherVar %>"> Add Teacher</aui:a></h3>
<br/>


<br/>
<liferay-portlet:renderURL varImpl="iteratorURL">
<portlet:param name="mvcPath" value="/html/teachermanagement/view.jsp"/>

</liferay-portlet:renderURL>

<liferay-ui:search-container delta="5" deltaConfigurable="true" iteratorURL="<%= iteratorURL %>" emptyResultsMessage="msg.info.noteacher">

	<liferay-ui:search-container-results
		results="<%= TeacherLocalServiceUtil.getTeachers(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= TeacherLocalServiceUtil.getTeachersCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.rvrjc.portal.model.Teacher"
		modelVar="teacher"
	>
		<liferay-portlet:renderURL varImpl="rowURL">
	<portlet:param name="tid" value="${teacher.tid}"/>
	<portlet:param name="mvcPath" value="/html/teachermanagement/teacher_details.jsp"/>
	</liferay-portlet:renderURL>
	
		<liferay-ui:search-container-column-text property="tid" />

		<liferay-ui:search-container-column-text href="${rowURL }" value='<%= teacher.getFirstName()+" "+teacher.getLastName()+" "+teacher.getLastName() %>'  name="Name"  />
		
		<liferay-ui:search-container-column-text name="Gender" value='<%=(teacher.getGender().equalsIgnoreCase("M"))?"Male":"Female"%>'/>

		
		<liferay-ui:search-container-column-jsp name="Actions"   path="/html/teachermanagement/teacher_actions.jsp" />  
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

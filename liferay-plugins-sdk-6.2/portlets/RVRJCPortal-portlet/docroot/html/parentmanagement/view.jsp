<%@ include file="/html/init.jsp" %>

<portlet:renderURL var="addParentVar">
<portlet:param name="mvcPath" value="/html/parentmanagement/add_parent.jsp"/>
</portlet:renderURL>
<h3><aui:a href="<%= addParentVar%>">Add Parent</aui:a></h3>
<br/>

<%
	String currentURL=PortalUtil.getCurrentURL(request);
%>

<liferay-portlet:renderURL varImpl="iteratorURL">
<portlet:param name="mvcPath" value="/html/department/view.jsp"/>

</liferay-portlet:renderURL>
<liferay-ui:search-container delta="5" deltaConfigurable="true"  emptyResultsMessage="msg.no.parents">

	<liferay-ui:search-container-results
		results="<%= ParentLocalServiceUtil.getParents(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= ParentLocalServiceUtil.getParentsCount() %>"
	/>

	<liferay-ui:search-container-row 	className="com.rvrjc.portal.model.Parent" 		modelVar="parent">
		<liferay-portlet:renderURL varImpl="rowURL">
	<portlet:param name="parentId" value="${parent.parentId}"/>
	<portlet:param name="backURL" value="<%=currentURL %>"/>
	<portlet:param name="mvcPath" value="/html/parentmanagement/parent_details.jsp"/>
	</liferay-portlet:renderURL>
	
		<liferay-ui:search-container-column-text href="<%= rowURL%>" value='<%= parent.getFirstName()+" "+parent.getMiddleName()+" "+parent.getLastName() %>' name="Name"/>
		<liferay-ui:search-container-column-text property="relationShip" name="header.relationShip"/>
<%-- 		<liferay-ui:search-container-column-text  name="Details"  value="click here" href="${rowURL}"/> --%>
		<liferay-ui:search-container-column-jsp name="Actions"   path="/html/parentmanagement/parent_actions.jsp" /> 

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

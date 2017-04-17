<%@include file="/html/init.jsp" %>
<portlet:defineObjects />

<%

long parentId=ParamUtil.getLong(request, "parentId");
Parent parent=ParentLocalServiceUtil.getParent(parentId);
request.setAttribute("parent", parent);
%>

<h3>Name :<%=parent.getFirstName()+" "+parent.getMiddleName()+" "+parent.getLastName() %></h3>
<h3>Email : <%= parent.getEmail() %></h3>
<h3>Phone Number<%=parent.getPhNo()%></h3>
<h3>Relationship <%=parent.getRelationShip()%></h3>


<h3>Created By : <%=parent.getCreatedBy()%></h3>
<h3>Created On :<%=parent.getCreatedOn() %></h3>
<h3>Modified By :<%=parent.getModifiedBy() %></h3>
<h3>Modified On : <%=parent.getModifiedOn() %></h3>

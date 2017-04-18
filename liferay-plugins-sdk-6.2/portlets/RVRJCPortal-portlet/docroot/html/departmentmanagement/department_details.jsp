<%@include file="/html/init.jsp" %>

<%
 long dno=ParamUtil.getLong(request, "dno");
Department dept=DepartmentLocalServiceUtil.getDepartment(dno);
request.setAttribute("dept", dept);
  
  String redirect=ParamUtil.getString(request, "backURL");
 
  %>
  
  <h1>Department Information</h1>
  <br/>
  <h2>Department Name :<%=dept.getDname()  %></h2>
  <h2>Created On :<%=dept.getCreatedOn() %></h2>
    <h2>Created By : <%=dept.getCreatedBy() %></h2>
      <h2>Modified On :<%=dept.getModifiedOn() %></h2>
      <h2>Modified By :<%=dept.getModifiedBy() %></h2>
      
      <br/>
      
      <aui:a href="<%=redirect %>">Back</aui:a>
  
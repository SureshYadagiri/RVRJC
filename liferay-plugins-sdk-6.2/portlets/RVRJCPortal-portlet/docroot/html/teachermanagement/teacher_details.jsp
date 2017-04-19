<%@include file="/html/init.jsp" %>

<%
 long tid=ParamUtil.getLong(request, "tid");
  Teacher teacher=TeacherLocalServiceUtil.getTeacher(tid);
  request.setAttribute("teacher", teacher);
  String redirect=ParamUtil.getString(request, "backURL");
 
  %>
  
  <h1>Teacher Information</h1>
  <br/>
  <h2>Email ID :<%=teacher.getEmail()  %></h2>
  <h2>Phone Number :<%=teacher.getPhno()%></h2>

      
      <br/>
      
      <aui:a href="<%=redirect %>">Back</aui:a>
  
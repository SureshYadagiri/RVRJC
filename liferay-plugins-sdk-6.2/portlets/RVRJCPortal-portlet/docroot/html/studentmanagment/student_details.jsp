<%@include file="/html/init.jsp" %>
<portlet:defineObjects />

<%

long sno=ParamUtil.getLong(request, "sno");
Student student=StudentLocalServiceUtil.getStudent(sno);
request.setAttribute("student", student);

%>

<h3>Student Name :<%=student.getFirstName()+" "+student.getMiddleName()+" "+student.getLastName() %></h3>
<h3>Email : <%= student.getEmail() %></h3>
<h3>EMCET Rank :<%=student.getEmcetRank()%></h3>
<h3> Date Of Birth :<%=student.getDateOfBirth() %></h3>

<h3> Created BY :<%=student.getCreatedBy() %></h3>
<h3>Created On :<%=student.getCreatedOn() %></h3>
<h3>Modified By :<%=student.getModifiedBy() %></h3>
<h3>Modified On :<%=student.getModifiedOn() %></h3>

<%@include file="/html/init.jsp" %>

<h1>Welcome to Update Student Details</h1>
<a href="<portlet:renderURL />">&laquo;Home</a>
<div class="separator"></div>

<%
long sno=ParamUtil.getLong(request, "sno");
Student student=StudentLocalServiceUtil.getStudent(sno);
long addressId=student.getAddressId();
Address addr=AddressLocalServiceUtil.getAddress(addressId);

List<Parent> parent=ParentLocalServiceUtil.getStudentParents(sno);

%>

<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/studentdetails/view.jsp"/>
</portlet:renderURL>
<portlet:actionURL name="updateStudent" var="varUpdateStudentURL"></portlet:actionURL> 

<aui:form name="form" action="<%= varUpdateStudentURL %>" method="post">
<aui:model-context bean="<%= student %>" model="<%= Student.class %>"></aui:model-context>
<aui:model-context bean="<%= addr %>" model="<%= Address.class %>"></aui:model-context>

<aui:fieldset column="true" label="personal Details">
<aui:input name="sno" type="hidden"></aui:input>
<aui:input name="firstName" type="text" label="label.firstName"></aui:input>
<aui:input name="middleName" type="text" label="label.middleName"></aui:input>
<aui:input name="lastName" type="text" label="label.lastName"></aui:input>
<aui:field-wrapper name="gender" label="label.gender">
		<aui:input inlineLabel="right" name="gender" type="radio" value="0" label="Male" />
		<aui:input checked="<%= true %>" inlineLabel="right" name="gender" type="radio" value="1" label="Female"  />
</aui:field-wrapper>

<aui:input name="dob" type="text" label="label.dob"></aui:input>
</aui:fieldset>
 <aui:fieldset column="true" label="label.title.contactDetails">  
       <aui:input name="email" type="text" label="label.email" >
           
       </aui:input>
       
       <aui:input name="phno" type="text" label="label.phno">
          
         </aui:input>   
             <aui:input name="emcetRank" type="text" label="label.emcetRank">
            
            
       </aui:input>
    
       
     <aui:select name="dno" label="label.select.dept"  class="form-control" showEmptyOption="false" column-width="50">
         
         <aui:option value=" " ></aui:option>
           <%
                 List<Department> depts = DepartmentLocalServiceUtil.getDepartments(0,DepartmentLocalServiceUtil.getDepartmentsCount());
                for(Department dept: depts){
                %>
                
                <option value="<%=dept.getDno()%>" selected="selected"><%=dept.getDname()%></option>
                
                <%} %>
        
       </aui:select>
        <h6>Select Course</h6>           
                <%
                 List<Course> courses = CourseLocalServiceUtil.getCourses(0,CourseLocalServiceUtil.getCoursesCount());
                for(Course course: courses){
                %>
               
                <aui:input   name= "course" type="checkbox" value="<%=course.getCno()%>" label="<%=course.getCname()%>"></aui:input>
            <!--   <aui:option value="<%=course.getCno()%>" selected="selected"><%=course.getCname()%></aui:option>
                 -->
                <%} %>
               
           

       </aui:fieldset>
       &nbsp;&nbsp;
     
        <aui:fieldset   column="true" title="Address" label="label.title.addr">
       <aui:input name="doorNo" label="label.doorNo">
             
              
       </aui:input>
      
       <aui:input name="city" label="label.city">

       </aui:input>
        <aui:input name="mandal" label="label.mandal">
              
             
       </aui:input>
        <aui:input name="district" type="text" label="label.district"  >        
       </aui:input>
       <aui:input name="state"  type="text" label="label.state">
              
       </aui:input>
             
       <aui:input name="country" value="INDIA" readonly="readonly"  label="label.country"/>
              
      
       </aui:fieldset>
   
       
     
  
        <aui:fieldset name="parent" column="true" label="label.title.parenDetails">  
     
       <aui:input name="name"  type="text" label="label.parentName">
             
      </aui:input>
       
       </aui:fieldset>
       <aui:button-row>
       <aui:button type="submit" name="submit" value="Update"></aui:button>
       <aui:button type="cancel" name="cancel" value="Cancel" onClick="<%= cancelURL.toString() %>"></aui:button>
       </aui:button-row>       
</aui:form>

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
<aui:input name="firstName" type="text"></aui:input>
<aui:input name="middleName" type="text"></aui:input>
<aui:input name="lastName" type="text"></aui:input>
<aui:field-wrapper name="gender">
		<aui:input inlineLabel="right" name="gender" type="radio" value="0" label="Male" />
		<aui:input checked="<%= true %>" inlineLabel="right" name="gender" type="radio" value="1" label="Female"  />
</aui:field-wrapper>

<aui:input name="dob" type="text" ></aui:input>
</aui:fieldset>
 <aui:fieldset column="true" label="Contact Details">  
       <aui:input name="email" type="text" >
           
       </aui:input>
       
       <aui:input name="phno" type="text">
          
         </aui:input>   
             <aui:input name="emcetRank" type="text">
            
            
       </aui:input>
       <aui:input name="liferayUserId">
       <aui:validator name="required" ></aui:validator>
       </aui:input>
       
     <aui:select name="dno" label="select Department"  class="form-control" showEmptyOption="false" column-width="50">
         
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
     
        <aui:fieldset   column="true" title="Address" label="Address Details">
       <aui:input name="doorNo" >
             
              
       </aui:input>
      
       <aui:input name="city" >

       </aui:input>
        <aui:input name="mandal">
              
             
       </aui:input>
        <aui:input name="district" type="text"   >        
       </aui:input>
       <aui:input name="state"  type="text">
              
       </aui:input>
             
       <aui:input name="country" value="INDIA" readonly="readonly" />
              
      
       </aui:fieldset>
   
       
     
  
        <aui:fieldset name="parent" column="true" label="Parent Details">  
     
       <aui:input name="name"  type="text" >
             
      </aui:input>
       
       </aui:fieldset>
       <aui:button-row>
       <aui:button type="submit" name="submit" value="Update"></aui:button>
       <aui:button type="cancel" name="cancel" value="Cancel" onClick="<%= cancelURL.toString() %>"></aui:button>
       </aui:button-row>       
</aui:form>

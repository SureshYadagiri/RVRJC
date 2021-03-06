<%@include file="/html/init.jsp"%>

<portlet:actionURL var="addStudentURL" name="addStudent">
</portlet:actionURL>


<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/studentdetails/view.jsp"/>
</portlet:renderURL>

<liferay-ui:error key="birthdate-required" message="date-of-birth-required"></liferay-ui:error>


<%
 //Calendar dob=CalendarFactoryUtil.getCalendar();
//Student student=null;
//dob.setTime(student.getDateOfBirth());

%>

<aui:form name="form" action="<%= addStudentURL %>" method="post">
  
    <aui:fieldset column="true" label="label.title.personalDetails">  
       <aui:input name="firstName" label="label.firstName" >
              <aui:validator name="required" />
              <aui:validator name="alpha" />
       </aui:input>
       <aui:input name="middleName" label="label.middleName" >
             
       </aui:input>
       <aui:input name="lastName" label="label.lastName" >
        <aui:validator name="required" />
              <aui:validator name="alpha" />
       </aui:input>
      
       <aui:field-wrapper name="gender" label="label.gender">
		<aui:input inlineLabel="right" name="gender" type="radio" value="0" label="Male" />
		<aui:input checked="<%= true %>" inlineLabel="right" name="gender" type="radio" value="1" label="Female"  />
</aui:field-wrapper>

<aui:input name="dob"  label="label.dob">

 <aui:validator name="date"></aui:validator>
</aui:input>

</aui:fieldset>

&nbsp;&nbsp;&nbsp;
       <aui:fieldset column="true" label="label.title.contactDetails">  
       <aui:input name="email"  label="label.email">
           <aui:validator name="required" />
              <aui:validator name="email" />
       </aui:input>
       
       <aui:input name="phno" label="label.phno">
           <aui:validator name="required" />
              <aui:validator name="digits"></aui:validator>
              <aui:validator name="minLength">10</aui:validator>
             
             <aui:input name="emcetRank" label="label.emcetRank">
             <aui:validator name="number"></aui:validator>
             </aui:input>
       </aui:input>
    <div>
         <aui:select name="dno" label="label.select.dept"  class="form-control" showEmptyOption="false" column-width="50">
         
         <aui:option value=" " ></aui:option>
           <%
                 List<Department> depts = DepartmentLocalServiceUtil.getDepartments(0,DepartmentLocalServiceUtil.getDepartmentsCount());
                for(Department dept: depts){
                %>
                
                <option value="<%=dept.getDno()%>" selected="selected"><%=dept.getDname()%></option>
                
                <%} %>
        
       </aui:select>
      
</div>
         
                
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
     
     
        <aui:fieldset   column="true" title="Address" label="label.title.addr">
       <aui:input name="doorNo" label="label.doorNo" >
              <aui:validator name="required" />
              
       </aui:input>
      
       <aui:input name="city" label="label.city">
              <aui:validator name="required" />
              <aui:validator name="alpha" />
       </aui:input>
        <aui:input name="mandal" label="label.mandal">
              <aui:validator name="required" />
             
       </aui:input>
        <aui:input name="district" label="label.district">
              <aui:validator name="required" />
             
       </aui:input>
       <aui:select name="state" showEmptyOption="false" label="label.state">
     <aui:option value=" ">  </aui:option>
     <aui:option  value="ap">Andhra pradesh</aui:option>
     <aui:option  value="telangana">Telangana</aui:option>
        
       </aui:select>
     
             
       <aui:input name="country" value="INDIA" readonly="readonly" label="label.country">
              <aui:validator name="required" />
              <aui:validator name="alpha" />
       </aui:input>
       </aui:fieldset>
       <aui:fieldset name="" column="true" label="label.title.parenDetails">  
         <aui:select name="parent" label="label.parentName" class="form-control" id="state_id" multiple="true">
                
                  <aui:option value=" " >  </aui:option>
             <%
             	List<Parent> parents=ParentLocalServiceUtil.getParents(0, ParentLocalServiceUtil.getParentsCount());
             for(Parent parent:parents){
             %>
           <aui:option value="<%=parent.getParentId()%>" name="parent"> <%=parent.getFirstName()+""+parent.getMiddleName()+""+parent.getLastName() %></aui:option>                 
                </aui:select>
                 
  <%} %>
      </aui:fieldset>

      
       <aui:button-row>
       <aui:button type="submit" name="submit" value="Submit"></aui:button>
       <aui:button type="cancel" name="cancel" value="Cancel" onClick="<%= cancelURL.toString() %>"></aui:button>
       </aui:button-row>
       </aui:form>
       
       

       
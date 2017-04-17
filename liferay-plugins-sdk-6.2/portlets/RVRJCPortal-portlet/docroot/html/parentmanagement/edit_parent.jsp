  <%@ include file="/html/init.jsp" %>
  
<portlet:actionURL var="editParentURL" name="updateParent">
</portlet:actionURL>

<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/parentmanagement/view.jsp"/>
</portlet:renderURL>

<%
long parentId=ParamUtil.getLong(request, "parentId");
  Parent parent=ParentLocalServiceUtil.getParent(parentId);
%>
  
  <aui:form action="<%=editParentURL %>" method="post" name="name">
    
    <aui:model-context bean="<%= parent %>" model="<%= Parent.class %>"></aui:model-context>
    
  <aui:fieldset name="parent" column="true" label="label.parentdetails" >  
       
       <aui:input name="parentId" type="hidden" value="<%=parentId %>"></aui:input>
       <aui:input name="firstName"  type="text"/>
       
       <aui:input name="middleName" type="text"/>
             
       
       <aui:input type="text" name="lastName" >
       		 <aui:validator name="required" />
              <aui:validator name="alpha" />
       </aui:input>
       
       <aui:input name="email" type="text" >
       	    <aui:validator name="required" />
              <aui:validator name="email" />
       </aui:input>
       
       <aui:input name="phNo" type="text">
        	  <aui:validator name="required" />
              <aui:validator name="digits"/>
              <aui:validator name="maxLength">10</aui:validator>
              <aui:validator name="minLength">10</aui:validator>
		</aui:input>
      
       <aui:input name="relationShip" type="text">
      		 <aui:validator name="required"/>
       </aui:input>       
       
       </aui:fieldset>
        <aui:button-row>
       <aui:button type="submit" name="submit" value="Submit"></aui:button>
       <aui:button type="cancel" name="cancel" value="Cancel" onClick="<%= cancelURL.toString() %>"></aui:button>
       </aui:button-row>
      </aui:form>
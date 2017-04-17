<%@include file="/html/init.jsp" %>

<h1> Student Fee </h1>

<portlet:actionURL var="invoiceStudentURL" name="addInvoice">
</portlet:actionURL>

<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/studentmanagment/view.jsp"/>
</portlet:renderURL>

<aui:form action="<%=invoiceStudentURL %>" method="post" name="name">


 <aui:fieldset column="true" label="Invoice Details">
       <aui:input name="amountPaid" >
       <aui:validator name="number"></aui:validator>
       </aui:input>
       
      </aui:fieldset>
       
      <br/>
      <br/>
       <aui:button-row>
       <aui:button type="submit" name="submit" value="Submit"></aui:button>
       <aui:button type="cancel" name="cancel"  onClick="<%= cancelURL.toString() %>"></aui:button>
       </aui:button-row>
       </aui:form>
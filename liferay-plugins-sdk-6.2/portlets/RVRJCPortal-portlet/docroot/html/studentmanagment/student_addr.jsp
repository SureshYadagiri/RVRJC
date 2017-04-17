<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@include file="/html/init.jsp" %>
<%
	ResultRow row=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Student student=(Student)row.getObject();
	long addressId=student.getAddressId();
	Address addr=null;
	try{
	addr=AddressLocalServiceUtil.getAddress(addressId);
	}catch(Exception e){
		
	}
%>

<c:if test="<%= Validator.isNotNull(addr) %>">


<%= addr.getDoorNo()%>
<%= addr.getCity() %>
<%= addr.getMandal() %>
<%= addr.getDistrict() %>
<%= addr.getState()%>
<%= addr.getAddCountry() %>

</c:if>

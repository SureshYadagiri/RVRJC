<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>



<%@page import="com.rvrjc.portal.service.CourseLocalServiceUtil"%>
<%@page import="com.rvrjc.portal.service.*" %>


<%@page import="com.rvrjc.portal.model.Course"%>
<%@page import="com.liferay.portal.kernel.util.ArrayUtil"%>
<%@page import="java.util.ArrayList"%>

<%@page import="java.util.List"%>

<%@page import="javax.portlet.RenderRequest"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.mysql.jdbc.ResultSetRow"%>

<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.rvrjc.portal.service.DepartmentLocalServiceUtil"%>
<%@page import="com.rvrjc.portal.model.Department"%>

<%@page import="com.rvrjc.portal.model.Teacher"%>
<%@page import="com.rvrjc.portal.service.InvoiceLocalServiceUtil"%>
<%@page import="com.rvrjc.portal.model.Invoice"%>
<%@page import="com.rvrjc.portal.service.AddressLocalServiceUtil"%>
<%@page import="com.rvrjc.portal.model.Address"%>
<%@page import="com.rvrjc.portal.service.StudentLocalServiceUtil"%>
<%@page import="com.rvrjc.portal.model.Student"%>
<%@page import="com.liferay.portal.kernel.util.ArrayUtil"%>
<%@page import="java.util.ArrayList"%>

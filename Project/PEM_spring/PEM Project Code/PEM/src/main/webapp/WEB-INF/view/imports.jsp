<!-- 
	Author : Swaraj Udakhe
 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%-- <%@page import="com.uswaraj.pemappmaven.controller"%>
<%@page import="com.uswaraj.pemappmaven.dao"%>
<%@page import="com.uswaraj.pemappmaven.daoimpl"%>
<%@page import="com.uswaraj.pemappmaven.service"%>
<%@page import="com.uswaraj.pemappmaven.serviceimpl"%>
<%@page import="com.uswaraj.pemappmaven.domain"%>
 --%>
    
    
    
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<%-- Spring link preparation --%>
<s:url var="url_bootstrap" value="/static/css/bootstrap.min.css" />
<s:url var="url_font_awesome" value="/static/css/font-awesome.min.css" />

<link href="${url_bootstrap}" type="text/css" rel="stylesheet">
<link href="${url_font_awesome}" type="text/css" rel="stylesheet">


<body>

<%@include file="./common/catHeader.jsp"%>



<%@include file="./common/footer.jsp"%>


</body>
</html>
<!-- 
	Author : Swaraj Udakhe
 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<%-- Spring link preparation --%>
<s:url var="url_bootstrap" value="/static/css/bootstrap.min.css" />
<s:url var="url_font_awesome" value="/static/css/font-awesome.min.css" />

<link href="${url_bootstrap}" type="text/css" rel="stylesheet">
<link href="${url_font_awesome}" type="text/css" rel="stylesheet">

<link rel="icon" type="image/png"
	href="/static/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/PEMAppMaven/src/main/webapp/static/vendor/bootstrap/css/bootstrap.min.css">

<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/PEMAppMaven/src/main/webapp/static/fonts/font-awesome-4.7.0/css/font-awesome.min.css">

<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/PEMAppMaven/src/main/webapp/static/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/PEMAppMaven/src/main/webapp/static/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/PEMAppMaven/src/main/webapp/static/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/PEMAppMaven/src/main/webapp/static/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/PEMAppMaven/src/main/webapp/static/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/PEMAppMaven/src/main/webapp/static/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="/static/css/util.css">
<link rel="stylesheet" type="text/css" href="/static/css/main.css">
<!--===============================================================================================-->


</head>
<body>

	<%@include file="./common/header.jsp"%>

	<%@include file="./common/footer.jsp"%>

</body>
</html>
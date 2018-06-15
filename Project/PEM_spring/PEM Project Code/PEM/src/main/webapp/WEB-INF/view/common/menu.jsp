<!-- 
	Author : Swaraj Udakhe
 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Expense Manager</title>

<%-- Spring link preparation --%>
<s:url var="url_bootstrap" value="/static/css/bootstrap.min.css" />
<s:url var="url_font_awesome" value="/static/css/font-awesome.min.css" />

<%-- Spring link preparation --%>
<s:url var="url_bootstrap" value="../static/css/bootstrap.min.css" />
<s:url var="url_font_awesome" value="../static/css/font-awesome.min.css" />

<link href="${url_bootstrap}" type="text/css" rel="stylesheet">
<link href="${url_font_awesome}" type="text/css" rel="stylesheet">

<link rel="icon" type="image/png"
	href="../static/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../static/vendor/bootstrap/css/bootstrap.min.css">

<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../static/fonts/font-awesome-4.7.0/css/font-awesome.min.css">

<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../static/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../static/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../static/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../static/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../static/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../static/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="../static/css/util.css">
<link rel="stylesheet" type="text/css" href="../static/css/main.css">
<!--===============================================================================================-->

<style>
body {
	/*  background-image: url("../static/images/image-01.jpg"); */
	background-repeat: no-repeat;
	background-position: center;
	height: 600px;
	width: inherit;
}
</style>


</head>
<body>

	<header> <!-- Fixed navbar -->
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
	<h4 class="navbar-brand">Personal Expense Manager</h4>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarCollapse" aria-controls="navbarCollapse"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarCollapse">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link"
				href="./home.htm">Home<span class="sr-only">(current)</span></a></li>
			<li class="nav-item"><a class="nav-link" href="./login.htm">Login</a>
			</li>
			<li class="nav-item"><a class="nav-link "
				href="./userRegistration.htm">Register Here</a></li>
		</ul>
	</div>
	</nav> </header>
	<%
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("login.htm", "0"); //prevents caching at the proxy server
	%>

	<%@ page session="false"%>

</body>
</html>
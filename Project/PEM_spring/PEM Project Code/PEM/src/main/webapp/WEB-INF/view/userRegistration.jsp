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
<title>User Registration</title>

</head>

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

</head>
<body>
	<%@include file="./common/header.jsp"%>
	<div align="center"">
		<h3 class="mt-5">User Registration Form</h3>
		<form name="myform" action="./submitRegistration.htm" method="post">
			<table align="center">
				<div class="wrap-input100 validate-input m-t-85 m-b-35"
					data-validate="Enter username">
					<input class="input100" type="text" name="userName"
						required="required"> <span class="focus-input100"
						data-placeholder="Name"></span>
				</div>

				<div class="wrap-input100 validate-input m-b-50"
					data-validate="Enter loginname">
					<input class="input100" type="email" name="email"
						required="required"> <span class="focus-input100"
						data-placeholder="Email"></span>
				</div>

				<div class="wrap-input100 validate-input m-b-50"
					data-validate="Enter loginname">
					<input class="input100" type="text" name="loginname"
						required="required"> <span class="focus-input100"
						data-placeholder="Loginname"></span>
				</div>

				<div class="wrap-input100 validate-input m-b-50"
					data-validate="Enter password">
					<input class="input100" type="password" name="password"
						required="required"> <span class="focus-input100"
						data-placeholder="Password"></span>
				</div>
			</table>

			<div class="container-login100-form-btn">
				<button class="login100-form-btn">Register</button>
			</div>
		</form>
	</div>
	>
	<%@include file="./common/footer.jsp"%>

</body>
</html>
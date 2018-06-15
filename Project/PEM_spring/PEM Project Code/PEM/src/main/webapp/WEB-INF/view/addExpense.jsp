<!-- 
	Author : Swaraj Udakhe
 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Expense</title>

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
<body style="text-align: center;">

	<%@include file="./common/catHeader.jsp"%>

	<div align="center">

		<h2 class="mt-5">Add Expenses</h2>
		<form action="sendExpense.htm" method="post">
<div>			<table align="center">
			
				<tr>
			<td>Select Category</td>
			
			<td>
		 
							<select name="catId" class="custom-select" style="width:200px;">
							   <c:forEach items="${catList}" var="catlist">
							       <option value="${catlist.catId}"><c:out value="${catlist.catName}"/></option>
							   </c:forEach>
							</select>
						
			 </td>
				
				</tr>
	</div>	

				<div class="wrap-input100 validate-input m-t-85 m-b-35"
					data-validate="Enter username">
					<input class="input100" type="text" name="amount"> <span
						class="focus-input100" data-placeholder="Amount"></span>
				</div>

				<div class="wrap-input100 validate-input m-b-50"
					data-validate="Enter password">
					<input class="input100" type="date" name="date"> <span
						class="focus-input100"></span>
				</div>


				<div class="wrap-input100 validate-input m-b-50"
					data-validate="Enter username">
					<input class="input100" type="text" name="remark"> <span
						class="focus-input100" data-placeholder="remark"></span>
				</div>


			</table>
			<div class="container-login100-form-btn">
				<button class="login100-form-btn">Add</button>
			</div>


		</form>

		<%@include file="./common/footer.jsp"%>
</body>
</html>
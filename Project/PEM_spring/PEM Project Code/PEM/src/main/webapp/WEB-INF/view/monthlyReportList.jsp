<!-- 
	Author : Swaraj Udakhe
 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Monthly Report</title>

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
	<%@include file="./common/catHeader.jsp"%>
	<br>
	<br>
	<br>
	<br>
	<h3 align="center">Monthly Expense Report</h3>
	<br>
	<br>
	<div align="center">
		<table id="pemtable" border="1" cellspacing="3" cellpadding="3" align="center">


			<tr style="width: 40px">
				<th>SR</th>
				<th>MONTH</th>
				<th>TOTAL</th>


			</tr>
			<%
				int i = 0;
			%>
			<c:forEach items="${requestScope.expMonList}" var="expense">
				<tr>
					<td><%=++i%></td>
					<td><c:out value="${expense.month}"></c:out></td>
					<td><c:out value="${expense.total}"></c:out></td>

				</tr>
			</c:forEach>

			</form>
			</td>
			</tr>
			<%-- </c:forEach> --%>
		</table>

	</div>

	<%@include file="./common/footer.jsp"%>

</body>
</html>
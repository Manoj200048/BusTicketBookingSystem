<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel ="stylesheet" type="text/css" href="./USERaccount.css">
	
	<style type="text/css">
		body{
			font-family: Hind SemiBold;
		}
	
		table, th, td {
  			border: 1px solid black;
		}
	</style>
</head>
<body>

<h><b>Tikcet</b></h>

	<table>
	<c:forEach var="c" items="${BookDetails}">
	
	<c:set var="id" value="${c.bookid}"/>
	<c:set var="uname" value="${c.username}"/>
	<c:set var="seats" value="${c.seates}"/>
	<c:set var="date" value="${c.date}"/>
	<c:set var="busId" value="${c.busid}"/>
	<c:set var="total" value="${c.totalPrice}"/>
	
	
	
	<tr>
		<td>BOOKING ID</td>
		<td>${c.bookid}</td>
	</tr>
	<tr>
		<td>USER Name</td>
		<td>${c.username}</td>
	</tr>
	<tr>
		<td>NO OF SEATS</td>
		<td>${c.seates}</td>
	</tr>
	<tr>
		<td>DATE</td>
		<td>${c.date}</td>
	</tr>
	<tr>
		<td>BUS ID</td>
		<td>${c.busid}</td>
	</tr>
	<tr>
		<td>PRICE</td>
		<td>${c.totalPrice}</td>
	</tr>

	</c:forEach>
	</table>
	
	
	
	<a href="Update.jsp"><input type="submit" value="Change Date" name="up"></a>
	 <a href="deletecustomer.jsp"><input type="submit" value="Cancel Tikcet" name="up"></a>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>
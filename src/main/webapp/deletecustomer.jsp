<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel ="stylesheet" type="text/css" href="./cancel.css">
</head>
<body>

	<form method="post" action="DeleteSevlet">
        <label for="bookingId">Enter Booking ID to delete:</label>
        <input type="text" name="bookid" id="bookingId">
        <input type="submit" value="Delete">
    </form>
</body>
</html>
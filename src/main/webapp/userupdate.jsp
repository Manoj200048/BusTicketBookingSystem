<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel ="stylesheet" type="text/css" href="./USERaccount.css">
    <style type="text/css">
        body {
            font-family: Hind SemiBold;
        }
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h><b>Update Date</b></h>
    <table>
        <c:forEach var="m" items="${Details}">
            <tr>
                <td>BOOKING ID</td>
                <td>${m.bookid}</td>
            </tr>
            <tr>
                <td>USER Name</td>
                <td>${m.username}</td>
            </tr>
            <tr>
                <td>NO OF SEATS</td>
                <td>${m.seates}</td>
            </tr>
            <tr>
                <td>DATE</td>
                <td>${m.date}</td>
            </tr>
            <tr>
                <td>BUS ID</td>
                <td>${m.busid}</td>
            </tr>
            <tr>
                <td>PRICE</td>
                <td>${m.totalPrice}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

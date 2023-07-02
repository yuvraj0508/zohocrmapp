<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file = "menu.jsp" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<table>
<tr> 
<th>first name</th>
<th>last name</th>
<th>email</th>
<th>mobile</th>
<th>Product</th>
<th>Amount</th>


</tr>
<tr>
<c:forEach var ="billings" items ="${billings}">
<td>${billings.firstname}</td>
<td>${billings.lastname}</td>
<td>${billings.email}</td>
<td>${billings.mobile}</td>
<td>${billings.product}</td>
<td>${billings.amount}</td>
</c:forEach>
</tr>
 </table>
</body>
</html>
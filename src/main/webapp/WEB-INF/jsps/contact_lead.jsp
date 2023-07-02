<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file = "menu.jsp" %>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead</title>
</head>
<body>
<table>
<tr> 
<th>first name</th>
<th>last name</th>
<th>email</th>
<th>mobile</th>
<th>source</th>
<th>source</th>
<th>Billing</th>


</tr>
<c:forEach var ="contacts" items ="${contacts}">
   <tr> 

   <td>${contacts.firstname}</td>
   <td>${contacts.lastname}</td>
   <td>${contacts.email}</td>
   <td>${contacts.mobile}</td>
    <td>${contacts.source}</td>
    <td><a href ="Billinginfo?id=${contacts.id}">Billing</a></td>
    
   </tr>
</c:forEach>
</table>
</body>
</html>
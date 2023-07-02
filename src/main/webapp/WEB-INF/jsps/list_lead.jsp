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
<a href ="Viewcreatepage">new lead</a>
<table>
<tr> 
<th>first name</th>
<th>last name</th>
<th>email</th>
<th>mobile</th>
<th>source</th>


</tr>
<c:forEach var ="lead" items ="${lead}">
   <tr> 
   <td><a><a href="leadinfo?id=${lead.id}">${lead.firstname}</a></td>
   <td>${lead.firstname}</td>
   <td>${lead.lastname}</td>
   <td>${lead.email}</td>
   <td>${lead.mobile}</td>
    <td>${lead.source}</td>
   </tr>
</c:forEach>
</table>
</body>
</html>
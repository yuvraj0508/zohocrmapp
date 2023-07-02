<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file = "menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
create bill
<form action="SaveBill" method = "post">
<pre>
 First name<input type = "text" name = "firstname" value = "${contact.firstname}">
 Last name<input type = "text" name = "lastname"value = "${contact.lastname}">
 email<input type = "text" name = "email"value = "${contact.email}">
 mobile<input type = "text" name = "mobile"value = "${contact.mobile}">
 Product<input type = "text" name = "product">
 Amount<input type = "text" name = "amount">
  
  <input type = "submit" value = "GenerateBill">
</pre>
</form>
</body>
</html>
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
Create New Lead
<form action="save" method = "post">
<pre>
 First name<input type = "text" name = "firstname">
  Last name<input type = "text" name = "lastname">
   email<input type = "text" name = "email">
   mobile<input type = "text" name = "mobile">
  source : 
 <select name="source">
  <option value="radio">radio</option>
  <option value="news paper">news paper</option>
  <option value="news paper">Trade fair</option>
  <option value="media">media</option>
  </select>
  <input type = "submit" value = "save">
</pre>
</form>
</body>
</html>
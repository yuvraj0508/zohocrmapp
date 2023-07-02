<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file = "menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Lead info</h2>

first name:${lead.firstname}
last name:${lead.lastname}<br/>
 email:${lead.email}<br/>
 mobile: ${lead.mobile}<br/>
 source:${lead.source}<br/>
 
</body>
<form action="sendemail" method = "post">
<input type = "hidden" name = "email" value ="${lead.email}">
<input type = "submit" value = "send email">
</form>
<form action ="covertlead" method = "post" >
<input type = "hidden" name = "id" value ="${lead.id}">
<input type = "submit" value = "convert">
</form>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: cyan">
<H3>WELCOME TO EMAIL SERVICE</H3>
<form action="rest/mail" method="post">
<pre><b>
		TO :		<input type="text" name="to" required="required"/>
		SUBJECT :	<input type="text" name="sub" required="required"/>
		TEXT :		<textarea name="text"></textarea>
		 <input type="submit" value="Send Email"/>
</b></pre>
</form>
</body>
</html>
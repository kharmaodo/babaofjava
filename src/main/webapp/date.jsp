<%@page import="java.time.ZoneId" %>
<%@page import="java.time.LocalDate" %>
<html>
<head>
<title>Gestionnaire de Date</title>
</head>
<body>
	<h2>Une date avec du JAVA</h2>
	<p>
		<b>Example pour une date ! </b>
		<%
		
		LocalDate now = LocalDate.now(ZoneId.systemDefault());
		
		%>
	<%=now %>
	</p>
</body>
</html>

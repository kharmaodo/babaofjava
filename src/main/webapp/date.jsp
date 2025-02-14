<html>
<head>
<title>Gestionnaire de Date</title>
</head>
<body>
	<h2>Une date avec du JAVA</h2>
	<p>
		<b>Example pour une date ! </b>
		<%
		
		java.time.Instant now = java.time.Instant.now();
		
		%>
	<%=now %>
	</p>
</body>
</html>

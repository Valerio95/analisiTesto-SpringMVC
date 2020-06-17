<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br> <br>Scegli l'analisi del testo<br> <br>
	<form action="contaP" method="get">
		<input type="hidden" name="testo" value="${testo}">
		
		<input type="submit" value="Conta Parole">
	</form>
	<form action="contaV" method="get">
		<input type="hidden" name="testo" value="${testo}">
		
		<input type="submit" value="Conta Vocali">
	</form>
	<form action="contaC" method="get">
		<input type="hidden" name="testo" value="${testo}">
		
		<input type="submit" value="Conta Consonanti">
	</form>
</body>
</html>
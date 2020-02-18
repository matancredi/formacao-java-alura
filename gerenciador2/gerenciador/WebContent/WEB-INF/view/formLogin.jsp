<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h2> Login</h2>
<p> Faça seu login </p>

    <form action="${linkEntradaServlet}" method="post">

        Login: <input type="text" name="login" style="margin: 5px" />
        <br>
        Senha: <input type="password" name="senha"  style="margin: 5px"/>
        <br>
        <br>
		<input type="hidden" name="acao" value="Login">
        <input type="submit" />
    </form>

</body>
</html>

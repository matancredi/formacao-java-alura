<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem de empresas</title>
</head>
<body>

	<c:if test="${not empty empresa}">
		Empresa ${empresa} cadastrada com sucesso!
	</c:if>
	
	<h1> Listagem de empresas</h1>

    <ul>
       <c:forEach items = "${empresas}" var="empresa">
       	<li> ${empresa.nome} <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
	       	<a href="/gerenciador/removeEmpresa?id=${empresa.id}">remover</a>
	       	<a href="/gerenciador/mostraEmpresa?id=${empresa.id}">alterar</a>
       	</li>
       </c:forEach>
           
           
    </ul>

</body>
</html>
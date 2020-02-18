<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <c:import url="logout-parcial.jsp"/>
    
<!DOCTYPE html>
<head>
<style>
td {width: 20%; }
th {font-weight: bold}
table, .novo {margin-left:10px}
h1 {text-align: center}

</style>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Listagem de empresas</title>
</head>
<body>

Usuario Logado: ${ usuarioLogado.login }

	<c:if test="${not empty empresa}">
		Empresa ${empresa} cadastrada com sucesso!
	</c:if>
	
	<h1> Listagem de empresas</h1>
	<a class = "novo" href="/gerenciador/entrada?acao=NovaEmpresaForm"> <i class="glyphicon glyphicon-plus"></i></a>
	<br>
	<br>
    <table>
    <tr>
    	<th> Nome </th>
    	<th> Data de criação </th>
    	<th> Remover </th>
    	<th> Alterar </th>
    </tr>
           	<tr> 
       <c:forEach items = "${empresas}" var="empresa">

       	<td> ${empresa.nome} </td> 
       	<td> <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> </td>
	    <td> <a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}"><i class="glyphicon glyphicon-remove"></i></a> </td>
	    <td> <a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}"><i class="glyphicon glyphicon-pencil"></i></a> </td>
       	</tr>
       </c:forEach>
       </table>
    

</body>
</html>
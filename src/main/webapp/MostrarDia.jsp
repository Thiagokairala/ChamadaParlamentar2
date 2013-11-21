<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style type="text/css">
		<jsp:include page="FolhaParaHeader.css"/>
		<jsp:include page="FolhaParaTudo.css"/>
		<jsp:include page="FolhaParaBody.css"/>
		<jsp:include page="FolhaParaFooter.css"/>
		<jsp:include page="FolhaParaMostrarDia.css"/>
</style>

<title>Chamada Parlamentar</title>
</head>
<body>
	<div id = "tudo">
	
		<div id = "topo">
			<jsp:include page='Header.html'/>
		</div><!-- Fim da div topo -->
		<h1>DATA: ${dia.data }</h1>
		
		<c:if test="${dia.numeroSessoes ==1 }">
			<h2>Sessão:</h2>
		</c:if>
		<c:if test="${dia.numeroSessoes>1 }">
			<h2>Sessões:</h2>
		</c:if>

		<c:forEach var="sessao" items="${dia.listaSessoes}">
			<td><a href="sessaoPorNome?descricao=${sessao.descricaoCompleta}">
					${sessao.descricao }</a></td>
		</c:forEach>

		<div id="rodape">
			<jsp:include page = 'Footer.html'/>
		</div> <!-- Fim da div rodapé -->
	</div><!--fim da div tudo-->
	
	
</body>
</html>
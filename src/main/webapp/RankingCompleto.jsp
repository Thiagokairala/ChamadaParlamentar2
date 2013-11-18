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
		<jsp:include page="FolhaParaPrincipal.css"/>
		<jsp:include page="FolhaParaBody.css"/>
		<jsp:include page="FolhaParaFooter.css"/>
		<jsp:include page="FolhaParaAuxiliar.css"/>
		<jsp:include page="FolhaParaRankingCompleto.css"/>
		
</style>

<title>Chamada Parlamentar</title>
</head>
<body>
	<div id = "tudo">
	
		<div id = "topo">
			<jsp:include page='Header.html'/>
		</div><!-- Fim da div topo -->
		
		<div id = "titulo">
			</div><!-- fim da id titulo -->
			
			<div id = "principal">
			<h2>Ranking dos Deputados: </h2>
			
			<c:forEach var = "ranking" items = "${ranking.lista }">
				<p>${ranking.nome }: ${ranking.porcentagem }</p>
			</c:forEach>
			</div><!-- fim da id principal -->
			
			<div id = "auxiliar">
			<h1>Deputados com dados não disponíveis:</h1>
			
			<c:forEach var = "naoPossuiDados" items = "${ranking.removidos }">
				<p>${naoPossuiDados.nome } </p>
			</c:forEach>
			</div><!-- fim da div auxiliar -->
		
		<div id="rodape">
			<jsp:include page = 'Footer.html'/>
		</div> <!-- Fim da div rodapé -->
	</div><!--fim da div tudo-->
	
	
</body>
</html>
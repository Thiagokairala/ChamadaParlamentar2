<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href='http://fonts.googleapis.com/css?family=Parisienne'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Kotta One'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Lily Script One'
	rel='stylesheet' type='text/css'>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css" media="all">
<jsp:include page = "FolhaParaTopo.css"/>
<jsp:include page="FolhaParaBody.css"/>
<jsp:include page="FolhaParaTudo.css"/>
<jsp:include page="FolhaParaPrincipal.css"/>
<jsp:include page="FolhaParaAuxiliar.css"/>
<jsp:include page="FolhaParaRodape.css"/>
<jsp:include page="FolhaParaEstatisticas.css"/>
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chamada Parlamentar</title>

</head>

<body>
	<div id="tudo">
		<div id="topo">

			<ul id="navegacao">
				<li><a href="Index.jsp">Home</a></li>
				<li><a href="AcompanharParlamentar.jsp">Acompanhar Parlamentar</a></li>
				<li><a href="AcompanharPartido.jsp">Acompanhar Partido</a></li>
				<li><a href="AcompanharSessao.jsp">Acompanhar Sessao</a></li>
				<li><a href="Ranking.jsp">Rankings Politicos</a></li> 
			</ul>
		</div>
		<!-- fim da div topo -->

		<div id="principal">
			
			<h1>Deputado: </h1>
			<p>${estatistica.nome }</p><br>
			
			<h1>Número de sessões ao qual o deputado compareceu: </h1>
			<p>${estatistica.numeroSessao }</p><br>
			
			<h1>Número total de sessões: </h1>
			<p>${estatistica.totalSessao }</p><br>
			
			<h1>Percentual de preseça: </h1>
			<p>${estatistica.porcentagem }</p><br>
			
			<h1>Sessoes Comparecidas: </h1><br>
			
			<c:forEach var="sessao" items = "${estatistica.lista }">
				<p>${sessao }</p><br><br>
			</c:forEach>

		</div>
		<!-- fim da div principal -->

		<div id="auxiliar"></div>
		<div id="rodape">
			<p>
				<a href="QuemSomos.jsp">Quem Somos</a>
			</p>
		</div>
	</div>
	<!-- fim da div tudo -->

</body>
</html>
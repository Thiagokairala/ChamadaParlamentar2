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
		<jsp:include page="FolhaParaMostrarPartido.css"/>
</style>

<title>Chamada Parlamentar</title>
</head>
<body>
	<div id = "tudo">
	
		<div id = "topo">
			<jsp:include page='Header.html'/>
		</div><!-- Fim da div topo -->
		
		<div id = "arrumar">
		<div id = "principal">
			<h1>${partido.nomePartido } - ${partido.sigla }</h1>
			
			<h2>Presença de seus deputados: ${estatisticaPartido.porcentagem }%</h2>
			
			<c:forEach var = "deputado" items="${partido.estatisticaDosDeputados}">
				<p>${deputado.nome }  -  ${deputado.porcentagem }</p>
			</c:forEach>
		</div><!-- fim da id principal -->
		<div id="semDados">	
			<c:if test="${numeroSemDados > 0 }">
				<h2>deputados Sem Dados disponiveis</h2>
				
				<c:forEach var = "deputado" items="${partido.deputadosSemDados }">
					<p>${deputado.nome }</p>
				</c:forEach>
			</c:if>
	
		</div><!-- fim da div semDados -->
		</div><!-- fim da div arrumar -->
		
		<div id="rodape">
			<jsp:include page = 'Footer.html'/>
		</div> <!-- Fim da div rodapé -->
	</div><!--fim da div tudo-->
	
	
</body>
</html>
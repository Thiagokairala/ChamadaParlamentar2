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
			
			<h1>Sessoes:</h1>
				<c:forEach var = "dia" items = "${dias }">
					<h2>Data: ${dia.data }</h2>
					<c:forEach var = "sessao" items = "${dia.lista }">
						<p>${sessao }</p>
					</c:forEach>
				</c:forEach>
            

		</div><!-- fim da id principal -->
		
		
		</div><!-- fim da div arrumar -->
		<div id="paginas">
			<c:if test="${paginaAtual != 1}">
				<td><a href="acompanharSessao?pagina=${pagina - 1}">Anterior</a></td>
			</c:if>
			
			<c:forEach begin="1" end="${noDePaginas}" var="i">
				<c:choose>
					<c:when test="${paginaAtual eq i}">
						<td>${i}</td>
					</c:when>
					<c:otherwise>
						<td><a href="acompanharSessao?pagina=${i}">${i}</a></td>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			
			<c:if test="${paginaAtual != noDePaginas }">
				<td><a href="acompanharSessao?pagina=${pagina + 1}">Proximo</a></td>
			</c:if>
			
		</div>

		<div id="rodape">
			<jsp:include page = 'Footer.html'/>
		</div> <!-- Fim da div rodapé -->
	</div><!--fim da div tudo-->
	
	
</body>
</html>
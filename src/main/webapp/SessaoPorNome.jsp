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
		<jsp:include page="FolhaParaSessaoPorNome.css"/>
		
</style>

<title>Chamada Parlamentar</title>
</head>
<body>
	<div id = "tudo">
	
		<div id = "topo">
			<jsp:include page='Header.html'/>
		</div><!-- Fim da div topo -->
		
		<h1>${sessao.descricao }</h1>
		<h2>Deputados Presentes:</h2>
		<div id="arrumar">
			<c:forEach var="deputado" items="${sessao.deputadosPresentes }">
				<td><a href="arrumarNome?nome=${deputado }">${deputado}<br>
					<br></a></td>
			</c:forEach>
		</div>
		<!-- fim da div arrumar -->

	</div><!--fim da div tudo-->
	
	<div id="paginas">
			<c:if test="${paginaAtual != 1}">
				<td><a href="sessaoPorNome?pagina=${paginaAtual - 1}&descricao=${sessao.descricao }">Anterior</a></td>
			</c:if>

			<c:forEach begin="1" end="${noDePaginas}" var="i">
				<c:choose>
					<c:when test="${paginaAtual eq i}">
						<td>${i}</td>
					</c:when>
					<c:otherwise>
						<td><a href="sessaoPorNome?pagina=${i}&descricao=${sessao.descricao }">${i}</a></td>
					</c:otherwise>
				</c:choose>
			</c:forEach>

			<c:if test="${paginaAtual != noDePaginas }">
				<td><a href="sessaoPorNome?pagina=${paginaAtual + 1}&descricao=${sessao.descricao }">Proximo</a></td>
			</c:if>

		</div>
		<!-- fim da div paginas -->
		<div id="rodape">
			<jsp:include page = 'Footer.html'/>
		</div> <!-- Fim da div rodapé -->
</body>
</html>
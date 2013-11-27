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

			<div id="autoComplete">
				<form name ="selecaoPartido" id = "selecaoPartido" 
	                                action ="partidoRecebido" method= "POST">
					<input type="text" name="nome" id="nome" list="partido"
						autocomplete="off" />
					
					<datalist id="partido">
						<c:forEach var="Partido" items="${lista}">
							<c:forEach var="partido" items="${Partido }">
								<option value="${partido}">
							</c:forEach>
						</c:forEach> 
					</datalist>
						
					<input type=image src="pesquisa_lupa.png" id="lupa">
				</form>
			</div>


			</div><!-- fim da id principal -->
		
		
		</div><!-- fim da div arrumar -->
		
		<div id="rodape">
			<jsp:include page = 'Footer.html'/>
		</div> <!-- Fim da div rodapé -->
	</div><!--fim da div tudo-->
	
	
</body>
</html>
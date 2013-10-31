<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<link href='http://fonts.googleapis.com/css?family=Parisienne' rel='stylesheet' type='text/css'>    
<link href='http://fonts.googleapis.com/css?family=Kotta One' rel='stylesheet' type='text/css'>    
<link href='http://fonts.googleapis.com/css?family=Lily Script One' rel='stylesheet' type='text/css'>    
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type= "text/css" media = "all">
	<jsp:include page="FolhaParaTopo.css"/>
	<jsp:include page="FolhaParaBody.css"/>
	<jsp:include page="FolhaParaTudo.css"/>
	<jsp:include page="FolhaParaPrincipal.css"/>
	<jsp:include page="FolhaParaAuxiliar.css"/>
	<jsp:include page="FolhaParaRodape.css"/>
</style>
<title>Acompanhar Parlamentar</title>

<jsp:useBean id="service" class="br.com.MDSGPP.ChamadaParlamentar.control.DeputadosControl" />

</head>
<body>

<div id="tudo">
	<div id = "topo">
	<h1>Chamada Parlamentar</h1>
	<ul id="navegacao">
		<li><a href="Index.jsp">Home</a></li>
		<li><a href="AcompanharParlamentar.jsp">Acompanhar Parlamentar</a></li>
		<li><a href="AcompanharPartido.jsp">Acompanhar Partido</a></li>
		<li><a href="AcompanharSessao.jsp">Acompanhar Sessao</a></li>
		<li><a href="Ranking.jsp">Rankings Politicos</a></li> 
	</ul>
	</div><!-- fim da div topo -->
	
	<div id="principal">
		<h1>Escolha seu deputado abaixo: </h1>
		
		<form method="POST" name ="selecaoDeputado" id="selecaoDeputado" 
			action="parlamentarRecebido">
			
			<select name="deputado">				
				<c:forEach var="deputado" items = "${service.deputados }">
					<option value = "${deputado }">${deputado }</option>
				</c:forEach>
			</select>
			<input name="enviar" type="submit" value="Escolhido!">
			
		</form>
	</div><!-- fim da div principal -->	
	<div id="auxiliar">
		
	</div>
	<div id="rodape">
		<p><a href="QuemSomos.jsp">Quem Somos</a></p>
	</div><!-- fim da div rodaPe -->
</div><!-- fim da div tudo -->

</body>
</html>
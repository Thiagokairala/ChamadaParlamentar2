<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<link href='http://fonts.googleapis.com/css?family=Parisienne'	rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Kotta One'	rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Lily Script One'	rel='stylesheet' type='text/css'>

<head>

<style type="text/css" media="all">
<jsp:include page = "FolhaParaTopo.css"/>
<jsp:include page="FolhaParaBody.css"/>
<jsp:include page="FolhaParaTudo.css"/>
<jsp:include page="FolhaParaPrincipal.css"/>
<jsp:include page="FolhaParaAuxiliar.css"/>
<jsp:include page="FolhaParaRodape.css"/>
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
			<h1>A lei dos dados abertos</h1>
			<p>Segundo a definição da Open Knowledge Foundation, em suma
				dados são abertos quando qualquer pessoa pode livremente usá-los,
				reutilizá-los e redistribuí-los, estando sujeito a, no máximo, a
				exigência de creditar a sua autoria e compartilhar a mesma licença.
				Isso Geralmente é satisfeito pela publicação dos dados em formato
				aberto e sob uma licença aberta</p>

			<p>Os dados abertos também são pautados pelas três leis e oito
				princípios</p>

			<p>
				As três leis:<br>O especialista em políticas públicas e
				ativista dos dados abertos David Eaves<br> propôs as seguintes
				"leis"<br> Se o dado não pode ser encontrado e indexado na Web,
				ele não existe<br> Se não estiver aberto e disponível em
				formato compreensível por máquina, <br> ele não pode ser
				reaproveitado; e<br> Se algum dispositivo legal nao permitir
				sua replicação, ele nao é útil<br> As leis foram propostas para
				os Dados Abertos Governamentais, mas<br> pode-se dizer que elas
				se aplicam aos Dados Abertos de forma geral.
			</p>

		</div>
		<!-- fim da div principal -->
		<div id="auxiliar">
			<img src="ImagemParaAuxiliar.jpg" id="imagem" />
		</div>
		<div id="rodape">
			<p>
				<a href="QuemSomos.jsp">Quem Somos</a>
			</p>
		</div>
	</div>
	<!-- fim da div tudo -->

</body>
</html>
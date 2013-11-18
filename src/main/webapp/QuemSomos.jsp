<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style type="text/css">
		<jsp:include page="FolhaParaHeader.css"/>
		<jsp:include page="FolhaParaTudo.css"/>
		<jsp:include page="FolhaParaQuemSomos.css"/>
		<jsp:include page="FolhaParaBody.css"/>
		<jsp:include page="FolhaParaFooter.css"/>
</style>

<title>Chamada Parlamentar</title>
</head>
<body>
	<div id = "tudo">
	
		<div id = "topo">
			<jsp:include page='Header.html'/>
		</div><!-- Fim da div topo -->
		
		<div id = "somos">
			<h1>Quem Somos:</h1>
            <p>Somos estudantes de Engenharia de Software da Universidade de Brasília.
            	<br>Integrantes:<br>
            	<br> <b>Métodos de Desenvolvimento de Software:</b>
            	<br><br>-Thiago Kairala
            	<br>-Eduardo Brasil Martins
            	<br>-Carlos Cruz
            	<br>-Bruno bragança
            	<br>-Rafael Fazzolino P. Barbosa<br>
            	<br> <b>Gestão de Portifólio e Projeto de Software:</b>
            	<br><br>-Thabata Helen
            	<br>-Nilton Araruna
            	<br>-João Guilherme Araruna
            </p>

		</div><!-- fim da id principal -->
		
			
		
		<div id="rodape">
			<jsp:include page = 'Footer.html'/>
		</div> <!-- Fim da div rodapé -->
	</div><!--fim da div tudo-->
	
	
</body>
</html>
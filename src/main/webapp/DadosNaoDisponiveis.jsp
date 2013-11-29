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
                <jsp:include page="FolhaParaAcompanharParlamentar.css"/>
                <jsp:include page="FolhaParaDadosNaoDisponiveis.css"/>
                
</style>

<title>Chamada Parlamentar</title>
</head>
<body>
        <div id = "tudo">
        
                <div id = "topo">
                        <jsp:include page='Header.html'/>
                </div><!-- Fim da div topo -->
                
                <div id = "principal">
               
                </div><!-- fim da id principal -->
                <div id = "mensagem">
                	<h1>Desculpe os dados deste deputado nao estao disponiveis!</h1>
                	<p>Clique <a href="acompanharParlamentar">AQUI </a> para pesquisar outro parlamentar.</p>
                	
                </div><!-- Fim da id mensagem -->
                <div id="rodape">
                        <jsp:include page = 'Footer.html'/>
                </div> <!-- Fim da div rodap� -->
        </div><!--fim da div tudo-->     
</body>
</html>
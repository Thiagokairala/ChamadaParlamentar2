<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
</style>

<title>Chamada Parlamentar</title>
</head>
<body>
        <div id = "tudo">
        
                <div id = "topo">
                        <jsp:include page='Header.html'/>
                </div><!-- Fim da div topo -->
                
                <div id = "pesquisa">
                        
                        <h1>Digite o nome do seu parlamentar:</h1>
        
                <form name ="selecaoDeputado" id = "selecaoDeputado" 
                                action ="parlamentarRecebido" method= "POST">
                                
                        <input type = "text" name= "nome" />
                        <input name="enviar" type = "submit" value = "ENVIAR" />
            </form>

                </div><!-- fim da id principal -->
                
                <div id="rodape">
                        <jsp:include page = 'Footer.html'/>
                </div> <!-- Fim da div rodapé -->
        </div><!--fim da div tudo-->        
</body>
</html>
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
			
			<h1>A lei dos dados abertos</h1>
            <p>Segundo a defini��o da Open Knowledge Foundation, em suma
          	dados s�o abertos quando qualquer pessoa pode livremente us�-los,
            reutiliz�-los e redistribu�-los, estando sujeito a, no m�ximo, a
            exig�ncia de creditar a sua autoria e compartilhar a mesma licen�a.
            Isso Geralmente � satisfeito pela publica��o dos dados em formato
            aberto e sob uma licen�a aberta.</p>

            <p>Os dados abertos tamb�m s�o pautados pelas tr�s leis e oito
            princ�pios.</p>

            <p>
             As tr�s leis:<br>O especialista em pol�ticas p�blicas e
            ativista dos dados abertos David Eaves<br> prop�s as seguintes
            "leis":<br> Se o dado n�o pode ser encontrado e indexado na Web,
            ele n�o existe<br> Se n�o estiver aberto e dispon�vel em
            formato compreens�vel por m�quina, <br> ele n�o pode ser
            reaproveitado; <br> Se algum dispositivo legal nao permitir
            sua replica��o, ele nao � �til<br> As leis foram propostas para
            os Dados Abertos Governamentais, mas<br> pode-se dizer que elas
            se aplicam aos Dados Abertos de forma geral.
            </p>

		</div><!-- fim da id principal -->
		
		<div id = "auxiliar">
				<!--Widget Agencia Camara--><div id="politica">
    				<script src="http://www2.camara.leg.br/camaranoticias/js/widget/agc-widgets_POLITICA.js" type="text/javascript"></script>
    			</div><!--//Widget Agencia Camara-->
				
			    <!--Widget Agencia Camara--><div id = "noticias">
    				<script src="http://www2.camara.leg.br/camaranoticias/js/widget/agc-widgets.js" type="text/javascript"></script>
    			</div><!--//Widget Agencia Camara-->			
		</div>
		</div><!-- fim da div arrumar -->
		
		<div id="rodape">
			<jsp:include page = 'Footer.html'/>
		</div> <!-- Fim da div rodap� -->
	</div><!--fim da div tudo-->
	
	
</body>
</html>
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
		
		<div id = "principal">
			
			<h1>A lei dos dados abertos</h1>
            <p>Segundo a definição da Open Knowledge Foundation, em suma
          	dados são abertos quando qualquer pessoa pode livremente usá-los,
            reutilizá-los e redistribuí-los, estando sujeito a, no máximo, a
            exigência de creditar a sua autoria e compartilhar a mesma licença.
            Isso Geralmente é satisfeito pela publicação dos dados em formato
            aberto e sob uma licença aberta.</p>

            <p>Os dados abertos também são pautados pelas três leis e oito
            princípios.</p>

            <p>
             As três leis:<br>O especialista em políticas públicas e
            ativista dos dados abertos David Eaves<br> propôs as seguintes
            "leis":<br> Se o dado não pode ser encontrado e indexado na Web,
            ele não existe<br> Se não estiver aberto e disponível em
            formato compreensível por máquina, <br> ele não pode ser
            reaproveitado; <br> Se algum dispositivo legal nao permitir
            sua replicação, ele nao é útil<br> As leis foram propostas para
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
		
		<div id="rodape">
			<jsp:include page = 'Footer.html'/>
		</div> <!-- Fim da div rodapé -->
	</div><!--fim da div tudo-->
	
	
</body>
</html>
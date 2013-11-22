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
		<jsp:include page="FolhaParaQuemSomos.css"/>
		<jsp:include page="FolhaParaBody.css"/>
		<jsp:include page="FolhaParaFooter.css"/>
		<jsp:include page="FolhaParaMostrarEstatisticaDeputado.css"/>
		
</style>

<title>Chamada Parlamentar</title>

</head>
<body>
	<div id = "tudo">
	
		<div id = "topo">
			<jsp:include page='Header.html'/>
		</div><!-- Fim da div topo -->
		
		<div id = "dados">
			<h1>Nome: ${estatistica.nome }</h1>
	
	  		<h2><b>Sessoes assistidas:</b></h2> <p>${estatistica.numeroSessao }</p>

			<h2><b>Sessoes totais:</b></h2> <p>${estatistica.totalSessao }</p>

			<h2><b>Porcentagem:</b></h2> <p>${estatistica.porcentagem }</p>

			<h2><b>Sessoes:</b></h2>  
			<p><c:forEach var= "sessao" items = "${estatistica.lista }">
				<td><a href = "sessaoPorNome?descricao=${sessao}">
						${sessao }</a></td><br><br>
			</c:forEach>
		</div><!-- fim da id principal -->
		
		<div id="novoDeputado">
			<form name ="selecaoDeputado" id = "selecaoDeputado" 
                                action ="segundoParlamentar?primeiroParlamentar=${estatistica.nome }" method= "POST">
                                
                        <input type = "text" name= "nome" id="nome" list = "deputados" autocomplete= "off"/>
                        <datalist id = "deputados" >
                        	<c:forEach var = "deputado" items = "${lista}">
                        		<option value = "${deputado}">
                        	</c:forEach> 
                        </datalist>
                        
                      <input type=image src="pesquisa_lupa.png" id = "lupa"> 
            </form>
		</div><!-- fim da div novoDeputado -->
		
		<div id="rodape">
			<jsp:include page = 'Footer.html'/>
		</div> <!-- Fim da div rodapé -->
	</div><!--fim da div tudo-->
	
	
</body>
</html>
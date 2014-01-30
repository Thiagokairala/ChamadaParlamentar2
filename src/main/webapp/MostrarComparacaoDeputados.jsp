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
                <jsp:include page="FolhaParaBody.css"/>
                <jsp:include page="FolhaParaFooter.css"/>
                <jsp:include page="FolhaParaMostrarComparacaoDeputados.css"/>
</style>

<script type="text/javascript" src = "jquery.js"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>

<script>
$(function () {
    $('#grafico').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: 'Compara��o dos deputados'
        },
        xAxis: {
            categories: [
                '${estatisticaPrimeiro.nome}',
                '${estatisticaSegundo.nome}',
                'Total',
            ]
        },
        yAxis: {
            min: 0,
            title: {
                text: 'Porcentagem de Presen�a'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} %</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0
            }
        },
        series: [{
            name: '${estatisticaPrimeiro.nome}',
            data: [${presencaPrimeiro}]

        }, {
            name: '${estatisticaSegundo.nome}',
            data: [${presencaSegundo}]

        }, {
            name: 'Total',
            data: [100]
        }]
    });
});
</script>


<title>Chamada Parlamentar</title>
</head>
<body>
	<div id="tudo">

		<div id="topo">
			<jsp:include page='Header.html' />
		</div>
		<!-- Fim da div topo -->
		
		<div id="grafico">
		</div>

		<div id="alinahr">
			<div id="primeiro">
				<h1>Nome: ${estatisticaPrimeiro.nome }</h1>

				<h2>
					<b>Sessoes assistidas:</b>
				</h2>
				<p>${estatisticaPrimeiro.numeroSessao }</p>

				<h2>
					<b>Sessoes totais:</b>
				</h2>
				<p>${estatisticaPrimeiro.totalSessao }</p>

				<h2>
					<b>Porcentagem:</b>
				</h2>
				<p>${estatisticaPrimeiro.porcentagem }</p>

				<h2>
					<b>Sessoes:</b>
				</h2>

				<c:forEach var="sessao" items="${estatisticaPrimeiro.lista }">
					<td><a href="sessaoPorNome?descricao=${sessao}"> ${sessao }</a></td>
					<br>
					<br>
				</c:forEach>
			</div>
			<!-- fim da div primeiro -->

			<div id="segundo">
				<h1>Nome: ${estatisticaSegundo.nome }</h1>

				<h2>
					<b>Sessoes assistidas:</b>
				</h2>
				<p>${estatisticaSegundo.numeroSessao }</p>

				<h2>
					<b>Sessoes totais:</b>
				</h2>
				<p>${estatisticaSegundo.totalSessao }</p>

				<h2>
					<b>Porcentagem:</b>
				</h2>
				<p>${estatisticaSegundo.porcentagem }</p>

				<h2>
					<b>Sessoes:</b>
				</h2>

				<c:forEach var="sessao" items="${estatisticaSegundo.lista }">
					<td><a href="sessaoPorNome?descricao=${sessao}"> ${sessao }</a></td>
					<br>
					<br>
				</c:forEach>

			</div>
			<!-- fim da div segundo -->
		</div>
		<!-- fim da div alinhar -->



		<div id="rodape">
		<jsp:include page='Footer.html' />
	</div>
	<!-- Fim da div rodap� -->
	</div>
	<!--fim da div tudo-->
</body>
</html>
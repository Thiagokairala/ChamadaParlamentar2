/**
 * SessoesReunioesSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.SessoesReunioes;

public interface SessoesReunioesSoap extends java.rmi.Remote {
    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarSituacoesReuniaoSessaoResponseListarSituacoesReuniaoSessaoResult listarSituacoesReuniaoSessao() throws java.rmi.RemoteException;
    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarPresencasParlamentarResponseListarPresencasParlamentarResult listarPresencasParlamentar(java.lang.String dataIni, java.lang.String dataFim, java.lang.String numMatriculaParlamentar) throws java.rmi.RemoteException;
    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarDiscursosPlenarioResponseListarDiscursosPlenarioResult listarDiscursosPlenario(java.lang.String dataIni, java.lang.String dataFim, java.lang.String codigoSessao, java.lang.String parteNomeParlamentar, java.lang.String siglaPartido, java.lang.String siglaUF) throws java.rmi.RemoteException;
    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult obterInteiroTeorDiscursosPlenario(java.lang.String codSessao, java.lang.String numOrador, java.lang.String numQuarto, java.lang.String numInsercao) throws java.rmi.RemoteException;
    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarPresencasDiaResponseListarPresencasDiaResult listarPresencasDia(java.lang.String data, java.lang.String numMatriculaParlamentar, java.lang.String siglaPartido, java.lang.String siglaUF) throws java.rmi.RemoteException;
}

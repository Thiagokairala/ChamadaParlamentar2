/**
 * DeputadosSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.Deputados;

public interface DeputadosSoap extends java.rmi.Remote {
    public br.gov.camara.www.SitCamaraWS.Deputados.ObterDeputadosResponseObterDeputadosResult obterDeputados() throws java.rmi.RemoteException;
    public br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult obterPartidosCD() throws java.rmi.RemoteException;
    public br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponseObterPartidosBlocoCDResult obterPartidosBlocoCD(java.lang.String idBloco, java.lang.String numLegislatura) throws java.rmi.RemoteException;
    public br.gov.camara.www.SitCamaraWS.Deputados.ObterDetalhesDeputadoResponseObterDetalhesDeputadoResult obterDetalhesDeputado(java.lang.String ideCadastro, java.lang.String numLegislatura) throws java.rmi.RemoteException;
    public br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponseObterLideresBancadasResult obterLideresBancadas() throws java.rmi.RemoteException;
}

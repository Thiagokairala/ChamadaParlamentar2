/**
 * Deputados.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.Deputados;

public interface Deputados extends javax.xml.rpc.Service {
    public java.lang.String getDeputadosSoapAddress();

    public br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoap getDeputadosSoap() throws javax.xml.rpc.ServiceException;

    public br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoap getDeputadosSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

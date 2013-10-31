/**
 * SessoesReunioesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.SessoesReunioes;

public class SessoesReunioesLocator extends org.apache.axis.client.Service implements br.gov.camara.www.SitCamaraWS.SessoesReunioes.SessoesReunioes {

    public SessoesReunioesLocator() {
    }


    public SessoesReunioesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SessoesReunioesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SessoesReunioesSoap
    private java.lang.String SessoesReunioesSoap_address = "http://www.camara.gov.br/SitCamaraWS/SessoesReunioes.asmx";

    public java.lang.String getSessoesReunioesSoapAddress() {
        return SessoesReunioesSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SessoesReunioesSoapWSDDServiceName = "SessoesReunioesSoap";

    public java.lang.String getSessoesReunioesSoapWSDDServiceName() {
        return SessoesReunioesSoapWSDDServiceName;
    }

    public void setSessoesReunioesSoapWSDDServiceName(java.lang.String name) {
        SessoesReunioesSoapWSDDServiceName = name;
    }

    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.SessoesReunioesSoap getSessoesReunioesSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SessoesReunioesSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSessoesReunioesSoap(endpoint);
    }

    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.SessoesReunioesSoap getSessoesReunioesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.gov.camara.www.SitCamaraWS.SessoesReunioes.SessoesReunioesSoapStub _stub = new br.gov.camara.www.SitCamaraWS.SessoesReunioes.SessoesReunioesSoapStub(portAddress, this);
            _stub.setPortName(getSessoesReunioesSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSessoesReunioesSoapEndpointAddress(java.lang.String address) {
        SessoesReunioesSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.gov.camara.www.SitCamaraWS.SessoesReunioes.SessoesReunioesSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.gov.camara.www.SitCamaraWS.SessoesReunioes.SessoesReunioesSoapStub _stub = new br.gov.camara.www.SitCamaraWS.SessoesReunioes.SessoesReunioesSoapStub(new java.net.URL(SessoesReunioesSoap_address), this);
                _stub.setPortName(getSessoesReunioesSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SessoesReunioesSoap".equals(inputPortName)) {
            return getSessoesReunioesSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "SessoesReunioes");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "SessoesReunioesSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SessoesReunioesSoap".equals(portName)) {
            setSessoesReunioesSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

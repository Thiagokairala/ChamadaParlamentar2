/**
 * DeputadosLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.Deputados;

public class DeputadosLocator extends org.apache.axis.client.Service implements br.gov.camara.www.SitCamaraWS.Deputados.Deputados {

    public DeputadosLocator() {
    }


    public DeputadosLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DeputadosLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DeputadosSoap
    private java.lang.String DeputadosSoap_address = "http://www.camara.gov.br/SitCamaraWS/Deputados.asmx";

    public java.lang.String getDeputadosSoapAddress() {
        return DeputadosSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DeputadosSoapWSDDServiceName = "DeputadosSoap";

    public java.lang.String getDeputadosSoapWSDDServiceName() {
        return DeputadosSoapWSDDServiceName;
    }

    public void setDeputadosSoapWSDDServiceName(java.lang.String name) {
        DeputadosSoapWSDDServiceName = name;
    }

    public br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoap getDeputadosSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DeputadosSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDeputadosSoap(endpoint);
    }

    public br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoap getDeputadosSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoapStub _stub = new br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoapStub(portAddress, this);
            _stub.setPortName(getDeputadosSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDeputadosSoapEndpointAddress(java.lang.String address) {
        DeputadosSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoapStub _stub = new br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoapStub(new java.net.URL(DeputadosSoap_address), this);
                _stub.setPortName(getDeputadosSoapWSDDServiceName());
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
        if ("DeputadosSoap".equals(inputPortName)) {
            return getDeputadosSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "Deputados");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "DeputadosSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DeputadosSoap".equals(portName)) {
            setDeputadosSoapEndpointAddress(address);
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

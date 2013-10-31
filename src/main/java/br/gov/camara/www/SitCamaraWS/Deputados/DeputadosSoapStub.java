/**
 * DeputadosSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.Deputados;

public class DeputadosSoapStub extends org.apache.axis.client.Stub implements br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObterDeputados");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">>ObterDeputadosResponse>ObterDeputadosResult"));
        oper.setReturnClass(br.gov.camara.www.SitCamaraWS.Deputados.ObterDeputadosResponseObterDeputadosResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ObterDeputadosResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObterPartidosCD");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">>ObterPartidosCDResponse>ObterPartidosCDResult"));
        oper.setReturnClass(br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ObterPartidosCDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObterPartidosBlocoCD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "idBloco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "numLegislatura"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">>ObterPartidosBlocoCDResponse>ObterPartidosBlocoCDResult"));
        oper.setReturnClass(br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponseObterPartidosBlocoCDResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ObterPartidosBlocoCDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObterDetalhesDeputado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ideCadastro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "numLegislatura"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">>ObterDetalhesDeputadoResponse>ObterDetalhesDeputadoResult"));
        oper.setReturnClass(br.gov.camara.www.SitCamaraWS.Deputados.ObterDetalhesDeputadoResponseObterDetalhesDeputadoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ObterDetalhesDeputadoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObterLideresBancadas");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">>ObterLideresBancadasResponse>ObterLideresBancadasResult"));
        oper.setReturnClass(br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponseObterLideresBancadasResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ObterLideresBancadasResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public DeputadosSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DeputadosSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DeputadosSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">>ObterDeputadosResponse>ObterDeputadosResult");
            cachedSerQNames.add(qName);
            cls = br.gov.camara.www.SitCamaraWS.Deputados.ObterDeputadosResponseObterDeputadosResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">>ObterDetalhesDeputadoResponse>ObterDetalhesDeputadoResult");
            cachedSerQNames.add(qName);
            cls = br.gov.camara.www.SitCamaraWS.Deputados.ObterDetalhesDeputadoResponseObterDetalhesDeputadoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">>ObterLideresBancadasResponse>ObterLideresBancadasResult");
            cachedSerQNames.add(qName);
            cls = br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponseObterLideresBancadasResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">>ObterPartidosBlocoCDResponse>ObterPartidosBlocoCDResult");
            cachedSerQNames.add(qName);
            cls = br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponseObterPartidosBlocoCDResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">>ObterPartidosCDResponse>ObterPartidosCDResult");
            cachedSerQNames.add(qName);
            cls = br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">ObterDetalhesDeputado");
            cachedSerQNames.add(qName);
            cls = br.gov.camara.www.SitCamaraWS.Deputados.ObterDetalhesDeputado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">ObterDetalhesDeputadoResponse");
            cachedSerQNames.add(qName);
            cls = br.gov.camara.www.SitCamaraWS.Deputados.ObterDetalhesDeputadoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">ObterLideresBancadas");
            cachedSerQNames.add(qName);
            cls = br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">ObterLideresBancadasResponse");
            cachedSerQNames.add(qName);
            cls = br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">ObterPartidosBlocoCD");
            cachedSerQNames.add(qName);
            cls = br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">ObterPartidosBlocoCDResponse");
            cachedSerQNames.add(qName);
            cls = br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">ObterPartidosCD");
            cachedSerQNames.add(qName);
            cls = br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">ObterPartidosCDResponse");
            cachedSerQNames.add(qName);
            cls = br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.gov.camara.www.SitCamaraWS.Deputados.ObterDeputadosResponseObterDeputadosResult obterDeputados() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.camara.gov.br/SitCamaraWS/Deputados/ObterDeputados");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ObterDeputados"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.camara.www.SitCamaraWS.Deputados.ObterDeputadosResponseObterDeputadosResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.camara.www.SitCamaraWS.Deputados.ObterDeputadosResponseObterDeputadosResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.camara.www.SitCamaraWS.Deputados.ObterDeputadosResponseObterDeputadosResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult obterPartidosCD() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.camara.gov.br/SitCamaraWS/Deputados/ObterPartidosCD");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ObterPartidosCD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponseObterPartidosBlocoCDResult obterPartidosBlocoCD(java.lang.String idBloco, java.lang.String numLegislatura) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.camara.gov.br/SitCamaraWS/Deputados/ObterPartidosBlocoCD");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ObterPartidosBlocoCD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idBloco, numLegislatura});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponseObterPartidosBlocoCDResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponseObterPartidosBlocoCDResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponseObterPartidosBlocoCDResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.camara.www.SitCamaraWS.Deputados.ObterDetalhesDeputadoResponseObterDetalhesDeputadoResult obterDetalhesDeputado(java.lang.String ideCadastro, java.lang.String numLegislatura) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.camara.gov.br/SitCamaraWS/Deputados/ObterDetalhesDeputado");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ObterDetalhesDeputado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ideCadastro, numLegislatura});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.camara.www.SitCamaraWS.Deputados.ObterDetalhesDeputadoResponseObterDetalhesDeputadoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.camara.www.SitCamaraWS.Deputados.ObterDetalhesDeputadoResponseObterDetalhesDeputadoResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.camara.www.SitCamaraWS.Deputados.ObterDetalhesDeputadoResponseObterDetalhesDeputadoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponseObterLideresBancadasResult obterLideresBancadas() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.camara.gov.br/SitCamaraWS/Deputados/ObterLideresBancadas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ObterLideresBancadas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponseObterLideresBancadasResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponseObterLideresBancadasResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponseObterLideresBancadasResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

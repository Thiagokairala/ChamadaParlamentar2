package br.gov.camara.www.SitCamaraWS.Deputados;

public class DeputadosSoapProxy implements br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoap {
  private String _endpoint = null;
  private br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoap deputadosSoap = null;
  
  public DeputadosSoapProxy() {
    _initDeputadosSoapProxy();
  }
  
  public DeputadosSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initDeputadosSoapProxy();
  }
  
  private void _initDeputadosSoapProxy() {
    try {
      deputadosSoap = (new br.gov.camara.www.SitCamaraWS.Deputados.DeputadosLocator()).getDeputadosSoap();
      if (deputadosSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)deputadosSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)deputadosSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (deputadosSoap != null)
      ((javax.xml.rpc.Stub)deputadosSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoap getDeputadosSoap() {
    if (deputadosSoap == null)
      _initDeputadosSoapProxy();
    return deputadosSoap;
  }
  
  public br.gov.camara.www.SitCamaraWS.Deputados.ObterDeputadosResponseObterDeputadosResult obterDeputados() throws java.rmi.RemoteException{
    if (deputadosSoap == null)
      _initDeputadosSoapProxy();
    return deputadosSoap.obterDeputados();
  }
  
  public br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult obterPartidosCD() throws java.rmi.RemoteException{
    if (deputadosSoap == null)
      _initDeputadosSoapProxy();
    return deputadosSoap.obterPartidosCD();
  }
  
  public br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponseObterPartidosBlocoCDResult obterPartidosBlocoCD(java.lang.String idBloco, java.lang.String numLegislatura) throws java.rmi.RemoteException{
    if (deputadosSoap == null)
      _initDeputadosSoapProxy();
    return deputadosSoap.obterPartidosBlocoCD(idBloco, numLegislatura);
  }
  
  public br.gov.camara.www.SitCamaraWS.Deputados.ObterDetalhesDeputadoResponseObterDetalhesDeputadoResult obterDetalhesDeputado(java.lang.String ideCadastro, java.lang.String numLegislatura) throws java.rmi.RemoteException{
    if (deputadosSoap == null)
      _initDeputadosSoapProxy();
    return deputadosSoap.obterDetalhesDeputado(ideCadastro, numLegislatura);
  }
  
  public br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponseObterLideresBancadasResult obterLideresBancadas() throws java.rmi.RemoteException{
    if (deputadosSoap == null)
      _initDeputadosSoapProxy();
    return deputadosSoap.obterLideresBancadas();
  }
  
  
}
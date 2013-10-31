/**
 * ObterPartidosBlocoCDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.Deputados;

public class ObterPartidosBlocoCDResponse  implements java.io.Serializable {
    private br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponseObterPartidosBlocoCDResult obterPartidosBlocoCDResult;

    public ObterPartidosBlocoCDResponse() {
    }

    public ObterPartidosBlocoCDResponse(
           br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponseObterPartidosBlocoCDResult obterPartidosBlocoCDResult) {
           this.obterPartidosBlocoCDResult = obterPartidosBlocoCDResult;
    }


    /**
     * Gets the obterPartidosBlocoCDResult value for this ObterPartidosBlocoCDResponse.
     * 
     * @return obterPartidosBlocoCDResult
     */
    public br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponseObterPartidosBlocoCDResult getObterPartidosBlocoCDResult() {
        return obterPartidosBlocoCDResult;
    }


    /**
     * Sets the obterPartidosBlocoCDResult value for this ObterPartidosBlocoCDResponse.
     * 
     * @param obterPartidosBlocoCDResult
     */
    public void setObterPartidosBlocoCDResult(br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponseObterPartidosBlocoCDResult obterPartidosBlocoCDResult) {
        this.obterPartidosBlocoCDResult = obterPartidosBlocoCDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObterPartidosBlocoCDResponse)) return false;
        ObterPartidosBlocoCDResponse other = (ObterPartidosBlocoCDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.obterPartidosBlocoCDResult==null && other.getObterPartidosBlocoCDResult()==null) || 
             (this.obterPartidosBlocoCDResult!=null &&
              this.obterPartidosBlocoCDResult.equals(other.getObterPartidosBlocoCDResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getObterPartidosBlocoCDResult() != null) {
            _hashCode += getObterPartidosBlocoCDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObterPartidosBlocoCDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">ObterPartidosBlocoCDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obterPartidosBlocoCDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ObterPartidosBlocoCDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">>ObterPartidosBlocoCDResponse>ObterPartidosBlocoCDResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

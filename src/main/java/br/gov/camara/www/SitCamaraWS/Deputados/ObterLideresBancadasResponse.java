/**
 * ObterLideresBancadasResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.Deputados;

public class ObterLideresBancadasResponse  implements java.io.Serializable {
    private br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponseObterLideresBancadasResult obterLideresBancadasResult;

    public ObterLideresBancadasResponse() {
    }

    public ObterLideresBancadasResponse(
           br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponseObterLideresBancadasResult obterLideresBancadasResult) {
           this.obterLideresBancadasResult = obterLideresBancadasResult;
    }


    /**
     * Gets the obterLideresBancadasResult value for this ObterLideresBancadasResponse.
     * 
     * @return obterLideresBancadasResult
     */
    public br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponseObterLideresBancadasResult getObterLideresBancadasResult() {
        return obterLideresBancadasResult;
    }


    /**
     * Sets the obterLideresBancadasResult value for this ObterLideresBancadasResponse.
     * 
     * @param obterLideresBancadasResult
     */
    public void setObterLideresBancadasResult(br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponseObterLideresBancadasResult obterLideresBancadasResult) {
        this.obterLideresBancadasResult = obterLideresBancadasResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObterLideresBancadasResponse)) return false;
        ObterLideresBancadasResponse other = (ObterLideresBancadasResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.obterLideresBancadasResult==null && other.getObterLideresBancadasResult()==null) || 
             (this.obterLideresBancadasResult!=null &&
              this.obterLideresBancadasResult.equals(other.getObterLideresBancadasResult())));
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
        if (getObterLideresBancadasResult() != null) {
            _hashCode += getObterLideresBancadasResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObterLideresBancadasResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">ObterLideresBancadasResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obterLideresBancadasResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ObterLideresBancadasResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">>ObterLideresBancadasResponse>ObterLideresBancadasResult"));
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

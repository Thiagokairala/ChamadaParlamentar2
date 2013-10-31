/**
 * ListarPresencasParlamentarResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.SessoesReunioes;

public class ListarPresencasParlamentarResponse  implements java.io.Serializable {
    private br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarPresencasParlamentarResponseListarPresencasParlamentarResult listarPresencasParlamentarResult;

    public ListarPresencasParlamentarResponse() {
    }

    public ListarPresencasParlamentarResponse(
           br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarPresencasParlamentarResponseListarPresencasParlamentarResult listarPresencasParlamentarResult) {
           this.listarPresencasParlamentarResult = listarPresencasParlamentarResult;
    }


    /**
     * Gets the listarPresencasParlamentarResult value for this ListarPresencasParlamentarResponse.
     * 
     * @return listarPresencasParlamentarResult
     */
    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarPresencasParlamentarResponseListarPresencasParlamentarResult getListarPresencasParlamentarResult() {
        return listarPresencasParlamentarResult;
    }


    /**
     * Sets the listarPresencasParlamentarResult value for this ListarPresencasParlamentarResponse.
     * 
     * @param listarPresencasParlamentarResult
     */
    public void setListarPresencasParlamentarResult(br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarPresencasParlamentarResponseListarPresencasParlamentarResult listarPresencasParlamentarResult) {
        this.listarPresencasParlamentarResult = listarPresencasParlamentarResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarPresencasParlamentarResponse)) return false;
        ListarPresencasParlamentarResponse other = (ListarPresencasParlamentarResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listarPresencasParlamentarResult==null && other.getListarPresencasParlamentarResult()==null) || 
             (this.listarPresencasParlamentarResult!=null &&
              this.listarPresencasParlamentarResult.equals(other.getListarPresencasParlamentarResult())));
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
        if (getListarPresencasParlamentarResult() != null) {
            _hashCode += getListarPresencasParlamentarResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarPresencasParlamentarResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", ">ListarPresencasParlamentarResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listarPresencasParlamentarResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "ListarPresencasParlamentarResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", ">>ListarPresencasParlamentarResponse>ListarPresencasParlamentarResult"));
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

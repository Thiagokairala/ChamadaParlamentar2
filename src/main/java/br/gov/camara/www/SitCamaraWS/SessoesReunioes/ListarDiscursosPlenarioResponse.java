/**
 * ListarDiscursosPlenarioResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.SessoesReunioes;

public class ListarDiscursosPlenarioResponse  implements java.io.Serializable {
    private br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarDiscursosPlenarioResponseListarDiscursosPlenarioResult listarDiscursosPlenarioResult;

    public ListarDiscursosPlenarioResponse() {
    }

    public ListarDiscursosPlenarioResponse(
           br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarDiscursosPlenarioResponseListarDiscursosPlenarioResult listarDiscursosPlenarioResult) {
           this.listarDiscursosPlenarioResult = listarDiscursosPlenarioResult;
    }


    /**
     * Gets the listarDiscursosPlenarioResult value for this ListarDiscursosPlenarioResponse.
     * 
     * @return listarDiscursosPlenarioResult
     */
    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarDiscursosPlenarioResponseListarDiscursosPlenarioResult getListarDiscursosPlenarioResult() {
        return listarDiscursosPlenarioResult;
    }


    /**
     * Sets the listarDiscursosPlenarioResult value for this ListarDiscursosPlenarioResponse.
     * 
     * @param listarDiscursosPlenarioResult
     */
    public void setListarDiscursosPlenarioResult(br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarDiscursosPlenarioResponseListarDiscursosPlenarioResult listarDiscursosPlenarioResult) {
        this.listarDiscursosPlenarioResult = listarDiscursosPlenarioResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarDiscursosPlenarioResponse)) return false;
        ListarDiscursosPlenarioResponse other = (ListarDiscursosPlenarioResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listarDiscursosPlenarioResult==null && other.getListarDiscursosPlenarioResult()==null) || 
             (this.listarDiscursosPlenarioResult!=null &&
              this.listarDiscursosPlenarioResult.equals(other.getListarDiscursosPlenarioResult())));
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
        if (getListarDiscursosPlenarioResult() != null) {
            _hashCode += getListarDiscursosPlenarioResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarDiscursosPlenarioResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", ">ListarDiscursosPlenarioResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listarDiscursosPlenarioResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "ListarDiscursosPlenarioResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", ">>ListarDiscursosPlenarioResponse>ListarDiscursosPlenarioResult"));
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

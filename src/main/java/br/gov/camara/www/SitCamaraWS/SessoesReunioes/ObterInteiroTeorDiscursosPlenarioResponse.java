/**
 * ObterInteiroTeorDiscursosPlenarioResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.SessoesReunioes;

public class ObterInteiroTeorDiscursosPlenarioResponse  implements java.io.Serializable {
    private br.gov.camara.www.SitCamaraWS.SessoesReunioes.ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult obterInteiroTeorDiscursosPlenarioResult;

    public ObterInteiroTeorDiscursosPlenarioResponse() {
    }

    public ObterInteiroTeorDiscursosPlenarioResponse(
           br.gov.camara.www.SitCamaraWS.SessoesReunioes.ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult obterInteiroTeorDiscursosPlenarioResult) {
           this.obterInteiroTeorDiscursosPlenarioResult = obterInteiroTeorDiscursosPlenarioResult;
    }


    /**
     * Gets the obterInteiroTeorDiscursosPlenarioResult value for this ObterInteiroTeorDiscursosPlenarioResponse.
     * 
     * @return obterInteiroTeorDiscursosPlenarioResult
     */
    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult getObterInteiroTeorDiscursosPlenarioResult() {
        return obterInteiroTeorDiscursosPlenarioResult;
    }


    /**
     * Sets the obterInteiroTeorDiscursosPlenarioResult value for this ObterInteiroTeorDiscursosPlenarioResponse.
     * 
     * @param obterInteiroTeorDiscursosPlenarioResult
     */
    public void setObterInteiroTeorDiscursosPlenarioResult(br.gov.camara.www.SitCamaraWS.SessoesReunioes.ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult obterInteiroTeorDiscursosPlenarioResult) {
        this.obterInteiroTeorDiscursosPlenarioResult = obterInteiroTeorDiscursosPlenarioResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObterInteiroTeorDiscursosPlenarioResponse)) return false;
        ObterInteiroTeorDiscursosPlenarioResponse other = (ObterInteiroTeorDiscursosPlenarioResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.obterInteiroTeorDiscursosPlenarioResult==null && other.getObterInteiroTeorDiscursosPlenarioResult()==null) || 
             (this.obterInteiroTeorDiscursosPlenarioResult!=null &&
              this.obterInteiroTeorDiscursosPlenarioResult.equals(other.getObterInteiroTeorDiscursosPlenarioResult())));
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
        if (getObterInteiroTeorDiscursosPlenarioResult() != null) {
            _hashCode += getObterInteiroTeorDiscursosPlenarioResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObterInteiroTeorDiscursosPlenarioResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", ">obterInteiroTeorDiscursosPlenarioResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obterInteiroTeorDiscursosPlenarioResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "obterInteiroTeorDiscursosPlenarioResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", ">>obterInteiroTeorDiscursosPlenarioResponse>obterInteiroTeorDiscursosPlenarioResult"));
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

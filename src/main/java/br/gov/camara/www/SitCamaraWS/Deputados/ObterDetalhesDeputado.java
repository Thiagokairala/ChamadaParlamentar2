/**
 * ObterDetalhesDeputado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.Deputados;

public class ObterDetalhesDeputado  implements java.io.Serializable {
    private java.lang.String ideCadastro;

    private java.lang.String numLegislatura;

    public ObterDetalhesDeputado() {
    }

    public ObterDetalhesDeputado(
           java.lang.String ideCadastro,
           java.lang.String numLegislatura) {
           this.ideCadastro = ideCadastro;
           this.numLegislatura = numLegislatura;
    }


    /**
     * Gets the ideCadastro value for this ObterDetalhesDeputado.
     * 
     * @return ideCadastro
     */
    public java.lang.String getIdeCadastro() {
        return ideCadastro;
    }


    /**
     * Sets the ideCadastro value for this ObterDetalhesDeputado.
     * 
     * @param ideCadastro
     */
    public void setIdeCadastro(java.lang.String ideCadastro) {
        this.ideCadastro = ideCadastro;
    }


    /**
     * Gets the numLegislatura value for this ObterDetalhesDeputado.
     * 
     * @return numLegislatura
     */
    public java.lang.String getNumLegislatura() {
        return numLegislatura;
    }


    /**
     * Sets the numLegislatura value for this ObterDetalhesDeputado.
     * 
     * @param numLegislatura
     */
    public void setNumLegislatura(java.lang.String numLegislatura) {
        this.numLegislatura = numLegislatura;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObterDetalhesDeputado)) return false;
        ObterDetalhesDeputado other = (ObterDetalhesDeputado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ideCadastro==null && other.getIdeCadastro()==null) || 
             (this.ideCadastro!=null &&
              this.ideCadastro.equals(other.getIdeCadastro()))) &&
            ((this.numLegislatura==null && other.getNumLegislatura()==null) || 
             (this.numLegislatura!=null &&
              this.numLegislatura.equals(other.getNumLegislatura())));
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
        if (getIdeCadastro() != null) {
            _hashCode += getIdeCadastro().hashCode();
        }
        if (getNumLegislatura() != null) {
            _hashCode += getNumLegislatura().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObterDetalhesDeputado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">ObterDetalhesDeputado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ideCadastro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "ideCadastro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numLegislatura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "numLegislatura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

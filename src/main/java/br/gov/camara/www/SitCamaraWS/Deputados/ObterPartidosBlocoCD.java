/**
 * ObterPartidosBlocoCD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.Deputados;

public class ObterPartidosBlocoCD  implements java.io.Serializable {
    private java.lang.String idBloco;

    private java.lang.String numLegislatura;

    public ObterPartidosBlocoCD() {
    }

    public ObterPartidosBlocoCD(
           java.lang.String idBloco,
           java.lang.String numLegislatura) {
           this.idBloco = idBloco;
           this.numLegislatura = numLegislatura;
    }


    /**
     * Gets the idBloco value for this ObterPartidosBlocoCD.
     * 
     * @return idBloco
     */
    public java.lang.String getIdBloco() {
        return idBloco;
    }


    /**
     * Sets the idBloco value for this ObterPartidosBlocoCD.
     * 
     * @param idBloco
     */
    public void setIdBloco(java.lang.String idBloco) {
        this.idBloco = idBloco;
    }


    /**
     * Gets the numLegislatura value for this ObterPartidosBlocoCD.
     * 
     * @return numLegislatura
     */
    public java.lang.String getNumLegislatura() {
        return numLegislatura;
    }


    /**
     * Sets the numLegislatura value for this ObterPartidosBlocoCD.
     * 
     * @param numLegislatura
     */
    public void setNumLegislatura(java.lang.String numLegislatura) {
        this.numLegislatura = numLegislatura;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObterPartidosBlocoCD)) return false;
        ObterPartidosBlocoCD other = (ObterPartidosBlocoCD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idBloco==null && other.getIdBloco()==null) || 
             (this.idBloco!=null &&
              this.idBloco.equals(other.getIdBloco()))) &&
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
        if (getIdBloco() != null) {
            _hashCode += getIdBloco().hashCode();
        }
        if (getNumLegislatura() != null) {
            _hashCode += getNumLegislatura().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObterPartidosBlocoCD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", ">ObterPartidosBlocoCD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idBloco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/Deputados", "idBloco"));
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

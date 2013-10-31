/**
 * ListarPresencasDia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.SessoesReunioes;

public class ListarPresencasDia  implements java.io.Serializable {
    private java.lang.String data;

    private java.lang.String numMatriculaParlamentar;

    private java.lang.String siglaPartido;

    private java.lang.String siglaUF;

    public ListarPresencasDia() {
    }

    public ListarPresencasDia(
           java.lang.String data,
           java.lang.String numMatriculaParlamentar,
           java.lang.String siglaPartido,
           java.lang.String siglaUF) {
           this.data = data;
           this.numMatriculaParlamentar = numMatriculaParlamentar;
           this.siglaPartido = siglaPartido;
           this.siglaUF = siglaUF;
    }


    /**
     * Gets the data value for this ListarPresencasDia.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this ListarPresencasDia.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the numMatriculaParlamentar value for this ListarPresencasDia.
     * 
     * @return numMatriculaParlamentar
     */
    public java.lang.String getNumMatriculaParlamentar() {
        return numMatriculaParlamentar;
    }


    /**
     * Sets the numMatriculaParlamentar value for this ListarPresencasDia.
     * 
     * @param numMatriculaParlamentar
     */
    public void setNumMatriculaParlamentar(java.lang.String numMatriculaParlamentar) {
        this.numMatriculaParlamentar = numMatriculaParlamentar;
    }


    /**
     * Gets the siglaPartido value for this ListarPresencasDia.
     * 
     * @return siglaPartido
     */
    public java.lang.String getSiglaPartido() {
        return siglaPartido;
    }


    /**
     * Sets the siglaPartido value for this ListarPresencasDia.
     * 
     * @param siglaPartido
     */
    public void setSiglaPartido(java.lang.String siglaPartido) {
        this.siglaPartido = siglaPartido;
    }


    /**
     * Gets the siglaUF value for this ListarPresencasDia.
     * 
     * @return siglaUF
     */
    public java.lang.String getSiglaUF() {
        return siglaUF;
    }


    /**
     * Sets the siglaUF value for this ListarPresencasDia.
     * 
     * @param siglaUF
     */
    public void setSiglaUF(java.lang.String siglaUF) {
        this.siglaUF = siglaUF;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarPresencasDia)) return false;
        ListarPresencasDia other = (ListarPresencasDia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.numMatriculaParlamentar==null && other.getNumMatriculaParlamentar()==null) || 
             (this.numMatriculaParlamentar!=null &&
              this.numMatriculaParlamentar.equals(other.getNumMatriculaParlamentar()))) &&
            ((this.siglaPartido==null && other.getSiglaPartido()==null) || 
             (this.siglaPartido!=null &&
              this.siglaPartido.equals(other.getSiglaPartido()))) &&
            ((this.siglaUF==null && other.getSiglaUF()==null) || 
             (this.siglaUF!=null &&
              this.siglaUF.equals(other.getSiglaUF())));
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
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getNumMatriculaParlamentar() != null) {
            _hashCode += getNumMatriculaParlamentar().hashCode();
        }
        if (getSiglaPartido() != null) {
            _hashCode += getSiglaPartido().hashCode();
        }
        if (getSiglaUF() != null) {
            _hashCode += getSiglaUF().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarPresencasDia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", ">ListarPresencasDia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numMatriculaParlamentar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "numMatriculaParlamentar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaPartido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "siglaPartido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaUF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "siglaUF"));
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

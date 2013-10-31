/**
 * ObterInteiroTeorDiscursosPlenario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.SessoesReunioes;

public class ObterInteiroTeorDiscursosPlenario  implements java.io.Serializable {
    private java.lang.String codSessao;

    private java.lang.String numOrador;

    private java.lang.String numQuarto;

    private java.lang.String numInsercao;

    public ObterInteiroTeorDiscursosPlenario() {
    }

    public ObterInteiroTeorDiscursosPlenario(
           java.lang.String codSessao,
           java.lang.String numOrador,
           java.lang.String numQuarto,
           java.lang.String numInsercao) {
           this.codSessao = codSessao;
           this.numOrador = numOrador;
           this.numQuarto = numQuarto;
           this.numInsercao = numInsercao;
    }


    /**
     * Gets the codSessao value for this ObterInteiroTeorDiscursosPlenario.
     * 
     * @return codSessao
     */
    public java.lang.String getCodSessao() {
        return codSessao;
    }


    /**
     * Sets the codSessao value for this ObterInteiroTeorDiscursosPlenario.
     * 
     * @param codSessao
     */
    public void setCodSessao(java.lang.String codSessao) {
        this.codSessao = codSessao;
    }


    /**
     * Gets the numOrador value for this ObterInteiroTeorDiscursosPlenario.
     * 
     * @return numOrador
     */
    public java.lang.String getNumOrador() {
        return numOrador;
    }


    /**
     * Sets the numOrador value for this ObterInteiroTeorDiscursosPlenario.
     * 
     * @param numOrador
     */
    public void setNumOrador(java.lang.String numOrador) {
        this.numOrador = numOrador;
    }


    /**
     * Gets the numQuarto value for this ObterInteiroTeorDiscursosPlenario.
     * 
     * @return numQuarto
     */
    public java.lang.String getNumQuarto() {
        return numQuarto;
    }


    /**
     * Sets the numQuarto value for this ObterInteiroTeorDiscursosPlenario.
     * 
     * @param numQuarto
     */
    public void setNumQuarto(java.lang.String numQuarto) {
        this.numQuarto = numQuarto;
    }


    /**
     * Gets the numInsercao value for this ObterInteiroTeorDiscursosPlenario.
     * 
     * @return numInsercao
     */
    public java.lang.String getNumInsercao() {
        return numInsercao;
    }


    /**
     * Sets the numInsercao value for this ObterInteiroTeorDiscursosPlenario.
     * 
     * @param numInsercao
     */
    public void setNumInsercao(java.lang.String numInsercao) {
        this.numInsercao = numInsercao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObterInteiroTeorDiscursosPlenario)) return false;
        ObterInteiroTeorDiscursosPlenario other = (ObterInteiroTeorDiscursosPlenario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codSessao==null && other.getCodSessao()==null) || 
             (this.codSessao!=null &&
              this.codSessao.equals(other.getCodSessao()))) &&
            ((this.numOrador==null && other.getNumOrador()==null) || 
             (this.numOrador!=null &&
              this.numOrador.equals(other.getNumOrador()))) &&
            ((this.numQuarto==null && other.getNumQuarto()==null) || 
             (this.numQuarto!=null &&
              this.numQuarto.equals(other.getNumQuarto()))) &&
            ((this.numInsercao==null && other.getNumInsercao()==null) || 
             (this.numInsercao!=null &&
              this.numInsercao.equals(other.getNumInsercao())));
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
        if (getCodSessao() != null) {
            _hashCode += getCodSessao().hashCode();
        }
        if (getNumOrador() != null) {
            _hashCode += getNumOrador().hashCode();
        }
        if (getNumQuarto() != null) {
            _hashCode += getNumQuarto().hashCode();
        }
        if (getNumInsercao() != null) {
            _hashCode += getNumInsercao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObterInteiroTeorDiscursosPlenario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", ">obterInteiroTeorDiscursosPlenario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codSessao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "codSessao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOrador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "numOrador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numQuarto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "numQuarto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numInsercao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "numInsercao"));
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

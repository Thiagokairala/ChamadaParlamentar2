/**
 * ListarDiscursosPlenario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.camara.www.SitCamaraWS.SessoesReunioes;

public class ListarDiscursosPlenario  implements java.io.Serializable {
    private java.lang.String dataIni;

    private java.lang.String dataFim;

    private java.lang.String codigoSessao;

    private java.lang.String parteNomeParlamentar;

    private java.lang.String siglaPartido;

    private java.lang.String siglaUF;

    public ListarDiscursosPlenario() {
    }

    public ListarDiscursosPlenario(
           java.lang.String dataIni,
           java.lang.String dataFim,
           java.lang.String codigoSessao,
           java.lang.String parteNomeParlamentar,
           java.lang.String siglaPartido,
           java.lang.String siglaUF) {
           this.dataIni = dataIni;
           this.dataFim = dataFim;
           this.codigoSessao = codigoSessao;
           this.parteNomeParlamentar = parteNomeParlamentar;
           this.siglaPartido = siglaPartido;
           this.siglaUF = siglaUF;
    }


    /**
     * Gets the dataIni value for this ListarDiscursosPlenario.
     * 
     * @return dataIni
     */
    public java.lang.String getDataIni() {
        return dataIni;
    }


    /**
     * Sets the dataIni value for this ListarDiscursosPlenario.
     * 
     * @param dataIni
     */
    public void setDataIni(java.lang.String dataIni) {
        this.dataIni = dataIni;
    }


    /**
     * Gets the dataFim value for this ListarDiscursosPlenario.
     * 
     * @return dataFim
     */
    public java.lang.String getDataFim() {
        return dataFim;
    }


    /**
     * Sets the dataFim value for this ListarDiscursosPlenario.
     * 
     * @param dataFim
     */
    public void setDataFim(java.lang.String dataFim) {
        this.dataFim = dataFim;
    }


    /**
     * Gets the codigoSessao value for this ListarDiscursosPlenario.
     * 
     * @return codigoSessao
     */
    public java.lang.String getCodigoSessao() {
        return codigoSessao;
    }


    /**
     * Sets the codigoSessao value for this ListarDiscursosPlenario.
     * 
     * @param codigoSessao
     */
    public void setCodigoSessao(java.lang.String codigoSessao) {
        this.codigoSessao = codigoSessao;
    }


    /**
     * Gets the parteNomeParlamentar value for this ListarDiscursosPlenario.
     * 
     * @return parteNomeParlamentar
     */
    public java.lang.String getParteNomeParlamentar() {
        return parteNomeParlamentar;
    }


    /**
     * Sets the parteNomeParlamentar value for this ListarDiscursosPlenario.
     * 
     * @param parteNomeParlamentar
     */
    public void setParteNomeParlamentar(java.lang.String parteNomeParlamentar) {
        this.parteNomeParlamentar = parteNomeParlamentar;
    }


    /**
     * Gets the siglaPartido value for this ListarDiscursosPlenario.
     * 
     * @return siglaPartido
     */
    public java.lang.String getSiglaPartido() {
        return siglaPartido;
    }


    /**
     * Sets the siglaPartido value for this ListarDiscursosPlenario.
     * 
     * @param siglaPartido
     */
    public void setSiglaPartido(java.lang.String siglaPartido) {
        this.siglaPartido = siglaPartido;
    }


    /**
     * Gets the siglaUF value for this ListarDiscursosPlenario.
     * 
     * @return siglaUF
     */
    public java.lang.String getSiglaUF() {
        return siglaUF;
    }


    /**
     * Sets the siglaUF value for this ListarDiscursosPlenario.
     * 
     * @param siglaUF
     */
    public void setSiglaUF(java.lang.String siglaUF) {
        this.siglaUF = siglaUF;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarDiscursosPlenario)) return false;
        ListarDiscursosPlenario other = (ListarDiscursosPlenario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataIni==null && other.getDataIni()==null) || 
             (this.dataIni!=null &&
              this.dataIni.equals(other.getDataIni()))) &&
            ((this.dataFim==null && other.getDataFim()==null) || 
             (this.dataFim!=null &&
              this.dataFim.equals(other.getDataFim()))) &&
            ((this.codigoSessao==null && other.getCodigoSessao()==null) || 
             (this.codigoSessao!=null &&
              this.codigoSessao.equals(other.getCodigoSessao()))) &&
            ((this.parteNomeParlamentar==null && other.getParteNomeParlamentar()==null) || 
             (this.parteNomeParlamentar!=null &&
              this.parteNomeParlamentar.equals(other.getParteNomeParlamentar()))) &&
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
        if (getDataIni() != null) {
            _hashCode += getDataIni().hashCode();
        }
        if (getDataFim() != null) {
            _hashCode += getDataFim().hashCode();
        }
        if (getCodigoSessao() != null) {
            _hashCode += getCodigoSessao().hashCode();
        }
        if (getParteNomeParlamentar() != null) {
            _hashCode += getParteNomeParlamentar().hashCode();
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
        new org.apache.axis.description.TypeDesc(ListarDiscursosPlenario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", ">ListarDiscursosPlenario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataIni");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "dataIni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "dataFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSessao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "codigoSessao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parteNomeParlamentar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", "parteNomeParlamentar"));
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

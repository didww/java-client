/**
 * TollFreeRatesIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.didww;

public class TollFreeRatesIn  implements java.io.Serializable {
    private java.lang.String src_prefix;

    private java.lang.String dst_prefix;

    private float rate;

    private float connect_fee;

    private java.math.BigInteger reject_calls;

    public TollFreeRatesIn() {
    }

    public TollFreeRatesIn(
           java.lang.String src_prefix,
           java.lang.String dst_prefix,
           float rate,
           float connect_fee,
           java.math.BigInteger reject_calls) {
           this.src_prefix = src_prefix;
           this.dst_prefix = dst_prefix;
           this.rate = rate;
           this.connect_fee = connect_fee;
           this.reject_calls = reject_calls;
    }


    /**
     * Gets the src_prefix value for this TollFreeRatesIn.
     * 
     * @return src_prefix
     */
    public java.lang.String getSrc_prefix() {
        return src_prefix;
    }


    /**
     * Sets the src_prefix value for this TollFreeRatesIn.
     * 
     * @param src_prefix
     */
    public void setSrc_prefix(java.lang.String src_prefix) {
        this.src_prefix = src_prefix;
    }


    /**
     * Gets the dst_prefix value for this TollFreeRatesIn.
     * 
     * @return dst_prefix
     */
    public java.lang.String getDst_prefix() {
        return dst_prefix;
    }


    /**
     * Sets the dst_prefix value for this TollFreeRatesIn.
     * 
     * @param dst_prefix
     */
    public void setDst_prefix(java.lang.String dst_prefix) {
        this.dst_prefix = dst_prefix;
    }


    /**
     * Gets the rate value for this TollFreeRatesIn.
     * 
     * @return rate
     */
    public float getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this TollFreeRatesIn.
     * 
     * @param rate
     */
    public void setRate(float rate) {
        this.rate = rate;
    }


    /**
     * Gets the connect_fee value for this TollFreeRatesIn.
     * 
     * @return connect_fee
     */
    public float getConnect_fee() {
        return connect_fee;
    }


    /**
     * Sets the connect_fee value for this TollFreeRatesIn.
     * 
     * @param connect_fee
     */
    public void setConnect_fee(float connect_fee) {
        this.connect_fee = connect_fee;
    }


    /**
     * Gets the reject_calls value for this TollFreeRatesIn.
     * 
     * @return reject_calls
     */
    public java.math.BigInteger getReject_calls() {
        return reject_calls;
    }


    /**
     * Sets the reject_calls value for this TollFreeRatesIn.
     * 
     * @param reject_calls
     */
    public void setReject_calls(java.math.BigInteger reject_calls) {
        this.reject_calls = reject_calls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TollFreeRatesIn)) return false;
        TollFreeRatesIn other = (TollFreeRatesIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.src_prefix==null && other.getSrc_prefix()==null) || 
             (this.src_prefix!=null &&
              this.src_prefix.equals(other.getSrc_prefix()))) &&
            ((this.dst_prefix==null && other.getDst_prefix()==null) || 
             (this.dst_prefix!=null &&
              this.dst_prefix.equals(other.getDst_prefix()))) &&
            this.rate == other.getRate() &&
            this.connect_fee == other.getConnect_fee() &&
            ((this.reject_calls==null && other.getReject_calls()==null) || 
             (this.reject_calls!=null &&
              this.reject_calls.equals(other.getReject_calls())));
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
        if (getSrc_prefix() != null) {
            _hashCode += getSrc_prefix().hashCode();
        }
        if (getDst_prefix() != null) {
            _hashCode += getDst_prefix().hashCode();
        }
        _hashCode += new Float(getRate()).hashCode();
        _hashCode += new Float(getConnect_fee()).hashCode();
        if (getReject_calls() != null) {
            _hashCode += getReject_calls().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TollFreeRatesIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:didww", "TollFreeRatesIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("src_prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "src_prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dst_prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dst_prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connect_fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connect_fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reject_calls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reject_calls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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

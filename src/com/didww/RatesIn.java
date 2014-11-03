/**
 * RatesIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.didww;

public class RatesIn  implements java.io.Serializable {
    private java.lang.String network_prefix;

    private java.lang.String sell_rate;

    public RatesIn() {
    }

    public RatesIn(
           java.lang.String network_prefix,
           java.lang.String sell_rate) {
           this.network_prefix = network_prefix;
           this.sell_rate = sell_rate;
    }


    /**
     * Gets the network_prefix value for this RatesIn.
     * 
     * @return network_prefix
     */
    public java.lang.String getNetwork_prefix() {
        return network_prefix;
    }


    /**
     * Sets the network_prefix value for this RatesIn.
     * 
     * @param network_prefix
     */
    public void setNetwork_prefix(java.lang.String network_prefix) {
        this.network_prefix = network_prefix;
    }


    /**
     * Gets the sell_rate value for this RatesIn.
     * 
     * @return sell_rate
     */
    public java.lang.String getSell_rate() {
        return sell_rate;
    }


    /**
     * Sets the sell_rate value for this RatesIn.
     * 
     * @param sell_rate
     */
    public void setSell_rate(java.lang.String sell_rate) {
        this.sell_rate = sell_rate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RatesIn)) return false;
        RatesIn other = (RatesIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.network_prefix==null && other.getNetwork_prefix()==null) || 
             (this.network_prefix!=null &&
              this.network_prefix.equals(other.getNetwork_prefix()))) &&
            ((this.sell_rate==null && other.getSell_rate()==null) || 
             (this.sell_rate!=null &&
              this.sell_rate.equals(other.getSell_rate())));
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
        if (getNetwork_prefix() != null) {
            _hashCode += getNetwork_prefix().hashCode();
        }
        if (getSell_rate() != null) {
            _hashCode += getSell_rate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RatesIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:didww", "RatesIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network_prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "network_prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sell_rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell_rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

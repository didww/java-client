/**
 * Country.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.didww;

public class Country  implements java.io.Serializable {
    private java.lang.String country_name;

    private java.lang.String country_prefix;

    private java.lang.String country_iso;

    public Country() {
    }

    public Country(
           java.lang.String country_name,
           java.lang.String country_prefix,
           java.lang.String country_iso) {
           this.country_name = country_name;
           this.country_prefix = country_prefix;
           this.country_iso = country_iso;
    }


    /**
     * Gets the country_name value for this Country.
     * 
     * @return country_name
     */
    public java.lang.String getCountry_name() {
        return country_name;
    }


    /**
     * Sets the country_name value for this Country.
     * 
     * @param country_name
     */
    public void setCountry_name(java.lang.String country_name) {
        this.country_name = country_name;
    }


    /**
     * Gets the country_prefix value for this Country.
     * 
     * @return country_prefix
     */
    public java.lang.String getCountry_prefix() {
        return country_prefix;
    }


    /**
     * Sets the country_prefix value for this Country.
     * 
     * @param country_prefix
     */
    public void setCountry_prefix(java.lang.String country_prefix) {
        this.country_prefix = country_prefix;
    }


    /**
     * Gets the country_iso value for this Country.
     * 
     * @return country_iso
     */
    public java.lang.String getCountry_iso() {
        return country_iso;
    }


    /**
     * Sets the country_iso value for this Country.
     * 
     * @param country_iso
     */
    public void setCountry_iso(java.lang.String country_iso) {
        this.country_iso = country_iso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Country)) return false;
        Country other = (Country) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country_name==null && other.getCountry_name()==null) || 
             (this.country_name!=null &&
              this.country_name.equals(other.getCountry_name()))) &&
            ((this.country_prefix==null && other.getCountry_prefix()==null) || 
             (this.country_prefix!=null &&
              this.country_prefix.equals(other.getCountry_prefix()))) &&
            ((this.country_iso==null && other.getCountry_iso()==null) || 
             (this.country_iso!=null &&
              this.country_iso.equals(other.getCountry_iso())));
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
        if (getCountry_name() != null) {
            _hashCode += getCountry_name().hashCode();
        }
        if (getCountry_prefix() != null) {
            _hashCode += getCountry_prefix().hashCode();
        }
        if (getCountry_iso() != null) {
            _hashCode += getCountry_iso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Country.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:didww", "Country"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_iso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_iso"));
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

/**
 * City.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.didww;

public class City  implements java.io.Serializable {
    private java.lang.String city_id;

    private java.lang.String city_name;

    private java.lang.String city_prefix;

    private java.lang.String city_nxx_prefix;

    private java.lang.String setup;

    private java.lang.String monthly;

    private int isavailable;

    private int islnrrequired;

    public City() {
    }

    public City(
           java.lang.String city_id,
           java.lang.String city_name,
           java.lang.String city_prefix,
           java.lang.String city_nxx_prefix,
           java.lang.String setup,
           java.lang.String monthly,
           int isavailable,
           int islnrrequired) {
           this.city_id = city_id;
           this.city_name = city_name;
           this.city_prefix = city_prefix;
           this.city_nxx_prefix = city_nxx_prefix;
           this.setup = setup;
           this.monthly = monthly;
           this.isavailable = isavailable;
           this.islnrrequired = islnrrequired;
    }


    /**
     * Gets the city_id value for this City.
     * 
     * @return city_id
     */
    public java.lang.String getCity_id() {
        return city_id;
    }


    /**
     * Sets the city_id value for this City.
     * 
     * @param city_id
     */
    public void setCity_id(java.lang.String city_id) {
        this.city_id = city_id;
    }


    /**
     * Gets the city_name value for this City.
     * 
     * @return city_name
     */
    public java.lang.String getCity_name() {
        return city_name;
    }


    /**
     * Sets the city_name value for this City.
     * 
     * @param city_name
     */
    public void setCity_name(java.lang.String city_name) {
        this.city_name = city_name;
    }


    /**
     * Gets the city_prefix value for this City.
     * 
     * @return city_prefix
     */
    public java.lang.String getCity_prefix() {
        return city_prefix;
    }


    /**
     * Sets the city_prefix value for this City.
     * 
     * @param city_prefix
     */
    public void setCity_prefix(java.lang.String city_prefix) {
        this.city_prefix = city_prefix;
    }


    /**
     * Gets the city_nxx_prefix value for this City.
     * 
     * @return city_nxx_prefix
     */
    public java.lang.String getCity_nxx_prefix() {
        return city_nxx_prefix;
    }


    /**
     * Sets the city_nxx_prefix value for this City.
     * 
     * @param city_nxx_prefix
     */
    public void setCity_nxx_prefix(java.lang.String city_nxx_prefix) {
        this.city_nxx_prefix = city_nxx_prefix;
    }


    /**
     * Gets the setup value for this City.
     * 
     * @return setup
     */
    public java.lang.String getSetup() {
        return setup;
    }


    /**
     * Sets the setup value for this City.
     * 
     * @param setup
     */
    public void setSetup(java.lang.String setup) {
        this.setup = setup;
    }


    /**
     * Gets the monthly value for this City.
     * 
     * @return monthly
     */
    public java.lang.String getMonthly() {
        return monthly;
    }


    /**
     * Sets the monthly value for this City.
     * 
     * @param monthly
     */
    public void setMonthly(java.lang.String monthly) {
        this.monthly = monthly;
    }


    /**
     * Gets the isavailable value for this City.
     * 
     * @return isavailable
     */
    public int getIsavailable() {
        return isavailable;
    }


    /**
     * Sets the isavailable value for this City.
     * 
     * @param isavailable
     */
    public void setIsavailable(int isavailable) {
        this.isavailable = isavailable;
    }


    /**
     * Gets the islnrrequired value for this City.
     * 
     * @return islnrrequired
     */
    public int getIslnrrequired() {
        return islnrrequired;
    }


    /**
     * Sets the islnrrequired value for this City.
     * 
     * @param islnrrequired
     */
    public void setIslnrrequired(int islnrrequired) {
        this.islnrrequired = islnrrequired;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof City)) return false;
        City other = (City) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.city_id==null && other.getCity_id()==null) || 
             (this.city_id!=null &&
              this.city_id.equals(other.getCity_id()))) &&
            ((this.city_name==null && other.getCity_name()==null) || 
             (this.city_name!=null &&
              this.city_name.equals(other.getCity_name()))) &&
            ((this.city_prefix==null && other.getCity_prefix()==null) || 
             (this.city_prefix!=null &&
              this.city_prefix.equals(other.getCity_prefix()))) &&
            ((this.city_nxx_prefix==null && other.getCity_nxx_prefix()==null) || 
             (this.city_nxx_prefix!=null &&
              this.city_nxx_prefix.equals(other.getCity_nxx_prefix()))) &&
            ((this.setup==null && other.getSetup()==null) || 
             (this.setup!=null &&
              this.setup.equals(other.getSetup()))) &&
            ((this.monthly==null && other.getMonthly()==null) || 
             (this.monthly!=null &&
              this.monthly.equals(other.getMonthly()))) &&
            this.isavailable == other.getIsavailable() &&
            this.islnrrequired == other.getIslnrrequired();
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
        if (getCity_id() != null) {
            _hashCode += getCity_id().hashCode();
        }
        if (getCity_name() != null) {
            _hashCode += getCity_name().hashCode();
        }
        if (getCity_prefix() != null) {
            _hashCode += getCity_prefix().hashCode();
        }
        if (getCity_nxx_prefix() != null) {
            _hashCode += getCity_nxx_prefix().hashCode();
        }
        if (getSetup() != null) {
            _hashCode += getSetup().hashCode();
        }
        if (getMonthly() != null) {
            _hashCode += getMonthly().hashCode();
        }
        _hashCode += getIsavailable();
        _hashCode += getIslnrrequired();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(City.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:didww", "City"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city_prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city_prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city_nxx_prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city_nxx_prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "setup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isavailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isavailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("islnrrequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "islnrrequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

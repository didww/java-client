/**
 * DID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.didww;

public class DID  implements java.io.Serializable {
    private int did_id;

    private java.lang.String did_number;

    public DID() {
    }

    public DID(
           int did_id,
           java.lang.String did_number) {
           this.did_id = did_id;
           this.did_number = did_number;
    }


    /**
     * Gets the did_id value for this DID.
     * 
     * @return did_id
     */
    public int getDid_id() {
        return did_id;
    }


    /**
     * Sets the did_id value for this DID.
     * 
     * @param did_id
     */
    public void setDid_id(int did_id) {
        this.did_id = did_id;
    }


    /**
     * Gets the did_number value for this DID.
     * 
     * @return did_number
     */
    public java.lang.String getDid_number() {
        return did_number;
    }


    /**
     * Sets the did_number value for this DID.
     * 
     * @param did_number
     */
    public void setDid_number(java.lang.String did_number) {
        this.did_number = did_number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DID)) return false;
        DID other = (DID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.did_id == other.getDid_id() &&
            ((this.did_number==null && other.getDid_number()==null) || 
             (this.did_number!=null &&
              this.did_number.equals(other.getDid_number())));
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
        _hashCode += getDid_id();
        if (getDid_number() != null) {
            _hashCode += getDid_number().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:didww", "DID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("did_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "did_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("did_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "did_number"));
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

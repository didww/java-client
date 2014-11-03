/**
 * CDRPage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.didww;

public class CDRPage  implements java.io.Serializable {
    private com.didww.CDRNew[] cdrs;

    private com.didww.Page pagination;

    public CDRPage() {
    }

    public CDRPage(
           com.didww.CDRNew[] cdrs,
           com.didww.Page pagination) {
           this.cdrs = cdrs;
           this.pagination = pagination;
    }


    /**
     * Gets the cdrs value for this CDRPage.
     * 
     * @return cdrs
     */
    public com.didww.CDRNew[] getCdrs() {
        return cdrs;
    }


    /**
     * Sets the cdrs value for this CDRPage.
     * 
     * @param cdrs
     */
    public void setCdrs(com.didww.CDRNew[] cdrs) {
        this.cdrs = cdrs;
    }


    /**
     * Gets the pagination value for this CDRPage.
     * 
     * @return pagination
     */
    public com.didww.Page getPagination() {
        return pagination;
    }


    /**
     * Sets the pagination value for this CDRPage.
     * 
     * @param pagination
     */
    public void setPagination(com.didww.Page pagination) {
        this.pagination = pagination;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDRPage)) return false;
        CDRPage other = (CDRPage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdrs==null && other.getCdrs()==null) || 
             (this.cdrs!=null &&
              java.util.Arrays.equals(this.cdrs, other.getCdrs()))) &&
            ((this.pagination==null && other.getPagination()==null) || 
             (this.pagination!=null &&
              this.pagination.equals(other.getPagination())));
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
        if (getCdrs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCdrs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCdrs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPagination() != null) {
            _hashCode += getPagination().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDRPage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:didww", "CDRPage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdrs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:didww", "CDRNew"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pagination"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:didww", "Page"));
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

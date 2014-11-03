/**
 * Prepaid_data.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.didww;

public class Prepaid_data  implements java.io.Serializable {
    private int result;

    private java.lang.String error;

    private java.lang.String prepaid_balance;

    private java.lang.String customer_id;

    private java.lang.String prepaid_balance_amount;

    public Prepaid_data() {
    }

    public Prepaid_data(
           int result,
           java.lang.String error,
           java.lang.String prepaid_balance,
           java.lang.String customer_id,
           java.lang.String prepaid_balance_amount) {
           this.result = result;
           this.error = error;
           this.prepaid_balance = prepaid_balance;
           this.customer_id = customer_id;
           this.prepaid_balance_amount = prepaid_balance_amount;
    }


    /**
     * Gets the result value for this Prepaid_data.
     * 
     * @return result
     */
    public int getResult() {
        return result;
    }


    /**
     * Sets the result value for this Prepaid_data.
     * 
     * @param result
     */
    public void setResult(int result) {
        this.result = result;
    }


    /**
     * Gets the error value for this Prepaid_data.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this Prepaid_data.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the prepaid_balance value for this Prepaid_data.
     * 
     * @return prepaid_balance
     */
    public java.lang.String getPrepaid_balance() {
        return prepaid_balance;
    }


    /**
     * Sets the prepaid_balance value for this Prepaid_data.
     * 
     * @param prepaid_balance
     */
    public void setPrepaid_balance(java.lang.String prepaid_balance) {
        this.prepaid_balance = prepaid_balance;
    }


    /**
     * Gets the customer_id value for this Prepaid_data.
     * 
     * @return customer_id
     */
    public java.lang.String getCustomer_id() {
        return customer_id;
    }


    /**
     * Sets the customer_id value for this Prepaid_data.
     * 
     * @param customer_id
     */
    public void setCustomer_id(java.lang.String customer_id) {
        this.customer_id = customer_id;
    }


    /**
     * Gets the prepaid_balance_amount value for this Prepaid_data.
     * 
     * @return prepaid_balance_amount
     */
    public java.lang.String getPrepaid_balance_amount() {
        return prepaid_balance_amount;
    }


    /**
     * Sets the prepaid_balance_amount value for this Prepaid_data.
     * 
     * @param prepaid_balance_amount
     */
    public void setPrepaid_balance_amount(java.lang.String prepaid_balance_amount) {
        this.prepaid_balance_amount = prepaid_balance_amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Prepaid_data)) return false;
        Prepaid_data other = (Prepaid_data) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.result == other.getResult() &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.prepaid_balance==null && other.getPrepaid_balance()==null) || 
             (this.prepaid_balance!=null &&
              this.prepaid_balance.equals(other.getPrepaid_balance()))) &&
            ((this.customer_id==null && other.getCustomer_id()==null) || 
             (this.customer_id!=null &&
              this.customer_id.equals(other.getCustomer_id()))) &&
            ((this.prepaid_balance_amount==null && other.getPrepaid_balance_amount()==null) || 
             (this.prepaid_balance_amount!=null &&
              this.prepaid_balance_amount.equals(other.getPrepaid_balance_amount())));
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
        _hashCode += getResult();
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getPrepaid_balance() != null) {
            _hashCode += getPrepaid_balance().hashCode();
        }
        if (getCustomer_id() != null) {
            _hashCode += getCustomer_id().hashCode();
        }
        if (getPrepaid_balance_amount() != null) {
            _hashCode += getPrepaid_balance_amount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Prepaid_data.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:didww", "prepaid_data"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaid_balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prepaid_balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaid_balance_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prepaid_balance_amount"));
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

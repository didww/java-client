/**
 * Api_didwwdata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.didww;

public class Api_didwwdata  implements java.io.Serializable {
    private int result;

    private java.lang.String error;

    private java.lang.String api_version;

    private java.lang.String reseller_did_pricelist;

    private java.lang.String reseller_pstn_tariff;

    private int reseller_id;

    private java.lang.String reseller_balance;

    private java.lang.String reseller_balance_status;

    public Api_didwwdata() {
    }

    public Api_didwwdata(
           int result,
           java.lang.String error,
           java.lang.String api_version,
           java.lang.String reseller_did_pricelist,
           java.lang.String reseller_pstn_tariff,
           int reseller_id,
           java.lang.String reseller_balance,
           java.lang.String reseller_balance_status) {
           this.result = result;
           this.error = error;
           this.api_version = api_version;
           this.reseller_did_pricelist = reseller_did_pricelist;
           this.reseller_pstn_tariff = reseller_pstn_tariff;
           this.reseller_id = reseller_id;
           this.reseller_balance = reseller_balance;
           this.reseller_balance_status = reseller_balance_status;
    }


    /**
     * Gets the result value for this Api_didwwdata.
     * 
     * @return result
     */
    public int getResult() {
        return result;
    }


    /**
     * Sets the result value for this Api_didwwdata.
     * 
     * @param result
     */
    public void setResult(int result) {
        this.result = result;
    }


    /**
     * Gets the error value for this Api_didwwdata.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this Api_didwwdata.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the api_version value for this Api_didwwdata.
     * 
     * @return api_version
     */
    public java.lang.String getApi_version() {
        return api_version;
    }


    /**
     * Sets the api_version value for this Api_didwwdata.
     * 
     * @param api_version
     */
    public void setApi_version(java.lang.String api_version) {
        this.api_version = api_version;
    }


    /**
     * Gets the reseller_did_pricelist value for this Api_didwwdata.
     * 
     * @return reseller_did_pricelist
     */
    public java.lang.String getReseller_did_pricelist() {
        return reseller_did_pricelist;
    }


    /**
     * Sets the reseller_did_pricelist value for this Api_didwwdata.
     * 
     * @param reseller_did_pricelist
     */
    public void setReseller_did_pricelist(java.lang.String reseller_did_pricelist) {
        this.reseller_did_pricelist = reseller_did_pricelist;
    }


    /**
     * Gets the reseller_pstn_tariff value for this Api_didwwdata.
     * 
     * @return reseller_pstn_tariff
     */
    public java.lang.String getReseller_pstn_tariff() {
        return reseller_pstn_tariff;
    }


    /**
     * Sets the reseller_pstn_tariff value for this Api_didwwdata.
     * 
     * @param reseller_pstn_tariff
     */
    public void setReseller_pstn_tariff(java.lang.String reseller_pstn_tariff) {
        this.reseller_pstn_tariff = reseller_pstn_tariff;
    }


    /**
     * Gets the reseller_id value for this Api_didwwdata.
     * 
     * @return reseller_id
     */
    public int getReseller_id() {
        return reseller_id;
    }


    /**
     * Sets the reseller_id value for this Api_didwwdata.
     * 
     * @param reseller_id
     */
    public void setReseller_id(int reseller_id) {
        this.reseller_id = reseller_id;
    }


    /**
     * Gets the reseller_balance value for this Api_didwwdata.
     * 
     * @return reseller_balance
     */
    public java.lang.String getReseller_balance() {
        return reseller_balance;
    }


    /**
     * Sets the reseller_balance value for this Api_didwwdata.
     * 
     * @param reseller_balance
     */
    public void setReseller_balance(java.lang.String reseller_balance) {
        this.reseller_balance = reseller_balance;
    }


    /**
     * Gets the reseller_balance_status value for this Api_didwwdata.
     * 
     * @return reseller_balance_status
     */
    public java.lang.String getReseller_balance_status() {
        return reseller_balance_status;
    }


    /**
     * Sets the reseller_balance_status value for this Api_didwwdata.
     * 
     * @param reseller_balance_status
     */
    public void setReseller_balance_status(java.lang.String reseller_balance_status) {
        this.reseller_balance_status = reseller_balance_status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Api_didwwdata)) return false;
        Api_didwwdata other = (Api_didwwdata) obj;
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
            ((this.api_version==null && other.getApi_version()==null) || 
             (this.api_version!=null &&
              this.api_version.equals(other.getApi_version()))) &&
            ((this.reseller_did_pricelist==null && other.getReseller_did_pricelist()==null) || 
             (this.reseller_did_pricelist!=null &&
              this.reseller_did_pricelist.equals(other.getReseller_did_pricelist()))) &&
            ((this.reseller_pstn_tariff==null && other.getReseller_pstn_tariff()==null) || 
             (this.reseller_pstn_tariff!=null &&
              this.reseller_pstn_tariff.equals(other.getReseller_pstn_tariff()))) &&
            this.reseller_id == other.getReseller_id() &&
            ((this.reseller_balance==null && other.getReseller_balance()==null) || 
             (this.reseller_balance!=null &&
              this.reseller_balance.equals(other.getReseller_balance()))) &&
            ((this.reseller_balance_status==null && other.getReseller_balance_status()==null) || 
             (this.reseller_balance_status!=null &&
              this.reseller_balance_status.equals(other.getReseller_balance_status())));
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
        if (getApi_version() != null) {
            _hashCode += getApi_version().hashCode();
        }
        if (getReseller_did_pricelist() != null) {
            _hashCode += getReseller_did_pricelist().hashCode();
        }
        if (getReseller_pstn_tariff() != null) {
            _hashCode += getReseller_pstn_tariff().hashCode();
        }
        _hashCode += getReseller_id();
        if (getReseller_balance() != null) {
            _hashCode += getReseller_balance().hashCode();
        }
        if (getReseller_balance_status() != null) {
            _hashCode += getReseller_balance_status().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Api_didwwdata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:didww", "api_didwwdata"));
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
        elemField.setFieldName("api_version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "api_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_did_pricelist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reseller_did_pricelist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_pstn_tariff");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reseller_pstn_tariff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reseller_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reseller_balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_balance_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reseller_balance_status"));
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

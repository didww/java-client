/**
 * Service_data.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.didww;

public class Service_data  implements java.io.Serializable {
    private int result;

    private java.lang.String country_name;

    private java.lang.String country_iso;

    private java.lang.String city_name;

    private java.lang.String city_prefix;

    private int city_id;

    private java.lang.String did_number;

    private java.lang.String did_status;

    private java.lang.String did_timeleft;

    private java.lang.String did_expire_date_gmt;

    private java.lang.String order_id;

    private java.lang.String order_status;

    private java.lang.String did_mapping_format;

    private java.lang.String did_setup;

    private java.lang.String did_monthly;

    private int did_period;

    private java.lang.String autorenew_enable;

    private java.lang.String prepaid_balance;

    public Service_data() {
    }

    public Service_data(
           int result,
           java.lang.String country_name,
           java.lang.String country_iso,
           java.lang.String city_name,
           java.lang.String city_prefix,
           int city_id,
           java.lang.String did_number,
           java.lang.String did_status,
           java.lang.String did_timeleft,
           java.lang.String did_expire_date_gmt,
           java.lang.String order_id,
           java.lang.String order_status,
           java.lang.String did_mapping_format,
           java.lang.String did_setup,
           java.lang.String did_monthly,
           int did_period,
           java.lang.String autorenew_enable,
           java.lang.String prepaid_balance) {
           this.result = result;
           this.country_name = country_name;
           this.country_iso = country_iso;
           this.city_name = city_name;
           this.city_prefix = city_prefix;
           this.city_id = city_id;
           this.did_number = did_number;
           this.did_status = did_status;
           this.did_timeleft = did_timeleft;
           this.did_expire_date_gmt = did_expire_date_gmt;
           this.order_id = order_id;
           this.order_status = order_status;
           this.did_mapping_format = did_mapping_format;
           this.did_setup = did_setup;
           this.did_monthly = did_monthly;
           this.did_period = did_period;
           this.autorenew_enable = autorenew_enable;
           this.prepaid_balance = prepaid_balance;
    }


    /**
     * Gets the result value for this Service_data.
     * 
     * @return result
     */
    public int getResult() {
        return result;
    }


    /**
     * Sets the result value for this Service_data.
     * 
     * @param result
     */
    public void setResult(int result) {
        this.result = result;
    }


    /**
     * Gets the country_name value for this Service_data.
     * 
     * @return country_name
     */
    public java.lang.String getCountry_name() {
        return country_name;
    }


    /**
     * Sets the country_name value for this Service_data.
     * 
     * @param country_name
     */
    public void setCountry_name(java.lang.String country_name) {
        this.country_name = country_name;
    }


    /**
     * Gets the country_iso value for this Service_data.
     * 
     * @return country_iso
     */
    public java.lang.String getCountry_iso() {
        return country_iso;
    }


    /**
     * Sets the country_iso value for this Service_data.
     * 
     * @param country_iso
     */
    public void setCountry_iso(java.lang.String country_iso) {
        this.country_iso = country_iso;
    }


    /**
     * Gets the city_name value for this Service_data.
     * 
     * @return city_name
     */
    public java.lang.String getCity_name() {
        return city_name;
    }


    /**
     * Sets the city_name value for this Service_data.
     * 
     * @param city_name
     */
    public void setCity_name(java.lang.String city_name) {
        this.city_name = city_name;
    }


    /**
     * Gets the city_prefix value for this Service_data.
     * 
     * @return city_prefix
     */
    public java.lang.String getCity_prefix() {
        return city_prefix;
    }


    /**
     * Sets the city_prefix value for this Service_data.
     * 
     * @param city_prefix
     */
    public void setCity_prefix(java.lang.String city_prefix) {
        this.city_prefix = city_prefix;
    }


    /**
     * Gets the city_id value for this Service_data.
     * 
     * @return city_id
     */
    public int getCity_id() {
        return city_id;
    }


    /**
     * Sets the city_id value for this Service_data.
     * 
     * @param city_id
     */
    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }


    /**
     * Gets the did_number value for this Service_data.
     * 
     * @return did_number
     */
    public java.lang.String getDid_number() {
        return did_number;
    }


    /**
     * Sets the did_number value for this Service_data.
     * 
     * @param did_number
     */
    public void setDid_number(java.lang.String did_number) {
        this.did_number = did_number;
    }


    /**
     * Gets the did_status value for this Service_data.
     * 
     * @return did_status
     */
    public java.lang.String getDid_status() {
        return did_status;
    }


    /**
     * Sets the did_status value for this Service_data.
     * 
     * @param did_status
     */
    public void setDid_status(java.lang.String did_status) {
        this.did_status = did_status;
    }


    /**
     * Gets the did_timeleft value for this Service_data.
     * 
     * @return did_timeleft
     */
    public java.lang.String getDid_timeleft() {
        return did_timeleft;
    }


    /**
     * Sets the did_timeleft value for this Service_data.
     * 
     * @param did_timeleft
     */
    public void setDid_timeleft(java.lang.String did_timeleft) {
        this.did_timeleft = did_timeleft;
    }


    /**
     * Gets the did_expire_date_gmt value for this Service_data.
     * 
     * @return did_expire_date_gmt
     */
    public java.lang.String getDid_expire_date_gmt() {
        return did_expire_date_gmt;
    }


    /**
     * Sets the did_expire_date_gmt value for this Service_data.
     * 
     * @param did_expire_date_gmt
     */
    public void setDid_expire_date_gmt(java.lang.String did_expire_date_gmt) {
        this.did_expire_date_gmt = did_expire_date_gmt;
    }


    /**
     * Gets the order_id value for this Service_data.
     * 
     * @return order_id
     */
    public java.lang.String getOrder_id() {
        return order_id;
    }


    /**
     * Sets the order_id value for this Service_data.
     * 
     * @param order_id
     */
    public void setOrder_id(java.lang.String order_id) {
        this.order_id = order_id;
    }


    /**
     * Gets the order_status value for this Service_data.
     * 
     * @return order_status
     */
    public java.lang.String getOrder_status() {
        return order_status;
    }


    /**
     * Sets the order_status value for this Service_data.
     * 
     * @param order_status
     */
    public void setOrder_status(java.lang.String order_status) {
        this.order_status = order_status;
    }


    /**
     * Gets the did_mapping_format value for this Service_data.
     * 
     * @return did_mapping_format
     */
    public java.lang.String getDid_mapping_format() {
        return did_mapping_format;
    }


    /**
     * Sets the did_mapping_format value for this Service_data.
     * 
     * @param did_mapping_format
     */
    public void setDid_mapping_format(java.lang.String did_mapping_format) {
        this.did_mapping_format = did_mapping_format;
    }


    /**
     * Gets the did_setup value for this Service_data.
     * 
     * @return did_setup
     */
    public java.lang.String getDid_setup() {
        return did_setup;
    }


    /**
     * Sets the did_setup value for this Service_data.
     * 
     * @param did_setup
     */
    public void setDid_setup(java.lang.String did_setup) {
        this.did_setup = did_setup;
    }


    /**
     * Gets the did_monthly value for this Service_data.
     * 
     * @return did_monthly
     */
    public java.lang.String getDid_monthly() {
        return did_monthly;
    }


    /**
     * Sets the did_monthly value for this Service_data.
     * 
     * @param did_monthly
     */
    public void setDid_monthly(java.lang.String did_monthly) {
        this.did_monthly = did_monthly;
    }


    /**
     * Gets the did_period value for this Service_data.
     * 
     * @return did_period
     */
    public int getDid_period() {
        return did_period;
    }


    /**
     * Sets the did_period value for this Service_data.
     * 
     * @param did_period
     */
    public void setDid_period(int did_period) {
        this.did_period = did_period;
    }


    /**
     * Gets the autorenew_enable value for this Service_data.
     * 
     * @return autorenew_enable
     */
    public java.lang.String getAutorenew_enable() {
        return autorenew_enable;
    }


    /**
     * Sets the autorenew_enable value for this Service_data.
     * 
     * @param autorenew_enable
     */
    public void setAutorenew_enable(java.lang.String autorenew_enable) {
        this.autorenew_enable = autorenew_enable;
    }


    /**
     * Gets the prepaid_balance value for this Service_data.
     * 
     * @return prepaid_balance
     */
    public java.lang.String getPrepaid_balance() {
        return prepaid_balance;
    }


    /**
     * Sets the prepaid_balance value for this Service_data.
     * 
     * @param prepaid_balance
     */
    public void setPrepaid_balance(java.lang.String prepaid_balance) {
        this.prepaid_balance = prepaid_balance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Service_data)) return false;
        Service_data other = (Service_data) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.result == other.getResult() &&
            ((this.country_name==null && other.getCountry_name()==null) || 
             (this.country_name!=null &&
              this.country_name.equals(other.getCountry_name()))) &&
            ((this.country_iso==null && other.getCountry_iso()==null) || 
             (this.country_iso!=null &&
              this.country_iso.equals(other.getCountry_iso()))) &&
            ((this.city_name==null && other.getCity_name()==null) || 
             (this.city_name!=null &&
              this.city_name.equals(other.getCity_name()))) &&
            ((this.city_prefix==null && other.getCity_prefix()==null) || 
             (this.city_prefix!=null &&
              this.city_prefix.equals(other.getCity_prefix()))) &&
            this.city_id == other.getCity_id() &&
            ((this.did_number==null && other.getDid_number()==null) || 
             (this.did_number!=null &&
              this.did_number.equals(other.getDid_number()))) &&
            ((this.did_status==null && other.getDid_status()==null) || 
             (this.did_status!=null &&
              this.did_status.equals(other.getDid_status()))) &&
            ((this.did_timeleft==null && other.getDid_timeleft()==null) || 
             (this.did_timeleft!=null &&
              this.did_timeleft.equals(other.getDid_timeleft()))) &&
            ((this.did_expire_date_gmt==null && other.getDid_expire_date_gmt()==null) || 
             (this.did_expire_date_gmt!=null &&
              this.did_expire_date_gmt.equals(other.getDid_expire_date_gmt()))) &&
            ((this.order_id==null && other.getOrder_id()==null) || 
             (this.order_id!=null &&
              this.order_id.equals(other.getOrder_id()))) &&
            ((this.order_status==null && other.getOrder_status()==null) || 
             (this.order_status!=null &&
              this.order_status.equals(other.getOrder_status()))) &&
            ((this.did_mapping_format==null && other.getDid_mapping_format()==null) || 
             (this.did_mapping_format!=null &&
              this.did_mapping_format.equals(other.getDid_mapping_format()))) &&
            ((this.did_setup==null && other.getDid_setup()==null) || 
             (this.did_setup!=null &&
              this.did_setup.equals(other.getDid_setup()))) &&
            ((this.did_monthly==null && other.getDid_monthly()==null) || 
             (this.did_monthly!=null &&
              this.did_monthly.equals(other.getDid_monthly()))) &&
            this.did_period == other.getDid_period() &&
            ((this.autorenew_enable==null && other.getAutorenew_enable()==null) || 
             (this.autorenew_enable!=null &&
              this.autorenew_enable.equals(other.getAutorenew_enable()))) &&
            ((this.prepaid_balance==null && other.getPrepaid_balance()==null) || 
             (this.prepaid_balance!=null &&
              this.prepaid_balance.equals(other.getPrepaid_balance())));
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
        if (getCountry_name() != null) {
            _hashCode += getCountry_name().hashCode();
        }
        if (getCountry_iso() != null) {
            _hashCode += getCountry_iso().hashCode();
        }
        if (getCity_name() != null) {
            _hashCode += getCity_name().hashCode();
        }
        if (getCity_prefix() != null) {
            _hashCode += getCity_prefix().hashCode();
        }
        _hashCode += getCity_id();
        if (getDid_number() != null) {
            _hashCode += getDid_number().hashCode();
        }
        if (getDid_status() != null) {
            _hashCode += getDid_status().hashCode();
        }
        if (getDid_timeleft() != null) {
            _hashCode += getDid_timeleft().hashCode();
        }
        if (getDid_expire_date_gmt() != null) {
            _hashCode += getDid_expire_date_gmt().hashCode();
        }
        if (getOrder_id() != null) {
            _hashCode += getOrder_id().hashCode();
        }
        if (getOrder_status() != null) {
            _hashCode += getOrder_status().hashCode();
        }
        if (getDid_mapping_format() != null) {
            _hashCode += getDid_mapping_format().hashCode();
        }
        if (getDid_setup() != null) {
            _hashCode += getDid_setup().hashCode();
        }
        if (getDid_monthly() != null) {
            _hashCode += getDid_monthly().hashCode();
        }
        _hashCode += getDid_period();
        if (getAutorenew_enable() != null) {
            _hashCode += getAutorenew_enable().hashCode();
        }
        if (getPrepaid_balance() != null) {
            _hashCode += getPrepaid_balance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Service_data.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:didww", "service_data"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_iso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_iso"));
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
        elemField.setFieldName("city_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("did_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "did_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("did_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "did_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("did_timeleft");
        elemField.setXmlName(new javax.xml.namespace.QName("", "did_timeleft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("did_expire_date_gmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "did_expire_date_gmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("did_mapping_format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "did_mapping_format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("did_setup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "did_setup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("did_monthly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "did_monthly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("did_period");
        elemField.setXmlName(new javax.xml.namespace.QName("", "did_period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorenew_enable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autorenew_enable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaid_balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prepaid_balance"));
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

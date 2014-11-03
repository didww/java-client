/**
 * CDRNew.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.didww;

public class CDRNew  implements java.io.Serializable {
    private int customer_id;

    private java.lang.String source;

    private java.lang.String destination;

    private java.lang.String status;

    private java.lang.String date_gmt;

    private java.lang.String duration;

    private java.lang.String reseller_billed_usd;

    private java.lang.String customer_billed_points;

    private int reason;

    private java.lang.String caller_id;

    public CDRNew() {
    }

    public CDRNew(
           int customer_id,
           java.lang.String source,
           java.lang.String destination,
           java.lang.String status,
           java.lang.String date_gmt,
           java.lang.String duration,
           java.lang.String reseller_billed_usd,
           java.lang.String customer_billed_points,
           int reason,
           java.lang.String caller_id) {
           this.customer_id = customer_id;
           this.source = source;
           this.destination = destination;
           this.status = status;
           this.date_gmt = date_gmt;
           this.duration = duration;
           this.reseller_billed_usd = reseller_billed_usd;
           this.customer_billed_points = customer_billed_points;
           this.reason = reason;
           this.caller_id = caller_id;
    }


    /**
     * Gets the customer_id value for this CDRNew.
     * 
     * @return customer_id
     */
    public int getCustomer_id() {
        return customer_id;
    }


    /**
     * Sets the customer_id value for this CDRNew.
     * 
     * @param customer_id
     */
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }


    /**
     * Gets the source value for this CDRNew.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this CDRNew.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the destination value for this CDRNew.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this CDRNew.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the status value for this CDRNew.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CDRNew.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the date_gmt value for this CDRNew.
     * 
     * @return date_gmt
     */
    public java.lang.String getDate_gmt() {
        return date_gmt;
    }


    /**
     * Sets the date_gmt value for this CDRNew.
     * 
     * @param date_gmt
     */
    public void setDate_gmt(java.lang.String date_gmt) {
        this.date_gmt = date_gmt;
    }


    /**
     * Gets the duration value for this CDRNew.
     * 
     * @return duration
     */
    public java.lang.String getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this CDRNew.
     * 
     * @param duration
     */
    public void setDuration(java.lang.String duration) {
        this.duration = duration;
    }


    /**
     * Gets the reseller_billed_usd value for this CDRNew.
     * 
     * @return reseller_billed_usd
     */
    public java.lang.String getReseller_billed_usd() {
        return reseller_billed_usd;
    }


    /**
     * Sets the reseller_billed_usd value for this CDRNew.
     * 
     * @param reseller_billed_usd
     */
    public void setReseller_billed_usd(java.lang.String reseller_billed_usd) {
        this.reseller_billed_usd = reseller_billed_usd;
    }


    /**
     * Gets the customer_billed_points value for this CDRNew.
     * 
     * @return customer_billed_points
     */
    public java.lang.String getCustomer_billed_points() {
        return customer_billed_points;
    }


    /**
     * Sets the customer_billed_points value for this CDRNew.
     * 
     * @param customer_billed_points
     */
    public void setCustomer_billed_points(java.lang.String customer_billed_points) {
        this.customer_billed_points = customer_billed_points;
    }


    /**
     * Gets the reason value for this CDRNew.
     * 
     * @return reason
     */
    public int getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this CDRNew.
     * 
     * @param reason
     */
    public void setReason(int reason) {
        this.reason = reason;
    }


    /**
     * Gets the caller_id value for this CDRNew.
     * 
     * @return caller_id
     */
    public java.lang.String getCaller_id() {
        return caller_id;
    }


    /**
     * Sets the caller_id value for this CDRNew.
     * 
     * @param caller_id
     */
    public void setCaller_id(java.lang.String caller_id) {
        this.caller_id = caller_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDRNew)) return false;
        CDRNew other = (CDRNew) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.customer_id == other.getCustomer_id() &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.date_gmt==null && other.getDate_gmt()==null) || 
             (this.date_gmt!=null &&
              this.date_gmt.equals(other.getDate_gmt()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.reseller_billed_usd==null && other.getReseller_billed_usd()==null) || 
             (this.reseller_billed_usd!=null &&
              this.reseller_billed_usd.equals(other.getReseller_billed_usd()))) &&
            ((this.customer_billed_points==null && other.getCustomer_billed_points()==null) || 
             (this.customer_billed_points!=null &&
              this.customer_billed_points.equals(other.getCustomer_billed_points()))) &&
            this.reason == other.getReason() &&
            ((this.caller_id==null && other.getCaller_id()==null) || 
             (this.caller_id!=null &&
              this.caller_id.equals(other.getCaller_id())));
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
        _hashCode += getCustomer_id();
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDate_gmt() != null) {
            _hashCode += getDate_gmt().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getReseller_billed_usd() != null) {
            _hashCode += getReseller_billed_usd().hashCode();
        }
        if (getCustomer_billed_points() != null) {
            _hashCode += getCustomer_billed_points().hashCode();
        }
        _hashCode += getReason();
        if (getCaller_id() != null) {
            _hashCode += getCaller_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDRNew.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:didww", "CDRNew"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_gmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_gmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_billed_usd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reseller_billed_usd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_billed_points");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_billed_points"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caller_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caller_id"));
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

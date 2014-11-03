/**
 * MappingDataIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.didww;

public class MappingDataIn  implements java.io.Serializable {
    private java.lang.String map_type;

    private java.lang.String map_proto;

    private java.lang.String map_detail;

    private int map_pref_server;

    private java.lang.String map_itsp_id;

    private java.lang.String cli_format;

    private java.lang.String cli_prefix;

    public MappingDataIn() {
    }

    public MappingDataIn(
           java.lang.String map_type,
           java.lang.String map_proto,
           java.lang.String map_detail,
           int map_pref_server,
           java.lang.String map_itsp_id,
           java.lang.String cli_format,
           java.lang.String cli_prefix) {
           this.map_type = map_type;
           this.map_proto = map_proto;
           this.map_detail = map_detail;
           this.map_pref_server = map_pref_server;
           this.map_itsp_id = map_itsp_id;
           this.cli_format = cli_format;
           this.cli_prefix = cli_prefix;
    }


    /**
     * Gets the map_type value for this MappingDataIn.
     * 
     * @return map_type
     */
    public java.lang.String getMap_type() {
        return map_type;
    }


    /**
     * Sets the map_type value for this MappingDataIn.
     * 
     * @param map_type
     */
    public void setMap_type(java.lang.String map_type) {
        this.map_type = map_type;
    }


    /**
     * Gets the map_proto value for this MappingDataIn.
     * 
     * @return map_proto
     */
    public java.lang.String getMap_proto() {
        return map_proto;
    }


    /**
     * Sets the map_proto value for this MappingDataIn.
     * 
     * @param map_proto
     */
    public void setMap_proto(java.lang.String map_proto) {
        this.map_proto = map_proto;
    }


    /**
     * Gets the map_detail value for this MappingDataIn.
     * 
     * @return map_detail
     */
    public java.lang.String getMap_detail() {
        return map_detail;
    }


    /**
     * Sets the map_detail value for this MappingDataIn.
     * 
     * @param map_detail
     */
    public void setMap_detail(java.lang.String map_detail) {
        this.map_detail = map_detail;
    }


    /**
     * Gets the map_pref_server value for this MappingDataIn.
     * 
     * @return map_pref_server
     */
    public int getMap_pref_server() {
        return map_pref_server;
    }


    /**
     * Sets the map_pref_server value for this MappingDataIn.
     * 
     * @param map_pref_server
     */
    public void setMap_pref_server(int map_pref_server) {
        this.map_pref_server = map_pref_server;
    }


    /**
     * Gets the map_itsp_id value for this MappingDataIn.
     * 
     * @return map_itsp_id
     */
    public java.lang.String getMap_itsp_id() {
        return map_itsp_id;
    }


    /**
     * Sets the map_itsp_id value for this MappingDataIn.
     * 
     * @param map_itsp_id
     */
    public void setMap_itsp_id(java.lang.String map_itsp_id) {
        this.map_itsp_id = map_itsp_id;
    }


    /**
     * Gets the cli_format value for this MappingDataIn.
     * 
     * @return cli_format
     */
    public java.lang.String getCli_format() {
        return cli_format;
    }


    /**
     * Sets the cli_format value for this MappingDataIn.
     * 
     * @param cli_format
     */
    public void setCli_format(java.lang.String cli_format) {
        this.cli_format = cli_format;
    }


    /**
     * Gets the cli_prefix value for this MappingDataIn.
     * 
     * @return cli_prefix
     */
    public java.lang.String getCli_prefix() {
        return cli_prefix;
    }


    /**
     * Sets the cli_prefix value for this MappingDataIn.
     * 
     * @param cli_prefix
     */
    public void setCli_prefix(java.lang.String cli_prefix) {
        this.cli_prefix = cli_prefix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MappingDataIn)) return false;
        MappingDataIn other = (MappingDataIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.map_type==null && other.getMap_type()==null) || 
             (this.map_type!=null &&
              this.map_type.equals(other.getMap_type()))) &&
            ((this.map_proto==null && other.getMap_proto()==null) || 
             (this.map_proto!=null &&
              this.map_proto.equals(other.getMap_proto()))) &&
            ((this.map_detail==null && other.getMap_detail()==null) || 
             (this.map_detail!=null &&
              this.map_detail.equals(other.getMap_detail()))) &&
            this.map_pref_server == other.getMap_pref_server() &&
            ((this.map_itsp_id==null && other.getMap_itsp_id()==null) || 
             (this.map_itsp_id!=null &&
              this.map_itsp_id.equals(other.getMap_itsp_id()))) &&
            ((this.cli_format==null && other.getCli_format()==null) || 
             (this.cli_format!=null &&
              this.cli_format.equals(other.getCli_format()))) &&
            ((this.cli_prefix==null && other.getCli_prefix()==null) || 
             (this.cli_prefix!=null &&
              this.cli_prefix.equals(other.getCli_prefix())));
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
        if (getMap_type() != null) {
            _hashCode += getMap_type().hashCode();
        }
        if (getMap_proto() != null) {
            _hashCode += getMap_proto().hashCode();
        }
        if (getMap_detail() != null) {
            _hashCode += getMap_detail().hashCode();
        }
        _hashCode += getMap_pref_server();
        if (getMap_itsp_id() != null) {
            _hashCode += getMap_itsp_id().hashCode();
        }
        if (getCli_format() != null) {
            _hashCode += getCli_format().hashCode();
        }
        if (getCli_prefix() != null) {
            _hashCode += getCli_prefix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MappingDataIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:didww", "MappingDataIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("map_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "map_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("map_proto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "map_proto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("map_detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "map_detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("map_pref_server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "map_pref_server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("map_itsp_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "map_itsp_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cli_format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cli_format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cli_prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cli_prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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

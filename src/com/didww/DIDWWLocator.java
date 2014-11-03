/**
 * DIDWWLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.didww;

public class DIDWWLocator extends org.apache.axis.client.Service implements com.didww.DIDWW {

    public DIDWWLocator() {
    }


    public DIDWWLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DIDWWLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DIDWWPort
    private java.lang.String DIDWWPort_address = "http://api.didww.com/api2/index.php";

    public java.lang.String getDIDWWPortAddress() {
        return DIDWWPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DIDWWPortWSDDServiceName = "DIDWWPort";

    public java.lang.String getDIDWWPortWSDDServiceName() {
        return DIDWWPortWSDDServiceName;
    }

    public void setDIDWWPortWSDDServiceName(java.lang.String name) {
        DIDWWPortWSDDServiceName = name;
    }

    public com.didww.DIDWWPortType getDIDWWPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DIDWWPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDIDWWPort(endpoint);
    }

    public com.didww.DIDWWPortType getDIDWWPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.didww.DIDWWBindingStub _stub = new com.didww.DIDWWBindingStub(portAddress, this);
            _stub.setPortName(getDIDWWPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDIDWWPortEndpointAddress(java.lang.String address) {
        DIDWWPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.didww.DIDWWPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.didww.DIDWWBindingStub _stub = new com.didww.DIDWWBindingStub(new java.net.URL(DIDWWPort_address), this);
                _stub.setPortName(getDIDWWPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DIDWWPort".equals(inputPortName)) {
            return getDIDWWPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:didww", "DIDWW");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:didww", "DIDWWPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DIDWWPort".equals(portName)) {
            setDIDWWPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

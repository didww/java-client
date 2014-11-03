/**
 * DIDWWPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.didww;

public interface DIDWWPortType extends java.rmi.Remote {
    public com.didww.Api_didwwdata didww_getdidwwapidetails(java.lang.String auth_string) throws java.rmi.RemoteException;
    public com.didww.Regions[] didww_getdidwwregions(java.lang.String auth_string, java.lang.String country_iso, java.lang.String city_prefix, java.lang.String last_request_gmt, java.lang.String city_id) throws java.rmi.RemoteException;
    public com.didww.Country[] didww_getdidwwcountries(java.lang.String auth_string, java.lang.String country_iso) throws java.rmi.RemoteException;
    public com.didww.City[] didww_getdidwwcities(java.lang.String auth_string, java.lang.String country_iso, java.lang.String city_id, int active) throws java.rmi.RemoteException;
    public com.didww.Rates[] didww_getdidwwpstnrates(java.lang.String auth_string, java.lang.String country_iso, java.lang.String pstn_prefix, java.lang.String last_request_gmt) throws java.rmi.RemoteException;
    public com.didww.GlobalResponse didww_updatepstnrates(java.lang.String auth_string, com.didww.RatesIn[] rates) throws java.rmi.RemoteException;
    public com.didww.GlobalResponse didww_checkpstnnumber(java.lang.String auth_string, java.lang.String pstn_number) throws java.rmi.RemoteException;
    public com.didww.Service_data didww_ordercreate(java.lang.String auth_string, java.lang.String customer_id, java.lang.String country_iso, java.lang.String city_prefix, int period, com.didww.MappingDataIn map_data, java.lang.String prepaid_funds, java.lang.String uniq_hash, java.lang.String city_id, int autorenew_enable) throws java.rmi.RemoteException;
    public com.didww.Service_data didww_orderautorenew(java.lang.String auth_string, java.lang.String customer_id, java.lang.String did_number, int period, java.lang.String uniq_hash) throws java.rmi.RemoteException;
    public com.didww.GlobalResponse didww_didrestore(java.lang.String auth_string, java.lang.String customer_id, java.lang.String did_number, int period, java.lang.String uniq_hash, int isrenew) throws java.rmi.RemoteException;
    public com.didww.GlobalResponse didww_ordercancel(java.lang.String auth_string, java.lang.String customer_id, java.lang.String did_number) throws java.rmi.RemoteException;
    public com.didww.GlobalResponse didww_updatemapping(java.lang.String auth_string, java.lang.String customer_id, java.lang.String did_number, com.didww.MappingDataIn map_data) throws java.rmi.RemoteException;
    public com.didww.Prepaid_data didww_updateprepaidbalance(java.lang.String auth_string, java.lang.String customer_id, java.lang.String prepaid_funds, int operation_type, java.lang.String uniq_hash) throws java.rmi.RemoteException;
    public com.didww.Prepaid_data didww_getprepaidbalance(java.lang.String auth_string, java.lang.String customer_id) throws java.rmi.RemoteException;
    public com.didww.Prepaid_data[] didww_getprepaidbalancelist(java.lang.String auth_string, java.lang.String customer_id) throws java.rmi.RemoteException;
    public com.didww.Service_data didww_getservicedetails(java.lang.String auth_string, java.lang.String customer_id, java.lang.String api_order_id, java.lang.String did_number) throws java.rmi.RemoteException;
    public com.didww.Service_data[] didww_getservicelist(java.lang.String auth_string, java.lang.String customer_id) throws java.rmi.RemoteException;
    public com.didww.Used_amount_data didww_callhistory_invoices(java.lang.String auth_string, int customer_id, java.lang.String from_date, java.lang.String to_date) throws java.rmi.RemoteException;
    public com.didww.SMSPage didww_getsmslog(java.lang.String auth_string, int customer_id, java.lang.String from_date, java.lang.String to_date, java.lang.String destination, java.lang.String source, int success, int limit, int offset, java.lang.String order, java.lang.String order_Dir) throws java.rmi.RemoteException;
    public com.didww.GlobalResponse didww_order_autorenew_status(java.lang.String auth_string, java.lang.String customer_id, java.lang.String did_number, int status) throws java.rmi.RemoteException;
    public com.didww.Traffic_item[] didww_pstn_traffic(java.lang.String auth_string, java.lang.String from_date, java.lang.String to_date) throws java.rmi.RemoteException;
    public com.didww.CDRPage didww_getcdrlog(java.lang.String auth_string, java.lang.String customer_id, java.lang.String did_number, java.lang.String from_date, java.lang.String to_date, java.lang.String limit, java.lang.String offset, java.lang.String order, java.lang.String order_Dir) throws java.rmi.RemoteException;
    public com.didww.GlobalResponse didww_update_toll_free_data(java.lang.String auth_string, com.didww.TollFreeRatesIn[] rates) throws java.rmi.RemoteException;
    public com.didww.TollFreeRates[] didww_get_toll_free_data(java.lang.String auth_string) throws java.rmi.RemoteException;
    public com.didww.RegionsExt[] didww_getcoverage(java.lang.String auth_string, java.lang.String country_iso, java.lang.String city_prefix, int city_id) throws java.rmi.RemoteException;
}

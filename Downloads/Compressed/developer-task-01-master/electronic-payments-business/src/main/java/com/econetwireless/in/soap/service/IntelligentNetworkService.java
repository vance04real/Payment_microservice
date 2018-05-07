
package com.econetwireless.in.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "IntelligentNetworkService", targetNamespace = "http://service.soap.in.econetwireless.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IntelligentNetworkService {


    /**
     * 
     * @param msisdn
     * @param partnerCode
     * @return
     *     returns com.econetwireless.in.soap.service.BalanceResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "enquireBalance", targetNamespace = "http://service.soap.in.econetwireless.com/", className = "com.econetwireless.in.soap.service.EnquireBalance")
    @ResponseWrapper(localName = "enquireBalanceResponse", targetNamespace = "http://service.soap.in.econetwireless.com/", className = "com.econetwireless.in.soap.service.EnquireBalanceResponse")
    public BalanceResponse enquireBalance(
        @WebParam(name = "partnerCode", targetNamespace = "")
        String partnerCode,
        @WebParam(name = "msisdn", targetNamespace = "")
        String msisdn);

    /**
     * 
     * @param creditRequest
     * @return
     *     returns com.econetwireless.in.soap.service.CreditResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "creditSubscriberAccount", targetNamespace = "http://service.soap.in.econetwireless.com/", className = "com.econetwireless.in.soap.service.CreditSubscriberAccount")
    @ResponseWrapper(localName = "creditSubscriberAccountResponse", targetNamespace = "http://service.soap.in.econetwireless.com/", className = "com.econetwireless.in.soap.service.CreditSubscriberAccountResponse")
    public CreditResponse creditSubscriberAccount(
        @WebParam(name = "creditRequest", targetNamespace = "")
        CreditRequest creditRequest);

}
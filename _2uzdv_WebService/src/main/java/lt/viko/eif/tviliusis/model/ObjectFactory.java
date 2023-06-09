//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.05 at 09:18:24 PM EEST 
//


package lt.viko.eif.tviliusis.model;

import io.spring.guides.gs_producing_web_service.Account;
import io.spring.guides.gs_producing_web_service.Categories;
import io.spring.guides.gs_producing_web_service.ClientShipping;
import io.spring.guides.gs_producing_web_service.Components;
import io.spring.guides.gs_producing_web_service.GetAllAccountRequest;
import io.spring.guides.gs_producing_web_service.GetAllAccountResponse;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.spring.guides.gs_producing_web_service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.spring.guides.gs_producing_web_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllAccountRequest }
     * 
     */
    public GetAllAccountRequest createGetAllAccountRequest() {
        return new GetAllAccountRequest();
    }

    /**
     * Create an instance of {@link GetAllAccountResponse }
     * 
     */
    public GetAllAccountResponse createGetAllAccountResponse() {
        return new GetAllAccountResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link AddComponentRequest }
     * 
     */
    public AddComponentRequest createAddComponentRequest() {
        return new AddComponentRequest();
    }

    /**
     * Create an instance of {@link Components }
     * 
     */
    public Components createComponents() {
        return new Components();
    }

    /**
     * Create an instance of {@link AddComponentResponse }
     * 
     */
    public AddComponentResponse createAddComponentResponse() {
        return new AddComponentResponse();
    }

    /**
     * Create an instance of {@link DeleteShippingRequest }
     * 
     */
    public DeleteShippingRequest createDeleteShippingRequest() {
        return new DeleteShippingRequest();
    }

    /**
     * Create an instance of {@link DeleteShippingResponse }
     * 
     */
    public DeleteShippingResponse createDeleteShippingResponse() {
        return new DeleteShippingResponse();
    }

    /**
     * Create an instance of {@link ChangeUserRequest }
     * 
     */
    public ChangeUserRequest createChangeUserRequest() {
        return new ChangeUserRequest();
    }

    /**
     * Create an instance of {@link ChangeUserResponse }
     * 
     */
    public ChangeUserResponse createChangeUserResponse() {
        return new ChangeUserResponse();
    }

    /**
     * Create an instance of {@link GetOrderPriceRequest }
     * 
     */
    public GetOrderPriceRequest createGetOrderPriceRequest() {
        return new GetOrderPriceRequest();
    }

    /**
     * Create an instance of {@link GetOrderPriceResponse }
     * 
     */
    public GetOrderPriceResponse createGetOrderPriceResponse() {
        return new GetOrderPriceResponse();
    }

    /**
     * Create an instance of {@link GetShippingRequest }
     * 
     */
    public GetShippingRequest createGetShippingRequest() {
        return new GetShippingRequest();
    }

    /**
     * Create an instance of {@link GetShippingResponse }
     * 
     */
    public GetShippingResponse createGetShippingResponse() {
        return new GetShippingResponse();
    }

    /**
     * Create an instance of {@link io.spring.guides.gs_producing_web_service.ClientShipping }
     * 
     */
    public ClientShipping createClientShipping() {
        return new ClientShipping();
    }

    /**
     * Create an instance of {@link Categories }
     * 
     */
    public Categories createCategories() {
        return new Categories();
    }

}

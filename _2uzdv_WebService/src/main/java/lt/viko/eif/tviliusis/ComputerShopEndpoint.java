package lt.viko.eif.tviliusis;


import lt.viko.eif.tviliusis.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


/**
 * The MoviesEndpoint class handles SOAP requests for the movie web service.
 * <p>
 * This class maps incoming SOAP requests to corresponding methods and uses
 * the MoviesRepository to process the requests.
 * </p>
 *
 * @author Edgar Semasko
 * @version 1.0
 * @since 1.0
 */
@Endpoint
public class ComputerShopEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private ComputerShopRepository computerShopRepository;

    @Autowired
    public ComputerShopEndpoint(ComputerShopRepository computerShopRepository) {
        this.computerShopRepository = computerShopRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllAccountRequest")
    @ResponsePayload
    public GetAllAccountResponse getAllAccount(@RequestPayload GetAllAccountRequest request) {
        GetAllAccountResponse response = new GetAllAccountResponse();
        response.getAllAccounts().addAll(computerShopRepository.getAllAccount());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getShippingRequest")
    @ResponsePayload
    public GetShippingResponse getShipping(@RequestPayload GetShippingRequest request) {
        GetShippingResponse response = new GetShippingResponse();
        response.setUserName(computerShopRepository.getUserName(request.getAccoundId()));
        response.setClientShipping(computerShopRepository.getClientShipping(request.getAccoundId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOrderPriceRequest")
    @ResponsePayload
    public GetOrderPriceResponse getOrderPrice(@RequestPayload GetOrderPriceRequest request) {
        GetOrderPriceResponse response = new GetOrderPriceResponse();
        response.setPrice(computerShopRepository.getOrderPrice(request.getAccountId()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteShippingRequest")
    @ResponsePayload
    public DeleteShippingResponse DeleteShipping(@RequestPayload DeleteShippingRequest request) {
        DeleteShippingResponse response = new DeleteShippingResponse();
        response.setIsDeleted(computerShopRepository.deleteShipping(request.getAccountId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "changeUserRequest")
    @ResponsePayload
    public ChangeUserResponse ChangeUserResponse(@RequestPayload ChangeUserRequest request) {
        ChangeUserResponse response = new ChangeUserResponse();
        response.setAccount((computerShopRepository.changeUser(request.getAccountId(),request.getUserName(), request.getPassword())));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addComponentRequest")
    @ResponsePayload
    public AddComponentResponse AddComponent(@RequestPayload AddComponentRequest request) {
        AddComponentResponse response = new AddComponentResponse();
        response.getAllComponents().addAll(computerShopRepository.addComponent(request.getAccountID(), request.getCategorieID(), request.getComponent()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteComponentRequest")
    @ResponsePayload
    public DeleteComponentResponse DeleteComponent(@RequestPayload DeleteComponentRequest request) {
        DeleteComponentResponse response = new DeleteComponentResponse();
        response.setIsDeleted(computerShopRepository.deleteComponent(request.getAccountId(), request.getCategorieId(), request.getComponentId()));
        return response;
    }

}


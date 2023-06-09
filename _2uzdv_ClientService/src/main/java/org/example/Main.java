package org.example;

import lt.viko.eif.tviliusis.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShopPortService service = new ShopPortService();
        ShopPort port = service.getShopPortSoap11();

        GetAllAccountRequest request = new GetAllAccountRequest();
        GetAllAccountResponse response = port.getAllAccount(request);

        List<Account> accounts = new ArrayList<>();
        accounts.addAll(response.getAllAccounts());
        for (Account account: accounts) {
            System.out.println(account.toString());
        }


        AddComponentRequest request1 = new AddComponentRequest();
        request1.setAccountID(1);
        request1.setCategorieID(1);
        request1.setComponent(new Components(5, "SSD550", 58));
        port.addComponent(request1);


        ChangeUserRequest request2 = new ChangeUserRequest();
        request2.setAccountId(1);
        request2.setUserName("tomas");
        request2.setPassword("tomas1");

        port.changeUser(request2);

        DeleteComponentRequest request3 = new DeleteComponentRequest();
        request3.setAccountId(1);
        request3.setCategorieId(1);
        request3.setComponentId(1);
        port.deleteComponent(request3);

        DeleteShippingRequest request4 = new DeleteShippingRequest();
        request4.setAccountId(1);
        port.deleteShipping(request4);

        GetOrderPriceRequest request5 = new GetOrderPriceRequest();
        request5.setAccountId(1);
        GetOrderPriceResponse response3 = port.getOrderPrice(request5);

        GetShippingRequest request6 = new GetShippingRequest();
        request6.setAccoundId(1);
        GetShippingResponse response1 = port.getShipping(request6);
        System.out.println(response1.getUserName());
        System.out.println(response1.getClientShipping().toString());

        GetAllAccountResponse response2 = port.getAllAccount(request);
        List<Account> newaccounts = new ArrayList<>();
        newaccounts.addAll(response2.getAllAccounts());
        for (Account account: newaccounts) {
            System.out.println(account.toString());
        }
        System.out.println("Order sum: " + response3.getPrice());

    }
}
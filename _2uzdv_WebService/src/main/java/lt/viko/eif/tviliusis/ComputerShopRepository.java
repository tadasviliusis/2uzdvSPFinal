package lt.viko.eif.tviliusis;

import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;
import lt.viko.eif.tviliusis.model.Account;
import lt.viko.eif.tviliusis.model.Categories;
import lt.viko.eif.tviliusis.model.ClientShipping;
import lt.viko.eif.tviliusis.model.Components;
import org.springframework.stereotype.Component;

/**
 * MoviesRepository class representing a repository for storing movies and related data.
 */
@Component
public class ComputerShopRepository {

    private static final List<Account> accounts = new ArrayList<>();

    /**
     * Initializes the repository with some predefined data.
     */
    @PostConstruct
    public void initData() {
        Components mb1 = new Components(1, "Asus ROG STRIX B550", 120.99);
        Components mb2 = new Components(2, "Gigabyte Elite AX V2", 169.99);
        Categories category = new Categories(1, "Motherboard", List.of(mb1, mb2));
        ClientShipping clientShipping = new ClientShipping(1, 869784526, "Verkiu g.45", "LT00762");
        Account account1 = new Account(1, "Tadas", "1515", clientShipping, List.of(category));
        accounts.add(account1);

    }

    public List<Account> getAllAccount() {
        return accounts;
    }

    public String getUserName(int ID) {
        for (Account account:accounts){
            if (account.getId() == ID)
                return account.getUserName();
        }
        return "account not found";
    }

    public ClientShipping getClientShipping(int ID){
        for (Account account:accounts){
            if (account.getId() == ID)
                return account.getClientShipping();
        }
        return new ClientShipping();
    }

    public double getOrderPrice(int ID) {
        double price = 0;
        for (Account account:accounts){
            if (account.getId() == ID){
                for (Categories categories:account.getCategories()){
                    for (Components components:categories.getComponents()){
                        price += components.getPrice();
                    }
                }
            }

        }
        return price;
    }

    public boolean deleteShipping(int ID) {
        for (Account account:accounts){
            if (account.getId() == ID) {
                account.getClientShipping().setPhoneNumber(0);
                account.getClientShipping().setAddress("Canceled");
                account.getClientShipping().setPostCode("Canceled");
            return true;
            }
        }
        return false;
    }

    public Account changeUser(int ID, String userName, String password){
        for (Account account:accounts){
            if (account.getId() == ID) {
                account.setUserName(userName);
                account.setPassword(password);
                return account; }
        }
        return new Account();
    }

    public List<Components> addComponent(int accountID, int categorieID, Components components) {
        for (Account account : accounts) {
            if (account.getId() == accountID) {
                for (Categories categories : account.getCategories()) {
                    if (categories.getId() == categorieID) {
                        List<Components> componentList = new ArrayList<>(categories.getComponents());
                        componentList.add(components);
                        categories.setComponents(componentList);
                        return categories.getComponents();
                    }
                }
            }
        }
        return new ArrayList<>();
    }


    public boolean deleteComponent(int accountID, int categorieID, int componentID) {
        int temp = 0;
        boolean isDeleted = false;
        for (Account account : accounts) {
            if (account.getId() == accountID) {
                for (Categories categories : account.getCategories()) {
                    if (categories.getId() == categorieID) {
                        for (Components component : categories.getComponents()) {
                            if (component.getId() == componentID)
                            {
                                temp = categories.getComponents().indexOf(component);
                                isDeleted = true;
                            }
                        }
                    }
                    if(isDeleted)
                    {
                        List<Components> componentList = new ArrayList<>(categories.getComponents());
                        componentList.remove(temp);
                        categories.setComponents(componentList);
                        return isDeleted;
                    }

                }
            }
        }

        return isDeleted;
    }
}

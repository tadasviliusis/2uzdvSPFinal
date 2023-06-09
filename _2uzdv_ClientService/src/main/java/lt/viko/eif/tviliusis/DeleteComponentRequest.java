
package lt.viko.eif.tviliusis;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="categorieId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="componentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountId",
    "categorieId",
    "componentId"
})
@XmlRootElement(name = "deleteComponentRequest")
public class DeleteComponentRequest {

    protected int accountId;
    protected int categorieId;
    protected int componentId;

    /**
     * Gets the value of the accountId property.
     * 
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(int value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the categorieId property.
     * 
     */
    public int getCategorieId() {
        return categorieId;
    }

    /**
     * Sets the value of the categorieId property.
     * 
     */
    public void setCategorieId(int value) {
        this.categorieId = value;
    }

    /**
     * Gets the value of the componentId property.
     * 
     */
    public int getComponentId() {
        return componentId;
    }

    /**
     * Sets the value of the componentId property.
     * 
     */
    public void setComponentId(int value) {
        this.componentId = value;
    }

}

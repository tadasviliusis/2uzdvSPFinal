
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
 *         &lt;element name="accountID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="categorieID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="component" type="{http://spring.io/guides/gs-producing-web-service}components"/>
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
    "accountID",
    "categorieID",
    "component"
})
@XmlRootElement(name = "addComponentRequest")
public class AddComponentRequest {

    protected int accountID;
    protected int categorieID;
    @XmlElement(required = true)
    protected Components component;

    /**
     * Gets the value of the accountID property.
     * 
     */
    public int getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     */
    public void setAccountID(int value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the categorieID property.
     * 
     */
    public int getCategorieID() {
        return categorieID;
    }

    /**
     * Sets the value of the categorieID property.
     * 
     */
    public void setCategorieID(int value) {
        this.categorieID = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link Components }
     *     
     */
    public Components getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link Components }
     *     
     */
    public void setComponent(Components value) {
        this.component = value;
    }

}

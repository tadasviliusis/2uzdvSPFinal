
package lt.viko.eif.tviliusis;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for components complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="components">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="componentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "components", propOrder = {
    "id",
    "componentName",
    "price"
})
public class Components {

    protected int id;
    @XmlElement(required = true)
    protected String componentName;
    protected double price;

    public Components(int id, String componentName, double price) {
        this.id = id;
        this.componentName = componentName;
        this.price = price;
    }

    public Components() {
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the componentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     * Sets the value of the componentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentName(String value) {
        this.componentName = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    @Override
    public String toString() {
        return "Components{" +
                "id=" + id +
                ", componentName='" + componentName + '\'' +
                ", price=" + price +
                '}';
    }
}

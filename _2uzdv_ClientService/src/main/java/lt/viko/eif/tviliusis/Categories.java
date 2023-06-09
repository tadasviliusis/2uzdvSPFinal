
package lt.viko.eif.tviliusis;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for categories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="categories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="categorieName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="components" type="{http://spring.io/guides/gs-producing-web-service}components" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categories", propOrder = {
    "id",
    "categorieName",
    "components"
})
public class Categories {

    protected int id;
    @XmlElement(required = true)
    protected String categorieName;
    protected List<Components> components;

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
     * Gets the value of the categorieName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorieName() {
        return categorieName;
    }

    /**
     * Sets the value of the categorieName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorieName(String value) {
        this.categorieName = value;
    }

    /**
     * Gets the value of the components property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the components property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Components }
     * 
     * 
     */
    public List<Components> getComponents() {
        if (components == null) {
            components = new ArrayList<Components>();
        }
        return this.components;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", categorieName='" + categorieName + '\'' +
                ", components=" + components +
                '}';
    }
}

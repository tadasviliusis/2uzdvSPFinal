
package lt.viko.eif.tviliusis;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="allComponents" type="{http://spring.io/guides/gs-producing-web-service}components" maxOccurs="unbounded"/>
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
    "allComponents"
})
@XmlRootElement(name = "addComponentResponse")
public class AddComponentResponse {

    @XmlElement(required = true)
    protected List<Components> allComponents;

    /**
     * Gets the value of the allComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Components }
     * 
     * 
     */
    public List<Components> getAllComponents() {
        if (allComponents == null) {
            allComponents = new ArrayList<Components>();
        }
        return this.allComponents;
    }

}

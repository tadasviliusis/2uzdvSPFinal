
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
 *         &lt;element name="accoundId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "accoundId"
})
@XmlRootElement(name = "getShippingRequest")
public class GetShippingRequest {

    protected int accoundId;

    /**
     * Gets the value of the accoundId property.
     * 
     */
    public int getAccoundId() {
        return accoundId;
    }

    /**
     * Sets the value of the accoundId property.
     * 
     */
    public void setAccoundId(int value) {
        this.accoundId = value;
    }

}

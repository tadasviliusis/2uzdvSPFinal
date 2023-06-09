
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
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientShipping" type="{http://spring.io/guides/gs-producing-web-service}clientShipping"/>
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
    "userName",
    "clientShipping"
})
@XmlRootElement(name = "getShippingResponse")
public class GetShippingResponse {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected ClientShipping clientShipping;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the clientShipping property.
     * 
     * @return
     *     possible object is
     *     {@link ClientShipping }
     *     
     */
    public ClientShipping getClientShipping() {
        return clientShipping;
    }

    /**
     * Sets the value of the clientShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientShipping }
     *     
     */
    public void setClientShipping(ClientShipping value) {
        this.clientShipping = value;
    }

}

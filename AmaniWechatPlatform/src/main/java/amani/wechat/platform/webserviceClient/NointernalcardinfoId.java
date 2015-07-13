
package amani.wechat.platform.webserviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NointernalcardinfoId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NointernalcardinfoId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardvesting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createcardtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createcardtypename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NointernalcardinfoId", namespace = "http://model.amani.com", propOrder = {
    "cardno",
    "cardvesting",
    "createcardtype",
    "createcardtypename"
})
public class NointernalcardinfoId {

    @XmlElementRef(name = "cardno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardno;
    @XmlElementRef(name = "cardvesting", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardvesting;
    @XmlElementRef(name = "createcardtype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createcardtype;
    @XmlElementRef(name = "createcardtypename", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createcardtypename;

    /**
     * Gets the value of the cardno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardno() {
        return cardno;
    }

    /**
     * Sets the value of the cardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardno(JAXBElement<String> value) {
        this.cardno = value;
    }

    /**
     * Gets the value of the cardvesting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardvesting() {
        return cardvesting;
    }

    /**
     * Sets the value of the cardvesting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardvesting(JAXBElement<String> value) {
        this.cardvesting = value;
    }

    /**
     * Gets the value of the createcardtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatecardtype() {
        return createcardtype;
    }

    /**
     * Sets the value of the createcardtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatecardtype(JAXBElement<String> value) {
        this.createcardtype = value;
    }

    /**
     * Gets the value of the createcardtypename property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatecardtypename() {
        return createcardtypename;
    }

    /**
     * Sets the value of the createcardtypename property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatecardtypename(JAXBElement<String> value) {
        this.createcardtypename = value;
    }

}


package amani.wechat.platform.webserviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vouchersdetal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vouchersdetal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="id" type="{http://model.amani.com}VouchersdetalId" minOccurs="0"/>
 *         &lt;element name="vchtype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vouchersdetal", namespace = "http://model.amani.com", propOrder = {
    "amt",
    "id",
    "vchtype"
})
public class Vouchersdetal {

    @XmlElementRef(name = "amt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> amt;
    @XmlElementRef(name = "id", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<VouchersdetalId> id;
    @XmlElementRef(name = "vchtype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> vchtype;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAmt(JAXBElement<Double> value) {
        this.amt = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VouchersdetalId }{@code >}
     *     
     */
    public JAXBElement<VouchersdetalId> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VouchersdetalId }{@code >}
     *     
     */
    public void setId(JAXBElement<VouchersdetalId> value) {
        this.id = value;
    }

    /**
     * Gets the value of the vchtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVchtype() {
        return vchtype;
    }

    /**
     * Sets the value of the vchtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVchtype(JAXBElement<Integer> value) {
        this.vchtype = value;
    }

}

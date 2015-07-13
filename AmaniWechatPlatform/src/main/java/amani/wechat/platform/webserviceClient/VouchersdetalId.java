
package amani.wechat.platform.webserviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VouchersdetalId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VouchersdetalId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vchno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VouchersdetalId", namespace = "http://model.amani.com", propOrder = {
    "compid",
    "itemno",
    "vchno"
})
public class VouchersdetalId {

    @XmlElementRef(name = "compid", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compid;
    @XmlElementRef(name = "itemno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemno;
    @XmlElementRef(name = "vchno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vchno;

    /**
     * Gets the value of the compid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompid() {
        return compid;
    }

    /**
     * Sets the value of the compid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompid(JAXBElement<String> value) {
        this.compid = value;
    }

    /**
     * Gets the value of the itemno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemno() {
        return itemno;
    }

    /**
     * Sets the value of the itemno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemno(JAXBElement<String> value) {
        this.itemno = value;
    }

    /**
     * Gets the value of the vchno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVchno() {
        return vchno;
    }

    /**
     * Sets the value of the vchno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVchno(JAXBElement<String> value) {
        this.vchno = value;
    }

}

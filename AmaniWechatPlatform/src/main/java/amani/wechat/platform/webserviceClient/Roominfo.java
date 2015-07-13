
package amani.wechat.platform.webserviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Roominfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Roominfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Roominfo", namespace = "http://model.amani.com", propOrder = {
    "compno",
    "roomname",
    "roomno"
})
public class Roominfo {

    @XmlElementRef(name = "compno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compno;
    @XmlElementRef(name = "roomname", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomname;
    @XmlElementRef(name = "roomno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomno;

    /**
     * Gets the value of the compno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompno() {
        return compno;
    }

    /**
     * Sets the value of the compno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompno(JAXBElement<String> value) {
        this.compno = value;
    }

    /**
     * Gets the value of the roomname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomname() {
        return roomname;
    }

    /**
     * Sets the value of the roomname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomname(JAXBElement<String> value) {
        this.roomname = value;
    }

    /**
     * Gets the value of the roomno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomno() {
        return roomno;
    }

    /**
     * Sets the value of the roomno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomno(JAXBElement<String> value) {
        this.roomno = value;
    }

}


package amani.wechat.platform.webserviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodsinfoId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsinfoId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="goodsmodeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodsno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodssource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsinfoId", namespace = "http://model.amani.com", propOrder = {
    "goodsmodeid",
    "goodsno",
    "goodssource"
})
public class GoodsinfoId {

    @XmlElementRef(name = "goodsmodeid", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsmodeid;
    @XmlElementRef(name = "goodsno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsno;
    @XmlElementRef(name = "goodssource", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodssource;

    /**
     * Gets the value of the goodsmodeid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodsmodeid() {
        return goodsmodeid;
    }

    /**
     * Sets the value of the goodsmodeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodsmodeid(JAXBElement<String> value) {
        this.goodsmodeid = value;
    }

    /**
     * Gets the value of the goodsno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodsno() {
        return goodsno;
    }

    /**
     * Sets the value of the goodsno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodsno(JAXBElement<String> value) {
        this.goodsno = value;
    }

    /**
     * Gets the value of the goodssource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodssource() {
        return goodssource;
    }

    /**
     * Sets the value of the goodssource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodssource(JAXBElement<String> value) {
        this.goodssource = value;
    }

}


package amani.wechat.platform.webserviceClient;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Nointernalcardinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Nointernalcardinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bcardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bcardvesting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardfaceamt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cardpassward" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardstate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cardstateText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardtype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carduseflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carduseflagText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createcardtype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="createcardtypename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createtype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="enabledate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entrytype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrytypeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://model.amani.com}NointernalcardinfoId" minOccurs="0"/>
 *         &lt;element name="lastvalidate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldvalidate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uespassward" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useinproject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nointernalcardinfo", namespace = "http://model.amani.com", propOrder = {
    "bcardno",
    "bcardvesting",
    "billid",
    "cardfaceamt",
    "cardpassward",
    "cardstate",
    "cardstateText",
    "cardtype",
    "carduseflag",
    "carduseflagText",
    "createcardtype",
    "createcardtypename",
    "createtype",
    "enabledate",
    "entrytype",
    "entrytypeText",
    "id",
    "lastvalidate",
    "oldvalidate",
    "phone",
    "uespassward",
    "usedate",
    "useinproject"
})
public class Nointernalcardinfo {

    @XmlElementRef(name = "bcardno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bcardno;
    @XmlElementRef(name = "bcardvesting", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bcardvesting;
    @XmlElementRef(name = "billid", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billid;
    @XmlElementRef(name = "cardfaceamt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> cardfaceamt;
    @XmlElementRef(name = "cardpassward", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardpassward;
    @XmlElementRef(name = "cardstate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cardstate;
    @XmlElementRef(name = "cardstateText", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardstateText;
    @XmlElementRef(name = "cardtype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cardtype;
    @XmlElementRef(name = "carduseflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> carduseflag;
    @XmlElementRef(name = "carduseflagText", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carduseflagText;
    @XmlElementRef(name = "createcardtype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> createcardtype;
    @XmlElementRef(name = "createcardtypename", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createcardtypename;
    @XmlElementRef(name = "createtype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> createtype;
    @XmlElementRef(name = "enabledate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enabledate;
    @XmlElementRef(name = "entrytype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> entrytype;
    @XmlElementRef(name = "entrytypeText", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entrytypeText;
    @XmlElementRef(name = "id", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<NointernalcardinfoId> id;
    @XmlElementRef(name = "lastvalidate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastvalidate;
    @XmlElementRef(name = "oldvalidate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oldvalidate;
    @XmlElementRef(name = "phone", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "uespassward", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> uespassward;
    @XmlElementRef(name = "usedate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usedate;
    @XmlElementRef(name = "useinproject", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> useinproject;

    /**
     * Gets the value of the bcardno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcardno() {
        return bcardno;
    }

    /**
     * Sets the value of the bcardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcardno(JAXBElement<String> value) {
        this.bcardno = value;
    }

    /**
     * Gets the value of the bcardvesting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcardvesting() {
        return bcardvesting;
    }

    /**
     * Sets the value of the bcardvesting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcardvesting(JAXBElement<String> value) {
        this.bcardvesting = value;
    }

    /**
     * Gets the value of the billid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillid() {
        return billid;
    }

    /**
     * Sets the value of the billid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillid(JAXBElement<String> value) {
        this.billid = value;
    }

    /**
     * Gets the value of the cardfaceamt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCardfaceamt() {
        return cardfaceamt;
    }

    /**
     * Sets the value of the cardfaceamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCardfaceamt(JAXBElement<BigDecimal> value) {
        this.cardfaceamt = value;
    }

    /**
     * Gets the value of the cardpassward property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardpassward() {
        return cardpassward;
    }

    /**
     * Sets the value of the cardpassward property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardpassward(JAXBElement<String> value) {
        this.cardpassward = value;
    }

    /**
     * Gets the value of the cardstate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCardstate() {
        return cardstate;
    }

    /**
     * Sets the value of the cardstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCardstate(JAXBElement<Integer> value) {
        this.cardstate = value;
    }

    /**
     * Gets the value of the cardstateText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardstateText() {
        return cardstateText;
    }

    /**
     * Sets the value of the cardstateText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardstateText(JAXBElement<String> value) {
        this.cardstateText = value;
    }

    /**
     * Gets the value of the cardtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCardtype() {
        return cardtype;
    }

    /**
     * Sets the value of the cardtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCardtype(JAXBElement<Integer> value) {
        this.cardtype = value;
    }

    /**
     * Gets the value of the carduseflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCarduseflag() {
        return carduseflag;
    }

    /**
     * Sets the value of the carduseflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCarduseflag(JAXBElement<Integer> value) {
        this.carduseflag = value;
    }

    /**
     * Gets the value of the carduseflagText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarduseflagText() {
        return carduseflagText;
    }

    /**
     * Sets the value of the carduseflagText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarduseflagText(JAXBElement<String> value) {
        this.carduseflagText = value;
    }

    /**
     * Gets the value of the createcardtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCreatecardtype() {
        return createcardtype;
    }

    /**
     * Sets the value of the createcardtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCreatecardtype(JAXBElement<Integer> value) {
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

    /**
     * Gets the value of the createtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCreatetype() {
        return createtype;
    }

    /**
     * Sets the value of the createtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCreatetype(JAXBElement<Integer> value) {
        this.createtype = value;
    }

    /**
     * Gets the value of the enabledate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnabledate() {
        return enabledate;
    }

    /**
     * Sets the value of the enabledate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnabledate(JAXBElement<String> value) {
        this.enabledate = value;
    }

    /**
     * Gets the value of the entrytype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEntrytype() {
        return entrytype;
    }

    /**
     * Sets the value of the entrytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEntrytype(JAXBElement<Integer> value) {
        this.entrytype = value;
    }

    /**
     * Gets the value of the entrytypeText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntrytypeText() {
        return entrytypeText;
    }

    /**
     * Sets the value of the entrytypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntrytypeText(JAXBElement<String> value) {
        this.entrytypeText = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NointernalcardinfoId }{@code >}
     *     
     */
    public JAXBElement<NointernalcardinfoId> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NointernalcardinfoId }{@code >}
     *     
     */
    public void setId(JAXBElement<NointernalcardinfoId> value) {
        this.id = value;
    }

    /**
     * Gets the value of the lastvalidate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastvalidate() {
        return lastvalidate;
    }

    /**
     * Sets the value of the lastvalidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastvalidate(JAXBElement<String> value) {
        this.lastvalidate = value;
    }

    /**
     * Gets the value of the oldvalidate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOldvalidate() {
        return oldvalidate;
    }

    /**
     * Sets the value of the oldvalidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOldvalidate(JAXBElement<String> value) {
        this.oldvalidate = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = value;
    }

    /**
     * Gets the value of the uespassward property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUespassward() {
        return uespassward;
    }

    /**
     * Sets the value of the uespassward property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUespassward(JAXBElement<Integer> value) {
        this.uespassward = value;
    }

    /**
     * Gets the value of the usedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsedate() {
        return usedate;
    }

    /**
     * Sets the value of the usedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsedate(JAXBElement<String> value) {
        this.usedate = value;
    }

    /**
     * Gets the value of the useinproject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUseinproject() {
        return useinproject;
    }

    /**
     * Sets the value of the useinproject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUseinproject(JAXBElement<String> value) {
        this.useinproject = value;
    }

}

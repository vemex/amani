
package amani.wechat.platform.webserviceClient;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Companyinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Companyinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compadslno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compadslpassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comparea" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="compfex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compipaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compipaddressex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compmode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comprent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="compresponsible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compstateText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comptradelicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compzipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipadpwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mangerPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mirrornumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopwf1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopwf10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopwf2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopwf3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopwf4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopwf5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopwf6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopwf7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopwf8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopwf9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xcoordinate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ycoordinate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Companyinfo", namespace = "http://model.amani.com", propOrder = {
    "compaddress",
    "compadslno",
    "compadslpassword",
    "comparea",
    "compfex",
    "compipaddress",
    "compipaddressex",
    "compmode",
    "compname",
    "compno",
    "compphone",
    "comprent",
    "compresponsible",
    "compstate",
    "compstateText",
    "comptradelicense",
    "compzipcode",
    "createdate",
    "ipadpwd",
    "mangerPassword",
    "mirrornumber",
    "model",
    "region",
    "shopwf1",
    "shopwf10",
    "shopwf2",
    "shopwf3",
    "shopwf4",
    "shopwf5",
    "shopwf6",
    "shopwf7",
    "shopwf8",
    "shopwf9",
    "xcoordinate",
    "ycoordinate"
})
public class Companyinfo {

    @XmlElementRef(name = "compaddress", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compaddress;
    @XmlElementRef(name = "compadslno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compadslno;
    @XmlElementRef(name = "compadslpassword", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compadslpassword;
    @XmlElementRef(name = "comparea", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> comparea;
    @XmlElementRef(name = "compfex", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compfex;
    @XmlElementRef(name = "compipaddress", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compipaddress;
    @XmlElementRef(name = "compipaddressex", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compipaddressex;
    @XmlElementRef(name = "compmode", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compmode;
    @XmlElementRef(name = "compname", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compname;
    @XmlElementRef(name = "compno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compno;
    @XmlElementRef(name = "compphone", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compphone;
    @XmlElementRef(name = "comprent", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> comprent;
    @XmlElementRef(name = "compresponsible", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compresponsible;
    @XmlElementRef(name = "compstate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compstate;
    @XmlElementRef(name = "compstateText", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compstateText;
    @XmlElementRef(name = "comptradelicense", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comptradelicense;
    @XmlElementRef(name = "compzipcode", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compzipcode;
    @XmlElementRef(name = "createdate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdate;
    @XmlElementRef(name = "ipadpwd", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ipadpwd;
    @XmlElementRef(name = "mangerPassword", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mangerPassword;
    @XmlElementRef(name = "mirrornumber", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> mirrornumber;
    @XmlElementRef(name = "model", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> model;
    @XmlElementRef(name = "region", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> region;
    @XmlElementRef(name = "shopwf1", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shopwf1;
    @XmlElementRef(name = "shopwf10", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shopwf10;
    @XmlElementRef(name = "shopwf2", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shopwf2;
    @XmlElementRef(name = "shopwf3", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shopwf3;
    @XmlElementRef(name = "shopwf4", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shopwf4;
    @XmlElementRef(name = "shopwf5", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shopwf5;
    @XmlElementRef(name = "shopwf6", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shopwf6;
    @XmlElementRef(name = "shopwf7", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shopwf7;
    @XmlElementRef(name = "shopwf8", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shopwf8;
    @XmlElementRef(name = "shopwf9", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shopwf9;
    @XmlElementRef(name = "xcoordinate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xcoordinate;
    @XmlElementRef(name = "ycoordinate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ycoordinate;

    /**
     * Gets the value of the compaddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompaddress() {
        return compaddress;
    }

    /**
     * Sets the value of the compaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompaddress(JAXBElement<String> value) {
        this.compaddress = value;
    }

    /**
     * Gets the value of the compadslno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompadslno() {
        return compadslno;
    }

    /**
     * Sets the value of the compadslno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompadslno(JAXBElement<String> value) {
        this.compadslno = value;
    }

    /**
     * Gets the value of the compadslpassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompadslpassword() {
        return compadslpassword;
    }

    /**
     * Sets the value of the compadslpassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompadslpassword(JAXBElement<String> value) {
        this.compadslpassword = value;
    }

    /**
     * Gets the value of the comparea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getComparea() {
        return comparea;
    }

    /**
     * Sets the value of the comparea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setComparea(JAXBElement<BigDecimal> value) {
        this.comparea = value;
    }

    /**
     * Gets the value of the compfex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompfex() {
        return compfex;
    }

    /**
     * Sets the value of the compfex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompfex(JAXBElement<String> value) {
        this.compfex = value;
    }

    /**
     * Gets the value of the compipaddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompipaddress() {
        return compipaddress;
    }

    /**
     * Sets the value of the compipaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompipaddress(JAXBElement<String> value) {
        this.compipaddress = value;
    }

    /**
     * Gets the value of the compipaddressex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompipaddressex() {
        return compipaddressex;
    }

    /**
     * Sets the value of the compipaddressex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompipaddressex(JAXBElement<String> value) {
        this.compipaddressex = value;
    }

    /**
     * Gets the value of the compmode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompmode() {
        return compmode;
    }

    /**
     * Sets the value of the compmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompmode(JAXBElement<String> value) {
        this.compmode = value;
    }

    /**
     * Gets the value of the compname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompname() {
        return compname;
    }

    /**
     * Sets the value of the compname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompname(JAXBElement<String> value) {
        this.compname = value;
    }

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
     * Gets the value of the compphone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompphone() {
        return compphone;
    }

    /**
     * Sets the value of the compphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompphone(JAXBElement<String> value) {
        this.compphone = value;
    }

    /**
     * Gets the value of the comprent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getComprent() {
        return comprent;
    }

    /**
     * Sets the value of the comprent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setComprent(JAXBElement<BigDecimal> value) {
        this.comprent = value;
    }

    /**
     * Gets the value of the compresponsible property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompresponsible() {
        return compresponsible;
    }

    /**
     * Sets the value of the compresponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompresponsible(JAXBElement<String> value) {
        this.compresponsible = value;
    }

    /**
     * Gets the value of the compstate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompstate() {
        return compstate;
    }

    /**
     * Sets the value of the compstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompstate(JAXBElement<String> value) {
        this.compstate = value;
    }

    /**
     * Gets the value of the compstateText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompstateText() {
        return compstateText;
    }

    /**
     * Sets the value of the compstateText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompstateText(JAXBElement<String> value) {
        this.compstateText = value;
    }

    /**
     * Gets the value of the comptradelicense property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComptradelicense() {
        return comptradelicense;
    }

    /**
     * Sets the value of the comptradelicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComptradelicense(JAXBElement<String> value) {
        this.comptradelicense = value;
    }

    /**
     * Gets the value of the compzipcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompzipcode() {
        return compzipcode;
    }

    /**
     * Sets the value of the compzipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompzipcode(JAXBElement<String> value) {
        this.compzipcode = value;
    }

    /**
     * Gets the value of the createdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedate() {
        return createdate;
    }

    /**
     * Sets the value of the createdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedate(JAXBElement<String> value) {
        this.createdate = value;
    }

    /**
     * Gets the value of the ipadpwd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIpadpwd() {
        return ipadpwd;
    }

    /**
     * Sets the value of the ipadpwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIpadpwd(JAXBElement<String> value) {
        this.ipadpwd = value;
    }

    /**
     * Gets the value of the mangerPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMangerPassword() {
        return mangerPassword;
    }

    /**
     * Sets the value of the mangerPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMangerPassword(JAXBElement<String> value) {
        this.mangerPassword = value;
    }

    /**
     * Gets the value of the mirrornumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMirrornumber() {
        return mirrornumber;
    }

    /**
     * Sets the value of the mirrornumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMirrornumber(JAXBElement<BigDecimal> value) {
        this.mirrornumber = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setModel(JAXBElement<Integer> value) {
        this.model = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegion(JAXBElement<String> value) {
        this.region = value;
    }

    /**
     * Gets the value of the shopwf1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShopwf1() {
        return shopwf1;
    }

    /**
     * Sets the value of the shopwf1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShopwf1(JAXBElement<String> value) {
        this.shopwf1 = value;
    }

    /**
     * Gets the value of the shopwf10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShopwf10() {
        return shopwf10;
    }

    /**
     * Sets the value of the shopwf10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShopwf10(JAXBElement<String> value) {
        this.shopwf10 = value;
    }

    /**
     * Gets the value of the shopwf2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShopwf2() {
        return shopwf2;
    }

    /**
     * Sets the value of the shopwf2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShopwf2(JAXBElement<String> value) {
        this.shopwf2 = value;
    }

    /**
     * Gets the value of the shopwf3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShopwf3() {
        return shopwf3;
    }

    /**
     * Sets the value of the shopwf3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShopwf3(JAXBElement<String> value) {
        this.shopwf3 = value;
    }

    /**
     * Gets the value of the shopwf4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShopwf4() {
        return shopwf4;
    }

    /**
     * Sets the value of the shopwf4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShopwf4(JAXBElement<String> value) {
        this.shopwf4 = value;
    }

    /**
     * Gets the value of the shopwf5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShopwf5() {
        return shopwf5;
    }

    /**
     * Sets the value of the shopwf5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShopwf5(JAXBElement<String> value) {
        this.shopwf5 = value;
    }

    /**
     * Gets the value of the shopwf6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShopwf6() {
        return shopwf6;
    }

    /**
     * Sets the value of the shopwf6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShopwf6(JAXBElement<String> value) {
        this.shopwf6 = value;
    }

    /**
     * Gets the value of the shopwf7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShopwf7() {
        return shopwf7;
    }

    /**
     * Sets the value of the shopwf7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShopwf7(JAXBElement<String> value) {
        this.shopwf7 = value;
    }

    /**
     * Gets the value of the shopwf8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShopwf8() {
        return shopwf8;
    }

    /**
     * Sets the value of the shopwf8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShopwf8(JAXBElement<String> value) {
        this.shopwf8 = value;
    }

    /**
     * Gets the value of the shopwf9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShopwf9() {
        return shopwf9;
    }

    /**
     * Sets the value of the shopwf9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShopwf9(JAXBElement<String> value) {
        this.shopwf9 = value;
    }

    /**
     * Gets the value of the xcoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXcoordinate() {
        return xcoordinate;
    }

    /**
     * Sets the value of the xcoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXcoordinate(JAXBElement<String> value) {
        this.xcoordinate = value;
    }

    /**
     * Gets the value of the ycoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYcoordinate() {
        return ycoordinate;
    }

    /**
     * Sets the value of the ycoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYcoordinate(JAXBElement<String> value) {
        this.ycoordinate = value;
    }

}

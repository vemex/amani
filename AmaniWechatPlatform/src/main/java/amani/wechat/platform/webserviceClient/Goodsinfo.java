
package amani.wechat.platform.webserviceClient;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Goodsinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Goodsinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bgoodsmodeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bgoodsno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bgoodssource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costamtbysale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="costunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finaltype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="goodsappsource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="goodsbarno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodsformat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodsname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodspricetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodssupplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodstype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodsuniquebar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodswarehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heightstock" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="id" type="{http://model.amani.com}GoodsinfoId" minOccurs="0"/>
 *         &lt;element name="lowstock" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="msaleprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pointtype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pointvalue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="purchaseprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="purchaseunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purtocostcount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="saletocostcount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="saleunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selfFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="shelflife" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="standprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="stopdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stopmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storesalseprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tctype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tcvalue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="useflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="yetype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="yevalue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Goodsinfo", namespace = "http://model.amani.com", propOrder = {
    "appflag",
    "bgoodsmodeid",
    "bgoodsno",
    "bgoodssource",
    "costamtbysale",
    "costunit",
    "createdate",
    "finaltype",
    "goodsappsource",
    "goodsbarno",
    "goodsformat",
    "goodsname",
    "goodspricetype",
    "goodssupplier",
    "goodstype",
    "goodsuniquebar",
    "goodswarehouse",
    "heightstock",
    "id",
    "lowstock",
    "msaleprice",
    "pointtype",
    "pointvalue",
    "purchaseprice",
    "purchaseunit",
    "purtocostcount",
    "saletocostcount",
    "saleunit",
    "selfFlag",
    "shelflife",
    "standprice",
    "stopdate",
    "stopmark",
    "storesalseprice",
    "tctype",
    "tcvalue",
    "useflag",
    "yetype",
    "yevalue"
})
public class Goodsinfo {

    @XmlElementRef(name = "appflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> appflag;
    @XmlElementRef(name = "bgoodsmodeid", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bgoodsmodeid;
    @XmlElementRef(name = "bgoodsno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bgoodsno;
    @XmlElementRef(name = "bgoodssource", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bgoodssource;
    @XmlElementRef(name = "costamtbysale", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> costamtbysale;
    @XmlElementRef(name = "costunit", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> costunit;
    @XmlElementRef(name = "createdate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdate;
    @XmlElementRef(name = "finaltype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> finaltype;
    @XmlElementRef(name = "goodsappsource", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> goodsappsource;
    @XmlElementRef(name = "goodsbarno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsbarno;
    @XmlElementRef(name = "goodsformat", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsformat;
    @XmlElementRef(name = "goodsname", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsname;
    @XmlElementRef(name = "goodspricetype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodspricetype;
    @XmlElementRef(name = "goodssupplier", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodssupplier;
    @XmlElementRef(name = "goodstype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodstype;
    @XmlElementRef(name = "goodsuniquebar", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsuniquebar;
    @XmlElementRef(name = "goodswarehouse", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodswarehouse;
    @XmlElementRef(name = "heightstock", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> heightstock;
    @XmlElementRef(name = "id", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<GoodsinfoId> id;
    @XmlElementRef(name = "lowstock", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> lowstock;
    @XmlElementRef(name = "msaleprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> msaleprice;
    @XmlElementRef(name = "pointtype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pointtype;
    @XmlElementRef(name = "pointvalue", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pointvalue;
    @XmlElementRef(name = "purchaseprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> purchaseprice;
    @XmlElementRef(name = "purchaseunit", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseunit;
    @XmlElementRef(name = "purtocostcount", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> purtocostcount;
    @XmlElementRef(name = "saletocostcount", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> saletocostcount;
    @XmlElementRef(name = "saleunit", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> saleunit;
    protected Integer selfFlag;
    @XmlElementRef(name = "shelflife", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> shelflife;
    @XmlElementRef(name = "standprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> standprice;
    @XmlElementRef(name = "stopdate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopdate;
    @XmlElementRef(name = "stopmark", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopmark;
    @XmlElementRef(name = "storesalseprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> storesalseprice;
    @XmlElementRef(name = "tctype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tctype;
    @XmlElementRef(name = "tcvalue", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> tcvalue;
    @XmlElementRef(name = "useflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> useflag;
    @XmlElementRef(name = "yetype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> yetype;
    @XmlElementRef(name = "yevalue", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> yevalue;

    /**
     * Gets the value of the appflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAppflag() {
        return appflag;
    }

    /**
     * Sets the value of the appflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAppflag(JAXBElement<Integer> value) {
        this.appflag = value;
    }

    /**
     * Gets the value of the bgoodsmodeid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBgoodsmodeid() {
        return bgoodsmodeid;
    }

    /**
     * Sets the value of the bgoodsmodeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBgoodsmodeid(JAXBElement<String> value) {
        this.bgoodsmodeid = value;
    }

    /**
     * Gets the value of the bgoodsno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBgoodsno() {
        return bgoodsno;
    }

    /**
     * Sets the value of the bgoodsno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBgoodsno(JAXBElement<String> value) {
        this.bgoodsno = value;
    }

    /**
     * Gets the value of the bgoodssource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBgoodssource() {
        return bgoodssource;
    }

    /**
     * Sets the value of the bgoodssource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBgoodssource(JAXBElement<String> value) {
        this.bgoodssource = value;
    }

    /**
     * Gets the value of the costamtbysale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCostamtbysale() {
        return costamtbysale;
    }

    /**
     * Sets the value of the costamtbysale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCostamtbysale(JAXBElement<BigDecimal> value) {
        this.costamtbysale = value;
    }

    /**
     * Gets the value of the costunit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCostunit() {
        return costunit;
    }

    /**
     * Sets the value of the costunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCostunit(JAXBElement<String> value) {
        this.costunit = value;
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
     * Gets the value of the finaltype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFinaltype() {
        return finaltype;
    }

    /**
     * Sets the value of the finaltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFinaltype(JAXBElement<Integer> value) {
        this.finaltype = value;
    }

    /**
     * Gets the value of the goodsappsource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGoodsappsource() {
        return goodsappsource;
    }

    /**
     * Sets the value of the goodsappsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGoodsappsource(JAXBElement<Integer> value) {
        this.goodsappsource = value;
    }

    /**
     * Gets the value of the goodsbarno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodsbarno() {
        return goodsbarno;
    }

    /**
     * Sets the value of the goodsbarno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodsbarno(JAXBElement<String> value) {
        this.goodsbarno = value;
    }

    /**
     * Gets the value of the goodsformat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodsformat() {
        return goodsformat;
    }

    /**
     * Sets the value of the goodsformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodsformat(JAXBElement<String> value) {
        this.goodsformat = value;
    }

    /**
     * Gets the value of the goodsname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodsname() {
        return goodsname;
    }

    /**
     * Sets the value of the goodsname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodsname(JAXBElement<String> value) {
        this.goodsname = value;
    }

    /**
     * Gets the value of the goodspricetype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodspricetype() {
        return goodspricetype;
    }

    /**
     * Sets the value of the goodspricetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodspricetype(JAXBElement<String> value) {
        this.goodspricetype = value;
    }

    /**
     * Gets the value of the goodssupplier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodssupplier() {
        return goodssupplier;
    }

    /**
     * Sets the value of the goodssupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodssupplier(JAXBElement<String> value) {
        this.goodssupplier = value;
    }

    /**
     * Gets the value of the goodstype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodstype() {
        return goodstype;
    }

    /**
     * Sets the value of the goodstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodstype(JAXBElement<String> value) {
        this.goodstype = value;
    }

    /**
     * Gets the value of the goodsuniquebar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodsuniquebar() {
        return goodsuniquebar;
    }

    /**
     * Sets the value of the goodsuniquebar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodsuniquebar(JAXBElement<String> value) {
        this.goodsuniquebar = value;
    }

    /**
     * Gets the value of the goodswarehouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodswarehouse() {
        return goodswarehouse;
    }

    /**
     * Sets the value of the goodswarehouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodswarehouse(JAXBElement<String> value) {
        this.goodswarehouse = value;
    }

    /**
     * Gets the value of the heightstock property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHeightstock() {
        return heightstock;
    }

    /**
     * Sets the value of the heightstock property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHeightstock(JAXBElement<BigDecimal> value) {
        this.heightstock = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GoodsinfoId }{@code >}
     *     
     */
    public JAXBElement<GoodsinfoId> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GoodsinfoId }{@code >}
     *     
     */
    public void setId(JAXBElement<GoodsinfoId> value) {
        this.id = value;
    }

    /**
     * Gets the value of the lowstock property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLowstock() {
        return lowstock;
    }

    /**
     * Sets the value of the lowstock property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLowstock(JAXBElement<BigDecimal> value) {
        this.lowstock = value;
    }

    /**
     * Gets the value of the msaleprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMsaleprice() {
        return msaleprice;
    }

    /**
     * Sets the value of the msaleprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMsaleprice(JAXBElement<BigDecimal> value) {
        this.msaleprice = value;
    }

    /**
     * Gets the value of the pointtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPointtype() {
        return pointtype;
    }

    /**
     * Sets the value of the pointtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPointtype(JAXBElement<Integer> value) {
        this.pointtype = value;
    }

    /**
     * Gets the value of the pointvalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPointvalue() {
        return pointvalue;
    }

    /**
     * Sets the value of the pointvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPointvalue(JAXBElement<BigDecimal> value) {
        this.pointvalue = value;
    }

    /**
     * Gets the value of the purchaseprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPurchaseprice() {
        return purchaseprice;
    }

    /**
     * Sets the value of the purchaseprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPurchaseprice(JAXBElement<BigDecimal> value) {
        this.purchaseprice = value;
    }

    /**
     * Gets the value of the purchaseunit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchaseunit() {
        return purchaseunit;
    }

    /**
     * Sets the value of the purchaseunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchaseunit(JAXBElement<String> value) {
        this.purchaseunit = value;
    }

    /**
     * Gets the value of the purtocostcount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPurtocostcount() {
        return purtocostcount;
    }

    /**
     * Sets the value of the purtocostcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPurtocostcount(JAXBElement<BigDecimal> value) {
        this.purtocostcount = value;
    }

    /**
     * Gets the value of the saletocostcount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSaletocostcount() {
        return saletocostcount;
    }

    /**
     * Sets the value of the saletocostcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSaletocostcount(JAXBElement<BigDecimal> value) {
        this.saletocostcount = value;
    }

    /**
     * Gets the value of the saleunit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSaleunit() {
        return saleunit;
    }

    /**
     * Sets the value of the saleunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSaleunit(JAXBElement<String> value) {
        this.saleunit = value;
    }

    /**
     * Gets the value of the selfFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSelfFlag() {
        return selfFlag;
    }

    /**
     * Sets the value of the selfFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSelfFlag(Integer value) {
        this.selfFlag = value;
    }

    /**
     * Gets the value of the shelflife property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getShelflife() {
        return shelflife;
    }

    /**
     * Sets the value of the shelflife property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setShelflife(JAXBElement<Integer> value) {
        this.shelflife = value;
    }

    /**
     * Gets the value of the standprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStandprice() {
        return standprice;
    }

    /**
     * Sets the value of the standprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStandprice(JAXBElement<BigDecimal> value) {
        this.standprice = value;
    }

    /**
     * Gets the value of the stopdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopdate() {
        return stopdate;
    }

    /**
     * Sets the value of the stopdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopdate(JAXBElement<String> value) {
        this.stopdate = value;
    }

    /**
     * Gets the value of the stopmark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopmark() {
        return stopmark;
    }

    /**
     * Sets the value of the stopmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopmark(JAXBElement<String> value) {
        this.stopmark = value;
    }

    /**
     * Gets the value of the storesalseprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStoresalseprice() {
        return storesalseprice;
    }

    /**
     * Sets the value of the storesalseprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStoresalseprice(JAXBElement<BigDecimal> value) {
        this.storesalseprice = value;
    }

    /**
     * Gets the value of the tctype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTctype() {
        return tctype;
    }

    /**
     * Sets the value of the tctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTctype(JAXBElement<Integer> value) {
        this.tctype = value;
    }

    /**
     * Gets the value of the tcvalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTcvalue() {
        return tcvalue;
    }

    /**
     * Sets the value of the tcvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTcvalue(JAXBElement<BigDecimal> value) {
        this.tcvalue = value;
    }

    /**
     * Gets the value of the useflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUseflag() {
        return useflag;
    }

    /**
     * Sets the value of the useflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUseflag(JAXBElement<Integer> value) {
        this.useflag = value;
    }

    /**
     * Gets the value of the yetype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getYetype() {
        return yetype;
    }

    /**
     * Sets the value of the yetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setYetype(JAXBElement<Integer> value) {
        this.yetype = value;
    }

    /**
     * Gets the value of the yevalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getYevalue() {
        return yevalue;
    }

    /**
     * Sets the value of the yevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setYevalue(JAXBElement<BigDecimal> value) {
        this.yevalue = value;
    }

}

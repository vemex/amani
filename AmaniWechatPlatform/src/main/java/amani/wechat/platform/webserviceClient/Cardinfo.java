
package amani.wechat.platform.webserviceClient;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cardinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cardinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DCanCostAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DFillLowAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DSaleLowAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="account2Amt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="account2debtAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="account3Amt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="account3debtAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="account4Amt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="account4debtAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="account5Amt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="account5debtAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="account6Amt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="account6debtAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bcardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bcardvesting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardremark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardsource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cardstate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cardtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardtypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changeflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="changerule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="costamt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="costamtbydebts" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="costcountbydebts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="costpassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cutoffdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fillflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://model.amani.com}CardinfoId" minOccurs="0"/>
 *         &lt;element name="membername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="membernotocard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberpaperworkno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberpcid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="membersex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="openflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="salebillno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salecarddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchpassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendamtflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="showmemberphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slaeproerate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cardinfo", namespace = "http://model.amani.com", propOrder = {
    "dCanCostAmt",
    "dFillLowAmt",
    "dSaleLowAmt",
    "account2Amt",
    "account2DebtAmt",
    "account3Amt",
    "account3DebtAmt",
    "account4Amt",
    "account4DebtAmt",
    "account5Amt",
    "account5DebtAmt",
    "account6Amt",
    "account6DebtAmt",
    "bcardno",
    "bcardvesting",
    "cardremark",
    "cardsource",
    "cardstate",
    "cardtype",
    "cardtypeName",
    "changeflag",
    "changerule",
    "costamt",
    "costamtbydebts",
    "costcountbydebts",
    "costpassword",
    "cutoffdate",
    "fillflag",
    "id",
    "membername",
    "membernotocard",
    "memberpaperworkno",
    "memberpcid",
    "memberphone",
    "membersex",
    "openflag",
    "salebillno",
    "salecarddate",
    "searchpassword",
    "sendamtflag",
    "showmemberphone",
    "slaeproerate"
})
public class Cardinfo {

    @XmlElementRef(name = "DCanCostAmt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dCanCostAmt;
    @XmlElementRef(name = "DFillLowAmt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dFillLowAmt;
    @XmlElementRef(name = "DSaleLowAmt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dSaleLowAmt;
    @XmlElementRef(name = "account2Amt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> account2Amt;
    @XmlElementRef(name = "account2debtAmt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> account2DebtAmt;
    @XmlElementRef(name = "account3Amt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> account3Amt;
    @XmlElementRef(name = "account3debtAmt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> account3DebtAmt;
    @XmlElementRef(name = "account4Amt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> account4Amt;
    @XmlElementRef(name = "account4debtAmt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> account4DebtAmt;
    @XmlElementRef(name = "account5Amt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> account5Amt;
    @XmlElementRef(name = "account5debtAmt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> account5DebtAmt;
    @XmlElementRef(name = "account6Amt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> account6Amt;
    @XmlElementRef(name = "account6debtAmt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> account6DebtAmt;
    @XmlElementRef(name = "bcardno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bcardno;
    @XmlElementRef(name = "bcardvesting", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bcardvesting;
    @XmlElementRef(name = "cardremark", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardremark;
    @XmlElementRef(name = "cardsource", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cardsource;
    @XmlElementRef(name = "cardstate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cardstate;
    @XmlElementRef(name = "cardtype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardtype;
    @XmlElementRef(name = "cardtypeName", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardtypeName;
    @XmlElementRef(name = "changeflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> changeflag;
    @XmlElementRef(name = "changerule", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> changerule;
    @XmlElementRef(name = "costamt", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> costamt;
    @XmlElementRef(name = "costamtbydebts", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> costamtbydebts;
    @XmlElementRef(name = "costcountbydebts", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> costcountbydebts;
    @XmlElementRef(name = "costpassword", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> costpassword;
    @XmlElementRef(name = "cutoffdate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cutoffdate;
    @XmlElementRef(name = "fillflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fillflag;
    @XmlElementRef(name = "id", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<CardinfoId> id;
    @XmlElementRef(name = "membername", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> membername;
    @XmlElementRef(name = "membernotocard", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> membernotocard;
    @XmlElementRef(name = "memberpaperworkno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberpaperworkno;
    @XmlElementRef(name = "memberpcid", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberpcid;
    @XmlElementRef(name = "memberphone", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberphone;
    @XmlElementRef(name = "membersex", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> membersex;
    @XmlElementRef(name = "openflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> openflag;
    @XmlElementRef(name = "salebillno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salebillno;
    @XmlElementRef(name = "salecarddate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salecarddate;
    @XmlElementRef(name = "searchpassword", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> searchpassword;
    @XmlElementRef(name = "sendamtflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sendamtflag;
    @XmlElementRef(name = "showmemberphone", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> showmemberphone;
    @XmlElementRef(name = "slaeproerate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> slaeproerate;

    /**
     * Gets the value of the dCanCostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDCanCostAmt() {
        return dCanCostAmt;
    }

    /**
     * Sets the value of the dCanCostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDCanCostAmt(JAXBElement<BigDecimal> value) {
        this.dCanCostAmt = value;
    }

    /**
     * Gets the value of the dFillLowAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDFillLowAmt() {
        return dFillLowAmt;
    }

    /**
     * Sets the value of the dFillLowAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDFillLowAmt(JAXBElement<BigDecimal> value) {
        this.dFillLowAmt = value;
    }

    /**
     * Gets the value of the dSaleLowAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDSaleLowAmt() {
        return dSaleLowAmt;
    }

    /**
     * Sets the value of the dSaleLowAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDSaleLowAmt(JAXBElement<BigDecimal> value) {
        this.dSaleLowAmt = value;
    }

    /**
     * Gets the value of the account2Amt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAccount2Amt() {
        return account2Amt;
    }

    /**
     * Sets the value of the account2Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAccount2Amt(JAXBElement<BigDecimal> value) {
        this.account2Amt = value;
    }

    /**
     * Gets the value of the account2DebtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAccount2DebtAmt() {
        return account2DebtAmt;
    }

    /**
     * Sets the value of the account2DebtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAccount2DebtAmt(JAXBElement<BigDecimal> value) {
        this.account2DebtAmt = value;
    }

    /**
     * Gets the value of the account3Amt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAccount3Amt() {
        return account3Amt;
    }

    /**
     * Sets the value of the account3Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAccount3Amt(JAXBElement<BigDecimal> value) {
        this.account3Amt = value;
    }

    /**
     * Gets the value of the account3DebtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAccount3DebtAmt() {
        return account3DebtAmt;
    }

    /**
     * Sets the value of the account3DebtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAccount3DebtAmt(JAXBElement<BigDecimal> value) {
        this.account3DebtAmt = value;
    }

    /**
     * Gets the value of the account4Amt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAccount4Amt() {
        return account4Amt;
    }

    /**
     * Sets the value of the account4Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAccount4Amt(JAXBElement<BigDecimal> value) {
        this.account4Amt = value;
    }

    /**
     * Gets the value of the account4DebtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAccount4DebtAmt() {
        return account4DebtAmt;
    }

    /**
     * Sets the value of the account4DebtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAccount4DebtAmt(JAXBElement<BigDecimal> value) {
        this.account4DebtAmt = value;
    }

    /**
     * Gets the value of the account5Amt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAccount5Amt() {
        return account5Amt;
    }

    /**
     * Sets the value of the account5Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAccount5Amt(JAXBElement<BigDecimal> value) {
        this.account5Amt = value;
    }

    /**
     * Gets the value of the account5DebtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAccount5DebtAmt() {
        return account5DebtAmt;
    }

    /**
     * Sets the value of the account5DebtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAccount5DebtAmt(JAXBElement<BigDecimal> value) {
        this.account5DebtAmt = value;
    }

    /**
     * Gets the value of the account6Amt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAccount6Amt() {
        return account6Amt;
    }

    /**
     * Sets the value of the account6Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAccount6Amt(JAXBElement<BigDecimal> value) {
        this.account6Amt = value;
    }

    /**
     * Gets the value of the account6DebtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAccount6DebtAmt() {
        return account6DebtAmt;
    }

    /**
     * Sets the value of the account6DebtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAccount6DebtAmt(JAXBElement<BigDecimal> value) {
        this.account6DebtAmt = value;
    }

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
     * Gets the value of the cardremark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardremark() {
        return cardremark;
    }

    /**
     * Sets the value of the cardremark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardremark(JAXBElement<String> value) {
        this.cardremark = value;
    }

    /**
     * Gets the value of the cardsource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCardsource() {
        return cardsource;
    }

    /**
     * Sets the value of the cardsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCardsource(JAXBElement<Integer> value) {
        this.cardsource = value;
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
     * Gets the value of the cardtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardtype() {
        return cardtype;
    }

    /**
     * Sets the value of the cardtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardtype(JAXBElement<String> value) {
        this.cardtype = value;
    }

    /**
     * Gets the value of the cardtypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardtypeName() {
        return cardtypeName;
    }

    /**
     * Sets the value of the cardtypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardtypeName(JAXBElement<String> value) {
        this.cardtypeName = value;
    }

    /**
     * Gets the value of the changeflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getChangeflag() {
        return changeflag;
    }

    /**
     * Sets the value of the changeflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setChangeflag(JAXBElement<Integer> value) {
        this.changeflag = value;
    }

    /**
     * Gets the value of the changerule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getChangerule() {
        return changerule;
    }

    /**
     * Sets the value of the changerule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setChangerule(JAXBElement<Integer> value) {
        this.changerule = value;
    }

    /**
     * Gets the value of the costamt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCostamt() {
        return costamt;
    }

    /**
     * Sets the value of the costamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCostamt(JAXBElement<BigDecimal> value) {
        this.costamt = value;
    }

    /**
     * Gets the value of the costamtbydebts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCostamtbydebts() {
        return costamtbydebts;
    }

    /**
     * Sets the value of the costamtbydebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCostamtbydebts(JAXBElement<BigDecimal> value) {
        this.costamtbydebts = value;
    }

    /**
     * Gets the value of the costcountbydebts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCostcountbydebts() {
        return costcountbydebts;
    }

    /**
     * Sets the value of the costcountbydebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCostcountbydebts(JAXBElement<Integer> value) {
        this.costcountbydebts = value;
    }

    /**
     * Gets the value of the costpassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCostpassword() {
        return costpassword;
    }

    /**
     * Sets the value of the costpassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCostpassword(JAXBElement<String> value) {
        this.costpassword = value;
    }

    /**
     * Gets the value of the cutoffdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCutoffdate() {
        return cutoffdate;
    }

    /**
     * Sets the value of the cutoffdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCutoffdate(JAXBElement<String> value) {
        this.cutoffdate = value;
    }

    /**
     * Gets the value of the fillflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFillflag() {
        return fillflag;
    }

    /**
     * Sets the value of the fillflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFillflag(JAXBElement<Integer> value) {
        this.fillflag = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CardinfoId }{@code >}
     *     
     */
    public JAXBElement<CardinfoId> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CardinfoId }{@code >}
     *     
     */
    public void setId(JAXBElement<CardinfoId> value) {
        this.id = value;
    }

    /**
     * Gets the value of the membername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMembername() {
        return membername;
    }

    /**
     * Sets the value of the membername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMembername(JAXBElement<String> value) {
        this.membername = value;
    }

    /**
     * Gets the value of the membernotocard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMembernotocard() {
        return membernotocard;
    }

    /**
     * Sets the value of the membernotocard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMembernotocard(JAXBElement<String> value) {
        this.membernotocard = value;
    }

    /**
     * Gets the value of the memberpaperworkno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberpaperworkno() {
        return memberpaperworkno;
    }

    /**
     * Sets the value of the memberpaperworkno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberpaperworkno(JAXBElement<String> value) {
        this.memberpaperworkno = value;
    }

    /**
     * Gets the value of the memberpcid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberpcid() {
        return memberpcid;
    }

    /**
     * Sets the value of the memberpcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberpcid(JAXBElement<String> value) {
        this.memberpcid = value;
    }

    /**
     * Gets the value of the memberphone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberphone() {
        return memberphone;
    }

    /**
     * Sets the value of the memberphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberphone(JAXBElement<String> value) {
        this.memberphone = value;
    }

    /**
     * Gets the value of the membersex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMembersex() {
        return membersex;
    }

    /**
     * Sets the value of the membersex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMembersex(JAXBElement<Integer> value) {
        this.membersex = value;
    }

    /**
     * Gets the value of the openflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOpenflag() {
        return openflag;
    }

    /**
     * Sets the value of the openflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOpenflag(JAXBElement<Integer> value) {
        this.openflag = value;
    }

    /**
     * Gets the value of the salebillno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalebillno() {
        return salebillno;
    }

    /**
     * Sets the value of the salebillno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalebillno(JAXBElement<String> value) {
        this.salebillno = value;
    }

    /**
     * Gets the value of the salecarddate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalecarddate() {
        return salecarddate;
    }

    /**
     * Sets the value of the salecarddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalecarddate(JAXBElement<String> value) {
        this.salecarddate = value;
    }

    /**
     * Gets the value of the searchpassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSearchpassword() {
        return searchpassword;
    }

    /**
     * Sets the value of the searchpassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSearchpassword(JAXBElement<String> value) {
        this.searchpassword = value;
    }

    /**
     * Gets the value of the sendamtflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSendamtflag() {
        return sendamtflag;
    }

    /**
     * Sets the value of the sendamtflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSendamtflag(JAXBElement<Integer> value) {
        this.sendamtflag = value;
    }

    /**
     * Gets the value of the showmemberphone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShowmemberphone() {
        return showmemberphone;
    }

    /**
     * Sets the value of the showmemberphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShowmemberphone(JAXBElement<String> value) {
        this.showmemberphone = value;
    }

    /**
     * Gets the value of the slaeproerate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSlaeproerate() {
        return slaeproerate;
    }

    /**
     * Sets the value of the slaeproerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSlaeproerate(JAXBElement<BigDecimal> value) {
        this.slaeproerate = value;
    }

}

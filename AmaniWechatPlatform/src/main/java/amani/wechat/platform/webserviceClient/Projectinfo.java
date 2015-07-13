
package amani.wechat.platform.webserviceClient;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Projectinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Projectinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bprisource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bprjmodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bprjno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="costtype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="editflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="finaltype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hsalecount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hsaleprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="id" type="{http://model.amani.com}ProjectinfoId" minOccurs="0"/>
 *         &lt;element name="ipadname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipddl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ktcrate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="kyjrate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ltcrate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lyjrate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="markflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="memberprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="morelongflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="msalecount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="msaleprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="needhairflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newcosttc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="oldcosttc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="onecountprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="onepageprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pointtype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pointvalue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="prjabridge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prjname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prjpricetype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="prjreporttype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prjsaletype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="prjtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rsalecount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rsaleprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="saleflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="salelowprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="saleprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="saleunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selfFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="useflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ysalecount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ysaleprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Projectinfo", namespace = "http://model.amani.com", propOrder = {
    "bprisource",
    "bprjmodeId",
    "bprjno",
    "costprice",
    "costtype",
    "editflag",
    "finaltype",
    "hsalecount",
    "hsaleprice",
    "id",
    "ipadname",
    "ipddl",
    "ktcrate",
    "kyjrate",
    "ltcrate",
    "lyjrate",
    "markflag",
    "memberprice",
    "morelongflag",
    "msalecount",
    "msaleprice",
    "needhairflag",
    "newcosttc",
    "oldcosttc",
    "onecountprice",
    "onepageprice",
    "pointtype",
    "pointvalue",
    "prjabridge",
    "prjname",
    "prjpricetype",
    "prjreporttype",
    "prjsaletype",
    "prjtype",
    "rateflag",
    "rsalecount",
    "rsaleprice",
    "saleflag",
    "salelowprice",
    "saleprice",
    "saleunit",
    "selfFlag",
    "useflag",
    "ysalecount",
    "ysaleprice"
})
public class Projectinfo {

    @XmlElementRef(name = "bprisource", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bprisource;
    @XmlElementRef(name = "bprjmodeId", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bprjmodeId;
    @XmlElementRef(name = "bprjno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bprjno;
    @XmlElementRef(name = "costprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> costprice;
    @XmlElementRef(name = "costtype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> costtype;
    @XmlElementRef(name = "editflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> editflag;
    @XmlElementRef(name = "finaltype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> finaltype;
    @XmlElementRef(name = "hsalecount", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> hsalecount;
    @XmlElementRef(name = "hsaleprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> hsaleprice;
    @XmlElementRef(name = "id", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectinfoId> id;
    @XmlElementRef(name = "ipadname", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ipadname;
    @XmlElementRef(name = "ipddl", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ipddl;
    @XmlElementRef(name = "ktcrate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ktcrate;
    @XmlElementRef(name = "kyjrate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> kyjrate;
    @XmlElementRef(name = "ltcrate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ltcrate;
    @XmlElementRef(name = "lyjrate", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> lyjrate;
    @XmlElementRef(name = "markflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> markflag;
    @XmlElementRef(name = "memberprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> memberprice;
    @XmlElementRef(name = "morelongflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> morelongflag;
    @XmlElementRef(name = "msalecount", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> msalecount;
    @XmlElementRef(name = "msaleprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> msaleprice;
    @XmlElementRef(name = "needhairflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> needhairflag;
    @XmlElementRef(name = "newcosttc", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> newcosttc;
    @XmlElementRef(name = "oldcosttc", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> oldcosttc;
    @XmlElementRef(name = "onecountprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> onecountprice;
    @XmlElementRef(name = "onepageprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> onepageprice;
    @XmlElementRef(name = "pointtype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pointtype;
    @XmlElementRef(name = "pointvalue", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pointvalue;
    @XmlElementRef(name = "prjabridge", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prjabridge;
    @XmlElementRef(name = "prjname", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prjname;
    @XmlElementRef(name = "prjpricetype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prjpricetype;
    @XmlElementRef(name = "prjreporttype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prjreporttype;
    @XmlElementRef(name = "prjsaletype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prjsaletype;
    @XmlElementRef(name = "prjtype", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prjtype;
    @XmlElementRef(name = "rateflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rateflag;
    @XmlElementRef(name = "rsalecount", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsalecount;
    @XmlElementRef(name = "rsaleprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsaleprice;
    @XmlElementRef(name = "saleflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> saleflag;
    @XmlElementRef(name = "salelowprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> salelowprice;
    @XmlElementRef(name = "saleprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> saleprice;
    @XmlElementRef(name = "saleunit", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> saleunit;
    protected Integer selfFlag;
    @XmlElementRef(name = "useflag", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> useflag;
    @XmlElementRef(name = "ysalecount", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ysalecount;
    @XmlElementRef(name = "ysaleprice", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ysaleprice;

    /**
     * Gets the value of the bprisource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprisource() {
        return bprisource;
    }

    /**
     * Sets the value of the bprisource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprisource(JAXBElement<String> value) {
        this.bprisource = value;
    }

    /**
     * Gets the value of the bprjmodeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprjmodeId() {
        return bprjmodeId;
    }

    /**
     * Sets the value of the bprjmodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprjmodeId(JAXBElement<String> value) {
        this.bprjmodeId = value;
    }

    /**
     * Gets the value of the bprjno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprjno() {
        return bprjno;
    }

    /**
     * Sets the value of the bprjno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprjno(JAXBElement<String> value) {
        this.bprjno = value;
    }

    /**
     * Gets the value of the costprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCostprice() {
        return costprice;
    }

    /**
     * Sets the value of the costprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCostprice(JAXBElement<BigDecimal> value) {
        this.costprice = value;
    }

    /**
     * Gets the value of the costtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCosttype() {
        return costtype;
    }

    /**
     * Sets the value of the costtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCosttype(JAXBElement<Integer> value) {
        this.costtype = value;
    }

    /**
     * Gets the value of the editflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEditflag() {
        return editflag;
    }

    /**
     * Sets the value of the editflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEditflag(JAXBElement<Integer> value) {
        this.editflag = value;
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
     * Gets the value of the hsalecount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHsalecount() {
        return hsalecount;
    }

    /**
     * Sets the value of the hsalecount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHsalecount(JAXBElement<BigDecimal> value) {
        this.hsalecount = value;
    }

    /**
     * Gets the value of the hsaleprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHsaleprice() {
        return hsaleprice;
    }

    /**
     * Sets the value of the hsaleprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHsaleprice(JAXBElement<BigDecimal> value) {
        this.hsaleprice = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProjectinfoId }{@code >}
     *     
     */
    public JAXBElement<ProjectinfoId> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProjectinfoId }{@code >}
     *     
     */
    public void setId(JAXBElement<ProjectinfoId> value) {
        this.id = value;
    }

    /**
     * Gets the value of the ipadname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIpadname() {
        return ipadname;
    }

    /**
     * Sets the value of the ipadname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIpadname(JAXBElement<String> value) {
        this.ipadname = value;
    }

    /**
     * Gets the value of the ipddl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIpddl() {
        return ipddl;
    }

    /**
     * Sets the value of the ipddl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIpddl(JAXBElement<String> value) {
        this.ipddl = value;
    }

    /**
     * Gets the value of the ktcrate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getKtcrate() {
        return ktcrate;
    }

    /**
     * Sets the value of the ktcrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setKtcrate(JAXBElement<BigDecimal> value) {
        this.ktcrate = value;
    }

    /**
     * Gets the value of the kyjrate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getKyjrate() {
        return kyjrate;
    }

    /**
     * Sets the value of the kyjrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setKyjrate(JAXBElement<BigDecimal> value) {
        this.kyjrate = value;
    }

    /**
     * Gets the value of the ltcrate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLtcrate() {
        return ltcrate;
    }

    /**
     * Sets the value of the ltcrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLtcrate(JAXBElement<BigDecimal> value) {
        this.ltcrate = value;
    }

    /**
     * Gets the value of the lyjrate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLyjrate() {
        return lyjrate;
    }

    /**
     * Sets the value of the lyjrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLyjrate(JAXBElement<BigDecimal> value) {
        this.lyjrate = value;
    }

    /**
     * Gets the value of the markflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMarkflag() {
        return markflag;
    }

    /**
     * Sets the value of the markflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMarkflag(JAXBElement<Integer> value) {
        this.markflag = value;
    }

    /**
     * Gets the value of the memberprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMemberprice() {
        return memberprice;
    }

    /**
     * Sets the value of the memberprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMemberprice(JAXBElement<BigDecimal> value) {
        this.memberprice = value;
    }

    /**
     * Gets the value of the morelongflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMorelongflag() {
        return morelongflag;
    }

    /**
     * Sets the value of the morelongflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMorelongflag(JAXBElement<Integer> value) {
        this.morelongflag = value;
    }

    /**
     * Gets the value of the msalecount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMsalecount() {
        return msalecount;
    }

    /**
     * Sets the value of the msalecount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMsalecount(JAXBElement<BigDecimal> value) {
        this.msalecount = value;
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
     * Gets the value of the needhairflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNeedhairflag() {
        return needhairflag;
    }

    /**
     * Sets the value of the needhairflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNeedhairflag(JAXBElement<Integer> value) {
        this.needhairflag = value;
    }

    /**
     * Gets the value of the newcosttc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNewcosttc() {
        return newcosttc;
    }

    /**
     * Sets the value of the newcosttc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNewcosttc(JAXBElement<BigDecimal> value) {
        this.newcosttc = value;
    }

    /**
     * Gets the value of the oldcosttc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOldcosttc() {
        return oldcosttc;
    }

    /**
     * Sets the value of the oldcosttc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOldcosttc(JAXBElement<BigDecimal> value) {
        this.oldcosttc = value;
    }

    /**
     * Gets the value of the onecountprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOnecountprice() {
        return onecountprice;
    }

    /**
     * Sets the value of the onecountprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOnecountprice(JAXBElement<BigDecimal> value) {
        this.onecountprice = value;
    }

    /**
     * Gets the value of the onepageprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOnepageprice() {
        return onepageprice;
    }

    /**
     * Sets the value of the onepageprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOnepageprice(JAXBElement<BigDecimal> value) {
        this.onepageprice = value;
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
     * Gets the value of the prjabridge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrjabridge() {
        return prjabridge;
    }

    /**
     * Sets the value of the prjabridge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrjabridge(JAXBElement<String> value) {
        this.prjabridge = value;
    }

    /**
     * Gets the value of the prjname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrjname() {
        return prjname;
    }

    /**
     * Sets the value of the prjname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrjname(JAXBElement<String> value) {
        this.prjname = value;
    }

    /**
     * Gets the value of the prjpricetype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrjpricetype() {
        return prjpricetype;
    }

    /**
     * Sets the value of the prjpricetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrjpricetype(JAXBElement<Integer> value) {
        this.prjpricetype = value;
    }

    /**
     * Gets the value of the prjreporttype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrjreporttype() {
        return prjreporttype;
    }

    /**
     * Sets the value of the prjreporttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrjreporttype(JAXBElement<String> value) {
        this.prjreporttype = value;
    }

    /**
     * Gets the value of the prjsaletype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrjsaletype() {
        return prjsaletype;
    }

    /**
     * Sets the value of the prjsaletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrjsaletype(JAXBElement<Integer> value) {
        this.prjsaletype = value;
    }

    /**
     * Gets the value of the prjtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrjtype() {
        return prjtype;
    }

    /**
     * Sets the value of the prjtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrjtype(JAXBElement<String> value) {
        this.prjtype = value;
    }

    /**
     * Gets the value of the rateflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRateflag() {
        return rateflag;
    }

    /**
     * Sets the value of the rateflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRateflag(JAXBElement<Integer> value) {
        this.rateflag = value;
    }

    /**
     * Gets the value of the rsalecount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRsalecount() {
        return rsalecount;
    }

    /**
     * Sets the value of the rsalecount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRsalecount(JAXBElement<BigDecimal> value) {
        this.rsalecount = value;
    }

    /**
     * Gets the value of the rsaleprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRsaleprice() {
        return rsaleprice;
    }

    /**
     * Sets the value of the rsaleprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRsaleprice(JAXBElement<BigDecimal> value) {
        this.rsaleprice = value;
    }

    /**
     * Gets the value of the saleflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSaleflag() {
        return saleflag;
    }

    /**
     * Sets the value of the saleflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSaleflag(JAXBElement<Integer> value) {
        this.saleflag = value;
    }

    /**
     * Gets the value of the salelowprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalelowprice() {
        return salelowprice;
    }

    /**
     * Sets the value of the salelowprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalelowprice(JAXBElement<BigDecimal> value) {
        this.salelowprice = value;
    }

    /**
     * Gets the value of the saleprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSaleprice() {
        return saleprice;
    }

    /**
     * Sets the value of the saleprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSaleprice(JAXBElement<BigDecimal> value) {
        this.saleprice = value;
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
     * Gets the value of the ysalecount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getYsalecount() {
        return ysalecount;
    }

    /**
     * Sets the value of the ysalecount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setYsalecount(JAXBElement<BigDecimal> value) {
        this.ysalecount = value;
    }

    /**
     * Gets the value of the ysaleprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getYsaleprice() {
        return ysaleprice;
    }

    /**
     * Sets the value of the ysaleprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setYsaleprice(JAXBElement<BigDecimal> value) {
        this.ysaleprice = value;
    }

}

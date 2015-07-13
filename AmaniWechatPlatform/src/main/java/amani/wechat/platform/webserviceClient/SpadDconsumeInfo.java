
package amani.wechat.platform.webserviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpadDconsumeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpadDconsumeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brachcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_no2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_no3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isdeleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isfortreatment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isnew" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isnew2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isnew3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reward" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="reward2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="reward3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="score2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="score3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="small_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpadDconsumeInfo", namespace = "http://bean.amani.com", propOrder = {
    "amount",
    "brachcode",
    "cdate",
    "code",
    "cost",
    "employeeNo",
    "employeeNo2",
    "employeeNo3",
    "id",
    "isdeleted",
    "isfortreatment",
    "isnew",
    "isnew2",
    "isnew3",
    "price",
    "product",
    "reward",
    "reward2",
    "reward3",
    "score",
    "score2",
    "score3",
    "smallNo",
    "sortid"
})
public class SpadDconsumeInfo {

    @XmlElementRef(name = "amount", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amount;
    @XmlElementRef(name = "brachcode", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brachcode;
    @XmlElementRef(name = "cdate", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cdate;
    @XmlElementRef(name = "code", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "cost", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cost;
    @XmlElementRef(name = "employee_no", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeNo;
    @XmlElementRef(name = "employee_no2", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeNo2;
    @XmlElementRef(name = "employee_no3", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeNo3;
    protected Integer id;
    protected Integer isdeleted;
    protected Integer isfortreatment;
    protected Integer isnew;
    protected Integer isnew2;
    protected Integer isnew3;
    @XmlElementRef(name = "price", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> price;
    @XmlElementRef(name = "product", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product;
    protected Double reward;
    protected Double reward2;
    protected Double reward3;
    protected Double score;
    protected Double score2;
    protected Double score3;
    @XmlElementRef(name = "small_no", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smallNo;
    protected Integer sortid;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmount(JAXBElement<String> value) {
        this.amount = value;
    }

    /**
     * Gets the value of the brachcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrachcode() {
        return brachcode;
    }

    /**
     * Sets the value of the brachcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrachcode(JAXBElement<String> value) {
        this.brachcode = value;
    }

    /**
     * Gets the value of the cdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCdate() {
        return cdate;
    }

    /**
     * Sets the value of the cdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCdate(JAXBElement<String> value) {
        this.cdate = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode(JAXBElement<String> value) {
        this.code = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCost(JAXBElement<String> value) {
        this.cost = value;
    }

    /**
     * Gets the value of the employeeNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeNo() {
        return employeeNo;
    }

    /**
     * Sets the value of the employeeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeNo(JAXBElement<String> value) {
        this.employeeNo = value;
    }

    /**
     * Gets the value of the employeeNo2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeNo2() {
        return employeeNo2;
    }

    /**
     * Sets the value of the employeeNo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeNo2(JAXBElement<String> value) {
        this.employeeNo2 = value;
    }

    /**
     * Gets the value of the employeeNo3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeNo3() {
        return employeeNo3;
    }

    /**
     * Sets the value of the employeeNo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeNo3(JAXBElement<String> value) {
        this.employeeNo3 = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the isdeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsdeleted() {
        return isdeleted;
    }

    /**
     * Sets the value of the isdeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsdeleted(Integer value) {
        this.isdeleted = value;
    }

    /**
     * Gets the value of the isfortreatment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsfortreatment() {
        return isfortreatment;
    }

    /**
     * Sets the value of the isfortreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsfortreatment(Integer value) {
        this.isfortreatment = value;
    }

    /**
     * Gets the value of the isnew property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsnew() {
        return isnew;
    }

    /**
     * Sets the value of the isnew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsnew(Integer value) {
        this.isnew = value;
    }

    /**
     * Gets the value of the isnew2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsnew2() {
        return isnew2;
    }

    /**
     * Sets the value of the isnew2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsnew2(Integer value) {
        this.isnew2 = value;
    }

    /**
     * Gets the value of the isnew3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsnew3() {
        return isnew3;
    }

    /**
     * Sets the value of the isnew3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsnew3(Integer value) {
        this.isnew3 = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrice(JAXBElement<String> value) {
        this.price = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct(JAXBElement<String> value) {
        this.product = value;
    }

    /**
     * Gets the value of the reward property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReward() {
        return reward;
    }

    /**
     * Sets the value of the reward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReward(Double value) {
        this.reward = value;
    }

    /**
     * Gets the value of the reward2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReward2() {
        return reward2;
    }

    /**
     * Sets the value of the reward2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReward2(Double value) {
        this.reward2 = value;
    }

    /**
     * Gets the value of the reward3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReward3() {
        return reward3;
    }

    /**
     * Sets the value of the reward3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReward3(Double value) {
        this.reward3 = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScore(Double value) {
        this.score = value;
    }

    /**
     * Gets the value of the score2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScore2() {
        return score2;
    }

    /**
     * Sets the value of the score2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScore2(Double value) {
        this.score2 = value;
    }

    /**
     * Gets the value of the score3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScore3() {
        return score3;
    }

    /**
     * Sets the value of the score3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScore3(Double value) {
        this.score3 = value;
    }

    /**
     * Gets the value of the smallNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmallNo() {
        return smallNo;
    }

    /**
     * Sets the value of the smallNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmallNo(JAXBElement<String> value) {
        this.smallNo = value;
    }

    /**
     * Gets the value of the sortid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortid() {
        return sortid;
    }

    /**
     * Sets the value of the sortid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortid(Integer value) {
        this.sortid = value;
    }

}

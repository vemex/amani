
package amani.wechat.platform.webserviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpadMconsumeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpadMconsumeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brachcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="psmall_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="small_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smerge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpadMconsumeInfo", namespace = "http://bean.amani.com", propOrder = {
    "brachcode",
    "cdate",
    "custom",
    "employeeNo",
    "id",
    "psmallNo",
    "smallNo",
    "smerge",
    "status",
    "summary"
})
public class SpadMconsumeInfo {

    @XmlElementRef(name = "brachcode", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brachcode;
    @XmlElementRef(name = "cdate", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cdate;
    @XmlElementRef(name = "custom", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custom;
    @XmlElementRef(name = "employee_no", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeNo;
    protected Integer id;
    @XmlElementRef(name = "psmall_no", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> psmallNo;
    @XmlElementRef(name = "small_no", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smallNo;
    protected Integer smerge;
    protected Integer status;
    @XmlElementRef(name = "summary", namespace = "http://bean.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> summary;

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
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustom(JAXBElement<String> value) {
        this.custom = value;
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
     * Gets the value of the psmallNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPsmallNo() {
        return psmallNo;
    }

    /**
     * Sets the value of the psmallNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPsmallNo(JAXBElement<String> value) {
        this.psmallNo = value;
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
     * Gets the value of the smerge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSmerge() {
        return smerge;
    }

    /**
     * Sets the value of the smerge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSmerge(Integer value) {
        this.smerge = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSummary(JAXBElement<String> value) {
        this.summary = value;
    }

}

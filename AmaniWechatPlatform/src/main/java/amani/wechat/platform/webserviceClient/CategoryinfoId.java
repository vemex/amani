
package amani.wechat.platform.webserviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryinfoId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryinfoId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postationid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postationname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryinfoId", namespace = "http://model.amani.com", propOrder = {
    "categoryname",
    "categoryno",
    "compno",
    "postationid",
    "postationname"
})
public class CategoryinfoId {

    @XmlElementRef(name = "categoryname", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> categoryname;
    @XmlElementRef(name = "categoryno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> categoryno;
    @XmlElementRef(name = "compno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compno;
    @XmlElementRef(name = "postationid", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postationid;
    @XmlElementRef(name = "postationname", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postationname;

    /**
     * Gets the value of the categoryname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoryname() {
        return categoryname;
    }

    /**
     * Sets the value of the categoryname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoryname(JAXBElement<String> value) {
        this.categoryname = value;
    }

    /**
     * Gets the value of the categoryno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoryno() {
        return categoryno;
    }

    /**
     * Sets the value of the categoryno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoryno(JAXBElement<String> value) {
        this.categoryno = value;
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
     * Gets the value of the postationid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostationid() {
        return postationid;
    }

    /**
     * Sets the value of the postationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostationid(JAXBElement<String> value) {
        this.postationid = value;
    }

    /**
     * Gets the value of the postationname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostationname() {
        return postationname;
    }

    /**
     * Sets the value of the postationname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostationname(JAXBElement<String> value) {
        this.postationname = value;
    }

}


package amani.wechat.platform.webserviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectinfoId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectinfoId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prisource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prjmodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prjno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectinfoId", namespace = "http://model.amani.com", propOrder = {
    "prisource",
    "prjmodeId",
    "prjno"
})
public class ProjectinfoId {

    @XmlElementRef(name = "prisource", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prisource;
    @XmlElementRef(name = "prjmodeId", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prjmodeId;
    @XmlElementRef(name = "prjno", namespace = "http://model.amani.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prjno;

    /**
     * Gets the value of the prisource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrisource() {
        return prisource;
    }

    /**
     * Sets the value of the prisource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrisource(JAXBElement<String> value) {
        this.prisource = value;
    }

    /**
     * Gets the value of the prjmodeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrjmodeId() {
        return prjmodeId;
    }

    /**
     * Sets the value of the prjmodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrjmodeId(JAXBElement<String> value) {
        this.prjmodeId = value;
    }

    /**
     * Gets the value of the prjno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrjno() {
        return prjno;
    }

    /**
     * Sets the value of the prjno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrjno(JAXBElement<String> value) {
        this.prjno = value;
    }

}

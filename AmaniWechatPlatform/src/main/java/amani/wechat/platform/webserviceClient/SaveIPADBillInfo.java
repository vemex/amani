
package amani.wechat.platform.webserviceClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="in0" type="{http://bean.amani.com}SpadMconsumeInfo"/>
 *         &lt;element name="in1" type="{http://bean.amani.com}ArrayOfSpadDconsumeInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "in0",
    "in1"
})
@XmlRootElement(name = "saveIPADBillInfo")
public class SaveIPADBillInfo {

    @XmlElement(required = true, nillable = true)
    protected SpadMconsumeInfo in0;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSpadDconsumeInfo in1;

    /**
     * Gets the value of the in0 property.
     * 
     * @return
     *     possible object is
     *     {@link SpadMconsumeInfo }
     *     
     */
    public SpadMconsumeInfo getIn0() {
        return in0;
    }

    /**
     * Sets the value of the in0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpadMconsumeInfo }
     *     
     */
    public void setIn0(SpadMconsumeInfo value) {
        this.in0 = value;
    }

    /**
     * Gets the value of the in1 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpadDconsumeInfo }
     *     
     */
    public ArrayOfSpadDconsumeInfo getIn1() {
        return in1;
    }

    /**
     * Sets the value of the in1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpadDconsumeInfo }
     *     
     */
    public void setIn1(ArrayOfSpadDconsumeInfo value) {
        this.in1 = value;
    }

}

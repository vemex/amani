
package amani.wechat.platform.webserviceClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSpadDconsumeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSpadDconsumeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpadDconsumeInfo" type="{http://bean.amani.com}SpadDconsumeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSpadDconsumeInfo", namespace = "http://bean.amani.com", propOrder = {
    "spadDconsumeInfo"
})
public class ArrayOfSpadDconsumeInfo {

    @XmlElement(name = "SpadDconsumeInfo", nillable = true)
    protected List<SpadDconsumeInfo> spadDconsumeInfo;

    /**
     * Gets the value of the spadDconsumeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spadDconsumeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpadDconsumeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpadDconsumeInfo }
     * 
     * 
     */
    public List<SpadDconsumeInfo> getSpadDconsumeInfo() {
        if (spadDconsumeInfo == null) {
            spadDconsumeInfo = new ArrayList<SpadDconsumeInfo>();
        }
        return this.spadDconsumeInfo;
    }

}

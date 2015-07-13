
package amani.wechat.platform.webserviceClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProjectinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProjectinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Projectinfo" type="{http://model.amani.com}Projectinfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProjectinfo", namespace = "http://model.amani.com", propOrder = {
    "projectinfo"
})
public class ArrayOfProjectinfo {

    @XmlElement(name = "Projectinfo", nillable = true)
    protected List<Projectinfo> projectinfo;

    /**
     * Gets the value of the projectinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectinfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Projectinfo }
     * 
     * 
     */
    public List<Projectinfo> getProjectinfo() {
        if (projectinfo == null) {
            projectinfo = new ArrayList<Projectinfo>();
        }
        return this.projectinfo;
    }

}

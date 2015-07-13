
package amani.wechat.platform.webserviceClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRoominfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoominfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Roominfo" type="{http://model.amani.com}Roominfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoominfo", namespace = "http://model.amani.com", propOrder = {
    "roominfo"
})
public class ArrayOfRoominfo {

    @XmlElement(name = "Roominfo", nillable = true)
    protected List<Roominfo> roominfo;

    /**
     * Gets the value of the roominfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roominfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoominfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Roominfo }
     * 
     * 
     */
    public List<Roominfo> getRoominfo() {
        if (roominfo == null) {
            roominfo = new ArrayList<Roominfo>();
        }
        return this.roominfo;
    }

}

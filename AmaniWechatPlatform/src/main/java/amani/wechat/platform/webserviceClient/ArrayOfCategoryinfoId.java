
package amani.wechat.platform.webserviceClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCategoryinfoId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCategoryinfoId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryinfoId" type="{http://model.amani.com}CategoryinfoId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCategoryinfoId", namespace = "http://model.amani.com", propOrder = {
    "categoryinfoId"
})
public class ArrayOfCategoryinfoId {

    @XmlElement(name = "CategoryinfoId", nillable = true)
    protected List<CategoryinfoId> categoryinfoId;

    /**
     * Gets the value of the categoryinfoId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryinfoId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryinfoId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryinfoId }
     * 
     * 
     */
    public List<CategoryinfoId> getCategoryinfoId() {
        if (categoryinfoId == null) {
            categoryinfoId = new ArrayList<CategoryinfoId>();
        }
        return this.categoryinfoId;
    }

}


package amani.wechat.platform.webserviceClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVouchersdetal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVouchersdetal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vouchersdetal" type="{http://model.amani.com}Vouchersdetal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVouchersdetal", namespace = "http://model.amani.com", propOrder = {
    "vouchersdetal"
})
public class ArrayOfVouchersdetal {

    @XmlElement(name = "Vouchersdetal", nillable = true)
    protected List<Vouchersdetal> vouchersdetal;

    /**
     * Gets the value of the vouchersdetal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vouchersdetal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVouchersdetal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vouchersdetal }
     * 
     * 
     */
    public List<Vouchersdetal> getVouchersdetal() {
        if (vouchersdetal == null) {
            vouchersdetal = new ArrayList<Vouchersdetal>();
        }
        return this.vouchersdetal;
    }

}

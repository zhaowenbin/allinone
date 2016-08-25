
package com.derun.webservice.client.wtmdcxf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfQuesListDefTaxInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQuesListDefTaxInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuesListDefTaxInfo" type="{http://beans.derun.com}QuesListDefTaxInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQuesListDefTaxInfo", propOrder = {
    "quesListDefTaxInfo"
})
public class ArrayOfQuesListDefTaxInfo {

    @XmlElement(name = "QuesListDefTaxInfo", nillable = true)
    protected List<QuesListDefTaxInfo> quesListDefTaxInfo;

    /**
     * Gets the value of the quesListDefTaxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quesListDefTaxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuesListDefTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuesListDefTaxInfo }
     * 
     * 
     */
    public List<QuesListDefTaxInfo> getQuesListDefTaxInfo() {
        if (quesListDefTaxInfo == null) {
            quesListDefTaxInfo = new ArrayList<QuesListDefTaxInfo>();
        }
        return this.quesListDefTaxInfo;
    }

}

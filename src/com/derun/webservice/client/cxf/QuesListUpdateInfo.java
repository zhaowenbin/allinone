
package com.derun.webservice.client.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QuesListUpdateInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QuesListUpdateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrQuesListDefTaxInfo" type="{http://beans.derun.com}ArrayOfQuesListDefTaxInfo" minOccurs="0"/>
 *         &lt;element name="operStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quesListCarTaxInfo" type="{http://beans.derun.com}QuesListCarTaxInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuesListUpdateInfo", propOrder = {
    "arrQuesListDefTaxInfo",
    "operStatus",
    "quesListCarTaxInfo"
})
public class QuesListUpdateInfo {

    @XmlElement(nillable = true)
    protected ArrayOfQuesListDefTaxInfo arrQuesListDefTaxInfo;
    @XmlElement(nillable = true)
    protected String operStatus;
    @XmlElement(nillable = true)
    protected QuesListCarTaxInfo quesListCarTaxInfo;

    /**
     * 获取arrQuesListDefTaxInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuesListDefTaxInfo }
     *     
     */
    public ArrayOfQuesListDefTaxInfo getArrQuesListDefTaxInfo() {
        return arrQuesListDefTaxInfo;
    }

    /**
     * 设置arrQuesListDefTaxInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuesListDefTaxInfo }
     *     
     */
    public void setArrQuesListDefTaxInfo(ArrayOfQuesListDefTaxInfo value) {
        this.arrQuesListDefTaxInfo = value;
    }

    /**
     * 获取operStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperStatus() {
        return operStatus;
    }

    /**
     * 设置operStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperStatus(String value) {
        this.operStatus = value;
    }

    /**
     * 获取quesListCarTaxInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QuesListCarTaxInfo }
     *     
     */
    public QuesListCarTaxInfo getQuesListCarTaxInfo() {
        return quesListCarTaxInfo;
    }

    /**
     * 设置quesListCarTaxInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QuesListCarTaxInfo }
     *     
     */
    public void setQuesListCarTaxInfo(QuesListCarTaxInfo value) {
        this.quesListCarTaxInfo = value;
    }

}

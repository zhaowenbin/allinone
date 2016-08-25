
package com.derun.webservice.client.wtmdcxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QuesListUpdateResInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QuesListUpdateResInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrQuesListUpdateInfo" type="{http://beans.derun.com}ArrayOfQuesListUpdateInfo" minOccurs="0"/>
 *         &lt;element name="downloadSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuesListUpdateResInfo", propOrder = {
    "arrQuesListUpdateInfo",
    "downloadSerialNo",
    "returnCode"
})
public class QuesListUpdateResInfo {

    @XmlElement(nillable = true)
    protected ArrayOfQuesListUpdateInfo arrQuesListUpdateInfo;
    @XmlElement(nillable = true)
    protected String downloadSerialNo;
    @XmlElement(nillable = true)
    protected String returnCode;

    /**
     * 获取arrQuesListUpdateInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuesListUpdateInfo }
     *     
     */
    public ArrayOfQuesListUpdateInfo getArrQuesListUpdateInfo() {
        return arrQuesListUpdateInfo;
    }

    /**
     * 设置arrQuesListUpdateInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuesListUpdateInfo }
     *     
     */
    public void setArrQuesListUpdateInfo(ArrayOfQuesListUpdateInfo value) {
        this.arrQuesListUpdateInfo = value;
    }

    /**
     * 获取downloadSerialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadSerialNo() {
        return downloadSerialNo;
    }

    /**
     * 设置downloadSerialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadSerialNo(String value) {
        this.downloadSerialNo = value;
    }

    /**
     * 获取returnCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * 设置returnCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

}

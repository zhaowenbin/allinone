
package com.derun.webservice.client.wtmdcxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QuesListUpdateResInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡarrQuesListUpdateInfo���Ե�ֵ��
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
     * ����arrQuesListUpdateInfo���Ե�ֵ��
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
     * ��ȡdownloadSerialNo���Ե�ֵ��
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
     * ����downloadSerialNo���Ե�ֵ��
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
     * ��ȡreturnCode���Ե�ֵ��
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
     * ����returnCode���Ե�ֵ��
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

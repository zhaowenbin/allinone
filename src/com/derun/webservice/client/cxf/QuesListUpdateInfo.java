
package com.derun.webservice.client.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QuesListUpdateInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡarrQuesListDefTaxInfo���Ե�ֵ��
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
     * ����arrQuesListDefTaxInfo���Ե�ֵ��
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
     * ��ȡoperStatus���Ե�ֵ��
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
     * ����operStatus���Ե�ֵ��
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
     * ��ȡquesListCarTaxInfo���Ե�ֵ��
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
     * ����quesListCarTaxInfo���Ե�ֵ��
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

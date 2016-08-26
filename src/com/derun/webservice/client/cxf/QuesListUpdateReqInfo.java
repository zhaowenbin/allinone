
package com.derun.webservice.client.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QuesListUpdateReqInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QuesListUpdateReqInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="downloadSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errMap" type="{http://service.wtmd.derun.com}anyType2anyTypeMap" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuesListUpdateReqInfo", propOrder = {
    "downloadSerialNo",
    "errMap",
    "pageSize",
    "password",
    "reqStyle",
    "username"
})
public class QuesListUpdateReqInfo {

    @XmlElement(nillable = true)
    protected String downloadSerialNo;
    @XmlElement(nillable = true)
    protected AnyType2AnyTypeMap errMap;
    protected Integer pageSize;
    @XmlElement(nillable = true)
    protected String password;
    @XmlElement(nillable = true)
    protected String reqStyle;
    @XmlElement(nillable = true)
    protected String username;

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
     * 获取errMap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnyType2AnyTypeMap }
     *     
     */
    public AnyType2AnyTypeMap getErrMap() {
        return errMap;
    }

    /**
     * 设置errMap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType2AnyTypeMap }
     *     
     */
    public void setErrMap(AnyType2AnyTypeMap value) {
        this.errMap = value;
    }

    /**
     * 获取pageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置pageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取reqStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqStyle() {
        return reqStyle;
    }

    /**
     * 设置reqStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqStyle(String value) {
        this.reqStyle = value;
    }

    /**
     * 获取username属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置username属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}

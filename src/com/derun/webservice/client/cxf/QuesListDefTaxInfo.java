
package com.derun.webservice.client.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>QuesListDefTaxInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QuesListDefTaxInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annualTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deduction" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deductionDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deductionDueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deductionDueProportion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deductionDueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deductionTaxDept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deductionTaxDeptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exceedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="exceedDaysCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="overDue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="overdueFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taxLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taxUnitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unitRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuesListDefTaxInfo", propOrder = {
    "annualTaxAmount",
    "deduction",
    "deductionDocumentNumber",
    "deductionDueCode",
    "deductionDueProportion",
    "deductionDueType",
    "deductionTaxDept",
    "deductionTaxDeptCode",
    "exceedDate",
    "exceedDaysCount",
    "overDue",
    "overdueFlag",
    "reasonCode",
    "taxDepartment",
    "taxDepartmentCode",
    "taxDocumentNumber",
    "taxDue",
    "taxEndDate",
    "taxLocationCode",
    "taxStartDate",
    "taxUnitTypeCode",
    "taxYear",
    "totalAmount",
    "unitRate"
})
public class QuesListDefTaxInfo {

    protected Double annualTaxAmount;
    protected Double deduction;
    @XmlElement(nillable = true)
    protected String deductionDocumentNumber;
    @XmlElement(nillable = true)
    protected String deductionDueCode;
    protected Double deductionDueProportion;
    @XmlElement(nillable = true)
    protected String deductionDueType;
    @XmlElement(nillable = true)
    protected String deductionTaxDept;
    @XmlElement(nillable = true)
    protected String deductionTaxDeptCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exceedDate;
    protected Integer exceedDaysCount;
    protected Double overDue;
    @XmlElement(nillable = true)
    protected String overdueFlag;
    @XmlElement(nillable = true)
    protected String reasonCode;
    @XmlElement(nillable = true)
    protected String taxDepartment;
    @XmlElement(nillable = true)
    protected String taxDepartmentCode;
    @XmlElement(nillable = true)
    protected String taxDocumentNumber;
    protected Double taxDue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar taxEndDate;
    @XmlElement(nillable = true)
    protected String taxLocationCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar taxStartDate;
    @XmlElement(nillable = true)
    protected String taxUnitTypeCode;
    @XmlElement(nillable = true)
    protected String taxYear;
    protected Double totalAmount;
    protected Double unitRate;

    /**
     * 获取annualTaxAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnnualTaxAmount() {
        return annualTaxAmount;
    }

    /**
     * 设置annualTaxAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnnualTaxAmount(Double value) {
        this.annualTaxAmount = value;
    }

    /**
     * 获取deduction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeduction() {
        return deduction;
    }

    /**
     * 设置deduction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeduction(Double value) {
        this.deduction = value;
    }

    /**
     * 获取deductionDocumentNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductionDocumentNumber() {
        return deductionDocumentNumber;
    }

    /**
     * 设置deductionDocumentNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductionDocumentNumber(String value) {
        this.deductionDocumentNumber = value;
    }

    /**
     * 获取deductionDueCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductionDueCode() {
        return deductionDueCode;
    }

    /**
     * 设置deductionDueCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductionDueCode(String value) {
        this.deductionDueCode = value;
    }

    /**
     * 获取deductionDueProportion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeductionDueProportion() {
        return deductionDueProportion;
    }

    /**
     * 设置deductionDueProportion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeductionDueProportion(Double value) {
        this.deductionDueProportion = value;
    }

    /**
     * 获取deductionDueType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductionDueType() {
        return deductionDueType;
    }

    /**
     * 设置deductionDueType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductionDueType(String value) {
        this.deductionDueType = value;
    }

    /**
     * 获取deductionTaxDept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductionTaxDept() {
        return deductionTaxDept;
    }

    /**
     * 设置deductionTaxDept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductionTaxDept(String value) {
        this.deductionTaxDept = value;
    }

    /**
     * 获取deductionTaxDeptCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductionTaxDeptCode() {
        return deductionTaxDeptCode;
    }

    /**
     * 设置deductionTaxDeptCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductionTaxDeptCode(String value) {
        this.deductionTaxDeptCode = value;
    }

    /**
     * 获取exceedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExceedDate() {
        return exceedDate;
    }

    /**
     * 设置exceedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExceedDate(XMLGregorianCalendar value) {
        this.exceedDate = value;
    }

    /**
     * 获取exceedDaysCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExceedDaysCount() {
        return exceedDaysCount;
    }

    /**
     * 设置exceedDaysCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExceedDaysCount(Integer value) {
        this.exceedDaysCount = value;
    }

    /**
     * 获取overDue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverDue() {
        return overDue;
    }

    /**
     * 设置overDue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverDue(Double value) {
        this.overDue = value;
    }

    /**
     * 获取overdueFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueFlag() {
        return overdueFlag;
    }

    /**
     * 设置overdueFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueFlag(String value) {
        this.overdueFlag = value;
    }

    /**
     * 获取reasonCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * 设置reasonCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * 获取taxDepartment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDepartment() {
        return taxDepartment;
    }

    /**
     * 设置taxDepartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDepartment(String value) {
        this.taxDepartment = value;
    }

    /**
     * 获取taxDepartmentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDepartmentCode() {
        return taxDepartmentCode;
    }

    /**
     * 设置taxDepartmentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDepartmentCode(String value) {
        this.taxDepartmentCode = value;
    }

    /**
     * 获取taxDocumentNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDocumentNumber() {
        return taxDocumentNumber;
    }

    /**
     * 设置taxDocumentNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDocumentNumber(String value) {
        this.taxDocumentNumber = value;
    }

    /**
     * 获取taxDue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxDue() {
        return taxDue;
    }

    /**
     * 设置taxDue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxDue(Double value) {
        this.taxDue = value;
    }

    /**
     * 获取taxEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxEndDate() {
        return taxEndDate;
    }

    /**
     * 设置taxEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxEndDate(XMLGregorianCalendar value) {
        this.taxEndDate = value;
    }

    /**
     * 获取taxLocationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxLocationCode() {
        return taxLocationCode;
    }

    /**
     * 设置taxLocationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxLocationCode(String value) {
        this.taxLocationCode = value;
    }

    /**
     * 获取taxStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxStartDate() {
        return taxStartDate;
    }

    /**
     * 设置taxStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxStartDate(XMLGregorianCalendar value) {
        this.taxStartDate = value;
    }

    /**
     * 获取taxUnitTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxUnitTypeCode() {
        return taxUnitTypeCode;
    }

    /**
     * 设置taxUnitTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxUnitTypeCode(String value) {
        this.taxUnitTypeCode = value;
    }

    /**
     * 获取taxYear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxYear() {
        return taxYear;
    }

    /**
     * 设置taxYear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxYear(String value) {
        this.taxYear = value;
    }

    /**
     * 获取totalAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置totalAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAmount(Double value) {
        this.totalAmount = value;
    }

    /**
     * 获取unitRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitRate() {
        return unitRate;
    }

    /**
     * 设置unitRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitRate(Double value) {
        this.unitRate = value;
    }

}

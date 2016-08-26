
package com.derun.webservice.client.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>QuesListDefTaxInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡannualTaxAmount���Ե�ֵ��
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
     * ����annualTaxAmount���Ե�ֵ��
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
     * ��ȡdeduction���Ե�ֵ��
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
     * ����deduction���Ե�ֵ��
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
     * ��ȡdeductionDocumentNumber���Ե�ֵ��
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
     * ����deductionDocumentNumber���Ե�ֵ��
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
     * ��ȡdeductionDueCode���Ե�ֵ��
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
     * ����deductionDueCode���Ե�ֵ��
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
     * ��ȡdeductionDueProportion���Ե�ֵ��
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
     * ����deductionDueProportion���Ե�ֵ��
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
     * ��ȡdeductionDueType���Ե�ֵ��
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
     * ����deductionDueType���Ե�ֵ��
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
     * ��ȡdeductionTaxDept���Ե�ֵ��
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
     * ����deductionTaxDept���Ե�ֵ��
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
     * ��ȡdeductionTaxDeptCode���Ե�ֵ��
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
     * ����deductionTaxDeptCode���Ե�ֵ��
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
     * ��ȡexceedDate���Ե�ֵ��
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
     * ����exceedDate���Ե�ֵ��
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
     * ��ȡexceedDaysCount���Ե�ֵ��
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
     * ����exceedDaysCount���Ե�ֵ��
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
     * ��ȡoverDue���Ե�ֵ��
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
     * ����overDue���Ե�ֵ��
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
     * ��ȡoverdueFlag���Ե�ֵ��
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
     * ����overdueFlag���Ե�ֵ��
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
     * ��ȡreasonCode���Ե�ֵ��
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
     * ����reasonCode���Ե�ֵ��
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
     * ��ȡtaxDepartment���Ե�ֵ��
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
     * ����taxDepartment���Ե�ֵ��
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
     * ��ȡtaxDepartmentCode���Ե�ֵ��
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
     * ����taxDepartmentCode���Ե�ֵ��
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
     * ��ȡtaxDocumentNumber���Ե�ֵ��
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
     * ����taxDocumentNumber���Ե�ֵ��
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
     * ��ȡtaxDue���Ե�ֵ��
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
     * ����taxDue���Ե�ֵ��
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
     * ��ȡtaxEndDate���Ե�ֵ��
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
     * ����taxEndDate���Ե�ֵ��
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
     * ��ȡtaxLocationCode���Ե�ֵ��
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
     * ����taxLocationCode���Ե�ֵ��
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
     * ��ȡtaxStartDate���Ե�ֵ��
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
     * ����taxStartDate���Ե�ֵ��
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
     * ��ȡtaxUnitTypeCode���Ե�ֵ��
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
     * ����taxUnitTypeCode���Ե�ֵ��
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
     * ��ȡtaxYear���Ե�ֵ��
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
     * ����taxYear���Ե�ֵ��
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
     * ��ȡtotalAmount���Ե�ֵ��
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
     * ����totalAmount���Ե�ֵ��
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
     * ��ȡunitRate���Ե�ֵ��
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
     * ����unitRate���Ե�ֵ��
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

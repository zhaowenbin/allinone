
package com.derun.webservice.client.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QuesListCarTaxInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QuesListCarTaxInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credentialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credentialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displacement" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="engineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstRegisterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licensePlateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licensePlateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="madeFactory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motorTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motorUsageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noLicenseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="power" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ratedPassengerCapacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="specialCarType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxPayerIdentificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxPayerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxRegistryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxTermTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tonnage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vehicleOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wholeWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuesListCarTaxInfo", propOrder = {
    "vin",
    "address",
    "carSerialNo",
    "credentialCode",
    "credentialNo",
    "displacement",
    "engineNo",
    "firstRegisterDate",
    "fuelType",
    "licensePlateNo",
    "licensePlateType",
    "madeFactory",
    "model",
    "motorTypeCode",
    "motorUsageTypeCode",
    "noLicenseFlag",
    "phoneNo",
    "power",
    "ratedPassengerCapacity",
    "specialCarType",
    "taxPayerIdentificationCode",
    "taxPayerName",
    "taxRegistryNumber",
    "taxTermTypeCode",
    "tonnage",
    "vehicleOwnerName",
    "vehicleType",
    "wholeWeight"
})
public class QuesListCarTaxInfo {

    @XmlElement(name = "VIN", nillable = true)
    protected String vin;
    @XmlElement(nillable = true)
    protected String address;
    @XmlElement(nillable = true)
    protected String carSerialNo;
    @XmlElement(nillable = true)
    protected String credentialCode;
    @XmlElement(nillable = true)
    protected String credentialNo;
    protected Double displacement;
    @XmlElement(nillable = true)
    protected String engineNo;
    @XmlElement(nillable = true)
    protected String firstRegisterDate;
    @XmlElement(nillable = true)
    protected String fuelType;
    @XmlElement(nillable = true)
    protected String licensePlateNo;
    @XmlElement(nillable = true)
    protected String licensePlateType;
    @XmlElement(nillable = true)
    protected String madeFactory;
    @XmlElement(nillable = true)
    protected String model;
    @XmlElement(nillable = true)
    protected String motorTypeCode;
    @XmlElement(nillable = true)
    protected String motorUsageTypeCode;
    @XmlElement(nillable = true)
    protected String noLicenseFlag;
    @XmlElement(nillable = true)
    protected String phoneNo;
    protected Double power;
    protected Integer ratedPassengerCapacity;
    @XmlElement(nillable = true)
    protected String specialCarType;
    @XmlElement(nillable = true)
    protected String taxPayerIdentificationCode;
    @XmlElement(nillable = true)
    protected String taxPayerName;
    @XmlElement(nillable = true)
    protected String taxRegistryNumber;
    @XmlElement(nillable = true)
    protected String taxTermTypeCode;
    protected Double tonnage;
    @XmlElement(nillable = true)
    protected String vehicleOwnerName;
    @XmlElement(nillable = true)
    protected String vehicleType;
    protected Double wholeWeight;

    /**
     * 获取vin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIN() {
        return vin;
    }

    /**
     * 设置vin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIN(String value) {
        this.vin = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取carSerialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarSerialNo() {
        return carSerialNo;
    }

    /**
     * 设置carSerialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarSerialNo(String value) {
        this.carSerialNo = value;
    }

    /**
     * 获取credentialCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialCode() {
        return credentialCode;
    }

    /**
     * 设置credentialCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialCode(String value) {
        this.credentialCode = value;
    }

    /**
     * 获取credentialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialNo() {
        return credentialNo;
    }

    /**
     * 设置credentialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialNo(String value) {
        this.credentialNo = value;
    }

    /**
     * 获取displacement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDisplacement() {
        return displacement;
    }

    /**
     * 设置displacement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDisplacement(Double value) {
        this.displacement = value;
    }

    /**
     * 获取engineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNo() {
        return engineNo;
    }

    /**
     * 设置engineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNo(String value) {
        this.engineNo = value;
    }

    /**
     * 获取firstRegisterDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstRegisterDate() {
        return firstRegisterDate;
    }

    /**
     * 设置firstRegisterDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstRegisterDate(String value) {
        this.firstRegisterDate = value;
    }

    /**
     * 获取fuelType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * 设置fuelType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelType(String value) {
        this.fuelType = value;
    }

    /**
     * 获取licensePlateNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensePlateNo() {
        return licensePlateNo;
    }

    /**
     * 设置licensePlateNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicensePlateNo(String value) {
        this.licensePlateNo = value;
    }

    /**
     * 获取licensePlateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensePlateType() {
        return licensePlateType;
    }

    /**
     * 设置licensePlateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicensePlateType(String value) {
        this.licensePlateType = value;
    }

    /**
     * 获取madeFactory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMadeFactory() {
        return madeFactory;
    }

    /**
     * 设置madeFactory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMadeFactory(String value) {
        this.madeFactory = value;
    }

    /**
     * 获取model属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置model属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * 获取motorTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotorTypeCode() {
        return motorTypeCode;
    }

    /**
     * 设置motorTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotorTypeCode(String value) {
        this.motorTypeCode = value;
    }

    /**
     * 获取motorUsageTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotorUsageTypeCode() {
        return motorUsageTypeCode;
    }

    /**
     * 设置motorUsageTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotorUsageTypeCode(String value) {
        this.motorUsageTypeCode = value;
    }

    /**
     * 获取noLicenseFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoLicenseFlag() {
        return noLicenseFlag;
    }

    /**
     * 设置noLicenseFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoLicenseFlag(String value) {
        this.noLicenseFlag = value;
    }

    /**
     * 获取phoneNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * 设置phoneNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNo(String value) {
        this.phoneNo = value;
    }

    /**
     * 获取power属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPower() {
        return power;
    }

    /**
     * 设置power属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPower(Double value) {
        this.power = value;
    }

    /**
     * 获取ratedPassengerCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatedPassengerCapacity() {
        return ratedPassengerCapacity;
    }

    /**
     * 设置ratedPassengerCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatedPassengerCapacity(Integer value) {
        this.ratedPassengerCapacity = value;
    }

    /**
     * 获取specialCarType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialCarType() {
        return specialCarType;
    }

    /**
     * 设置specialCarType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialCarType(String value) {
        this.specialCarType = value;
    }

    /**
     * 获取taxPayerIdentificationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPayerIdentificationCode() {
        return taxPayerIdentificationCode;
    }

    /**
     * 设置taxPayerIdentificationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPayerIdentificationCode(String value) {
        this.taxPayerIdentificationCode = value;
    }

    /**
     * 获取taxPayerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPayerName() {
        return taxPayerName;
    }

    /**
     * 设置taxPayerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPayerName(String value) {
        this.taxPayerName = value;
    }

    /**
     * 获取taxRegistryNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegistryNumber() {
        return taxRegistryNumber;
    }

    /**
     * 设置taxRegistryNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegistryNumber(String value) {
        this.taxRegistryNumber = value;
    }

    /**
     * 获取taxTermTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTermTypeCode() {
        return taxTermTypeCode;
    }

    /**
     * 设置taxTermTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTermTypeCode(String value) {
        this.taxTermTypeCode = value;
    }

    /**
     * 获取tonnage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTonnage() {
        return tonnage;
    }

    /**
     * 设置tonnage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTonnage(Double value) {
        this.tonnage = value;
    }

    /**
     * 获取vehicleOwnerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    /**
     * 设置vehicleOwnerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleOwnerName(String value) {
        this.vehicleOwnerName = value;
    }

    /**
     * 获取vehicleType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * 设置vehicleType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

    /**
     * 获取wholeWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWholeWeight() {
        return wholeWeight;
    }

    /**
     * 设置wholeWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWholeWeight(Double value) {
        this.wholeWeight = value;
    }

}


package com.derun.webservice.client.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QuesListCarTaxInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡvin���Ե�ֵ��
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
     * ����vin���Ե�ֵ��
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
     * ��ȡaddress���Ե�ֵ��
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
     * ����address���Ե�ֵ��
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
     * ��ȡcarSerialNo���Ե�ֵ��
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
     * ����carSerialNo���Ե�ֵ��
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
     * ��ȡcredentialCode���Ե�ֵ��
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
     * ����credentialCode���Ե�ֵ��
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
     * ��ȡcredentialNo���Ե�ֵ��
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
     * ����credentialNo���Ե�ֵ��
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
     * ��ȡdisplacement���Ե�ֵ��
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
     * ����displacement���Ե�ֵ��
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
     * ��ȡengineNo���Ե�ֵ��
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
     * ����engineNo���Ե�ֵ��
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
     * ��ȡfirstRegisterDate���Ե�ֵ��
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
     * ����firstRegisterDate���Ե�ֵ��
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
     * ��ȡfuelType���Ե�ֵ��
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
     * ����fuelType���Ե�ֵ��
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
     * ��ȡlicensePlateNo���Ե�ֵ��
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
     * ����licensePlateNo���Ե�ֵ��
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
     * ��ȡlicensePlateType���Ե�ֵ��
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
     * ����licensePlateType���Ե�ֵ��
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
     * ��ȡmadeFactory���Ե�ֵ��
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
     * ����madeFactory���Ե�ֵ��
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
     * ��ȡmodel���Ե�ֵ��
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
     * ����model���Ե�ֵ��
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
     * ��ȡmotorTypeCode���Ե�ֵ��
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
     * ����motorTypeCode���Ե�ֵ��
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
     * ��ȡmotorUsageTypeCode���Ե�ֵ��
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
     * ����motorUsageTypeCode���Ե�ֵ��
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
     * ��ȡnoLicenseFlag���Ե�ֵ��
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
     * ����noLicenseFlag���Ե�ֵ��
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
     * ��ȡphoneNo���Ե�ֵ��
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
     * ����phoneNo���Ե�ֵ��
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
     * ��ȡpower���Ե�ֵ��
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
     * ����power���Ե�ֵ��
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
     * ��ȡratedPassengerCapacity���Ե�ֵ��
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
     * ����ratedPassengerCapacity���Ե�ֵ��
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
     * ��ȡspecialCarType���Ե�ֵ��
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
     * ����specialCarType���Ե�ֵ��
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
     * ��ȡtaxPayerIdentificationCode���Ե�ֵ��
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
     * ����taxPayerIdentificationCode���Ե�ֵ��
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
     * ��ȡtaxPayerName���Ե�ֵ��
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
     * ����taxPayerName���Ե�ֵ��
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
     * ��ȡtaxRegistryNumber���Ե�ֵ��
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
     * ����taxRegistryNumber���Ե�ֵ��
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
     * ��ȡtaxTermTypeCode���Ե�ֵ��
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
     * ����taxTermTypeCode���Ե�ֵ��
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
     * ��ȡtonnage���Ե�ֵ��
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
     * ����tonnage���Ե�ֵ��
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
     * ��ȡvehicleOwnerName���Ե�ֵ��
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
     * ����vehicleOwnerName���Ե�ֵ��
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
     * ��ȡvehicleType���Ե�ֵ��
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
     * ����vehicleType���Ե�ֵ��
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
     * ��ȡwholeWeight���Ե�ֵ��
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
     * ����wholeWeight���Ե�ֵ��
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

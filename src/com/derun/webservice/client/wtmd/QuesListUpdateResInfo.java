/**
 * QuesListUpdateResInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.derun.webservice.client.wtmd;

public class QuesListUpdateResInfo  implements java.io.Serializable {
    private com.derun.webservice.client.wtmd.QuesListUpdateInfo[] arrQuesListUpdateInfo;

    private java.lang.String downloadSerialNo;

    private java.lang.String returnCode;

    public QuesListUpdateResInfo() {
    }

    public QuesListUpdateResInfo(
           com.derun.webservice.client.wtmd.QuesListUpdateInfo[] arrQuesListUpdateInfo,
           java.lang.String downloadSerialNo,
           java.lang.String returnCode) {
           this.arrQuesListUpdateInfo = arrQuesListUpdateInfo;
           this.downloadSerialNo = downloadSerialNo;
           this.returnCode = returnCode;
    }


    /**
     * Gets the arrQuesListUpdateInfo value for this QuesListUpdateResInfo.
     * 
     * @return arrQuesListUpdateInfo
     */
    public com.derun.webservice.client.wtmd.QuesListUpdateInfo[] getArrQuesListUpdateInfo() {
        return arrQuesListUpdateInfo;
    }


    /**
     * Sets the arrQuesListUpdateInfo value for this QuesListUpdateResInfo.
     * 
     * @param arrQuesListUpdateInfo
     */
    public void setArrQuesListUpdateInfo(com.derun.webservice.client.wtmd.QuesListUpdateInfo[] arrQuesListUpdateInfo) {
        this.arrQuesListUpdateInfo = arrQuesListUpdateInfo;
    }


    /**
     * Gets the downloadSerialNo value for this QuesListUpdateResInfo.
     * 
     * @return downloadSerialNo
     */
    public java.lang.String getDownloadSerialNo() {
        return downloadSerialNo;
    }


    /**
     * Sets the downloadSerialNo value for this QuesListUpdateResInfo.
     * 
     * @param downloadSerialNo
     */
    public void setDownloadSerialNo(java.lang.String downloadSerialNo) {
        this.downloadSerialNo = downloadSerialNo;
    }


    /**
     * Gets the returnCode value for this QuesListUpdateResInfo.
     * 
     * @return returnCode
     */
    public java.lang.String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this QuesListUpdateResInfo.
     * 
     * @param returnCode
     */
    public void setReturnCode(java.lang.String returnCode) {
        this.returnCode = returnCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuesListUpdateResInfo)) return false;
        QuesListUpdateResInfo other = (QuesListUpdateResInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arrQuesListUpdateInfo==null && other.getArrQuesListUpdateInfo()==null) || 
             (this.arrQuesListUpdateInfo!=null &&
              java.util.Arrays.equals(this.arrQuesListUpdateInfo, other.getArrQuesListUpdateInfo()))) &&
            ((this.downloadSerialNo==null && other.getDownloadSerialNo()==null) || 
             (this.downloadSerialNo!=null &&
              this.downloadSerialNo.equals(other.getDownloadSerialNo()))) &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getArrQuesListUpdateInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrQuesListUpdateInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrQuesListUpdateInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDownloadSerialNo() != null) {
            _hashCode += getDownloadSerialNo().hashCode();
        }
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuesListUpdateResInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.derun.com", "QuesListUpdateResInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrQuesListUpdateInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.derun.com", "arrQuesListUpdateInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.derun.com", "QuesListUpdateInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://beans.derun.com", "QuesListUpdateInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.derun.com", "downloadSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.derun.com", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

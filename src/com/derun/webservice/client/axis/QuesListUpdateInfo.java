/**
 * QuesListUpdateInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.derun.webservice.client.axis;

public class QuesListUpdateInfo  implements java.io.Serializable {
    private com.derun.webservice.client.axis.QuesListDefTaxInfo[] arrQuesListDefTaxInfo;

    private java.lang.String operStatus;

    private com.derun.webservice.client.axis.QuesListCarTaxInfo quesListCarTaxInfo;

    public QuesListUpdateInfo() {
    }

    public QuesListUpdateInfo(
           com.derun.webservice.client.axis.QuesListDefTaxInfo[] arrQuesListDefTaxInfo,
           java.lang.String operStatus,
           com.derun.webservice.client.axis.QuesListCarTaxInfo quesListCarTaxInfo) {
           this.arrQuesListDefTaxInfo = arrQuesListDefTaxInfo;
           this.operStatus = operStatus;
           this.quesListCarTaxInfo = quesListCarTaxInfo;
    }


    /**
     * Gets the arrQuesListDefTaxInfo value for this QuesListUpdateInfo.
     * 
     * @return arrQuesListDefTaxInfo
     */
    public com.derun.webservice.client.axis.QuesListDefTaxInfo[] getArrQuesListDefTaxInfo() {
        return arrQuesListDefTaxInfo;
    }


    /**
     * Sets the arrQuesListDefTaxInfo value for this QuesListUpdateInfo.
     * 
     * @param arrQuesListDefTaxInfo
     */
    public void setArrQuesListDefTaxInfo(com.derun.webservice.client.axis.QuesListDefTaxInfo[] arrQuesListDefTaxInfo) {
        this.arrQuesListDefTaxInfo = arrQuesListDefTaxInfo;
    }


    /**
     * Gets the operStatus value for this QuesListUpdateInfo.
     * 
     * @return operStatus
     */
    public java.lang.String getOperStatus() {
        return operStatus;
    }


    /**
     * Sets the operStatus value for this QuesListUpdateInfo.
     * 
     * @param operStatus
     */
    public void setOperStatus(java.lang.String operStatus) {
        this.operStatus = operStatus;
    }


    /**
     * Gets the quesListCarTaxInfo value for this QuesListUpdateInfo.
     * 
     * @return quesListCarTaxInfo
     */
    public com.derun.webservice.client.axis.QuesListCarTaxInfo getQuesListCarTaxInfo() {
        return quesListCarTaxInfo;
    }


    /**
     * Sets the quesListCarTaxInfo value for this QuesListUpdateInfo.
     * 
     * @param quesListCarTaxInfo
     */
    public void setQuesListCarTaxInfo(com.derun.webservice.client.axis.QuesListCarTaxInfo quesListCarTaxInfo) {
        this.quesListCarTaxInfo = quesListCarTaxInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuesListUpdateInfo)) return false;
        QuesListUpdateInfo other = (QuesListUpdateInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arrQuesListDefTaxInfo==null && other.getArrQuesListDefTaxInfo()==null) || 
             (this.arrQuesListDefTaxInfo!=null &&
              java.util.Arrays.equals(this.arrQuesListDefTaxInfo, other.getArrQuesListDefTaxInfo()))) &&
            ((this.operStatus==null && other.getOperStatus()==null) || 
             (this.operStatus!=null &&
              this.operStatus.equals(other.getOperStatus()))) &&
            ((this.quesListCarTaxInfo==null && other.getQuesListCarTaxInfo()==null) || 
             (this.quesListCarTaxInfo!=null &&
              this.quesListCarTaxInfo.equals(other.getQuesListCarTaxInfo())));
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
        if (getArrQuesListDefTaxInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrQuesListDefTaxInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrQuesListDefTaxInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperStatus() != null) {
            _hashCode += getOperStatus().hashCode();
        }
        if (getQuesListCarTaxInfo() != null) {
            _hashCode += getQuesListCarTaxInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuesListUpdateInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.derun.com", "QuesListUpdateInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrQuesListDefTaxInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.derun.com", "arrQuesListDefTaxInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.derun.com", "QuesListDefTaxInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://beans.derun.com", "QuesListDefTaxInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.derun.com", "operStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quesListCarTaxInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.derun.com", "quesListCarTaxInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.derun.com", "QuesListCarTaxInfo"));
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

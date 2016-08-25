/**
 * QuesListUpdateReqInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.derun.webservice.client.wtmd;

public class QuesListUpdateReqInfo  implements java.io.Serializable {
    private java.lang.String downloadSerialNo;

    private com.derun.webservice.client.wtmd.AnyType2AnyType2AnyTypeMapMapEntry[] errMap;

    private java.lang.Integer pageSize;

    private java.lang.String password;

    private java.lang.String reqStyle;

    private java.lang.String username;

    public QuesListUpdateReqInfo() {
    }

    public QuesListUpdateReqInfo(
           java.lang.String downloadSerialNo,
           com.derun.webservice.client.wtmd.AnyType2AnyType2AnyTypeMapMapEntry[] errMap,
           java.lang.Integer pageSize,
           java.lang.String password,
           java.lang.String reqStyle,
           java.lang.String username) {
           this.downloadSerialNo = downloadSerialNo;
           this.errMap = errMap;
           this.pageSize = pageSize;
           this.password = password;
           this.reqStyle = reqStyle;
           this.username = username;
    }


    /**
     * Gets the downloadSerialNo value for this QuesListUpdateReqInfo.
     * 
     * @return downloadSerialNo
     */
    public java.lang.String getDownloadSerialNo() {
        return downloadSerialNo;
    }


    /**
     * Sets the downloadSerialNo value for this QuesListUpdateReqInfo.
     * 
     * @param downloadSerialNo
     */
    public void setDownloadSerialNo(java.lang.String downloadSerialNo) {
        this.downloadSerialNo = downloadSerialNo;
    }


    /**
     * Gets the errMap value for this QuesListUpdateReqInfo.
     * 
     * @return errMap
     */
    public com.derun.webservice.client.wtmd.AnyType2AnyType2AnyTypeMapMapEntry[] getErrMap() {
        return errMap;
    }


    /**
     * Sets the errMap value for this QuesListUpdateReqInfo.
     * 
     * @param errMap
     */
    public void setErrMap(com.derun.webservice.client.wtmd.AnyType2AnyType2AnyTypeMapMapEntry[] errMap) {
        this.errMap = errMap;
    }


    /**
     * Gets the pageSize value for this QuesListUpdateReqInfo.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this QuesListUpdateReqInfo.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the password value for this QuesListUpdateReqInfo.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this QuesListUpdateReqInfo.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the reqStyle value for this QuesListUpdateReqInfo.
     * 
     * @return reqStyle
     */
    public java.lang.String getReqStyle() {
        return reqStyle;
    }


    /**
     * Sets the reqStyle value for this QuesListUpdateReqInfo.
     * 
     * @param reqStyle
     */
    public void setReqStyle(java.lang.String reqStyle) {
        this.reqStyle = reqStyle;
    }


    /**
     * Gets the username value for this QuesListUpdateReqInfo.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this QuesListUpdateReqInfo.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuesListUpdateReqInfo)) return false;
        QuesListUpdateReqInfo other = (QuesListUpdateReqInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.downloadSerialNo==null && other.getDownloadSerialNo()==null) || 
             (this.downloadSerialNo!=null &&
              this.downloadSerialNo.equals(other.getDownloadSerialNo()))) &&
            ((this.errMap==null && other.getErrMap()==null) || 
             (this.errMap!=null &&
              java.util.Arrays.equals(this.errMap, other.getErrMap()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.reqStyle==null && other.getReqStyle()==null) || 
             (this.reqStyle!=null &&
              this.reqStyle.equals(other.getReqStyle()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getDownloadSerialNo() != null) {
            _hashCode += getDownloadSerialNo().hashCode();
        }
        if (getErrMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getReqStyle() != null) {
            _hashCode += getReqStyle().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuesListUpdateReqInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.derun.com", "QuesListUpdateReqInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.derun.com", "downloadSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errMap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.derun.com", "errMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.wtmd.derun.com", ">anyType2anyType2anyTypeMapMap>entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service.wtmd.derun.com", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.derun.com", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.derun.com", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.derun.com", "reqStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.derun.com", "username"));
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

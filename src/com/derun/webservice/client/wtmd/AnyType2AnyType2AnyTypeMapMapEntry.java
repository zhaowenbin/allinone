/**
 * AnyType2AnyType2AnyTypeMapMapEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.derun.webservice.client.wtmd;

public class AnyType2AnyType2AnyTypeMapMapEntry  implements java.io.Serializable {
    private java.lang.Object key;

    private com.derun.webservice.client.wtmd.AnyType2AnyTypeMapEntry[] value;

    public AnyType2AnyType2AnyTypeMapMapEntry() {
    }

    public AnyType2AnyType2AnyTypeMapMapEntry(
           java.lang.Object key,
           com.derun.webservice.client.wtmd.AnyType2AnyTypeMapEntry[] value) {
           this.key = key;
           this.value = value;
    }


    /**
     * Gets the key value for this AnyType2AnyType2AnyTypeMapMapEntry.
     * 
     * @return key
     */
    public java.lang.Object getKey() {
        return key;
    }


    /**
     * Sets the key value for this AnyType2AnyType2AnyTypeMapMapEntry.
     * 
     * @param key
     */
    public void setKey(java.lang.Object key) {
        this.key = key;
    }


    /**
     * Gets the value value for this AnyType2AnyType2AnyTypeMapMapEntry.
     * 
     * @return value
     */
    public com.derun.webservice.client.wtmd.AnyType2AnyTypeMapEntry[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this AnyType2AnyType2AnyTypeMapMapEntry.
     * 
     * @param value
     */
    public void setValue(com.derun.webservice.client.wtmd.AnyType2AnyTypeMapEntry[] value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnyType2AnyType2AnyTypeMapMapEntry)) return false;
        AnyType2AnyType2AnyTypeMapMapEntry other = (AnyType2AnyType2AnyTypeMapMapEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnyType2AnyType2AnyTypeMapMapEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.wtmd.derun.com", ">anyType2anyType2anyTypeMapMap>entry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.wtmd.derun.com", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.wtmd.derun.com", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.wtmd.derun.com", ">anyType2anyTypeMap>entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service.wtmd.derun.com", "entry"));
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

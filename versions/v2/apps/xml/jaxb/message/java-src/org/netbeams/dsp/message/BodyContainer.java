//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.11.22 at 08:53:00 PM PST 
//


package org.netbeams.dsp.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Pojo" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Xml" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyContainer", propOrder = {
    "pojo",
    "xml"
})
public class BodyContainer {

    @XmlElement(name = "Pojo")
    protected Object pojo;
    @XmlElement(name = "Xml")
    protected Object xml;

    /**
     * Gets the value of the pojo property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPojo() {
        return pojo;
    }

    /**
     * Sets the value of the pojo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPojo(Object value) {
        this.pojo = value;
    }

    /**
     * Gets the value of the xml property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getXml() {
        return xml;
    }

    /**
     * Sets the value of the xml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setXml(Object value) {
        this.xml = value;
    }

}

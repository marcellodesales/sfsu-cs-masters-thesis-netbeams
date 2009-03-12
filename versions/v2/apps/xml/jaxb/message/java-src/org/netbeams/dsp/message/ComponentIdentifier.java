//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.03.04 at 09:49:05 PM PST 
//


package org.netbeams.dsp.message;

/**
 * <p>Java class for ComponentIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComponentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ComponentLocator" type="{http://www.netbeams.dsp.org/message.xsd}ComponentLocator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class ComponentIdentifier {

    //@XmlElement(name = "ComponentType", required = true)
    protected String componentType;
    //@XmlElement(name = "ComponentLocator", required = true)
    protected ComponentLocator componentLocator;

    /**
     * Gets the value of the componentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentType() {
        return componentType;
    }

    /**
     * Sets the value of the componentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentType(String value) {
        this.componentType = value;
    }

    /**
     * Gets the value of the componentLocator property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentLocator }
     *     
     */
    public ComponentLocator getComponentLocator() {
        return componentLocator;
    }

    /**
     * Sets the value of the componentLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentLocator }
     *     
     */
    public void setComponentLocator(ComponentLocator value) {
        this.componentLocator = value;
    }
    
    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<ComponentType>" + this.componentType + "</ComponentType>");
        builder.append(this.componentLocator.toXml());
        return builder.toString();
    }
}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.21 at 02:31:02 AM PST 
//


package org.netbeams.dsp.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentLocator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentLocator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComponentNodeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NodeAddress" type="{http://www.netbeams.dsp.org/message.xsd}AbstractNodeAddress"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentLocator", propOrder = {
    "componentNodeId",
    "nodeAddress"
})
public class ComponentLocator {

    @XmlElement(name = "ComponentNodeId", required = true)
    protected String componentNodeId;
    @XmlElement(name = "NodeAddress", required = true, type = NodeAddress.class)
    protected NodeAddress nodeAddress;

    /**
     * Gets the value of the componentNodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentNodeId() {
        return componentNodeId;
    }

    /**
     * Sets the value of the componentNodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentNodeId(String value) {
        this.componentNodeId = value;
    }

    /**
     * Gets the value of the nodeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractNodeAddress }
     *     
     */
    public AbstractNodeAddress getNodeAddress() {
        return nodeAddress;
    }

    /**
     * Sets the value of the nodeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractNodeAddress }
     *     
     */
    public void setNodeAddress(AbstractNodeAddress value) {
        this.nodeAddress = ((NodeAddress) value);
    }

}

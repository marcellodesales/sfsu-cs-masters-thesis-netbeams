//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.11.23 at 11:55:37 PM PST 
//


package org.netbeams.dsp.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreationTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Producer" type="{http://www.netbeams.dsp.org/message.xsd}ComponentIdentifier"/>
 *         &lt;element name="Consumer" type="{http://www.netbeams.dsp.org/message.xsd}ComponentIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "creationTime",
    "correlationID",
    "producer",
    "consumer"
})
public class Header {

    @XmlElement(name = "CreationTime")
    protected long creationTime;
    @XmlElement(name = "CorrelationID", required = true)
    protected Object correlationID;
    @XmlElement(name = "Producer", required = true)
    protected ComponentIdentifier producer;
    @XmlElement(name = "Consumer", required = true)
    protected ComponentIdentifier consumer;

    /**
     * Gets the value of the creationTime property.
     * 
     */
    public long getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     */
    public void setCreationTime(long value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCorrelationID(Object value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentIdentifier }
     *     
     */
    public ComponentIdentifier getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentIdentifier }
     *     
     */
    public void setProducer(ComponentIdentifier value) {
        this.producer = value;
    }

    /**
     * Gets the value of the consumer property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentIdentifier }
     *     
     */
    public ComponentIdentifier getConsumer() {
        return consumer;
    }

    /**
     * Sets the value of the consumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentIdentifier }
     *     
     */
    public void setConsumer(ComponentIdentifier value) {
        this.consumer = value;
    }

}

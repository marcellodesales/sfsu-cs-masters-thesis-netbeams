//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.03.04 at 09:49:05 PM PST 
//


package org.netbeams.dsp.message;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://www.netbeams.dsp.org/message.xsd}AbstractMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uudi" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creationTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destinationHost" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="acknowledgeUntil" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class MessagesContainer {

//    @XmlElement(type = Message.class)
    protected List<AbstractMessage> message;
//    @XmlAttribute(required = true)
    protected String uudi;
//    @XmlAttribute(required = true)
    protected String creationTime;
//    @XmlAttribute
    protected String destinationHost;
//    @XmlAttribute
    protected Integer acknowledgeUntil;
    
    private Integer windowSize;

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractMessage }
     * 
     * 
     */
    public List<AbstractMessage> getMessage() {
        if (message == null) {
            message = Collections.synchronizedList(new ArrayList<AbstractMessage>());
        }
        return this.message;
    }

    /**
     * Gets the value of the uudi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUudi() {
        return uudi;
    }

    /**
     * Sets the value of the uudi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUudi(String value) {
        this.uudi = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTime(String value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the destinationHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationHost() {
        return destinationHost;
    }

    /**
     * Sets the value of the destinationHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationHost(String value) {
        this.destinationHost = value;
    }

    /**
     * Gets the value of the acknowledgeUntil property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcknowledgeUntil() {
        return acknowledgeUntil;
    }

    /**
     * Sets the value of the acknowledgeUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcknowledgeUntil(Integer value) {
        this.acknowledgeUntil = value;
    }
    
    /**
     * @return The largest sequence number on the container. It's only used when transmitting messages
     * from the client to the server. Use the acknowledge until value to indicate the size of the window.
     */
    public Integer getWindowSize() {
        return this.windowSize;
    }
    
    /**
     * @param largestSequenceNumber is the biggest sequence number in a messages container. It sets the
     * size of the window for flow control.
     */
    public void setWindowSize(Integer largestSequenceNumber) {
        this.windowSize = largestSequenceNumber;
    }
    
    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
        builder.append("<MessagesContainer ");
        builder.append("uudi=\"" + this.uudi + "\" "); 
        builder.append("creationTime=\""+this.creationTime+"\" ");
        builder.append("destinationHost=\"" + this.destinationHost + "\" ");
        if (this.windowSize != null) {
             builder.append("windowSize=\"" + this.windowSize + "\" ");
        }
        if (this.acknowledgeUntil != null) {
            builder.append("acknowledgeUntil=\"" + this.acknowledgeUntil + "\"");
        }
        if (this.message != null) {
            builder.append(">");
            for(AbstractMessage message : this.message) {
                builder.append(message.toXml());
            }
            builder.append("</MessagesContainer>");
        } else {
            builder.append(" />");
        }
        return builder.toString();
    }
}

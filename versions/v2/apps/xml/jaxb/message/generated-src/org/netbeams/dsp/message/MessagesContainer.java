//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.01.29 at 01:41:26 PM PST 
//


package org.netbeams.dsp.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="message" type="{http://www.netbeams.dsp.org/message.xsd}AbstractMessage" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uudi" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creationTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "message"
})
@XmlRootElement(name = "MessagesContainer")
public class MessagesContainer {

    @XmlElement(required = true, type = Message.class)
    protected List<AbstractMessage> message;
    @XmlAttribute(required = true)
    protected String uudi;
    @XmlAttribute(required = true)
    protected String creationTime;
    @XmlAttribute
    protected String host;

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
            message = new ArrayList<AbstractMessage>();
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
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

}

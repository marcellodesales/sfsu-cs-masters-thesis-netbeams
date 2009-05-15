//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.03.04 at 06:15:56 PM PST 
//


package org.netbeams.dsp.demo.mouseactions;

import org.netbeams.dsp.message.XmlDecoratable;



/**
 * <p>Java class for mouseAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mouseAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="button" type="{http://dsp.netbeams.org/demo/mouseaction.xsd}buttonName" />
 *       &lt;attribute name="event" type="{http://dsp.netbeams.org/demo/mouseaction.xsd}eventName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "mouseAction")
public class MouseAction implements XmlDecoratable {

//    @XmlAttribute
    protected Integer x;
//    @XmlAttribute
    protected Integer y;
//    @XmlAttribute
    protected ButtonName button;
//    @XmlAttribute
    protected EventName event;

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setX(Integer value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setY(Integer value) {
        this.y = value;
    }

    /**
     * Gets the value of the button property.
     * 
     * @return
     *     possible object is
     *     {@link ButtonName }
     *     
     */
    public ButtonName getButton() {
        return button;
    }

    /**
     * Sets the value of the button property.
     * 
     * @param value
     *     allowed object is
     *     {@link ButtonName }
     *     
     */
    public void setButton(ButtonName value) {
        this.button = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link EventName }
     *     
     */
    public EventName getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventName }
     *     
     */
    public void setEvent(EventName value) {
        this.event = value;
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<mouseAction");
        builder.append(this.button.toXml());
        builder.append(this.event.toXml());
        builder.append(" x=\"" + this.x + "\"");
        builder.append(" y=\"" + this.y + "\"/>");
        return builder.toString();
    }

}

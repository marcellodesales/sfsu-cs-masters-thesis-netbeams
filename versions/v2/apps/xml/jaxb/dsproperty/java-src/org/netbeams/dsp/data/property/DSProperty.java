//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.03.04 at 06:15:49 PM PST 
//


package org.netbeams.dsp.data.property;

/**
 * <p>Java class for DSProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Values" type="{http://www.netbeams.dsp.org/dsproperty.xsd}Values"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="instruction" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class DSProperty {

//    @XmlElement(name = "Value")
    protected String value;
//    @XmlElement(name = "Values")
    protected Values values;
//    @XmlAttribute
//    @XmlSchemaType(name = "anySimpleType")
    protected String name;
//    @XmlAttribute
//    @XmlSchemaType(name = "anySimpleType")
    protected String type;
//    @XmlAttribute
//    @XmlSchemaType(name = "anySimpleType")
    protected String format;
//    @XmlAttribute
//    @XmlSchemaType(name = "anySimpleType")
    protected String unit;
//    @XmlAttribute
//    @XmlSchemaType(name = "anySimpleType")
    protected String instruction;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link Values }
     *     
     */
    public Values getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link Values }
     *     
     */
    public void setValues(Values value) {
        this.values = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstruction(String value) {
        this.instruction = value;
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<Property ");
        builder.append("name=\"" + this.name + "\" ");
        if (this.format != null && !this.format.equals("")) {
            builder.append("format=\"" + this.format + "\" ");
        }
        if (this.instruction != null && !this.instruction.equals("")) {
            builder.append("instruction=\"" + this.instruction + "\" ");
        }
        if (this.type!= null && !this.type.equals("")) {
            builder.append("type=\"" + this.type + "\" ");
        }
        if (this.unit!= null && !this.unit.equals("")) {
            builder.append("unit=\"" + this.unit + "\" ");
        }
        builder.append(">");
        if (this.value != null) {
            builder.append("<Value>"+ this.value + "</Value>");
        } else {
            builder.append(this.values.toXml());
        }
        builder.append("</Property>");
        return builder.toString();
    }
}

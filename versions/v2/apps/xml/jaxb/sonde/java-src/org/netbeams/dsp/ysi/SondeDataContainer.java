//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.03.04 at 06:20:22 PM PST 
//


package org.netbeams.dsp.ysi;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import org.netbeams.dsp.message.MessageContent;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netbeams.dsp.org/message.xsd}AbstractMessageContent">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="sondeData" type="{http://www.netbeams.dsp.org/sondedata.xsd}sondeDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class SondeDataContainer
    extends MessageContent
{

//    @XmlElement(required = true)
    protected List<SondeDataType> sondeData;
    
    
    /**
     * Gets the value of the sondeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sondeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSondeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SondeDataType }
     * 
     * 
     */
    public List<SondeDataType> getSondeData() {
        if (sondeData == null) {
            sondeData = Collections.synchronizedList(new ArrayList<SondeDataType>());
        }
        return this.sondeData;
    }

    public synchronized String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<SondeDataContainer>");
        for(SondeDataType data : this.sondeData) {
            builder.append(data.toXml());
        }
        builder.append("</SondeDataContainer>");
        return builder.toString();
    }
}

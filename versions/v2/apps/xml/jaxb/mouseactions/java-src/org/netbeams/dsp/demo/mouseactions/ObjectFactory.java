//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.03.19 at 02:23:22 AM PDT 
//


package org.netbeams.dsp.demo.mouseactions;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeams.dsp.demo.mouseactions package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeams.dsp.demo.mouseactions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MouseAction }
     * 
     */
    public MouseAction createMouseAction() {
        return new MouseAction();
    }

    /**
     * Create an instance of {@link MouseActionsContainer }
     * 
     */
    public MouseActionsContainer createMouseActionsContainer() {
        return new MouseActionsContainer();
    }

}

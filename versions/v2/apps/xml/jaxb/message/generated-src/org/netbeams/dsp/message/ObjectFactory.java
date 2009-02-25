//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.25 at 01:49:31 AM PST 
//


package org.netbeams.dsp.message;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeams.dsp.message package. 
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

    private final static QName _InsertMessage_QNAME = new QName("http://www.netbeams.dsp.org/message.xsd", "InsertMessage");
    private final static QName _DeleteMessage_QNAME = new QName("http://www.netbeams.dsp.org/message.xsd", "DeleteMessage");
    private final static QName _CreateMessage_QNAME = new QName("http://www.netbeams.dsp.org/message.xsd", "CreateMessage");
    private final static QName _UpdateMessage_QNAME = new QName("http://www.netbeams.dsp.org/message.xsd", "UpdateMessage");
    private final static QName _AcknowledgementMessage_QNAME = new QName("http://www.netbeams.dsp.org/message.xsd", "AcknowledgementMessage");
    private final static QName _ActionMessage_QNAME = new QName("http://www.netbeams.dsp.org/message.xsd", "ActionMessage");
    private final static QName _QueryMessage_QNAME = new QName("http://www.netbeams.dsp.org/message.xsd", "QueryMessage");
    private final static QName _MeasureMessage_QNAME = new QName("http://www.netbeams.dsp.org/message.xsd", "MeasureMessage");
    private final static QName _EventMessage_QNAME = new QName("http://www.netbeams.dsp.org/message.xsd", "EventMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeams.dsp.message
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AbstractMessage }
     * 
     */
    public AbstractMessage createAbstractMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link QueryMessage }
     * 
     */
    public QueryMessage createQueryMessage() {
        return new QueryMessage();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link CreateMessage }
     * 
     */
    public CreateMessage createCreateMessage() {
        return new CreateMessage();
    }

    /**
     * Create an instance of {@link ComponentLocator }
     * 
     */
    public ComponentLocator createComponentLocator() {
        return new ComponentLocator();
    }

    /**
     * Create an instance of {@link AbstractNodeAddress }
     * 
     */
    public AbstractNodeAddress createAbstractNodeAddress() {
        return new NodeAddress();
    }

    /**
     * Create an instance of {@link InsertMessage }
     * 
     */
    public InsertMessage createInsertMessage() {
        return new InsertMessage();
    }

    /**
     * Create an instance of {@link MessagesContainer }
     * 
     */
    public MessagesContainer createMessagesContainer() {
        return new MessagesContainer();
    }

    /**
     * Create an instance of {@link DeleteMessage }
     * 
     */
    public DeleteMessage createDeleteMessage() {
        return new DeleteMessage();
    }

    /**
     * Create an instance of {@link ComponentIdentifier }
     * 
     */
    public ComponentIdentifier createComponentIdentifier() {
        return new ComponentIdentifier();
    }

    /**
     * Create an instance of {@link ActionMessage }
     * 
     */
    public ActionMessage createActionMessage() {
        return new ActionMessage();
    }

    /**
     * Create an instance of {@link UpdateMessage }
     * 
     */
    public UpdateMessage createUpdateMessage() {
        return new UpdateMessage();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link EventMessage }
     * 
     */
    public EventMessage createEventMessage() {
        return new EventMessage();
    }

    /**
     * Create an instance of {@link MeasureMessage }
     * 
     */
    public MeasureMessage createMeasureMessage() {
        return new MeasureMessage();
    }

    /**
     * Create an instance of {@link AcknowledgementMessage }
     * 
     */
    public AcknowledgementMessage createAcknowledgementMessage() {
        return new AcknowledgementMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netbeams.dsp.org/message.xsd", name = "InsertMessage")
    public JAXBElement<Object> createInsertMessage(Object value) {
        return new JAXBElement<Object>(_InsertMessage_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netbeams.dsp.org/message.xsd", name = "DeleteMessage")
    public JAXBElement<Object> createDeleteMessage(Object value) {
        return new JAXBElement<Object>(_DeleteMessage_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netbeams.dsp.org/message.xsd", name = "CreateMessage")
    public JAXBElement<Object> createCreateMessage(Object value) {
        return new JAXBElement<Object>(_CreateMessage_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netbeams.dsp.org/message.xsd", name = "UpdateMessage")
    public JAXBElement<Object> createUpdateMessage(Object value) {
        return new JAXBElement<Object>(_UpdateMessage_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netbeams.dsp.org/message.xsd", name = "AcknowledgementMessage")
    public JAXBElement<Object> createAcknowledgementMessage(Object value) {
        return new JAXBElement<Object>(_AcknowledgementMessage_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netbeams.dsp.org/message.xsd", name = "ActionMessage")
    public JAXBElement<Object> createActionMessage(Object value) {
        return new JAXBElement<Object>(_ActionMessage_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netbeams.dsp.org/message.xsd", name = "QueryMessage")
    public JAXBElement<Object> createQueryMessage(Object value) {
        return new JAXBElement<Object>(_QueryMessage_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netbeams.dsp.org/message.xsd", name = "MeasureMessage")
    public JAXBElement<Object> createMeasureMessage(Object value) {
        return new JAXBElement<Object>(_MeasureMessage_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netbeams.dsp.org/message.xsd", name = "EventMessage")
    public JAXBElement<Object> createEventMessage(Object value) {
        return new JAXBElement<Object>(_EventMessage_QNAME, Object.class, null, value);
    }

}

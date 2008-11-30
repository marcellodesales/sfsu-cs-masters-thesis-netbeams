package org.netbeams.dsp;


import org.netbeams.dsp.message.*;
import org.netbeams.dsp.util.ErrorCode;


/**
 * Currently this factory create XML (JDOM) based message. In the future it would be possible to configure the 
 * a different encoding type.
 * 
 * @author kleber
 *
 */
public class MessageFactory {
	
	private MessageFactory() {}
	
	public static Message newMessage(Class<? extends Message> messageType, MessageContent messageContent, BaseComponent producer)
		throws DSPException
	{
	
		ComponentLocator locator = new ComponentLocator();
		locator.setComponentNodeId(producer.getComponentNodeId());
		locator.setNodeAddress(NodeAddressHelper.LOCAL_NODEADDRESS);
		
		ComponentIdentifier indentifier = new ComponentIdentifier();
		indentifier.setComponentType(producer.getComponentType());
		indentifier.setComponentLocator(locator);
				
		Message  message = createMessage(messageType, messageContent, indentifier);
		return message;
	}


	private static Message createMessage(Class<? extends Message> messageType,
			MessageContent messageContent, ComponentIdentifier componentIdentifier) 
		throws DSPException 
	{
		Message message = null;
		
		if(messageType.equals(ActionMessage.class)){
			message = new ActionMessage();
		}else if(messageType.equals(CreateMessage.class)){
			message = new ActionMessage();
		}else if(messageType.equals(DeleteMessage.class)){
			message = new ActionMessage();
		}else if(messageType.equals(EventMessage.class)){
			message = new ActionMessage();
		}else if(messageType.equals(InsertMessage.class)){
			message = new ActionMessage();
		}else if(messageType.equals(QueryMessage.class)){
			message = new ActionMessage();
		}else if(messageType.equals(UpdateMessage.class)){
			message = new ActionMessage();
		}else if(messageType.equals(MeasureMessage.class)){
			message = new ActionMessage();
		}else{
			throw new DSPException(ErrorCode.ERROR_INVALID_MESSAGE, "Invalide Message Type=" + messageType.getName());
		}
		
		// Create Header
		Header header = new Header();
		// Create Body
		Body body = new Body();
		body.setAny(messageContent);
		// Set up Message
		message.setContentType(messageContent.getContentType());
		message.setHeader(header);
		message.setBody(body);
		
		return message;
	}
}
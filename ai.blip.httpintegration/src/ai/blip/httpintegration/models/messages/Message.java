package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ai.blip.httpintegration.enums.MessageType;
import ai.blip.httpintegration.helpers.MessageDeserializer;


@JsonDeserialize(using = MessageDeserializer.class)
public  abstract class Message implements Serializable {

	protected String id = UUID.randomUUID().toString();
	protected MessageType type;
	protected String to;
	protected final static long serialVersionUID = 875082919667906573L;


	public Message() {
	}


	public Message(String id, MessageType type, String to) {
		super();
		this.id = id;
		this.type = type;
		this.to = to;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Message withId(String id) {
		this.id = id;
		return this;
	}
	
	public String getType() {
		return type.toString();
	}

	public void setType(String type) {		
		this.type = MessageType.fromString(type);
	}

	public Message withType(MessageType type) {
		this.type = type;
		return this;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Message withTo(String to) {
		this.to = to;
		return this;
	}
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("type", type)
				.append("to", to).toString();
	}
	
	

}
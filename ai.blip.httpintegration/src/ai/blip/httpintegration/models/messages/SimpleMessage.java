package ai.blip.httpintegration.models.messages;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ai.blip.httpintegration.enums.MessageType;

@JsonDeserialize(as = SimpleMessage.class)
public class SimpleMessage  extends Message{
	
	private String content;
	private final static long serialVersionUID = 875092919667906574L;
	public SimpleMessage() {
	}

	/**
	 * 
	 * @param content
	 * @param to
	 * @param id
	 * @param type
	 */
	public SimpleMessage(String id, MessageType type, String to, String content) {
		super(id, type, to);
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public SimpleMessage withContent(String content) {
		this.content = content;
		return this;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", super.id).append("type",  super.type).append("to",  super.to)
				.append("content", content).append("additionalProperties",  super.additionalProperties).toString();
	}
	

}

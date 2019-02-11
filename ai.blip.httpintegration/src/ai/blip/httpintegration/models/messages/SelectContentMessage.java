package ai.blip.httpintegration.models.messages;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ai.blip.httpintegration.enums.MessageType;

@JsonDeserialize(as = SelectContentMessage.class)
public class SelectContentMessage  extends Message{
	
	private SelectContent content;
	private final static long serialVersionUID = 875092919667906573L;
	public SelectContentMessage() {
	}

	/**
	 * 
	 * @param content
	 * @param to
	 * @param id
	 * @param type
	 */
	public SelectContentMessage(String id, MessageType type, String to, SelectContent content) {
		super(id, type, to);
		this.content = content;
	}
	
	public SelectContent getContent() {
		return content;
	}

	public void setContent(SelectContent content) {
		this.content = content;
	}
	
	public SelectContentMessage withContent(SelectContent content) {
		this.content = content;
		return this;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", super.id).append("type",  super.type).append("to",  super.to)
				.append("content", content).append("additionalProperties",  super.additionalProperties).toString();
	}
	

}

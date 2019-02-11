package ai.blip.httpintegration.models.messages;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ai.blip.httpintegration.enums.MessageType;

@JsonDeserialize(as = ListContentMessage.class)
public class ListContentMessage extends Message{
	private ListContent content;
	private final static long serialVersionUID = 875092719667906573L;
	public ListContentMessage() {
	}

	/**
	 * 
	 * @param content
	 * @param to
	 * @param id
	 * @param type
	 */
	public ListContentMessage(String id, MessageType type, String to, ListContent content) {
		super(id, type, to);
		this.content = content;
	}
	
	public ListContent getContent() {
		return content;
	}

	public void setContent(ListContent content) {
		this.content = content;
	}
	
	public ListContentMessage withContent(ListContent content) {
		this.content = content;
		return this;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", super.id).append("type",  super.type).append("to",  super.to)
				.append("content", content).append("additionalProperties",  super.additionalProperties).toString();
	}
	
}

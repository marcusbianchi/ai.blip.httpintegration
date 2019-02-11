package ai.blip.httpintegration.models.messages;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ai.blip.httpintegration.enums.MessageType;

@JsonDeserialize(as = WebLinkContentMessage.class)
public class WebLinkContentMessage extends Message {

	private WebLinkContent content;
	private final static long serialVersionUID = 875092919667906573L;

	public WebLinkContentMessage() {
	}

	public WebLinkContentMessage(String id, MessageType type, String to, WebLinkContent content) {
		super(id, type, to);
		this.content = content;
	}

	public WebLinkContent getContent() {
		return content;
	}

	public void setContent(WebLinkContent content) {
		this.content = content;
	}

	public WebLinkContentMessage withContent(WebLinkContent content) {
		this.content = content;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", super.id).append("type", super.type).append("to", super.to)
				.append("content", content).toString();
	}

}

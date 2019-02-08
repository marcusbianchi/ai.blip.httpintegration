package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang.builder.ToStringBuilder;

import ai.blip.httpintegration.enums.MessageType;

public class Message implements Serializable {

	private String id = UUID.randomUUID().toString();
	private MessageType type;
	private String to;
	private Object content;
	private Map<String, String> additionalProperties = new HashMap<String, String>();
	private final static long serialVersionUID = 875082919667906573L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Message() {
	}

	/**
	 * 
	 * @param content
	 * @param to
	 * @param id
	 * @param type
	 */
	public Message(String id, MessageType type, String to, CarrouselContent content) {
		super();
		this.id = id;
		this.type = type;
		this.to = to;
		this.content = content;
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

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
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

	public CarrouselContent getContentAsCarrouselContent() {
		if(this.content instanceof CarrouselContent)
			return (CarrouselContent)content;
		else
			return null;
	}
	
	public SelectContent getContentAsSelectContent() {
		if(this.content instanceof SelectContent)
			return (SelectContent)content;
		else
			return null;
	}
	
	public SelectContent getContentAsMediaLinkContent() {
		if(this.content instanceof MediaLinkContent)
			return (SelectContent)content;
		else
			return null;
	}
	
	public SelectContent getContentAsWebLinkContentt() {
		if(this.content instanceof WebLinkContent)
			return (SelectContent)content;
		else
			return null;
	}
	
	
	public void setContent(WebLinkContent content) {
		this.content = content;
	}
	
	public void setContent(CarrouselContent content) {
		this.content = content;
	}
	
	public void setContent(SelectContent content) {
		this.content = content;
	}
	
	public void setContent(MediaLinkContent content) {
		this.content = content;
	}
	
	public String getContentAsString() {
		if(this.content instanceof String)
			return (String)content;
		else if(this.content instanceof CarrouselContent || this.content instanceof SelectContent|| this.content instanceof MediaLinkContent|| this.content instanceof WebLinkContent)
			return this.content.toString();
		else 
			return null;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Message withContent(CarrouselContent content) {
		this.content = content;
		return this;
	}

	public Map<String, String> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
	}

	public Message withAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("type", type).append("to", to)
				.append("content", content).append("additionalProperties", additionalProperties).toString();
	}

}
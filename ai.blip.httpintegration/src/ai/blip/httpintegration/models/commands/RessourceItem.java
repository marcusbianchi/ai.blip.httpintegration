package ai.blip.httpintegration.models.commands;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class RessourceItem implements Serializable {

	private String text;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -71505539307412990L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public RessourceItem() {
	}

	/**
	 * 
	 * @param text
	 */
	public RessourceItem(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public RessourceItem withText(String text) {
		this.text = text;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public RessourceItem withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("text", text).append("additionalProperties", additionalProperties)
				.toString();
	}

}
package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Header implements Serializable {

	private String type;
	private Value value;
	private Map<String, String> additionalProperties = new HashMap<String, String>();
	private final static long serialVersionUID = -8537719114270319136L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Header() {
	}

	/**
	 * 
	 * @param value
	 * @param type
	 */
	public Header(String type, Value value) {
		super();
		this.type = type;
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Header withType(String type) {
		this.type = type;
		return this;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public Header withValue(Value value) {
		this.value = value;
		return this;
	}

	public Map<String, String> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
	}

	public Header withAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("type", type).append("value", value)
				.append("additionalProperties", additionalProperties).toString();
	}

}
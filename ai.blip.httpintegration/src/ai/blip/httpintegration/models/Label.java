package ai.blip.httpintegration.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Label implements Serializable {

	private String type;
	private Value value;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 4364383931646628478L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Label() {
	}

	/**
	 * 
	 * @param value
	 * @param type
	 */
	public Label(String type, Value value) {
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

	public Label withType(String type) {
		this.type = type;
		return this;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public Label withValue(Value value) {
		this.value = value;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Label withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("type", type).append("value", value)
				.append("additionalProperties", additionalProperties).toString();
	}

}
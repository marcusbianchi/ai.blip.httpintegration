package ai.blip.httpintegration.models.commands;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class NLPEntity implements Serializable {

	private String id;
	private String name;
	private String value;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 3123556739045008701L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public NLPEntity() {
	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param value
	 */
	public NLPEntity(String id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public NLPEntity withId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NLPEntity withName(String name) {
		this.name = name;
		return this;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public NLPEntity withValue(String value) {
		this.value = value;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public NLPEntity withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("name", name).append("value", value)
				.append("additionalProperties", additionalProperties).toString();
	}

}
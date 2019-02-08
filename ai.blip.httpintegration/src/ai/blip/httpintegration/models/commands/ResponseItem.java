
package ai.blip.httpintegration.models.commands;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ResponseItem implements Serializable {

	private String id;
	private String name;
	private String text;
	private String value;
	private String type;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2446270783204659650L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ResponseItem() {
	}

	/**
	 * 
	 * @param id
	 * @param provider
	 * @param trainingDate
	 * @param storageDate
	 * @param externalId
	 */
	public ResponseItem(String id, String name, String value, String type) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ResponseItem withId(String id) {
		this.id = id;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public ResponseItem withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ResponseItem withName(String name) {
		this.name = name;
		return this;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ResponseItem withtText(String text) {
		this.text = text;
		return this;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ResponseItem withtValue(String value) {
		this.value = value;
		return this;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public ResponseItem withtType(String type) {
		this.type = type;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("name", name).append("text", text)
				.append("value", value).append("type", type).append("additionalProperties", additionalProperties).toString();
	}

}
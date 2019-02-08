package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SelectContent implements Serializable {

	private String text;
	private String scope;
	private List<Option> options = new ArrayList<Option>();
	private Map<String, String> additionalProperties = new HashMap<String, String>();
	private final static long serialVersionUID = 8917460429094532419L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public SelectContent() {
	}

	/**
	 * 
	 * @param text
	 * @param scope
	 * @param options
	 */
	public SelectContent(String text, String scope, List<Option> options) {
		super();
		this.text = text;
		this.scope = scope;
		this.options = options;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public SelectContent withText(String text) {
		this.text = text;
		return this;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public SelectContent withScope(String scope) {
		this.scope = scope;
		return this;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public SelectContent withOptions(List<Option> options) {
		this.options = options;
		return this;
	}

	public Map<String, String> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
	}

	public SelectContent withAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("text", text).append("scope", scope).append("options", options)
				.append("additionalProperties", additionalProperties).toString();
	}

}
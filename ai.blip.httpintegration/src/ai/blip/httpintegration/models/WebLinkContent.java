package ai.blip.httpintegration.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class WebLinkContent implements Serializable {

	private String uri;
	private String target;
	private String text;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 4537027183665459057L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public WebLinkContent() {
	}

	/**
	 * 
	 * @param text
	 * @param target
	 * @param uri
	 */
	public WebLinkContent(String uri, String target, String text) {
		super();
		this.uri = uri;
		this.target = target;
		this.text = text;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public WebLinkContent withUri(String uri) {
		this.uri = uri;
		return this;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public WebLinkContent withTarget(String target) {
		this.target = target;
		return this;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public WebLinkContent withText(String text) {
		this.text = text;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public WebLinkContent withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("uri", uri).append("target", target).append("text", text)
				.append("additionalProperties", additionalProperties).toString();
	}

}
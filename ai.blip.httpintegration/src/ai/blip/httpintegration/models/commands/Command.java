package ai.blip.httpintegration.models.commands;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Command implements Serializable {

	private String id;
	private String to;
	private String method;
	private String uri;
	private String type;
	private Resource resource;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 8095711414605888550L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Command() {
	}

	/**
	 * 
	 * @param to
	 * @param id
	 * @param resource
	 * @param method
	 * @param type
	 * @param uri
	 */
	public Command(String id, String to, String method, String uri, String type, Resource resource) {
		super();
		this.id = id;
		this.to = to;
		this.method = method;
		this.uri = uri;
		this.type = type;
		this.resource = resource;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Command withId(String id) {
		this.id = id;
		return this;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Command withTo(String to) {
		this.to = to;
		return this;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Command withMethod(String method) {
		this.method = method;
		return this;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Command withUri(String uri) {
		this.uri = uri;
		return this;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Command withType(String type) {
		this.type = type;
		return this;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Command withResource(Resource resource) {
		this.resource = resource;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Command withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("to", to).append("method", method).append("uri", uri)
				.append("type", type).append("resource", resource).append("additionalProperties", additionalProperties)
				.toString();
	}

}
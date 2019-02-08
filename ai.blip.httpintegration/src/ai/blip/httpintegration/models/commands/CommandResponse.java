package ai.blip.httpintegration.models.commands;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

import ai.blip.httpintegration.enums.CommandType;

public class CommandResponse implements Serializable {

	private String id;
	private String from;
	private String to;
	private String method;
	private String status;
	private CommandType type;
	private ReponseResource resource;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -887713427385553081L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public CommandResponse() {
	}

	/**
	 * 
	 * @param to
	 * @param id
	 * @param status
	 * @param resource
	 * @param method
	 * @param from
	 * @param type
	 */
	public CommandResponse(String id, String from, String to, String method, String status, CommandType type,
			ReponseResource resource) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.method = method;
		this.status = status;
		this.type = type;
		this.resource = resource;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CommandResponse withId(String id) {
		this.id = id;
		return this;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public CommandResponse withFrom(String from) {
		this.from = from;
		return this;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public CommandResponse withTo(String to) {
		this.to = to;
		return this;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public CommandResponse withMethod(String method) {
		this.method = method;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CommandResponse withStatus(String status) {
		this.status = status;
		return this;
	}

	public CommandType getType() {
		return type;
	}

	public void setType(CommandType type) {
		this.type = type;
	}

	public CommandResponse withType(CommandType type) {
		this.type = type;
		return this;
	}

	public ReponseResource getResource() {
		return resource;
	}

	public void setResource(ReponseResource resource) {
		this.resource = resource;
	}

	public CommandResponse withResource(ReponseResource resource) {
		this.resource = resource;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public CommandResponse withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("from", from).append("to", to).append("method", method)
				.append("status", status).append("type", type).append("resource", resource)
				.append("additionalProperties", additionalProperties).toString();
	}

}
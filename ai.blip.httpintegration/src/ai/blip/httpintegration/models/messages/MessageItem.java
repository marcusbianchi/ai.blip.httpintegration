package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class MessageItem implements Serializable {

	private Header header;
	private List<Option> options = new ArrayList<Option>();
	private Map<String, String> additionalProperties = new HashMap<String, String>();
	private final static long serialVersionUID = -1708126047961356653L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public MessageItem() {
	}

	/**
	 * 
	 * @param id
	 * @param options
	 */
	public MessageItem(Header header, List<Option> options) {
		super();
		this.header = header;
		this.options = options;

	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public MessageItem withHeader(Header header) {
		this.header = header;
		return this;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public MessageItem withOptions(List<Option> options) {
		this.options = options;
		return this;
	}

	public Map<String, String> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
	}

	public MessageItem withAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("header", header).append("options", options)
				.append("additionalProperties", additionalProperties).toString();
	}

}
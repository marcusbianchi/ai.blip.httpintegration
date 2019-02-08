package ai.blip.httpintegration.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Item implements Serializable {

	private Header header;
	private List<Option> options = new ArrayList<Option>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -1708126047961356653L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Item() {
	}

	/**
	 * 
	 * @param id
	 * @param options
	 */
	public Item(Header header, List<Option> options) {
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

	public Item withHeader(Header header) {
		this.header = header;
		return this;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public Item withOptions(List<Option> options) {
		this.options = options;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Item withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("header", header).append("options", options)
				.append("additionalProperties", additionalProperties).toString();
	}

}
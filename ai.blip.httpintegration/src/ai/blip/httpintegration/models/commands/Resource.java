package ai.blip.httpintegration.models.commands;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang.builder.ToStringBuilder;

import ai.blip.httpintegration.models.messages.MessageItem;

public class Resource implements Serializable {

	private String name;
	private String itemType;
	private String id = UUID.randomUUID().toString();
	private String text;
	private List<MessageItem> messageItems = new ArrayList<MessageItem>();
	private List<RessourceValue> values = new ArrayList<RessourceValue>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -5396624263286655891L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Resource() {
	}

	/**
	 * 
	 * @param values
	 * @param name
	 */
	public Resource(String name, String itemType, List<RessourceValue> values, List<MessageItem> messageItems, String text) {
		super();
		this.name = name;
		this.values = values;
		this.itemType = itemType;
		this.messageItems = messageItems;
		this.text = text;
	}

	public String getitemType() {
		return itemType;
	}

	public void setitemType(String itemType) {
		this.itemType = itemType;
	}

	public Resource wititemType(String itemType) {
		this.itemType = itemType;
		return this;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public Resource wititemText(String text) {
		this.text = text;
		return this;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Resource withId(String id) {
		this.id = id;
		return this;
	}

	public List<MessageItem> getItems() {
		return messageItems;
	}

	public void setItems(List<MessageItem> messageItems) {
		this.messageItems = messageItems;
	}

	public Resource withItems(List<MessageItem> messageItems) {
		this.messageItems = messageItems;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Resource withName(String name) {
		this.name = name;
		return this;
	}

	public List<RessourceValue> getValues() {
		return values;
	}

	public void setValues(List<RessourceValue> values) {
		this.values = values;
	}

	public Resource withValues(List<RessourceValue> values) {
		this.values = values;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Resource withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}
	



	@Override
	public String toString() {
		return new ToStringBuilder(this).append("name", name).append("values", values).append("itemType", itemType).append("text",text)
				.append("items", messageItems).append("additionalProperties", additionalProperties).toString();
	}


}
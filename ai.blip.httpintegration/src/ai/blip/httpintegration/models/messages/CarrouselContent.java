
package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CarrouselContent implements Serializable {

	private String itemType;
	private List<MessageItem> messageItems = new ArrayList<MessageItem>();
	private Map<String, String> additionalProperties = new HashMap<String, String>();
	private final static long serialVersionUID = -2390936484221244103L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public CarrouselContent() {
	}

	/**
	 * 
	 * @param messageItems
	 * @param itemType
	 */
	public CarrouselContent(String itemType, List<MessageItem> messageItems) {
		super();
		this.itemType = itemType;
		this.messageItems = messageItems;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public CarrouselContent withItemType(String itemType) {
		this.itemType = itemType;
		return this;
	}

	public List<MessageItem> getItems() {
		return messageItems;
	}

	public void setItems(List<MessageItem> messageItems) {
		this.messageItems = messageItems;
	}

	public CarrouselContent withItems(List<MessageItem> messageItems) {
		this.messageItems = messageItems;
		return this;
	}

	public Map<String, String> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
	}

	public CarrouselContent withAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("itemType", itemType).append("items", messageItems)
				.append("additionalProperties", additionalProperties).toString();
	}

}
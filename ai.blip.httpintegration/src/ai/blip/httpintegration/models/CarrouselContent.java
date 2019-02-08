
package ai.blip.httpintegration.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CarrouselContent implements Serializable {

	private String itemType;
	private List<Item> items = new ArrayList<Item>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2390936484221244103L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public CarrouselContent() {
	}

	/**
	 * 
	 * @param items
	 * @param itemType
	 */
	public CarrouselContent(String itemType, List<Item> items) {
		super();
		this.itemType = itemType;
		this.items = items;
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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public CarrouselContent withItems(List<Item> items) {
		this.items = items;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public CarrouselContent withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("itemType", itemType).append("items", items)
				.append("additionalProperties", additionalProperties).toString();
	}

}
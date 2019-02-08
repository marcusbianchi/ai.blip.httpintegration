package ai.blip.httpintegration.models.commands;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

import ai.blip.httpintegration.enums.RequestResourceType;

public class ReponseResource implements Serializable {

	private int total;
	private RequestResourceType itemType;
	private List<ResponseItem> items = new ArrayList<ResponseItem>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 393067522038455614L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ReponseResource() {
	}

	/**
	 * 
	 * @param total
	 * @param items
	 * @param itemType
	 */
	public ReponseResource(int total, RequestResourceType itemType, List<ResponseItem> items) {
		super();
		this.total = total;
		this.itemType = itemType;
		this.items = items;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public ReponseResource withTotal(int total) {
		this.total = total;
		return this;
	}

	public RequestResourceType getItemType() {
		return itemType;
	}

	public void setItemType(RequestResourceType itemType) {
		this.itemType = itemType;
	}

	public ReponseResource withItemType(RequestResourceType itemType) {
		this.itemType = itemType;
		return this;
	}

	public List<ResponseItem> getItems() {
		return items;
	}

	public void setItems(List<ResponseItem> items) {
		this.items = items;
	}

	public ReponseResource withItems(List<ResponseItem> items) {
		this.items = items;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public ReponseResource withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("total", total).append("itemType", itemType).append("items", items)
				.append("additionalProperties", additionalProperties).toString();
	}

}
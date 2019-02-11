
package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CarrouselContent implements Serializable {

	private String itemType;
	private List<MessageItem> messageItems = new ArrayList<MessageItem>();
	private final static long serialVersionUID = -2390936484221244103L;

	public CarrouselContent() {
	}

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

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("itemType", itemType).append("items", messageItems).toString();
	}

}
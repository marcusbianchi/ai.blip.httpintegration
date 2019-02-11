package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListContent implements Serializable {

	private Header header;
	private List<Item> items = new ArrayList<Item>();
	private final static long serialVersionUID = 5241493783781707094L;


	public ListContent() {
	}

	public ListContent(Header header, List<Item> items) {
		super();
		this.header = header;
		this.items = items;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public ListContent withHeader(Header header) {
		this.header = header;
		return this;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public ListContent withItems(List<Item> items) {
		this.items = items;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("header", header).append("items", items).toString();
	}

}
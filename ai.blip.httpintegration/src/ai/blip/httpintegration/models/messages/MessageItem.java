package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.builder.ToStringBuilder;

public class MessageItem implements Serializable {

	private Header header;
	private List<Option> options = new ArrayList<Option>();
	private final static long serialVersionUID = -1708126047961356653L;

	public MessageItem() {
	}

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

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("header", header).append("options", options).toString();
	}

}
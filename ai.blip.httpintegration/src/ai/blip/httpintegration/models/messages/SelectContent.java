package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SelectContent implements Serializable {

	private String text;
	private List<Option> options = new ArrayList<Option>();
	private final static long serialVersionUID = 8917460429094532419L;

	public SelectContent() {
	}

	public SelectContent(String text, String scope, List<Option> options) {
		super();
		this.text = text;
		this.options = options;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public SelectContent withText(String text) {
		this.text = text;
		return this;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public SelectContent withOptions(List<Option> options) {
		this.options = options;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("text", text).append("options", options).toString();
	}

}
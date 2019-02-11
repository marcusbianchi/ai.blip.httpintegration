package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Label implements Serializable {

	private String type;
	private Value value;
	private final static long serialVersionUID = 4364383931646628478L;

	public Label() {
	}

	public Label(String type, Value value) {
		super();
		this.type = type;
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Label withType(String type) {
		this.type = type;
		return this;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public Label withValue(Value value) {
		this.value = value;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("type", type).append("value", value).toString();
	}

}
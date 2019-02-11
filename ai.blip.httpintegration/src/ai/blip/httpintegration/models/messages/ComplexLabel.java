package ai.blip.httpintegration.models.messages;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = ComplexLabel.class)
public class ComplexLabel extends Label {
	private Value value;
	private final static long serialVersionUID = 4364383931646628478L;

	public ComplexLabel() {
	}

	public ComplexLabel(String type, Value value) {
		super(type);
		this.value = value;
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
		return new ToStringBuilder(this).append("type", super.type).append("value", value).toString();
	}

}

package ai.blip.httpintegration.models.messages;

import org.apache.commons.lang.builder.ToStringBuilder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ai.blip.httpintegration.enums.MessageType;

@JsonDeserialize(as = ComplexOption.class)
public class ComplexOption extends Option {
	private Value value;
	private final static long serialVersionUID = 434566539626702052L;

	public ComplexOption() {
	}

	public ComplexOption(Label label, Value value, int index, String text, MessageType type, String previewText) {
		super(label, index, text, type, previewText);
		this.value = value;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public ComplexOption withValue(Value value) {
		this.value = value;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("label", super.label).append("index", super.index)
				.append("text", super.text).append("type", super.type).append("value", value)
				.append("previewText", super.previewText).toString();
	}
}

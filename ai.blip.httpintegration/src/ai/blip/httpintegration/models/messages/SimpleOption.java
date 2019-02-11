package ai.blip.httpintegration.models.messages;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ai.blip.httpintegration.enums.MessageType;

@JsonDeserialize(as = SimpleOption.class)
public class SimpleOption extends Option {
	private String value;
	private final static long serialVersionUID = 334566339626702052L;

	public SimpleOption() {
	}

	public SimpleOption(Label label, String value, int index, String text, MessageType type, String previewText) {
		super(label, index, text, type, previewText);
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public SimpleOption withValue(String value) {
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

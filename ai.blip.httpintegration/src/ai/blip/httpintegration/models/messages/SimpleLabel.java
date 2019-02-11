package ai.blip.httpintegration.models.messages;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = SimpleLabel.class)

public class SimpleLabel extends Label {
	private String value;
	private final static long serialVersionUID = 4364383931646628478L;

	public SimpleLabel() {
	}

	public SimpleLabel(String type, String value) {
		super(type);		
		this.value = value;
	}



	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Label withValue(String value) {
		this.value = value;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("type", super.type).append("value", value).toString();
	}
}

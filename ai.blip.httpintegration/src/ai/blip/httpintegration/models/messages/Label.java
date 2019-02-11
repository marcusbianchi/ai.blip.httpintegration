package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ai.blip.httpintegration.helpers.LabelDeserializer;

@JsonDeserialize(using = LabelDeserializer.class)

public abstract class Label implements Serializable {

	protected String type;
	protected final static long serialVersionUID = 4364383931646628478L;

	public Label() {
	}

	public Label(String type) {
		super();
		this.type = type;
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


	@Override
	public String toString() {
		return new ToStringBuilder(this).append("type", type).toString();
	}

}
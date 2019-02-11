package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ai.blip.httpintegration.enums.MessageType;
import ai.blip.httpintegration.helpers.OptionDeserializer;

@JsonDeserialize(using = OptionDeserializer.class)
public abstract class Option implements Serializable {

	protected int index;
	protected String text;
	protected MessageType type;
	protected String previewText;
	protected Label label;
	protected final static long serialVersionUID = 434566339626802052L;

	public Option() {
	}

	public Option(Label label, int index, String text, MessageType type, String previewText) {
		super();
		this.label = label;
		this.index = index;
		this.text = text;
		this.type = type;
		this.previewText = previewText;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getPreviewText() {
		return previewText;
	}

	public Option withIndex(int index) {
		this.index = index;
		return this;
	}

	public void setPreviewText(String previewText) {
		this.previewText = previewText;
	}

	public Option withText(String text) {
		this.text = text;
		return this;
	}

	public Option withPreviewText(String previewText) {
		this.previewText = previewText;
		return this;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Option withLabel(Label label) {
		this.label = label;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("label", label).append("index", index).append("text", text)
				.append("type", type).append("previewText", previewText).toString();
	}

}
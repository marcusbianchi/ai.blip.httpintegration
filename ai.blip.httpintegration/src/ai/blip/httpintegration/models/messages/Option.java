package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

import ai.blip.httpintegration.enums.MessageType;

public class Option implements Serializable {

	private int index;
	private String text;
	private MessageType type;
	private String previewText;
	private Label label;
	private Object value;
	private Map<String, String> additionalProperties = new HashMap<String, String>();
	private final static long serialVersionUID = 434566339626702052L;


	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Option() {
	}

	/**
	 * 
	 * @param value
	 * @param label
	 */
	public Option(Label label, Object value, int index, String text, MessageType type, String previewText) {
		super();
		this.label = label;
		this.value = value;
		this.index = index;
		this.text = text;
		this.type = type;
		this.value = value;
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

	public Object getValueAsObject() {
		return value;
	}
	
	public String getValueAsString() {
		return value.toString();
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

	public Option withValue(Object value) {
		this.value = value;
		return this;
	}
	
	public Option withValue(String value) {
		this.value = value;
		return this;
	}

	public Map<String, String> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
	}

	public Option withAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("label", label)
				.append("additionalProperties", additionalProperties).append("index", index)
				.append("text", text).append("type", type)
				.append("value", value).append("previewText", previewText)
				.append("additionalProperties", additionalProperties).toString();
	}

}
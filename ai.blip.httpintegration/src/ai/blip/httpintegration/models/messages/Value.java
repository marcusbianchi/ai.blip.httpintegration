package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Value implements Serializable {

	private String title;
	private String text;
	private String type;
	private String uri;
	private String aspectRatio;
	private String previewUri;
	private String target;

	private Map<String, String> additionalProperties = new HashMap<String, String>();
	private final static long serialVersionUID = 8395517138563823665L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Value() {
	}

	/**
	 * 
	 * @param text
	 * @param title
	 * @param aspectRatio
	 * @param type
	 * @param uri
	 */
	public Value(String title, String text, String type, String uri, String aspectRatio, String previewUri, String target) {
		super();
		this.title = title;
		this.text = text;
		this.type = type;
		this.uri = uri;
		this.aspectRatio = aspectRatio;
		this.previewUri = previewUri;
		this.target = target;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getPreviewUri() {
		return previewUri;
	}

	public void setPreviewUri(String previewUri) {
		this.previewUri = previewUri;
	}

	public Value withPreviewUri(String previewUri) {
		this.previewUri = previewUri;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Value withTitle(String title) {
		this.title = title;
		return this;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Value withText(String text) {
		this.text = text;
		return this;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Value withType(String type) {
		this.type = type;
		return this;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Value withUri(String uri) {
		this.uri = uri;
		return this;
	}
	
	public Value withTarget(String target) {
		this.target = target;
		return this;
	}

	public String getAspectRatio() {
		return aspectRatio;
	}

	public void setAspectRatio(String aspectRatio) {
		this.aspectRatio = aspectRatio;
	}

	public Value withAspectRatio(String aspectRatio) {
		this.aspectRatio = aspectRatio;
		return this;
	}

	public Map<String, String> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
	}

	public Value withAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("title", title).append("text", text).append("type", type)
				.append("uri", uri).append("aspectRatio", aspectRatio).append("previewUri", previewUri).append("target", target)
				.append("additionalProperties", additionalProperties).toString();
	}

}
package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

public class MediaLinkContent implements Serializable {

	private String title;
	private String text;
	private String type;
	private String uri;
	private String aspectRatio;
	private int size;
	private String previewUri;
	private String previewType;
	private final static long serialVersionUID = 6295238884374638236L;

	public MediaLinkContent() {
	}

	public MediaLinkContent(String title, String text, String type, String uri, String aspectRatio, int size,
			String previewUri, String previewType) {
		super();
		this.title = title;
		this.text = text;
		this.type = type;
		this.uri = uri;
		this.aspectRatio = aspectRatio;
		this.size = size;
		this.previewUri = previewUri;
		this.previewType = previewType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public MediaLinkContent withTitle(String title) {
		this.title = title;
		return this;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public MediaLinkContent withText(String text) {
		this.text = text;
		return this;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public MediaLinkContent withType(String type) {
		this.type = type;
		return this;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public MediaLinkContent withUri(String uri) {
		this.uri = uri;
		return this;
	}

	public String getAspectRatio() {
		return aspectRatio;
	}

	public void setAspectRatio(String aspectRatio) {
		this.aspectRatio = aspectRatio;
	}

	public MediaLinkContent withAspectRatio(String aspectRatio) {
		this.aspectRatio = aspectRatio;
		return this;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public MediaLinkContent withSize(int size) {
		this.size = size;
		return this;
	}

	public String getPreviewUri() {
		return previewUri;
	}

	public void setPreviewUri(String previewUri) {
		this.previewUri = previewUri;
	}

	public MediaLinkContent withPreviewUri(String previewUri) {
		this.previewUri = previewUri;
		return this;
	}

	public String getPreviewType() {
		return previewType;
	}

	public void setPreviewType(String previewType) {
		this.previewType = previewType;
	}

	public MediaLinkContent withPreviewType(String previewType) {
		this.previewType = previewType;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("title", title).append("text", text).append("type", type)
				.append("uri", uri).append("aspectRatio", aspectRatio).append("size", size)
				.append("previewUri", previewUri).append("previewType", previewType).toString();
	}

}
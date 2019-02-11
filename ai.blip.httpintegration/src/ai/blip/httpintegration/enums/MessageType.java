package ai.blip.httpintegration.enums;

public enum MessageType {
	PLAINT_TEXT("text/plain"), LIST("application/vnd.lime.list+json"), CHATSTATE("application/vnd.lime.chatstate+json"),
	WEB_LINK("application/vnd.lime.web-link+json"), DOCUMENT_SELECT("application/vnd.lime.document-select+json"),
	COLLECTION("application/vnd.lime.collection+json"), SELECT("application/vnd.lime.select+json"),
	MEDIA_LINK("application/vnd.lime.media-link+json");

	private final String text;

	MessageType(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}

	public static MessageType fromString(String text) {
		for (MessageType b : MessageType.values()) {
			if (b.text.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}
}

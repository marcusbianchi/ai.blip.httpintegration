package ai.blip.httpintegration.enums;

public enum RequestResourceType {
	AI_QUESTION("application/vnd.iris.ai.question+json"), AI_ANSWER("application/vnd.iris.ai.answer+json"),
	AI_MODEL("application/vnd.iris.ai.model+json"), AI_MODEL_ANALYSIS("application/vnd.iris.ai.analysis+json");

	private final String text;

	RequestResourceType(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}

	public static RequestResourceType fromString(String text) {
		for (RequestResourceType b : RequestResourceType.values()) {
			if (b.text.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}
}

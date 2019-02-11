package ai.blip.httpintegration.enums;

public enum CommandType {
	AI_ENTITY ("application/vnd.iris.ai.entity+json"),
	AI_INTENTION ("application/vnd.iris.ai.intention+json"),
	COLLETION ("application/vnd.lime.collection+json"),
	AI_MODEL_TRAINING ("application/vnd.iris.ai.model-training+json"),
	AI_MODEL_PUBLISHING ("application/vnd.iris.ai.model-publishing+json"),
	AI_MODEL_ANALYSIS_REQUEST ("application/vnd.iris.ai.analysis-request+json"),
	AI_MODEL_ANALYSIS_FEEDBACK("application/vnd.iris.ai.analysis-feedback+json"),
	AI_MODEL_ANALYSIS_RESPONSE ("application/vnd.iris.ai.analysis-response+json");
	
	private final String text;

	CommandType(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}

	public static CommandType fromString(String text) {
		for (CommandType b : CommandType.values()) {
			if (b.text.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}
}

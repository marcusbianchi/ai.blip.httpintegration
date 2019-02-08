package ai.blip.httpintegration.enums;

public enum CommandType {
	AI_ENTITY {
		public String toString() {
			return "application/vnd.iris.ai.entity+json";
		}
	},
	AI_INTENTION {
		public String toString() {
			return "application/vnd.iris.ai.intention+json";
		}
	},
	COLLETION {
		public String toString() {
			return "application/vnd.lime.collection+json";
		}
	},
	AI_MODEL_TRAINING {
		public String toString() {
			return "application/vnd.iris.ai.model-training+json";
		}
	},
	AI_MODEL_PUBLISHING {
		public String toString() {
			return "application/vnd.iris.ai.model-publishing+json";
		}
	},
	AI_MODEL_ANALYSIS_REQUEST {
		public String toString() {
			return "application/vnd.iris.ai.analysis-request+json";
		}
	},
	AI_MODEL_ANALYSIS_FEEDBACK {
		public String toString() {
			return "application/vnd.iris.ai.analysis-feedback+json";
		}
	},
	AI_MODEL_ANALYSIS_RESPONSE {
		public String toString() {
			return "application/vnd.iris.ai.analysis-response+json";
		}
	}
}

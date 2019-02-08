package ai.blip.httpintegration.enums;

public enum RequestResourceType {
	AI_QUESTION {
		public String toString() {
			return "application/vnd.iris.ai.question+json";
		}
	},
	AI_ANSWER {
		public String toString() {
			return "application/vnd.iris.ai.answer+json";
		}
	},
	AI_MODEL {
		public String toString() {
			return "application/vnd.iris.ai.model+json";
		}
	},
	AI_MODEL_ANALYSIS {
		public String toString() {
			return "application/vnd.iris.ai.analysis+json";
		}
	}
}

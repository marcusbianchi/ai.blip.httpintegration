package ai.blip.httpintegration.enums;

public enum MessageType {
	SELECT {
		public String toString() {
			return "application/vnd.lime.select+json";
		}
	},
	COLLECTION {
		public String toString() {
			return "application/vnd.lime.collection+json";
		}
	},
	DOCUMENT {
		public String toString() {
			return "application/vnd.lime.document-select+json";
		}
	},
	WEB_LINK {
		public String toString() {
			return "application/vnd.lime.web-link+json";
		}
	},
	CHATSTATE {
		public String toString() {
			return "application/vnd.lime.chatstate+json";
		}
	},
	MEDIA_LINK {
		public String toString() {
			return "application/vnd.lime.media-link+json";
		}
	},
	LIST {
		public String toString() {
			return "application/vnd.lime.list+json";
		}
	}

}

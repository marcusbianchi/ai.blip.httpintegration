package ai.blip.httpintegration.helpers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import ai.blip.httpintegration.models.messages.*;

public class InstanceDeserializer extends JsonDeserializer<Message> {

	@Override
	public Message deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectMapper mapper = (ObjectMapper) p.getCodec();
		ObjectNode root = (ObjectNode) mapper.readTree(p);
		Class<? extends Message> instanceClass = null;
		if (!root.has("type")) {
			instanceClass = Message.class;
			return mapper.readValue(p, instanceClass);
		}
		String type = root.get("type").asText();
		switch (type) {
		case "text/plain":
			instanceClass = SimpleMessage.class;
		case "application/vnd.lime.list+json":
			instanceClass = ListContentMessage.class;
		case "application/vnd.lime.chatstate+json":
			instanceClass = ChatstateContentMessage.class;
		case "application/vnd.lime.web-link+json":
			instanceClass = Message.class;
		case "application/vnd.lime.document-select+json":
			instanceClass = Message.class;
		case "application/vnd.lime.collection+json":
			instanceClass = Message.class;
		case "application/vnd.lime.select+json":
			instanceClass = SelectContentMessage.class;
		case"application/vnd.lime.media-link+json":
			instanceClass = Message.class;
		default:
			instanceClass = Message.class;
		}
		return mapper.readValue(p, instanceClass);
	}
}
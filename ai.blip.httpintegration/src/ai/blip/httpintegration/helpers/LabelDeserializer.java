package ai.blip.httpintegration.helpers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import ai.blip.httpintegration.models.messages.ComplexLabel;
import ai.blip.httpintegration.models.messages.Label;
import ai.blip.httpintegration.models.messages.SimpleLabel;


public class LabelDeserializer extends JsonDeserializer<Label> {

	@Override
	public Label deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectMapper mapper = (ObjectMapper) p.getCodec();
		ObjectNode root = (ObjectNode) mapper.readTree(p);
		Class<? extends Label> instanceClass = null;
		if (!root.has("type")) {
			instanceClass = Label.class;
			return mapper.readValue(p, instanceClass);
		}
		String type = root.get("type").asText();
		switch (type) {
		case "text/plain":
			instanceClass = SimpleLabel.class;
		default:
			instanceClass = ComplexLabel.class;
		}
		return mapper.readValue(p, instanceClass);
	}
}
package ai.blip.httpintegration.helpers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import ai.blip.httpintegration.models.messages.ComplexOption;
import ai.blip.httpintegration.models.messages.Option;
import ai.blip.httpintegration.models.messages.SimpleOption;

public class OptionDeserializer extends JsonDeserializer<Option> {

	@Override
	public Option deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectMapper mapper = (ObjectMapper) p.getCodec();
		ObjectNode root = (ObjectNode) mapper.readTree(p);
		Class<? extends Option> instanceClass = null;
		if (root.has("value") && root.get("value").has("type")) {
			String type = root.get("value").get("type").asText();
			switch (type) {
			case "text/plain":
				instanceClass = SimpleOption.class;
			default:
				instanceClass = ComplexOption.class;
			}
			return mapper.readValue(p, instanceClass);			
		}
		instanceClass = SimpleOption.class;
		return mapper.readValue(p, instanceClass);
	}
}

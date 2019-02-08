package ai.blip.httpintegration.models.messages;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

import ai.blip.httpintegration.enums.MessageType;

class SimpleMessageSerializationTest {

	@Test
	void serialization() throws IOException {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		String content = new String(Files.readAllBytes(Paths.get(s + "\\tests\\Resources\\SimpleMessage.json")));
		
		Message message = new Message().withId("1").withTo("128271320123982@messenger.gw.msging.net")
				.withType(MessageType.PLAINT_TEXT).withContent("Welcome to our service! How can I help you?");
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.setSerializationInclusion(Include.NON_EMPTY);
		String messageString = mapper.writeValueAsString(message);
		assertTrue(messageString.equals(content));

	}

	@Test
	void deserialization() throws IOException {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		String content = new String(Files.readAllBytes(Paths.get(s + "\\tests\\Resources\\SimpleMessage.json")));
		Message message = new Message().withId("1").withTo("128271320123982@messenger.gw.msging.net")
				.withType(MessageType.PLAINT_TEXT).withContent("Welcome to our service! How can I help you?");
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.setSerializationInclusion(Include.NON_EMPTY);
		Message deserialazedMessage= mapper.readValue(content,Message.class);
		
		
		assertTrue(deserialazedMessage.getId().equals(message.getId()));
		assertTrue(deserialazedMessage.getTo().equals(message.getTo()));
		assertTrue(deserialazedMessage.getContent().equals(message.getContent()));
		assertTrue(deserialazedMessage.getType().equals(message.getType()));

	}
}

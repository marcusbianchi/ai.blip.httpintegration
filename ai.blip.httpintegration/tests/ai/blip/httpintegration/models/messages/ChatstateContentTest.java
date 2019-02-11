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

public class ChatstateContentTest {
	@Test
	void serialization() throws IOException {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		String content = new String(Files.readAllBytes(Paths.get(s + "\\tests\\Resources\\ChatstateContent.json")));

		ChatstateContent chatstateContent = new ChatstateContent().withState("composing");
		Message message = new ChatstateContentMessage().withContent(chatstateContent).withId("1")
				.withTo("128271320123982@messenger.gw.msging.net").withType(MessageType.CHATSTATE);

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
		String content = new String(Files.readAllBytes(Paths.get(s + "\\tests\\Resources\\ChatstateContent.json")));

		ChatstateContent chatstateContent = new ChatstateContent().withState("composing");
		Message message = new ChatstateContentMessage().withContent(chatstateContent).withId("1")
				.withTo("128271320123982@messenger.gw.msging.net").withType(MessageType.CHATSTATE);

		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.setSerializationInclusion(Include.NON_EMPTY);
		String messageString = mapper.writeValueAsString(message);
		
		ChatstateContentMessage deserialazedMessage = mapper.readValue(content, ChatstateContentMessage.class);

		assertTrue(deserialazedMessage.getId().equals(message.getId()));
		assertTrue(deserialazedMessage.getTo().equals(message.getTo()));
		assertTrue(deserialazedMessage.getType().equals(message.getType()));
		assertTrue(deserialazedMessage.getContent().getState().equals(chatstateContent.getState()));		

	}
}

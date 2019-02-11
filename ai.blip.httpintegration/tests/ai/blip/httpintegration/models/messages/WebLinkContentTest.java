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

public class WebLinkContentTest {
	@Test
	void serialization() throws IOException {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		String content = new String(Files.readAllBytes(Paths.get(s + "\\tests\\Resources\\WebLinkMessage.json")));

		WebLinkContent weblinkContent = new WebLinkContent().withTarget("self")
				.withText("Here is a documentation weblink")
				.withUri("http://limeprotocol.org/content-types.html#web-link");
		
		Message message = new WebLinkContentMessage().withContent(weblinkContent).withId("1")
				.withTo("128271320123982@messenger.gw.msging.net").withType(MessageType.WEB_LINK);

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
		String content = new String(Files.readAllBytes(Paths.get(s + "\\tests\\Resources\\WebLinkMessage.json")));

		WebLinkContent weblinkContent = new WebLinkContent().withTarget("self")
				.withText("Here is a documentation weblink")
				.withUri("http://limeprotocol.org/content-types.html#web-link");		
		Message message = new WebLinkContentMessage().withContent(weblinkContent).withId("1")
				.withTo("128271320123982@messenger.gw.msging.net").withType(MessageType.WEB_LINK);

		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.setSerializationInclusion(Include.NON_EMPTY);
		WebLinkContentMessage deserialazedMessage = mapper.readValue(content, WebLinkContentMessage.class);
		assertTrue(deserialazedMessage.getId().equals(message.getId()));
		assertTrue(deserialazedMessage.getTo().equals(message.getTo()));
		assertTrue(deserialazedMessage.getType().equals(message.getType()));
		assertTrue(deserialazedMessage.getContent().getUri().equals(weblinkContent.getUri()));
		assertTrue(deserialazedMessage.getContent().getText().equals(weblinkContent.getText()));
		assertTrue(deserialazedMessage.getContent().getTarget().equals(weblinkContent.getTarget()));

	}
}

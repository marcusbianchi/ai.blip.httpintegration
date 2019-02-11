package ai.blip.httpintegration.models.messages;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

import ai.blip.httpintegration.enums.MessageType;

public class SelectContentSerializationTest {

	@Test
	void serialization() throws IOException {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		String content = new String(Files.readAllBytes(Paths.get(s + "\\tests\\Resources\\SelectMessage.json")));

		Option option = new Option().withText("Quero saber mais").withPreviewText("Quero saber mais");
		List<Option> optionsList = new ArrayList<Option>();
		optionsList.add(option);
		SelectContent selectContent = new SelectContent().withText("Para continuar, clique abaixo")
				.withOptions(optionsList);
		Message message = new SelectContentMessage().withContent(selectContent).withId("1")
				.withTo("128271320123982@messenger.gw.msging.net").withType(MessageType.SELECT);

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
		String content = new String(Files.readAllBytes(Paths.get(s + "\\tests\\Resources\\SelectMessage.json")));
		Option option = new Option().withText("Quero saber mais").withPreviewText("Quero saber mais").withIndex(0);
		List<Option> optionsList = new ArrayList<Option>();
		optionsList.add(option);
		SelectContent selectContent = new SelectContent().withText("Para continuar, clique abaixo")
				.withOptions(optionsList);
		Message message = new SelectContentMessage().withContent(selectContent).withId("1")
				.withTo("128271320123982@messenger.gw.msging.net").withType(MessageType.SELECT);
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.setSerializationInclusion(Include.NON_EMPTY);
		SelectContentMessage deserialazedMessage = mapper.readValue(content, SelectContentMessage.class);		
		Option deserialazedOption = deserialazedMessage.getContent().getOptions().get(0);			
		assertTrue(deserialazedMessage.getId().equals(message.getId()));
		assertTrue(deserialazedMessage.getTo().equals(message.getTo()));
		assertTrue(deserialazedMessage.getType().equals(message.getType()));
		assertTrue(option.getText().equals(deserialazedOption.getText()));
		assertTrue(option.getPreviewText().equals(deserialazedOption.getPreviewText()));
		assertTrue(option.getIndex()==deserialazedOption.getIndex());		

	}
}

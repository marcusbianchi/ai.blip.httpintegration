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

public class ListContentSerializationTest {
	@Test
	void serialization() throws IOException {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		String fileContent = new String(Files.readAllBytes(Paths.get(s + "\\tests\\Resources\\ListContent.json")));
		Value value = new Value().withTitle("Classic T-Shirt Collection").withText("See all our colors").withPreviewUri(
				"http://streetwearvilla.com/image/cache/data/Products/Supreme/T-shirt/supreme-box-logo-t-shirt-collection-600x600.png")
				.withUri("http://streetwearvilla.com/supreme-box-logo-t-shirt-whitemessengerExtensions=true")
				.withTarget("selfTall");
		Header header = new Header().withType("application/vnd.lime.web-link+json").withValue(value);
		Value valueItem = new Value().withTitle("Classic White T-Shirt").withText("100% Cotton, 200% Comfortable").withPreviewUri(
				"http://www.plainwhitetshirt.co.uk/image/cache/catalog/images/GD010vwhiteteegildan-750x750.jpg")
				.withUri("http://www.plainwhitetshirt.co.uk/gildan-soft-style-white-vneck-tshirt&messengerExtensions=true")
				.withTarget("selfTall");
		Item item = new Item().withType("application/vnd.lime.web-link+json").withValue(valueItem);
		List<Item> items = new ArrayList<Item>();
		items.add(item);
		ListContent content = new ListContent().withHeader(header).withItems(items);
		Message message = new ListContentMessage().withContent(content).withId("1")
				.withTo("128271320123982@messenger.gw.msging.net").withType(MessageType.LIST);
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.setSerializationInclusion(Include.NON_EMPTY);
		String messageString = mapper.writeValueAsString(message);
		assertTrue(messageString.equals(fileContent));

	}

	@Test
	void deserialization() throws IOException {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		String fileContent = new String(Files.readAllBytes(Paths.get(s + "\\tests\\Resources\\ListContent.json")));
		
		//--prepare
		Value value = new Value().withTitle("Classic T-Shirt Collection").withText("See all our colors").withPreviewUri(
				"http://streetwearvilla.com/image/cache/data/Products/Supreme/T-shirt/supreme-box-logo-t-shirt-collection-600x600.png")
				.withUri("http://streetwearvilla.com/supreme-box-logo-t-shirt-whitemessengerExtensions=true")
				.withTarget("selfTall");
		Header header = new Header().withType("application/vnd.lime.web-link+json").withValue(value);
		Value valueItem = new Value().withTitle("Classic White T-Shirt").withText("100% Cotton, 200% Comfortable").withPreviewUri(
				"http://www.plainwhitetshirt.co.uk/image/cache/catalog/images/GD010vwhiteteegildan-750x750.jpg")
				.withUri("http://www.plainwhitetshirt.co.uk/gildan-soft-style-white-vneck-tshirt&messengerExtensions=true")
				.withTarget("selfTall");
		Item item = new Item().withType("application/vnd.lime.web-link+json").withValue(valueItem);
		List<Item> items = new ArrayList<Item>();
		items.add(item);
		ListContent content = new ListContent().withHeader(header).withItems(items);
		Message message = new ListContentMessage().withContent(content).withId("1")
				.withTo("128271320123982@messenger.gw.msging.net").withType(MessageType.LIST);
		//---assert
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.setSerializationInclusion(Include.NON_EMPTY);
		ListContentMessage deserialazedMessage = mapper.readValue(fileContent, ListContentMessage.class);
		
		Item deserialazedItem = deserialazedMessage.getContent().getItems().get(0);		
		
		
		
		assertTrue(deserialazedMessage.getId().equals(message.getId()));
		assertTrue(deserialazedMessage.getTo().equals(message.getTo()));
		assertTrue(deserialazedMessage.getType().equals(message.getType()));
		
		assertTrue(deserialazedMessage.getContent().getHeader().getType().equals(header.getType()));
		assertTrue(deserialazedMessage.getContent().getHeader().getValue().getTitle().equals(value.getTitle()));
		assertTrue(deserialazedMessage.getContent().getHeader().getValue().getText().equals(value.getText()));
		assertTrue(deserialazedMessage.getContent().getHeader().getValue().getPreviewUri().equals(value.getPreviewUri()));
		assertTrue(deserialazedMessage.getContent().getHeader().getValue().getUri().equals(value.getUri()));
		assertTrue(deserialazedMessage.getContent().getHeader().getValue().getTarget().equals(value.getTarget()));
		
		
		assertTrue(deserialazedItem.getType().equals(item.getType()));
		assertTrue(deserialazedItem.getValue().getTitle().equals(valueItem.getTitle()));
		assertTrue(deserialazedItem.getValue().getText().equals(valueItem.getText()));
		assertTrue(deserialazedItem.getValue().getPreviewUri().equals(valueItem.getPreviewUri()));
		assertTrue(deserialazedItem.getValue().getUri().equals(valueItem.getUri()));
		assertTrue(deserialazedItem.getValue().getTarget().equals(valueItem.getTarget()));
		
		
		//assertTrue(option.getPreviewText().equals(deserialazedOption.getPreviewText()));
		//assertTrue(option.getIndex() == deserialazedOption.getIndex());

	}
}

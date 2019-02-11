package ai.blip.httpintegration.models.messages;
import org.apache.commons.lang.builder.ToStringBuilder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ai.blip.httpintegration.enums.MessageType;

@JsonDeserialize(as = ChatstateContentMessage.class)
public class ChatstateContentMessage extends Message {
	private ChatstateContent content;
	private final static long serialVersionUID = 876092919667906573L;

	public ChatstateContentMessage() {
	}

	public ChatstateContentMessage(String id, MessageType type, String to, ChatstateContent content) {
		super(id, type, to);
		this.content = content;
	}

	public ChatstateContent getContent() {
		return content;
	}

	public void setContent(ChatstateContent content) {
		this.content = content;
	}

	public ChatstateContentMessage withContent(ChatstateContent content) {
		this.content = content;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", super.id).append("type", super.type).append("to", super.to)
				.append("content", content).toString();
	}

}

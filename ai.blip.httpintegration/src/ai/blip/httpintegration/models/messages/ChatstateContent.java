package ai.blip.httpintegration.models.messages;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ChatstateContent implements Serializable {

	private String state;
	private final static long serialVersionUID = 8034243858004038731L;

	
	public ChatstateContent() {
	}


	public ChatstateContent(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ChatstateContent withState(String state) {
		this.state = state;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("state", state).toString();
	}

}
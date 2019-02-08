package ai.blip.httpintegration.models.commands;

import java.util.List;
import org.apache.commons.lang.builder.ToStringBuilder;

import ai.blip.httpintegration.models.messages.MessageItem;

public class RessourceNLP extends Resource {
	private String modelId;
	private String feedback;
	private String intentionId;
	private final static long serialVersionUID = -5396624264286655891L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public RessourceNLP() {
	}

	/**
	 * 
	 * @param values
	 * @param name
	 */
	public RessourceNLP(String name, String itemType, List<RessourceValue> values, List<MessageItem> messageItems, String modelId, String text) {
		super(name, itemType, values, messageItems, text);
		this.modelId = modelId;
	}
	
	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	
	public Resource withModelId(String modelId) {
		this.modelId = modelId;
		return this;
	}
	
	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public Resource withFeedback(String feedback) {
		this.feedback = feedback;
		return this;
	}

	public String getIntentionId() {
		return intentionId;
	}

	public void setIntentionId(String intentionId) {
		this.intentionId = intentionId;
	}
	
	public Resource withIntentionId(String intentionId) {
		this.intentionId = intentionId;
		return this;
	}

	public String toString() {		
		return new ToStringBuilder(this).append("name", super.getName()).append("values", super.getValues()).append("itemType", super.getitemType())		
				.append("additionalProperties", super.getAdditionalProperties()).append("modelId",modelId).append("intentionId",intentionId).toString();
	}
}

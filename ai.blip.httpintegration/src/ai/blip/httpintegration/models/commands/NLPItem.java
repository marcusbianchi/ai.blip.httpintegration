
package ai.blip.httpintegration.models.commands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class NLPItem extends ResponseItem {

	private String provider;
	private String externalId;
	private String storageDate;
	private String trainingDate;
	private List<NLPIntention> intentions = new ArrayList<NLPIntention>();
	private List<NLPEntity> entities = new ArrayList<NLPEntity>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2446280783204659650L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public NLPItem() {
	}

	/**
	 * 
	 * @param id
	 * @param provider
	 * @param trainingDate
	 * @param storageDate
	 * @param externalId
	 */
	public NLPItem(String id, String provider, String externalId, String storageDate, String trainingDate, String name,
			String value, String type) {
		super(id, name, value, type);
		this.provider = provider;
		this.externalId = externalId;
		this.storageDate = storageDate;
		this.trainingDate = trainingDate;
	}

	public String getProvider() {
		return provider;
	}

	public List<NLPIntention> getIntentions() {
		return intentions;
	}

	public void setIntentions(List<NLPIntention> intentions) {
		this.intentions = intentions;
	}

	public NLPItem withIntentions(List<NLPIntention> intentions) {
		this.intentions = intentions;
		return this;
	}

	public List<NLPEntity> getEntities() {
		return entities;
	}

	public void setEntities(List<NLPEntity> entities) {
		this.entities = entities;
	}

	public NLPItem withEntities(List<NLPEntity> entities) {
		this.entities = entities;
		return this;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public NLPItem withProvider(String provider) {
		this.provider = provider;
		return this;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public NLPItem withExternalId(String externalId) {
		this.externalId = externalId;
		return this;
	}

	public String getStorageDate() {
		return storageDate;
	}

	public void setStorageDate(String storageDate) {
		this.storageDate = storageDate;
	}

	public NLPItem withStorageDate(String storageDate) {
		this.storageDate = storageDate;
		return this;
	}

	public String getTrainingDate() {
		return trainingDate;
	}

	public void setTrainingDate(String trainingDate) {
		this.trainingDate = trainingDate;
	}

	public NLPItem withTrainingDate(String trainingDate) {
		this.trainingDate = trainingDate;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public NLPItem withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", super.getId()).append("provider", provider)
				.append("externalId", externalId).append("storageDate", storageDate).append("intentions", intentions).append("entities", entities)
				.append("trainingDate", trainingDate).append("additionalProperties", additionalProperties).toString();
	}

}
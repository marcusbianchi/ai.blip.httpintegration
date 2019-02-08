
package ai.blip.httpintegration.models.commands;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class RessourceValue implements Serializable {

	private String name;
	private List<String> synonymous = new ArrayList<String>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -7827176777769926902L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public RessourceValue() {
	}

	/**
	 * 
	 * @param synonymous
	 * @param name
	 */
	public RessourceValue(String name, List<String> synonymous) {
		super();
		this.name = name;
		this.synonymous = synonymous;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RessourceValue withName(String name) {
		this.name = name;
		return this;
	}

	public List<String> getSynonymous() {
		return synonymous;
	}

	public void setSynonymous(List<String> synonymous) {
		this.synonymous = synonymous;
	}

	public RessourceValue withSynonymous(List<String> synonymous) {
		this.synonymous = synonymous;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public RessourceValue withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("name", name).append("synonymous", synonymous)
				.append("additionalProperties", additionalProperties).toString();
	}

}
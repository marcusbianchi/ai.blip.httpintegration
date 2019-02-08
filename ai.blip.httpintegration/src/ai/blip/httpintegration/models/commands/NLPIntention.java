package ai.blip.httpintegration.models.commands;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class NLPIntention implements Serializable {

	private String id;
	private String name;
	private double score;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 7676396952416942991L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public NLPIntention() {
	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param score
	 */
	public NLPIntention(String id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public NLPIntention withId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NLPIntention withName(String name) {
		this.name = name;
		return this;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public NLPIntention withScore(double score) {
		this.score = score;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public NLPIntention withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("name", name).append("score", score)
				.append("additionalProperties", additionalProperties).toString();
	}

}
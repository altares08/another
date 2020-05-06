package com.example.demo.model.response;

import java.util.Map;

public class FollowupEventInput {
	private String name;

	private String languageCode;

	private Map<String, String> parameters;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getLanguageCode() {
		return this.languageCode;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public Map<String, String> getParameters() {
		return this.parameters;
	}

	@Override
	public String toString() {
		return "FollowupEventInput [name=" + name + ", languageCode=" + languageCode + ", parameters=" + parameters
				+ "]";
	}

}
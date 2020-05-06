package com.example.demo.model.response;

import java.util.Map;

public class OutputContexts {
	private String name;

	private int lifespanCount;

	private Map<String, String> parameters;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setLifespanCount(int lifespanCount) {
		this.lifespanCount = lifespanCount;
	}

	public int getLifespanCount() {
		return this.lifespanCount;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public Map<String, String> getParameters() {
		return this.parameters;
	}

	@Override
	public String toString() {
		return "OutputContexts [name=" + name + ", lifespanCount=" + lifespanCount + ", parameters=" + parameters + "]";
	}

}
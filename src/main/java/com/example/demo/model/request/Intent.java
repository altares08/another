package com.example.demo.model.request;

public class Intent {
	private String name;

	private String displayName;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	@Override
	public String toString() {
		return "Intent [name=" + name + ", displayName=" + displayName + "]";
	}
	
}
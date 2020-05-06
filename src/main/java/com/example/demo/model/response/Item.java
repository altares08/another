package com.example.demo.model.response;

public class Item {
	private SimpleResponse simpleResponse;

	public void setSimpleResponse(SimpleResponse simpleResponse) {
		this.simpleResponse = simpleResponse;
	}

	public SimpleResponse getSimpleResponse() {
		return this.simpleResponse;
	}

	@Override
	public String toString() {
		return "Item [simpleResponse=" + simpleResponse + "]";
	}
	
}
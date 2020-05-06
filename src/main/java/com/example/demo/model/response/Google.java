package com.example.demo.model.response;

public class Google {
	private boolean expectUserResponse;

	private RichResponse richResponse;

	public void setExpectUserResponse(boolean expectUserResponse) {
		this.expectUserResponse = expectUserResponse;
	}

	public boolean getExpectUserResponse() {
		return this.expectUserResponse;
	}

	public void setRichResponse(RichResponse richResponse) {
		this.richResponse = richResponse;
	}

	public RichResponse getRichResponse() {
		return this.richResponse;
	}

	@Override
	public String toString() {
		return "Google [expectUserResponse=" + expectUserResponse + ", richResponse=" + richResponse + "]";
	}
	
}

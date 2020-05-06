package com.example.demo.model.response;

public class Payload {
	private Google google;

	private Facebook facebook;

	private Slack slack;

	public void setGoogle(Google google) {
		this.google = google;
	}

	public Google getGoogle() {
		return this.google;
	}

	public void setFacebook(Facebook facebook) {
		this.facebook = facebook;
	}

	public Facebook getFacebook() {
		return this.facebook;
	}

	public void setSlack(Slack slack) {
		this.slack = slack;
	}

	public Slack getSlack() {
		return this.slack;
	}

	@Override
	public String toString() {
		return "Payload [google=" + google + ", facebook=" + facebook + ", slack=" + slack + "]";
	}

}
package com.example.demo.model;

public class OrderTrackingInfo {
	
	private String user;
	private String orderNumber;
	private String status;
	private String scheduledDeliveryDate;
	private String actualDeliveryDate;
	private String rescheduledDeliveryDate;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getScheduledDeliveryDate() {
		return scheduledDeliveryDate;
	}
	public void setScheduledDeliveryDate(String scheduledDeliveryDate) {
		this.scheduledDeliveryDate = scheduledDeliveryDate;
	}
	public String getActualDeliveryDate() {
		return actualDeliveryDate;
	}
	public void setActualDeliveryDate(String actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}
	public String getRescheduledDeliveryDate() {
		return rescheduledDeliveryDate;
	}
	public void setRescheduledDeliveryDate(String rescheduledDeliveryDate) {
		this.rescheduledDeliveryDate = rescheduledDeliveryDate;
	}

}

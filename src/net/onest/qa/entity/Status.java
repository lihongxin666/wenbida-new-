package net.onest.qa.entity;

public class Status {
	private int statusId;
	private int clientId;
	private String status;
	
	
	public Status() {
		super();
	}
	public Status(int statusId, int clientId, String status) {
		super();
		this.statusId = statusId;
		this.clientId = clientId;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", clientId=" + clientId + ", status=" + status + "]";
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}

package net.onest.qa.entity;

public class Subscribe {
	private int subscribeId;//id
	private int publisherId;//������id
	private int questionId;//����id
	private int subscribedId;//��ԤԼ��id
	private String questionStatus;//����״̬
	
	
	public Subscribe() {
		super();
	}
	public Subscribe(int subscribeId, int publisherId, int questionId, int subscribedId, String questionStatus) {
		super();
		this.subscribeId = subscribeId;
		this.publisherId = publisherId;
		this.questionId = questionId;
		this.subscribedId = subscribedId;
		this.questionStatus = questionStatus;
	}
	@Override
	public String toString() {
		return "Subscribe [subscribeId=" + subscribeId + ", publisherId=" + publisherId + ", questionId=" + questionId
				+ ", subscribedId=" + subscribedId + ", questionStatus=" + questionStatus + "]";
	}
	public int getSubscribeId() {
		return subscribeId;
	}
	public void setSubscribeId(int subscribeId) {
		this.subscribeId = subscribeId;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getSubscribedId() {
		return subscribedId;
	}
	public void setSubscribedId(int subscribedId) {
		this.subscribedId = subscribedId;
	}
	public String getQuestionStatus() {
		return questionStatus;
	}
	public void setQuestionStatus(String questionStatus) {
		this.questionStatus = questionStatus;
	}
	
}

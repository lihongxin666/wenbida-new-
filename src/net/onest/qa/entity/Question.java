package net.onest.qa.entity;

public class Question {
	private int questionId;//����id
	private String questionTitle;//�������
	private String questionContent;//��������
	private String questionPhoto;//����ͼƬ
	private int publisherId;//������id
	private String publisherOnlineTime;//������Ԥ������ʱ��
	private String questionLevel;//����ȼ�
	private String questionDirection;//���ⷽ��
	private int questionMoney;//������
	private String questionStatus;//����״̬
	private String publishTime;//����ʱ��
	private int answerId;//�����id
	
	public Question() {
		super();
	}
	public Question(int questionId, String questionTitle, String questionContent, String questionPhoto, int publisherId,
			String publisherOnlineTime, String questionLevel, String questionDirection, int questionMoney,
			String questionStatus, String publishTime, int answerId) {
		super();
		this.questionId = questionId;
		this.questionTitle = questionTitle;
		this.questionContent = questionContent;
		this.questionPhoto = questionPhoto;
		this.publisherId = publisherId;
		this.publisherOnlineTime = publisherOnlineTime;
		this.questionLevel = questionLevel;
		this.questionDirection = questionDirection;
		this.questionMoney = questionMoney;
		this.questionStatus = questionStatus;
		this.publishTime = publishTime;
		this.answerId = answerId;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionTitle=" + questionTitle + ", questionContent="
				+ questionContent + ", questionPhoto=" + questionPhoto + ", publisherId=" + publisherId
				+ ", publisherOnlineTime=" + publisherOnlineTime + ", questionLevel=" + questionLevel
				+ ", questionDirection=" + questionDirection + ", questionMoney=" + questionMoney + ", questionStatus="
				+ questionStatus + ", publishTime=" + publishTime + ", answerId=" + answerId + "]";
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getQuestionContent() {
		return questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	public String getQuestionPhoto() {
		return questionPhoto;
	}
	public void setQuestionPhoto(String questionPhoto) {
		this.questionPhoto = questionPhoto;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherOnlineTime() {
		return publisherOnlineTime;
	}
	public void setPublisherOnlineTime(String publisherOnlineTime) {
		this.publisherOnlineTime = publisherOnlineTime;
	}
	public String getQuestionLevel() {
		return questionLevel;
	}
	public void setQuestionLevel(String questionLevel) {
		this.questionLevel = questionLevel;
	}
	public String getQuestionDirection() {
		return questionDirection;
	}
	public void setQuestionDirection(String questionDirection) {
		this.questionDirection = questionDirection;
	}
	public int getQuestionMoney() {
		return questionMoney;
	}
	public void setQuestionMoney(int questionMoney) {
		this.questionMoney = questionMoney;
	}
	public String getQuestionStatus() {
		return questionStatus;
	}
	public void setQuestionStatus(String questionStatus) {
		this.questionStatus = questionStatus;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

}

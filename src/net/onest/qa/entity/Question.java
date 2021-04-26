package net.onest.qa.entity;

public class Question {
	private int questionId;//问题id
	private String questionTitle;//问题标题
	private String questionContent;//问题内容
	private String questionPhoto;//问题图片
	private int publisherId;//提问者id
	private String publisherOnlineTime;//提问者预计在线时间
	private String questionLevel;//问题等级
	private String questionDirection;//问题方向
	private int questionMoney;//问题酬金
	private String questionStatus;//问题状态
	private String publishTime;//发布时间
	private int answerId;//解答者id
	
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

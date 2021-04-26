package net.onest.qa.entity;

public class Client {

	private int clientId;         //用户id
	private String clientPhone;   //手机号
	private String password;     //密码
	private String clientName;    //用户名
	private String clientGender;  //性别男女
	private String clientIdCard;  //身份证号
	private String clientRealName;//真实姓名
	private String clientEducation;//学历
	private String clientRealm;    //擅长领域
	private int clientMinMoney;  //最低预约酬金
	private int clientBalance;  //余额
	private String clientPhoto;    //头像路径
	private int questionNum; //提问数
	private int answerNum;   //回答数
	private int highOpinionNum;  //好评数
	
	public Client() {
		super();
	}
	public Client(int clientId, String clientPhone, String password, String clientName, String clientGender,
			String clientIdCard, String clientRealName, String clientEducation, String clientRealm, int clientMinMoney,
			int clientBalance, String clientPhoto, int questionNum, int answerNum, int highOpinionNum) {
		super();
		this.clientId = clientId;
		this.clientPhone = clientPhone;
		this.password = password;
		this.clientName = clientName;
		this.clientGender = clientGender;
		this.clientIdCard = clientIdCard;
		this.clientRealName = clientRealName;
		this.clientEducation = clientEducation;
		this.clientRealm = clientRealm;
		this.clientMinMoney = clientMinMoney;
		this.clientBalance = clientBalance;
		this.clientPhoto = clientPhoto;
		this.questionNum = questionNum;
		this.answerNum = answerNum;
		this.highOpinionNum = highOpinionNum;
	}
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientPhone=" + clientPhone + ", password=" + password
				+ ", clientName=" + clientName + ", clientGender=" + clientGender + ", clientIdCard=" + clientIdCard
				+ ", clientRealName=" + clientRealName + ", clientEducation=" + clientEducation + ", clientRealm="
				+ clientRealm + ", clientMinMoney=" + clientMinMoney + ", clientBalance=" + clientBalance
				+ ", clientPhoto=" + clientPhoto + ", questionNum=" + questionNum + ", answerNum=" + answerNum
				+ ", highOpinionNum=" + highOpinionNum + "]";
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientPhone() {
		return clientPhone;
	}
	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientGender() {
		return clientGender;
	}
	public void setClientGender(String clientGender) {
		this.clientGender = clientGender;
	}
	public String getClientIdCard() {
		return clientIdCard;
	}
	public void setClientIdCard(String clientIdCard) {
		this.clientIdCard = clientIdCard;
	}
	public String getClientRealName() {
		return clientRealName;
	}
	public void setClientRealName(String clientRealName) {
		this.clientRealName = clientRealName;
	}
	public String getClientEducation() {
		return clientEducation;
	}
	public void setClientEducation(String clientEducation) {
		this.clientEducation = clientEducation;
	}
	public String getClientRealm() {
		return clientRealm;
	}
	public void setClientRealm(String clientRealm) {
		this.clientRealm = clientRealm;
	}
	public int getClientMinMoney() {
		return clientMinMoney;
	}
	public void setClientMinMoney(int clientMinMoney) {
		this.clientMinMoney = clientMinMoney;
	}
	public int getClientBalance() {
		return clientBalance;
	}
	public void setClientBalance(int clientBalance) {
		this.clientBalance = clientBalance;
	}
	public String getClientPhoto() {
		return clientPhoto;
	}
	public void setClientPhoto(String clientPhoto) {
		this.clientPhoto = clientPhoto;
	}
	public int getQuestionNum() {
		return questionNum;
	}
	public void setQuestionNum(int questionNum) {
		this.questionNum = questionNum;
	}
	public int getAnswerNum() {
		return answerNum;
	}
	public void setAnswerNum(int answerNum) {
		this.answerNum = answerNum;
	}
	public int getHighOpinionNum() {
		return highOpinionNum;
	}
	public void setHighOpinionNum(int highOpinionNum) {
		this.highOpinionNum = highOpinionNum;
	}
	
}

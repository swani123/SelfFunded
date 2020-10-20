package RestApi;

public class Users {
	
	//pojo-plain old java object
	String dzeeClient;
	String[] employerGroups = new String[5];
	String webServiceTransactionId;
	String webServiceStatus;
	String brokerId;
	String message;
	String deletedEmployers;
	String nonAvailableEmployers;
	String brokers;
	
	public String getWebServiceTransactionId() {
		return webServiceTransactionId;
	}
	public void setWebServiceTransactionId(String webServiceTransactionId) {
		this.webServiceTransactionId = webServiceTransactionId;
	}
	public String getWebServiceStatus() {
		return webServiceStatus;
	}
	public void setWebServiceStatus(String webServiceStatus) {
		this.webServiceStatus = webServiceStatus;
	}
	public String getBrokerId() {
		return brokerId;
	}
	public void setBrokerId(String brokerId) {
		this.brokerId = brokerId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDeletedEmployers() {
		return deletedEmployers;
	}
	public void setDeletedEmployers(String deletedEmployers) {
		this.deletedEmployers = deletedEmployers;
	}
	public String getNonAvailableEmployers() {
		return nonAvailableEmployers;
	}
	public void setNonAvailableEmployers(String nonAvailableEmployers) {
		this.nonAvailableEmployers = nonAvailableEmployers;
	}
	public String getBrokers() {
		return brokers;
	}
	public void setBrokers(String brokers) {
		this.brokers = brokers;
	}
	public Users() {
		
	}
	public Users(String dzeeClient,String employerGroups) {
		this.dzeeClient = dzeeClient;
		this.employerGroups = new String[] {employerGroups};
	}
	
	//Getters and Setters
	
	public String getDzeeClient() {
		return dzeeClient;
	}
	public void setDzeeClient(String dzeeClient) {
		this.dzeeClient = dzeeClient;
	}
	public String[] getEmployerGroups() {
		return employerGroups;
	}
	public void setEmployerGroups(String[] employerGroups) {
		this.employerGroups = employerGroups;
	}	
	

}

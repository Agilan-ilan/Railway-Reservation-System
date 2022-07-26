import Passenger.Account;

public class AccessSpecifier {

	private Account account;
	private String accessType;
	
	

	public AccessSpecifier(Account account, String accessType) {
		super();
		this.account = account;
		this.accessType = accessType;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
	
	public String getAccessType() {
		return accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	
	
}

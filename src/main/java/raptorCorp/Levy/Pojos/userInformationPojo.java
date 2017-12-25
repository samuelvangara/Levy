package raptorCorp.Levy.Pojos;

public class userInformationPojo {

	private String userName;
	private Object password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Object getPassword() {
		return password;
	}

	public void setPassword(Object password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "userInformationPojo [userName=" + userName + ", password=" + password + "]";
	}
}

package user;

public class LoginBean {
	
	//��� ���� ����
	private String userID;
	private String userPassword;
	private String Page;
	
	public String getPage() {
		return Page;
	}

	public void setPage(String page) {
		Page = page;
	}

	final String _userid = "admin";
	final String _passwd = "1234";
	
	//����� �޼���
	public boolean checkUser() {
		if(userID.equals(_userid)&&userPassword.contentEquals(_passwd)) {
			return true;
		} else {
			return false;
		}
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}

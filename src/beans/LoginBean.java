package beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6955508471291131930L;
	
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName; 
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String giris() {
		System.out.println("Username :" + userName +" þifre :" + password);
		return "";
	}

}

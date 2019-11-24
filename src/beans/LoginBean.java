package beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import dao.KullaniciDAO;
import login.filtre.NavigationBean;
import model.Kullanici;
import model.Rol;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

	
	public LoginBean() {
		System.out.println("logine geldi");
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 6955508471291131930L;

	private String userName;
	private String password;
	private boolean girisYapildimi;

	public boolean isGirisYapildimi() {
		return girisYapildimi;
	}

	public void setGirisYapildimi(boolean girisYapildimi) {
		this.girisYapildimi = girisYapildimi;
	}

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

	@ManagedProperty(value = "#{navigationBean}")
	private NavigationBean navigationBean;

	public NavigationBean getNavigationBean() {
		return navigationBean;
	}

	public void setNavigationBean(NavigationBean navigationBean) {
		this.navigationBean = navigationBean;
	}

	public String giris() {

		KullaniciDAO dao = new KullaniciDAO();
		List<Kullanici> liste = dao.listele(new Kullanici());
		if (liste.size() == 0) {
			Kullanici temp = new Kullanici();
			temp.setAd("Hüseyin");
			temp.setEmail("sfsdþfsdkflksdl");
			temp.setKullaniciAdi("hokumus");
			temp.setRol(Rol.ADMIN);
			temp.setSifre("123");
			temp.setSoyad("Okumuþ");
			temp.setUyelikTarihi(new Date());
			dao.kaydet(temp);
		} else {
			for (Kullanici temp : liste) {
				if (temp.getKullaniciAdi().equals(userName) && temp.getSifre().equals(password)) {
					girisYapildimi = true;
					return navigationBean.redirectToWelcome();
				} else {
					FacesMessage msg = new FacesMessage("Login error!", "ERROR MSG");
					msg.setSeverity(FacesMessage.SEVERITY_ERROR);
					FacesContext.getCurrentInstance().addMessage(null, msg);

					// To to login page
					return navigationBean.toLogin();

				}
			}

		}
		System.out.println("Username :" + userName + " þifre :" + password);
		return "";
	}

}

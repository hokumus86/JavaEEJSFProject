package beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.KullaniciDAO;
import model.Kullanici;
import model.Rol;



@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6955508471291131930L;
	
	private String deneme= "Hüseyin";	
	private String userName= "hokumus";
	private String password;
	private String hg= "Welcome User";
	public String getHg() {
		return hg;
	}

	public void setHg(String hg) {
		this.hg = hg;
	}

	
	
	
	public String getDeneme() {
		return deneme;
	}

	public void setDeneme(String deneme) {
		this.deneme = deneme;
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

	public String giris() {
		
		KullaniciDAO dao = new KullaniciDAO();
		List<Kullanici> liste = dao.listele(new Kullanici());
		if(liste.size()==0) {
			Kullanici temp= new Kullanici();
			temp.setAd("Hüseyin");
			temp.setEmail("sfsdþfsdkflksdl");
			temp.setKullaniciAdi("hokumus");
			temp.setRol(Rol.ADMIN);
			temp.setSifre("123");
			temp.setSoyad("Okumuþ");
			temp.setUyelikTarihi(new Date());
			dao.kaydet(temp);
		}
		else {
			return "slider.jsf";
		}
		System.out.println("Username :" + userName +" þifre :" + password);
		return "";
	}

}

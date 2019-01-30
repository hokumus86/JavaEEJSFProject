package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.tblUrunDAO;
import model.tblurun;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class urunDetailBean {

	tblUrunDAO DB = new tblUrunDAO();
	
	private tblurun urun= new tblurun();

	public urunDetailBean() {
		//System.out.println("gelen id...:"+ StaticValues.secilenurun);
		//urun = DB.bul(StaticValues.secilenurun, new tblurun());
	}
	
	public tblurun getUrun() {
		
		return urun;
	}

	public void setUrun(tblurun urun) {
		this.urun = urun;
	}
	
	
	
	
}

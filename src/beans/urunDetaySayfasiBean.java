package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.tblUrunDAO;
import model.tblurun;

@SessionScoped
@ManagedBean
public class urunDetaySayfasiBean {
	
	tblUrunDAO DB = new tblUrunDAO();
	
	private tblurun urunbilgisi;

	public tblurun getUrunbilgisi() {
		return new tblurun();
	}

	public void setUrunbilgisi(tblurun urunbilgisi) {
		this.urunbilgisi = urunbilgisi;
	}
	
	
	
	
}

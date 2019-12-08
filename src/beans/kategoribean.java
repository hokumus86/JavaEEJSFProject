package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.tblCatDAO;
import model.tblcategori;
@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class kategoribean {

	private String kategoriadi;
	private List<tblcategori> klist = new ArrayList<>();
	private int silinecekid=0;
	tblCatDAO db = new tblCatDAO();
	
	public void ekle() {
		
		tblcategori model = new tblcategori();
		model.setAd(kategoriadi);
		model.setSil_id(1);
		db.kaydet(model);	
		kategoriadi="";
	}

	public void sil() {
		
		if(silinecekid!=0) {
			//db.(silinecekid);	
			tblcategori s = new tblcategori();
			s.setId(silinecekid);
			db.sil(s);
		}
		
	}
	
	
	public int getSilinecekid() {
		return silinecekid;
	}

	public void setSilinecekid(int silinecekid) {
		this.silinecekid = silinecekid;
	}

	public tblCatDAO getDb() {
		return db;
	}

	public void setDb(tblCatDAO db) {
		this.db = db;
	}

	public String getKategoriadi() {
		return kategoriadi;
	}

	public void setKategoriadi(String kategoriadi) {
		this.kategoriadi = kategoriadi;
	}

	public List<tblcategori> getKlist() {
		return db.listele(new tblcategori());
	}

	public void setKlist(List<tblcategori> klist) {
		this.klist = klist;
	}
	
}

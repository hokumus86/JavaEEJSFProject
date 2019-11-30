package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.tblUrunDAO;
import model.tblurun;


@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class UrunBean {

	private String urunAdi;
	private int urunFiyati;
	private String urunKategori;
	private int kategoriid;
	private String aciklama;
	private List<tblurun> urunList = new ArrayList<>();
	tblUrunDAO urun_dao = new tblUrunDAO();
	
	private int silinecekid;
	
	
	public void ekle() {
		tblurun model = new tblurun();
		model.setAd(urunAdi);
		model.setFiyat(urunFiyati);
		model.setKategoriadi(urunKategori);
		model.setKategori_id(kategoriid);
		model.setAciklama(aciklama);
		
		urun_dao.kaydet(model);
	}
	
	public void sil() {
		
	}
	
	
	
	
	
	public List<tblurun> getUrunList() {
		return urun_dao.listele(new tblurun());
	}
	public void setUrunList(List<tblurun> urunList) {
		this.urunList = urunList;
	}
	public tblUrunDAO getUrun_dao() {
		return urun_dao;
	}
	public void setUrun_dao(tblUrunDAO urun_dao) {
		this.urun_dao = urun_dao;
	}


	public String getUrunAdi() {
		return urunAdi;
	}
	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}
	public int getUrunFiyati() {
		return urunFiyati;
	}
	public void setUrunFiyati(int urunFiyati) {
		this.urunFiyati = urunFiyati;
	}
	public String getUrunKategori() {
		return urunKategori;
	}
	public void setUrunKategori(String urunKategori) {
		this.urunKategori = urunKategori;
	}
	public int getKategoriid() {
		return kategoriid;
	}
	public void setKategoriid(int kategoriid) {
		this.kategoriid = kategoriid;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public int getSilinecekid() {
		return silinecekid;
	}
	public void setSilinecekid(int silinecekid) {
		this.silinecekid = silinecekid;
	}
}

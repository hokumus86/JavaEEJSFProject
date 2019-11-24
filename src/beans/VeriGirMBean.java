package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name ="verigirmbean")
@SessionScoped
public class VeriGirMBean {
	private String name;
	private String data;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public void veriKaydet() {
		System.out.println("veri geldi" + data + " " + name);
	}
	
	public void veriGirildi() {
		System.out.println("veri geldi scriptten"+ data  + " " + name);
	}

}

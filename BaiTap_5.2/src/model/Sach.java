package model;

public class Sach {
	private String id,tenSach,giaBan;
	private int namSanXuat;
	
	public Sach() {
		super();
	}
	
	public Sach(String id, String tenSach, String giaBan, int namSanXuat) {
		this.id = id;
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namSanXuat = namSanXuat;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(String giaBan) {
		this.giaBan = giaBan;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	
	
}

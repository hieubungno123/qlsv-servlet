package model;

import java.sql.Date;

public class KhachHang {
	private int id;
	private String hoVaTen,diaChi;
	private Date ngaySinh;
	
	public KhachHang() {
		super();
	}

	public KhachHang(int id, String hoVaTen, String diaChi, Date ngaySinh) {
		this.id = id;
		this.hoVaTen = hoVaTen;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	

	
	
	
	
}

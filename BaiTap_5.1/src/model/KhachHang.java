package model;

import java.sql.Date;

public class KhachHang {
	private int id;
	private String hoVaTen;
	private Date ngaySinh;
	
	public KhachHang() {
		super();
	}

	public KhachHang(int id, String hoVaTen, Date ngaySinh) {
		super();
		this.id = id;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
	}
	
	
	
}

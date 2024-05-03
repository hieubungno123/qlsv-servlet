package dataAccessObject;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Sach;

public class SachDAO implements DAOInterface<Sach>{
	
	public static SachDAO getInstance() {
		return new SachDAO();
	}

	@Override
	public int insert(Sach t) {
		int ketQua=0;
		
		try {
			//Bước 1: Tao kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			//Bước 2: Tạo ra đối tượng statement
			Statement st = con.createStatement();
			
			//Bước 3:Thực thi câu lệnh SQL
			String sql = "INSERT INTO sach(id,tenSach,giaBan,namXuatBan)" +
							"VALUE ('" + t.getId() +"' , '"+ t.getTenSach()+"' , "+t.getGiaBan()+" , "+t.getNamXuatBan()+")";
			
			
			
			ketQua = st.executeUpdate(sql);
			
			//Bước 4
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có "+ketQua+"dòng bị thay đổi");
			
			//Bước 5:
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return ketQua;
	}

	@Override
	public int update(Sach t) {
		try {
			//Bước 1: Tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			//Bước 2:Tạo ra đối tượng statement
			Statement st = con.createStatement();
			
			//Bước 3:Thực thi câu lệnh
			String sql = "UPDATE sach"+
							"SET"+
							"tenSach='" + t.getTenSach()+"' , '"+
							"giaBan=" + t.getGiaBan()+" , "+
							"namXuatBan="+t.getNamXuatBan()+" , "+
							"WHERE id='"+t.getId()+"\'";
			
			int ketQua = st.executeUpdate(sql);
			
			//Bước 4
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có "+ketQua+"dòng bị thay đổi");
			
			//Buoc 5
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
		return 0;
	}
		
	@Override
	public int delete(Sach t) {
		try {
			//Bước 1: Tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			//Bước 2:Tạo ra đối tượng statement
			Statement st = con.createStatement();
			
			//Bước 3:Thực thi câu lệnh
			String sql = "DELETE FROM sach"+
							"WHERE id='"+t.getId()+"'";
			
			int ketQua = st.executeUpdate(sql);
			
			//Bước 4
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có "+ketQua+"dòng bị thay đổi");
			
			//Buoc 5
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
		return 0;
	}

	@Override
	public ArrayList<Sach> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sach selectById(Sach t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condititon) {
		// TODO Auto-generated method stub
		return null;
	}

}

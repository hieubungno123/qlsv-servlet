package dataAccessObject;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCUtil;
import model.Sach;

public class SachDAO implements DAOInterface<Sach> {
	
	public static SachDAO getInstance() {
		return new SachDAO();
	}

	@Override
	public int insert(Sach t) {
		int ketQua =0;
		
		try {
			// B1: Tao ket noi bden CSDL
			Connection con = JDBCUtil.getConnection();
			
			//B2: Toa ra doi tuong Statement
			Statement st = con.createStatement();
			
			//Tao cau lenh SQL
			String sql = "INSERT INTO nhasach.sach(id,tenSach,giaBan,namXuatBan)" +
						"VALUE ('" + t.getId() +"','"+ t.getTenSach() +"','"+ t.getGiaBan() +"',"+ t.getNamSanXuat() +")";
			
			ketQua = st.executeUpdate(sql);
			
			System.out.println("Ban da thuc thi:"+sql);
			System.out.println("Co "+ketQua+" bi thay doi");
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int delete(Sach t) {
		try {
			//B1: Lien ket den CSDL
			 Connection con = JDBCUtil.getConnection();
			 
			 //B2: Tao doi tuong Statement
			 Statement st = con.createStatement();
			 
			 //B3: Tao cau lenh
			 String sql = "UPDATE nhasach.sach" +
					 		"SET "+
					 		"tenSach='"+t.getTenSach()+"',"+
					 		"giaBan='"+t.getGiaBan()+"',"+
					 		"namXuatBan='"+t.getNamSanXuat()+ "'" +
					 		"WHERE " +t.getId();
			 st.executeUpdate(sql);
			 
			 JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Sach t) {
		try {
			//B1: Lien ket CSDL
			Connection con = JDBCUtil.getConnection();

			//B2: Tao doi tuong Statement
			Statement st = con.createStatement();
			
			//B3: tao cau lenh
			String sql = "DETELE nhasach.sach" +
						"WHERE " +t.getId();
			
			st.executeUpdate(sql);
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
}
